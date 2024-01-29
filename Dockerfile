FROM openjdk:11
EXPOSE 8091
ADD target/mykube.jar mykube.jar
ENTRYPOINT ["java", "-jar", "/mykube.jar"]

