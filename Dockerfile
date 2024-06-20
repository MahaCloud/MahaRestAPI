FROM openjdk:17
EXPOSE 8083 8000
ADD target/restapi-github-actions.jar restapi-github-actions.jar
ADD "entrypoint.sh entrypoint.sh 
ENTRYPOINT ["sh", "/entrypoint.sh"] # for remote debuggin