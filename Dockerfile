#FROM eclipse-temurin:17.0.11_9-jre-jammy
FROM eclipse-temurin:17-alpine
ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]   