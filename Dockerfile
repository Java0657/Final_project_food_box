FROM openjdk:8
EXPOSE 8084
ADD target/foodboxproject-0.0.1-SNAPSHOT.war foodboxproject-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/foodboxproject-0.0.1-SNAPSHOT.war"]