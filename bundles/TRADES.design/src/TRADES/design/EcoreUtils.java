package TRADES.design;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

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
}
