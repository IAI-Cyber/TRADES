package dsm.TRADES.util;

import static java.util.stream.Collectors.toSet;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

public class EcoreUtils {
	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param r a resource
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentSteamWithSelf(Resource r) {
		if (r == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(r), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(r.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets an optional ancestor of the given type
	 * 
	 * @param <T>  the expected type
	 * @param self the source element
	 * @param type the expected type class
	 * @return an element or <code>null</code>
	 */
	public static <T extends EObject> T getAncestor(EObject self, Class<T> type) {
		EObject current = self;
		while (current != null && !(type.isInstance(current))) {
			current = current.eContainer();
		}
		if (current != null && type.isInstance(current)) {
			return type.cast(current);
		} else {
			return null;
		}

	}

	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param rs a resource set
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentSteamWithSelf(ResourceSet rs) {
		if (rs == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(rs), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(rs.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets all object contained in the given notifier with the given type
	 * <p>
	 * <i>If self if of the expected type then it belong to the returned stream </i>
	 * </p>
	 * 
	 * @param self a {@link Notifier} (EObject, Resource or ResourceSet)
	 * @param type the type of the element in the returned stream
	 * @return a stream
	 * @param <T> type of element in the returned stream
	 */
	public static <T extends EObject> Stream<T> allContainedObjectOfType(Notifier self, Class<T> type) {
		if (self instanceof EObject) {
			return eAllContentSteamWithSelf((EObject) self).filter(e -> type.isInstance(e)).map(e -> type.cast(e));

		} else if (self instanceof Resource) {
			return eAllContentSteamWithSelf((Resource) self).filter(e -> type.isInstance(e)).map(e -> type.cast(e));

		} else if (self instanceof ResourceSet) {
			return eAllContentSteamWithSelf((ResourceSet) self).filter(e -> type.isInstance(e)).map(e -> type.cast(e));
		} else {
			return Stream.empty();
		}
	}

	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param o an {@link EObject}
	 * @return a stream
	 */
	public static Stream<EObject> eAllContentSteamWithSelf(EObject o) {
		if (o == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(o), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(o.eAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets all {@link EObject} targeting the source object of the given type using
	 * an optional {@link EReference}
	 * 
	 * @param <T>          type of expected result
	 * @param source       source object (not <code>null</code>)
	 * @param expectedType the expected result type
	 * @param crossRef     a {@link ECrossReferenceAdapter}
	 * @param reference    a optional reference (<code>null</code> of all
	 *                     references)
	 * @return a list of object of the expected type
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType,
			ECrossReferenceAdapter crossRef, EReference reference) {
		if (reference == null) {
			return getInverse(source, expectedType, crossRef, (Set<EReference>) null);
		} else {
			return getInverse(source, expectedType, crossRef, Collections.singleton(reference));
		}
	}

	/**
	 * Gets all {@link EObject} targeting the source object of the given type using
	 * an optional {@link EReference}
	 * 
	 * @param <T>          type of expected result
	 * @param source       source object (not <code>null</code>)
	 * @param expectedType the expected result type
	 * @param crossRef     a {@link ECrossReferenceAdapter}
	 * @param reference    a optional set of reference (<code>null</code> of all
	 *                     references)
	 * @return a list of object of the expected type
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType,
			ECrossReferenceAdapter crossRef, Set<EReference> references) {
		if (crossRef != null) {
			return crossRef.getInverseReferences(source).stream()//
					.filter(s -> expectedType.isInstance(s.getEObject()) //
							&& (references == null || references.contains(s.getEStructuralFeature())))//
					.map(s -> ((T) s.getEObject())).collect(Collectors.toList());

		} else {
			return Collections.emptyList();
		}
	}

	/**
	 * Gets all {@link EObject} of the given type that are link to the given source
	 * using a given feature
	 * 
	 * @param <T>          type of the result
	 * @param source       the source object
	 * @param expectedType the type of the element returned
	 * @param reference    the reference use to link the objects (optional)
	 * @return a list of T
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType, EReference reference) {
		if (reference == null) {
			return getInverse(source, expectedType, (Set<EReference>) null);
		} else {

			return getInverse(source, expectedType, Collections.singleton(reference));
		}
	}

	/**
	 * Gets all {@link EObject} of the given type that are link to the given source
	 * using a given feature
	 * 
	 * @param <T>          type of the result
	 * @param source       the source object
	 * @param expectedType the type of the element returned
	 * @param references   the references use to link the objects (optional)
	 * @return a list of T
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType,
			EReference... references) {
		if (references.length == 0) {
			return getInverse(source, expectedType, (Set<EReference>) null);
		} else {
			return getInverse(source, expectedType, Stream.of(references).collect(toSet()));
		}
	}

	/**
	 * Gets all {@link EObject} of the given type that are link to the given source
	 * using a given feature
	 * 
	 * @param <T>          type of the result
	 * @param source       the source object
	 * @param expectedType the type of the element returned
	 * @param references   the references use to link the objects (optional)
	 * @return a list of T
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType,
			Set<EReference> references) {
		ECrossReferenceAdapter crossRef = source.eAdapters().stream().filter(e -> e instanceof ECrossReferenceAdapter)
				.findAny().map(opt -> (ECrossReferenceAdapter) opt).orElse(null);
		if (crossRef != null) {
			return getInverse(source, expectedType, crossRef, references);

		} else {
			return Collections.emptyList();
		}
	}
}
