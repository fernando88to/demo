FROM tomcat:9.0.80-jdk11-temurin
#COPY build/libs/demo-0.1-plain.war $CATALINA_HOME/webapps/ROOT.war
COPY demo-0.1-plain.war $CATALINA_HOME/webapps/app.war
COPY index.jsp $CATALINA_HOME/webapps/ROOT/index.jsp


ENV CATALINA_OPTS="-server  -Duser.language=pt -Duser.country=BR"