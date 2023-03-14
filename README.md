![Barney](https://cloud.githubusercontent.com/assets/3603793/23482593/669e9444-feae-11e6-9b6b-d1a53faf984a.png)

# Thortful API Challenge

API to retrieve photos from a 3rd party service named PEXELS [https://www.pexels.com/api/documentation/]

Frameworks and libraries used:
Spring Boot (starter and web) 3.0.4
Maven 3.8.1
Java JDK 19
Lombok 1.18.26
Jackson-annotations (from fasterxml) 2.14.2
IntelliJ as IDE

Steps to run:
- Maven commands to clean and compile
- Run main application
- Application working on port 8080

Available API endpoints:
- Search for photos with a specific topic(s) -> http://localhost:8080/thortful/topic/{subject}
- Get the latest trending photos -> http://localhost:8080/thortful/trending
- Get a specific photo by ID -> http://localhost:8080/thortful/photos/{id}
