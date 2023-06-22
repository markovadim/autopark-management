FROM openjdk:17
COPY build/libs/autopark-management-0.0.1-SNAPSHOT.jar autopark-management.jar
CMD ["java", "-jar", "autopark-management.jar"]