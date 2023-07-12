# listings-ui-automation
API tests for Listings using BDD approach

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/Krosav4eg/MyBDDFrame/tree/master.svg?style=shield)](https://dl.circleci.com/status-badge/redirect/gh/Krosav4eg/MyBDDFrame/tree/master)

## Tools

- Maven
- Cucumber-Java - 7.0.0
- JUnit - 4.12
- Selenium - 3.14.0
- Selenide - 5.25.1
- Cucumber reporting 5.6.0


## Requirements
- Java 11
- Maven 3 or higher version

## Setup

1. Clone the project
2. Open the project in an IDE such as Eclipse or IntelliJ Idea
3. Configure the JDK version in the IDE
4. Download dependencies using Maven

## Running the tests

- In Intellij Idea - You will see a green color play button on the left-side of the scenario in the feature file. If you click on it, you will get the option to run that scenario
- From the runner class - You can specify the tag name of the scenario you want to run in the "tags", and right-click and choose "Run.." option ("Run as Junit" in Eclipse)
- Using maven - You can run the tests using `mvn verify`. This will run the scenario tags specified in the "tags" of the runner class. This option will also generate the cucumber report
- On CI - Run is started automatically after merging to master

## Reporting

- Local run - Reports are available under `target/cucumber-html-reports`
- CI - reports are available under the **Artifacts** of the Job details