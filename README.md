# listings-ui-automation
API tests for Listings using BDD approach
## Tools

- Maven
- Cucumber-Java - 7.0.0
- JUnit - 4.12
- Selenium - 3.12.0
- ui-automation-library-0.0.18

## Requirements
- Java 11
- Maven 3

## Setup

1. Clone the project
2. Open the project in an IDE such as Eclipse or IntelliJ Idea
3. Configure the JDK version in the IDE
4. Install **gcloud cli** and log in following the instructions https://confluence.kw.com/display/KD/Downloading+from+artifact-registry
5. Download dependencies using Maven
6. Create file `src/test/resources/cukes.properties` and fill credentials for local run https://confluence.kw.com/display/KD/How+to+store+sensitive+data+in+circleCI

## Running the tests

- In Intellij Idea - You will see a green color play button on the left-side of the scenario in the feature file. If you click on it, you will get the option to run that scenario
- From the runner class - You can specify the tag name of the scenario you want to run in the "tags", and right-click and choose "Run.." option ("Run as Junit" in Eclipse)
- Using maven - You can run the tests using `mvn verify`. This will run the scenario tags specified in the "tags" of the runner class. This option will also generate the cucumber report
- On CI - Run is started automatically after merging to master

## Reporting

- Local run - Reports are available under `target/cucumber-html-reports`
- CI - reports are available under the **Artifacts** of the Job details