# Java Algorithms

Used to store the code for algorithms and data structures in Java

## Code Documentation

Code documentation generated via [Javadoc](https://www.oracle.com/java/technologies/javase/javadoc-tool.html)

To run complete the follow
- Make sure the gradle build is successful by running `gradle build`
    - Note: Project built with gradle version `6.5.1`
- View the docs with `gadle -q docs_view`
    - Note: Script located in `build.gradle` 
    - Note: Assumes firefox is installed
- To update the code docs run `gradle -q docs_view` 
    - Note: This generates/creates new code docs

## Code Tests

- Run unit tests `gradle test`
- View unit test results `gradle -q test_view`
