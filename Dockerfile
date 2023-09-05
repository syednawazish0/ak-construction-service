FROM adoptopenjdk:17-jre-hotspot
EXPOSE 8080
ADD target/ak-construction.jar ak-construction.jar
ENTRYPOINT ["java","-jar","/ak-construction.jar"]