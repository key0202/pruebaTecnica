# Usar una imagen base de JDK
FROM openjdk:17-jdk-slim

# Añadir un argumento de entorno para el JAR
ARG JAR_FILE=target/*.jar

# Copiar el JAR en el contenedor
COPY ${JAR_FILE} app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]
