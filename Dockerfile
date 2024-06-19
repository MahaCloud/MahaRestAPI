FROM openjdk:17
EXPOSE 8083 8000 #8000 for remote debuggin
ADD target/restapi-github-actions.jar restapi-github-actions.jar
#ENTRYPOINT ["java","-jar","/restapi-github-actions.jar"]
ADD "entrypoint.sh entrypoint.sh # for remote debuggin
ENTRYPOINT ["sh", "/entrypoint.sh"] # for remote debuggin