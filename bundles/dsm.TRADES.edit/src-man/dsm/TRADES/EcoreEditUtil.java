package dsm.TRADES;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

public class EcoreEditUtil {

	/**
	 * Gets all {@link EObject} of the given type that are link to the given source
	 * using a given feature
	 * 
	 * @param <T>          type of the result
	 * @param source       the source object
	 * @param expectedType the type of the element returned
	 * @param reference    the reference use to link the objects
	 * @return a list of T
	 */
	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType, EReference reference) {
		ECrossReferenceAdapter crossRef = source.eAdapters().stream().filter(e -> e instanceof ECrossReferenceAdapter)
				.findAny().map(opt -> (ECrossReferenceAdapter) opt).orElse(null);
		if (crossRef != null) {
			return crossRef.getInverseReferences(source).stream()//
					.filter(s -> expectedType.isInstance(s.getEObject()) && s.getEStructuralFeature() == reference)//
					.map(s -> ((T) s.getEObject())).collect(Collectors.toList());

		} else {
			return Collections.emptyList();
		}
	}
}
