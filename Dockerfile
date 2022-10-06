FROM openjdk:8
EXPOSE 8084
ADD target/food-box-project-0.0.1-SNAPSHOT.war food-box-project-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/foodboxproject-0.0.1-SNAPSHOT.war"]