package dsm.TRADES.migration;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESModelActivator;
import dsm.TRADES.TRADESPackage;

//import fr.obeo.dsl.ecompat.base.BaseFactory;
//import fr.obeo.dsl.ecompat.base.Model;

public class BaseResourceHandler extends BasicResourceHandler {

	private TRADESPackage ePack = TRADESPackage.eINSTANCE;

	@Override
	public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
		super.postLoad(resource, inputStream, options);
		processUnknownData(resource);
	}

	/**
	 * handle unknown data in Resource.
	 * 
	 * @param resource the resource to check
	 */
	protected void processUnknownData(final XMLResource resource) {
		final Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
		for (final EObject key : extMap.keySet()) {
			final AnyType value = extMap.get(key);
			handleUnknownData(key, value);
		}
	}

	private void handleUnknownData(final EObject eObj, final AnyType unknownData) {
		handleUnknownFeatures(eObj, unknownData.getMixed());
		handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
	}

	private void handleUnknownFeatures(final EObject owner, final FeatureMap featureMap) {
		final Iterator<FeatureMap.Entry> iter = featureMap.iterator();
		while (iter.hasNext()) {
			final FeatureMap.Entry entry = iter.next();
			EStructuralFeature eStructuralFeature = entry.getEStructuralFeature();
			if (isADeletedFeature(owner, eStructuralFeature)) {
				iter.remove();
				TRADESModelActivator.logInfo("Deleting feature " + eStructuralFeature.getName() + " on "
						+ eObjectToString(owner) + " since it is now useless.");
			} else {
				String msg = "Unkown feature " + eStructuralFeature.getName() + " on " + eObjectToString(owner);
				System.err.println(msg);
				TRADESModelActivator.logWarning(msg);
			}
		}
	}

	private String eObjectToString(EObject o) {
		String label = "[" + o.eClass().getName() + "] ";
		if (o instanceof NamedElement) {
			label += ((NamedElement) o).getName();
		} else {
			label += o.toString();
		}
		return label;
	}

	private boolean isADeletedFeature(EObject owner, EStructuralFeature eStructuralFeature) {

		return isMatching(owner, eStructuralFeature, ePack.getAnalysis(), "affectrelation") //
				|| isMatching(owner, eStructuralFeature, ePack.getComponent(), "analysis")
				|| isMatching(owner, eStructuralFeature, ePack.getComponent(), "allocatedThreat")
				|| isMatching(owner, eStructuralFeature, ePack.getThreat(), "allocated")
				|| isMatching(owner, eStructuralFeature, ePack.getComponent(), "threat")
				|| isMatching(owner, eStructuralFeature, ePack.getComponent(), "implements")
				|| isMatching(owner, eStructuralFeature, ePack.getControl(), "implementedBy")
				|| isMatching(owner, eStructuralFeature, ePack.getThreatAllocationRelation(), "threatRelated")

		;

	}

	private boolean isMatching(EObject owner, EStructuralFeature feature, EClass expectedOwnerType,
			String expectedFetureName) {
		return feature != null && owner != null && expectedOwnerType.isSuperTypeOf(owner.eClass())
				&& expectedFetureName.equals(feature.getName());
	}
}
