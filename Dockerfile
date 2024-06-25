FROM openjdk:17
EXPOSE 8083
ADD target/restapi-github-actions.jar restapi-github-actions.jar
ENTRYPOINT ["java","-jar","/restapi-github-actions.jar"]