<p>Prepared by: TAKI Oussama</p>
<h1>Report on Inversion of Control and Dependency Injection</h1>
<h2 style="color: cadetblue">Introduction</h2>
<p>Inversion of Control (IoC) is a concept that allows managing an object's dependencies without directly instantiating them. In the context of object creation, Spring intervenes to inject dependencies between different components (called Beans) to ensure that all required relationships are established.

This mechanism allows developers to focus more on the business logic of their application, while Spring handles dependency injection and offers various technical features.</p>
<h2 style="color: cadetblue">Statement</h2>
<ol>
    <li>DAO Layer
        <ul>
            <li>Create the IDao interface</li>
            <li>Create an implementation of the IDao interface</li>
        </ul>
    </li>
    <li>Business Layer
        <ul>
            <li>Create the IMetier interface</li>
            <li>Create an implementation of the IMetier interface</li>
        </ul>
    </li>
    <li>Presentation Layer
        <p>Create an application that allows dependency injection</p>
        <ul>
        <li>Static instantiation</li>
        <li>Dynamic instantiation</li>
        <li>Using Spring Framework
            <ul>
                <li>XML version</li>
                <li>Annotation version</li>
            </ul>
        </li>
        </ul>
    </li>
</ol>
<h2 style="color: cadetblue">Design</h2>
<h3>Principle of Loose Coupling</h3>
<img src="captures/Conception.png" alt="design image">
<p>
When aiming to achieve loose coupling, the use of interfaces is essential. To illustrate this, consider two classes: `DaoImpl`, which implements the `IDao` interface, and `MetierImpl`, which implements the `IMetier` interface.

When the `MetierImpl` class is associated with the `IDao` interface, it can be said that the `MetierImpl` class and the `IDaoImpl` class are loosely coupled.</p>

<p>This means that the `MetierImpl` class can collaborate with any class that adheres to the contract defined by the `IDao` interface. In reality, the `MetierImpl` class is only aware of the existence of this interface, which means it can be associated with any class that implements this interface without requiring modifications in the `MetierImpl` class.

Loose coupling thus allows creating applications that are resistant to internal changes while being flexible for extensions.
</p>
<h2 style="color: cadetblue">Screenshots</h2>
<h3>Creating the IDao Interface</h3>
<img src="captures/IDAO.png" alt="IDao interface">
<h3>Creating an Implementation of the IDao Interface for Database</h3>
<img src="captures/DAOIMPL.png" alt="database implementation">
<h3>Creating an Implementation of the IDao Interface for Web Services</h3>
<img src="captures/DAOIMPLV2.png" alt="web services implementation">
<hr>
<h3>Creating the IMetier Interface</h3>
<img src="captures/METIER.png" alt="IMetier interface">
<h3>Creating an Implementation of the IMetier Interface</h3>
<img src="captures/metierimpl1.png" alt="IMetier implementation">
<h3>Static Instantiation</h3>
<img src="captures/Pres1_instanstation_statique.png" alt="static instantiation">
<h3>Dynamic Instantiation</h3>
<img src="captures/Pres2_instanstation_dynamique.png" alt="dynamic instantiation">
<h3>Dependency Injection Using Spring XML Version</h3>
<p>First, install the dependencies, then add a config.xml file</p>
<img src="captures/config_xml.png" alt="config.xml">
<img src="captures/Spring_xml.png" alt="Spring XML version">
<h3>Dependency Injection Using Spring Annotations Version</h3>
<p>Repository Class</p>
<img src="captures/Repository.png" alt="repository class">
<p>Service Class</p>
<img src="captures/MetierImpl.png" alt="service class">
<p>Controller</p>
<img src="captures/pres4_annota.png" alt="controller">