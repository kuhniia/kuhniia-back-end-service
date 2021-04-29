#HELLO

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=kuhniia_kuhniia-back-end-service&metric=alert_status)](https://sonarcloud.io/dashboard?id=kuhniia_kuhniia-back-end-service)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=kuhniia_kuhniia-back-end-service&metric=bugs)](https://sonarcloud.io/dashboard?id=kuhniia_kuhniia-back-end-service)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=kuhniia_kuhniia-back-end-service&metric=code_smells)](https://sonarcloud.io/dashboard?id=kuhniia_kuhniia-back-end-service)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=kuhniia_kuhniia-back-end-service&metric=coverage)](https://sonarcloud.io/dashboard?id=kuhniia_kuhniia-back-end-service)

[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=kuhniia_kuhniia-back-end-service&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=kuhniia_kuhniia-back-end-service)



# Run the following to start the app

# Build the app

<code> mvn clean package -DskipTests -f pom.xml </code>

# Build the docker container 

<code> docker build -t kuhniia . </code>

# Start docker-compose

<code> docker-compose up -d </code>

# Connect to DB and execute

<code> CREATE EXTENSION IF NOT EXISTS "uuid-ossp"; </code>

# Run the container

<code>docker run -dp 8080:8080 --name kuhniia-back-end kuhniia</code>
