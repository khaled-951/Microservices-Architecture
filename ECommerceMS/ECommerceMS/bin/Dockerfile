FROM openjdk:15
EXPOSE 8089
ADD /target/ECommerceMS-0.0.1-SNAPSHOT.jar docker-service-evenements.jar
ENTRYPOINT ["java","-jar","docker-service-evenements.jar"]