FROM openjdk:11
COPY target/*.jar kuhniia-back-end.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kuhniia-back-end.jar"]
