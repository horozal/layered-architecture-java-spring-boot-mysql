# layered-architecture-java-spring-boot-mysql
### Template for a layered architecture in Java with Spring Boot and MySQL.

The project contains dependencies for Java 11, Spring Web, Spring Data JPA and MySQL Driver, and includes a Maven plugin.

It demonstrates a typical layered architecture with four layers:

1. Presentation/User Interface Layer:
- responsible for interacting with users/external systems and handling input/output operations
- implemented in the ```controller``` package consisting of controller(s) to act as the entry point for handling HTTP requests

2. Application/Service Layer:
- responsible for encapsulating the business logic and coordinating data flow between the presentation layer (e.g., controllers or user interfaces) and the data access layer (e.g., repositories or databases)
- implemented in the ```service``` package

3. Domain Layer/Doman Model:
- represents domain-specific concepts and business rules of the system
- defines entities, their relationships, and the operations performed on them
- implemented in the ```model``` package

4. Data Access Layer:
- handles data access operations, i.e., the storage and retrieval of data from various data sources such as databases, file systems or external services
- implemented in the ```repository``` package

### Packages in this project:

1. ```model``` package consists of the ```SampleEntity``` class that represents a sample entity with a name.

2. ```repository``` package consists of the ```EntityRepository``` interface that extends the ```JpaRepository``` interface, which provides generic CRUD (create, read, update, delete) operations for the ```SampleEntity``` type.

3. ```service``` package consists of the ```EntityService``` class that encapsulates business logic related to entities. It has a dependency on ```EntityRepository``` to perform data access operations.

4. ```controller```package consists of the ```EntityController``` class that handles incoming HTTP requests related to entities. It has a dependency on the ```EntityService``` class to perform business logic operations. It accepts a POST request to the ```/entity``` endpoint with a name in the request body.
