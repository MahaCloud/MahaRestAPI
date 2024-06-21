 EXPOSE 7074
 ENV DEBUG_INFO="-Xdebug -Xrunjdwp:transport=dt_socket,address=0.0.0.0:7074,server=y,suspend=n"
 ADD target/restapi-github-actions.jar restapi-github-actions.jar
 ENTRYPOINT [ "sh", "-c", "java ${DEBUG_INFO} -Dspring.profiles.active=docker -jar /restapi-github-actions.jar" ]
