FROM openjdk:17
EXPOSE 8080
ADD target/ak-construction.jar ak-construction.jar
ENTRYPOINT ["java","-jar","/ak-construction.jar"]
