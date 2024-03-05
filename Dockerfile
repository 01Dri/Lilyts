FROM openjdk:17

COPY target/Lilyts-0.0.1-SNAPSHOT.jar /app/Lilyts-0.0.1-SNAPSHOT.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "Lilyts-0.0.1-SNAPSHOT.jar"]
