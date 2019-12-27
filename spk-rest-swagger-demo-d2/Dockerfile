# Base image containing a Java runtime
FROM openjdk:11

# Author
LABEL maintainer="pravee.spk.java@gmail.com"

# Add any volume or mount storage to persist in host OS from container
# for example if writing any logs you can use /var/spk/log/app.log etc
# this will need to be mounted with the OS to verify or check app logs
VOLUME /tmp

# The actual executable or the app jar file
ARG SPK_REST_DEMO_D1_APP_JAR_FILE=target/spk-rest-demo-d1-app-0.0.1-SNAPSHOT.jar

# Copy app jar into container as 
ADD ${SPK_REST_DEMO_D1_APP_JAR_FILE} spk-rest-demo-d1-app.jar

# Configure how to run the app inside the container
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spk-rest-demo-d1-app.jar"]