# TRADES Tool

Home of the Threat and Risk Assessment Tool TRADES Tool.
TRADES Tool is a model-based threat and risk assessment tool for the design of systems. It is based on the TRADES methodology (see [1]).


Check the releases section for the most up-to-date version of TRADES Tool as a stand-alone modeling workbench.

Documentation is available at the respective folder.

[1] Shaked, A. and Reich, Y. (2021). Model-based Threat and Risk Assessment for Systems Design. In Proceedings of the 7th International Conference on Information Systems Security and Privacy - ICISSP, ISBN 978-989-758-491-6; ISSN 2184-4356, pages 331-338. DOI: 10.5220/0010187203310338 https://www.scitepress.org/Papers/2021/101872/101872.pdf

## How to set up an environment

### Java

The project is develop using Java 11.
So you need to have a compliant JRE/JDK installed and set up in your eclipse environment.

### Tooling

#### Eclipse

Download the Eclipse version (at least 2020-06 to ease the installation of other tools).

Install the following components (_some might be already be installed_) from the main repository ( http://download.eclipse.org/releases/2020-06):

* Accelo
* Ecore Diagram Editor (SDK) 
* EMF - Eclipse Modeling Framework SDK
* Graphical Modeling Framework (GMF) Notation SDK
* Graphical Modeling Framework (GMF) Runtime SDK
* XText Complete SDK
* Xtend IDE
* Eclipse Java Development Tools (JDT)
* Plug-in Development Environment (PDE) 

From other update sites:

* Sirius Specifier Environement - https://download.eclipse.org/sirius/updates/stable/6.5.0-S20210326-125830/2020-06/
* Target platform DSL -  http://download.eclipse.org/cbi/tpd/3.0.0-SNAPSHOT/
* EMF Loophole - http://mbarbero.github.io/emf-loophole/
* Asciidoctor Editor - Market place https://marketplace.eclipse.org/content/asciidoctor-editor

#### Java

The project is developed using Java 11.
So you need to have a compliant JRE/JDK installed and set up in your eclipse environment.

#### Maven

You need an installation of Maven.
To avoid any problem we recommend a version >= 3.6.3 and that the java version used by Maven to be 11 or above.


### Set up

### Build and download dependencies

*Before* importing the projects in an Eclipse workspace follow the instruction from _/dsm.oscal.ext/readme.adoc_.
Some of the required libraries are *not yet* available in Maven central and need to be built locally.

Then, run  _mvn clean compile_ in _/releng/dsm.TRADES.parent_ folder.
This command will automatically import/download the required dependencies in way that eclipse bundles can use them.

### Set up the workspace

* Set up a Java 11 jre/jdk in eclipse
* Set up eclipse compiler to Java 11
* Import all projects
* Load the target plaform _/dsm.TRADES.parent/tp/dev.target_

At this point all projects should compile.

### Run

Create an _Eclipse Application_ run configuration and select the product _dsm.TRADES.branding.product_


## How to build

Run _mvn clean verify_ in _/releng/dsm.TRADES.parent_.






