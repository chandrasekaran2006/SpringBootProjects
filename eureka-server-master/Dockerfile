FROM eclipse-temurin:17-jdk

LABEL maintainer="47@gmail.com"

ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]