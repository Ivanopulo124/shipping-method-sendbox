# Rest-api sandbox application of sample shipping method 

## Building & Running

To build or run the project, use one of the following tasks:

| Task                                    | Description                                                          |
| -----------------------------------------|---------------------------------------------------------------------- |
| `./gradlew test`                        | Run the tests                                                        |
| `./gradlew build`                       | Build everything                                                     |
| `./gradlew buildFatJar`                 | Build an executable JAR of the server with all dependencies included |
| `./gradlew buildImage`                  | Build the docker image to use with the fat JAR                       |
| `./gradlew publishImageToLocalRegistry` | Publish the docker image locally                                     |
| `./gradlew run`                         | Run the server                                                       |
| `./gradlew runDocker`                   | Run using the local docker image                                     |

## Rest api methods

| Method               | Description                        |
|----------------------|------------------------------------|
| `/ping`              | Test method to check application work |
| `/calculateDelivery` | Delivery cost calculation          |
| `/createShipment`    | Create shipment for package        |
| `/getShipmentStatus` | Get shipment status      |
| `/cancelShipment`    | Cancel shipment                    |
