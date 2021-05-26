/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
package dsm.TRADES;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

public class SemanticUtil {

	private static final String DEFAULT_ROOT_CMP_NAME = "System Analysis Scope";

	public static <T extends Control> T addControl(AbstractControlOwner cmp, T control) {

		ControlOwner owner = cmp.getControlOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			cmp.setControlOwner(owner);
		}
		if (control instanceof ExternalControl) {
			owner.getExternals().add((ExternalControl) control);
		} else {
			owner.getInternals().add(control);
		}

		return control;
	}

	public static Analysis createInitialModel(String rootObjectName) {
		Analysis analysis = TRADESFactory.eINSTANCE.createAnalysis();
		analysis.setName(rootObjectName);
		analysis.setId(UUID.randomUUID().toString());

		Component root = TRADESFactory.eINSTANCE.createComponent();
		analysis.getComponents().add(root);
		root.setName(DEFAULT_ROOT_CMP_NAME);

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();
		analysis.setScoreSystem(scoreSystem);

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		analysis.setThreatOwner(threatOwner);

		createControlOwner(analysis);

		createDataOwner(analysis);

		createDifficulty("Low", 1, scoreSystem);
		createDifficulty("Medium", 2, scoreSystem);
		createDifficulty("High", 3, scoreSystem);

		createImpact("Low", 1, scoreSystem);
		createImpact("Medium", 2, scoreSystem);
		createImpact("High", 3, scoreSystem);

		return analysis;
	}

	/**
	 * Create a empty catalog
	 * 
	 * @param rootObjectName the name of the catalog
	 * @return a new {@link Catalog}
	 */
	public static Catalog createInitialCatalog(String rootObjectName) {
		Catalog catalog = TRADESFactory.eINSTANCE.createCatalog();
		catalog.setName(rootObjectName);
		catalog.setId(UUID.randomUUID().toString());

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		catalog.setThreatOwner(threatOwner);

		ControlOwner controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
		catalog.setControlOwner(controlOwner);

		return catalog;
	}

	public static void createDataOwner(Analysis analysis) {
		DataOwner dataOwner = TRADESFactory.eINSTANCE.createDataOwner();
		analysis.setDataOwner(dataOwner);
	}

	public static void createControlOwner(AbstractControlOwner analysis) {
		ControlOwner controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
		analysis.setControlOwner(controlOwner);

	}

	private static void createDifficulty(String name, int score, ScoreSystem system) {
		DifficultyScore diff = TRADESFactory.eINSTANCE.createDifficultyScore();
		system.getDifficultyScores().add(diff);
		diff.setName(name);
		diff.setDifficulty(score);

	}

	private static void createImpact(String name, int score, ScoreSystem system) {
		ImpactScore impact = TRADESFactory.eINSTANCE.createImpactScore();
		system.getImpactScores().add(impact);
		impact.setName(name);
		impact.setImpact(score);
		for (DifficultyScore dif : system.getDifficultyScores()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			impact.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
	}

	/**
	 * Get the source name for an element
	 * 
	 * @param element an element stored in a model
	 * @return a identifier or null is not found;
	 */
	public static String getSourceName(EObject element) {
		if (element instanceof ExternalElement) {
			return ((ExternalElement) element).getSource();
		}
		EObject parent = element.eContainer();
		while (parent != null) {
			if (parent instanceof Analysis) {
				return ((Analysis) parent).getName();

			} else if (parent instanceof Catalog) {
				return ((Catalog) parent).getName();
			}
			parent = parent.eContainer();
		}
		return null;
	}

	/**
	 * Get the source identifier for an element
	 * 
	 * @param element a element store in a model
	 * @return a identifier or null is not found
	 */
	public static String getSourceIdentifier(EObject element) {
		if (element instanceof ExternalElement) {
			return ((ExternalElement) element).getSourceID();
		}
		EObject parent = element.eContainer();
		while (parent != null) {
			if (parent instanceof Analysis) {
				return ((Analysis) parent).getId();

			} else if (parent instanceof Catalog) {
				return ((Catalog) parent).getId();
			}
			parent = parent.eContainer();
		}
		return null;
	}

}
