package dsm.oscal.model.transform;

import org.eclipse.emf.ecore.EObject;

public interface ObjectMapper<T extends EObject, U> {

	T toTrades(U oscalObject);

	U toOscal(T tradesObject);


}
