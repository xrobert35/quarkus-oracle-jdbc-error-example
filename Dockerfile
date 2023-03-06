FROM quay.io/quarkus/ubi-quarkus-graalvmce-builder-image:22.3-java17 as nativeBuilder

COPY --chown=quarkus:quarkus --chmod=777 mvnw /code/mvnw
COPY --chown=quarkus:quarkus .mvn /code/.mvn
COPY --chown=quarkus:quarkus pom.xml /code/

SHELL ["/bin/bash", "-o", "pipefail", "-c"]
USER root

RUN mkdir -p /code/target \
    && chown quarkus:quarkus /code/target

USER quarkus

WORKDIR /code

ARG CACHEBUST=11

COPY src /code/src

USER root

COPY --chown=quarkus:quarkus pom.xml /code/
COPY src/main/resources/application.properties /code/src/main/resources/application.properties
COPY src/main/resources/reflection-config.json /code/src/main/resources/reflection-config.json

RUN ./mvnw package -Pnative -Dmaven.test.skip=true --batch-mode --errors

USER quarkus