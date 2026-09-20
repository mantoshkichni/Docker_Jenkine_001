From eclipse-temurin:17-jre
Workdir /app
copy target/*.jar app.jar
Expose 9091
Entrypoint ["java" ,"-jar" , "app.jar"]