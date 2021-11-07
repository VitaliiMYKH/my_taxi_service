## Description:
Here are simple implementation of taxi service app.
The system user is the driver. 
The driver can sign up and if he already signed up - sign in.
The driver can view all information about available cars and drivers assigned to them.
Basic CRUD operations are available.

The project has an N-tier structure and consists of:
- the database layer,
- the DAO layer for interaction with the database, 
- the service layer which contains the business logic,
- and the presentation layer.

## User can interact with our application by:
- Authentication or register Driver
- Adding drivers, cars, manufacturers to db
- Deleting drivers, cars, manufacturers from db
- Getting drivers, cars, manufacturers from db
- Getting car list of current user

## Technologies used in this app:
- JDBC
- Java Servlets
- MySQL
- Apache Tomcat 9.0.54
- Log4j2
- JSTL 1.2
- Custom dependency injector

## To deploy this project you need to:
- Install MySQL and Apache Tomcat 9.0.54
- Clone this project
- Create DB with help of init_db.sql file from resources folder
- Add your db credentials in ConnectionUtil class
- Add Tomcat configurations to your project

