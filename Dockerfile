FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY sisrh/ .
RUN mvn clean package -DskipTests

FROM tomcat:10.1-jdk17
COPY --from=build /app/target/sisrh-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/sisrh.war
EXPOSE 8080
CMD ["catalina.sh", "run"]