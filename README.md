INFO

First we will create basic Spring Boot Project.
You should have PostgreSQL DB running and then add connection parameters to application.properties.
Or choose some other DB and then adjust connection parameters as described under Repository section for each DB.
To verify setup we will edit SpringbootDemoAuthorsbooksApplication.java to print Hello to Console.

SPRING BOOT STARTERS

GROUP	            DEPENDENCY	          DESCRIPTION
Web	              Spring Web	          Enables @RequestMapping (includes Tomcat Server)
Developer Tools	  Spring Boot           DevTools	Enables application auto-reload 
Developer Tools   Lombok	              Enables @Data (generates helper methods: setters, getters, ...)
SQL	              Spring Data JPA	      Enables @Entity and @Id
SQL               PostgreSQL Database 	Enables Hibernate to work with PostgreSQL DB

