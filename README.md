# Build and Push

```shell script
./gradlew clean assemble -Dquarkus.container-image.insecure=true -Dquarkus.container-image.push=true  -Dquarkus.container-image.tag=3.0.0 -Dquarkus.container-image.build=true -Dquarkus.container-image.group=antram -Dquarkus.container-image.registry=docker.io -Dquarkus.container-image.name=kogito-operator-test 
```

# kogito-test Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./gradlew build
```
It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/kogito-test-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Related Guides

- Kogito ([guide](https://quarkus.io/guides/kogito)): Add business automation capabilities - processes and rules with Kogito (a toolkit that originates from projects Drools and jBPM)
- Kogito - Process (jBPM) ([guide](https://quarkus.io/guides/kogito)): Add Kogito Processes capabilities - Includes Process (jBPM) Engine
- Kogito Add-On Monitoring Prometheus ([guide](https://quarkus.io/guides/kogito)): Kogito Add-On for Prometheus Monitoring
