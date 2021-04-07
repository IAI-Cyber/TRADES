package dsm.oscal.ext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureBucket {

	private final String name;

	private final int lowerBound;

	private final int upperBounds;

	private final EClassifier data;

	private final FeatureType type;

	private static enum FeatureType {
		REF, CONTAINEMENT, ATTR;
	}

	public static FeatureBucket create(EStructuralFeature feature) {
		final FeatureType type;
		if (feature instanceof EAttribute) {
			type = FeatureType.ATTR;
			;

		} else if (feature instanceof EReference) {
			if (((EReference) feature).isContainment()) {
				type = FeatureType.CONTAINEMENT;
			} else {
				type = FeatureType.REF;
			}
		} else {
			type = null;
		}

		if (type != null) {
			return new FeatureBucket(feature.getName(), feature.getLowerBound(), feature.getUpperBound(),
					feature.getEType(), type);
		} else {
			return null;
		}
	}

	private FeatureBucket(String name, int lowerBound, int upperBounds, EClassifier data, FeatureType type) {
		super();
		this.name = name;
		this.lowerBound = lowerBound;
		this.upperBounds = upperBounds;
		this.data = data;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + lowerBound;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + upperBounds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeatureBucket other = (FeatureBucket) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (lowerBound != other.lowerBound)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		if (upperBounds != other.upperBounds)
			return false;
		return true;
	}

}
