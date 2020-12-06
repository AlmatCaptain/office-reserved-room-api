FROM openjdk:8

ADD /target/office-reserved-room-api-0.0.1-SNAPSHOT.jar office-reserved-room-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "office-reserved-room-api-0.0.1-SNAPSHOT.jar"]

EXPOSE 8082