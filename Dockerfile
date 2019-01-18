FROM tomcat:latest

RUN chmod 777 /usr/local/tomcat/webapps/

COPY ./webapp/target/*.war /user/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]