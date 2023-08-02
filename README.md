# taxi-service
This is a simple web application for managing a taxi service. <br>
It allows users to perform a list of basic operations
with drivers, cars and manufacturers, like:
<ul>
<li>Registration as a driver</li>
<li>Authentication as a driver</li>
<li>View all drivers</li>
<li>View all cars</li>
<li>View all manufacturers</li>
<li>Add new driver</li>
<li>Add new car</li>
<li>Add new manufacturer</li>
<li>Remove a driver</li>
<li>Remove a car</li>
<li>Remove a manufacturer</li>
<li>Add driver to a car</li>
<li>View all current cars as driver</li>
</ul>

<h3>Project Structure</h3>
The project consists of 3 layers:
<ul>
<li>Data Access Layer. It interacts with the database performs basic
CRUD operations.</li>
<li>Service Layer. It is an intermediate link between Presentation Layer and
Data Access Layer.</li>
<li>Presentation Layer. It is responsible what everything a user
can see an their screen, like lists of drivers, cars, or manufacturers.</li>
</ul>
<<h3>Used technologies</h3>
<ul>
    <li>Java 17</li>
    <li>Spring MVC</li>
    <li>Spring Security</li>
    <li>Hibernate</li>
    <li>Tomcat 9</li>
    <li>H2 database</li>
    <li>REST</li>
    <li>JSON</li>
    <li>Jackson</li>
    <li>Maven</li>
</ul>
<h3>How to install and use the project</h3>
<ol>
<li>Firstly, you need to install Java for your computer to be able
to run this program. To download it, please visit 
<a href = "https://www.oracle.com/cis/java/technologies/downloads/">this link</a>.</li>
<li>Then, after you installed Java, you should download
MySQL <a href = "https://www.mysql.com/downloads/">here</a> 
and MYSQL Workbench <a href = "https://www.mysql.com/products/workbench/">here</a>.</li>
<li>To run a project, you need an IDE, for example IntelliJ IDEA. 
You can get it <a href="https://www.jetbrains.com/idea/download">here</a>.</li>
<li>To download a project, run git clone at the desired folder.</li>
<li>To open a project, open IntelliJ IDEA, select "Open Project"
and choose the correct path.</li>
<li>To create a database, you need to run a script, which creates a database. Its 
path relative to project root directory is "src/main/resources/init_db.sql".
Copy its text to SQL editor in Workbench and run it.</li>
<li>Download Tomcat from <a href = "https://tomcat.apache.org/download-80.cgi">here</a>.</li>
<li>To run the project, select "Run" at top panel of IntelliJ IDEA, then - "Edit configurations".</li>
<li>Select path to your Tomcat add artifact - war:exploded and press "Run".</li>
</ol>

    
