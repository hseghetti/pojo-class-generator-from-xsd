# pojo-class-generator-from-xsd
This repo generates java pojo classes from xds files using jaxb, maven and JAVA 17

### STEPS to generate java classes from XSD
1. Download the repo
2. Copy and paste your xds files into the folder src/main/resources/schemas/xsd
3. Execute the deployment maven task and the generated file will be on: target/generated-sources

#### NOTE 1: the target folder was committed to the repo to show the generated classes as an example.

#### NOTE 2: the repo contains some XDS as examples inside the schemas/xsd folder.
The examples are the IATA NDC STANDARD version 19.2 and 21.3.5

You can use the generated classes to implement the NDC schema as a Bonus track.
