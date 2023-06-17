# layered-architecture-java-spring-boot-mysql
Template for a layered architecture in Java with Spring Boot and MySQL.

The project contains dependencies for Java 11, Spring Web, Spring Data JPA and MySQL Driver, and includes a Maven plugin.

It demonstrates a typical layered architecture with four layers:

1. Presentation/User Interface Layer:
- responsible for interacting with users/external systems and handling input/output operations.
- implemented in the ```controller``` package consisting of controller(s) to act as the entry point for handling HTTP requests.

2. Application/Service Layer:
- responsible for encapsulating the business logic and coordinating data flow between the presentation layer (e.g., controllers or user interfaces) and the data access layer (e.g., repositories or databases).
- implemented in the ```service``` package

3. Domain Layer/Doman Model:
   - represents domain-specific concepts and business rules of the system.
   - defines entities, their relationships, and the operations performed on them.

4. Data Access Layer:
   - It handles the storage and retrieval of data from various data sources such as databases, file systems or external services , and the repository handles data access operations. 

Packages:

1. Model
- The ```SampleEntity``` class represents a sample entity with a name.

2. Repository
- The ```EntityRepository``` interface extends the ```JpaRepository``` interface, which provides generic CRUD (create, read, update, delete) operations for the ```SampleEntity``` type.

3. Service
- ```EntityService``` class encapsulates business logic related to entities.
- It has a dependency on ```EntityRepository``` to perform data access operations.

4. Controller  
- ```EntityController``` class handles incoming HTTP requests related to entities.
- It has a dependency on the ```EntityService``` class to perform business logic operations.
