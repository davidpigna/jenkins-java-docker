FROM openjdk:11-jre-slim
COPY target/jenkins-java-demo-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
