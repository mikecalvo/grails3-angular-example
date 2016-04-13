# grails3-angular-example
Using bower plugin to install angularjs and bootstrap and product a sample welcome page with functional test.

# Building Project
Before building project, be sure you have the following items installed:
* npm
* bower
* Firefox

To build the project and run the functional tests, run:
`./gradlew bowerInstall check`

# Using Chrome
If you want to set Chrome as your browser, you will need to install the chrome driver using npm:
`./gradlew npmInstall`
Specify the browser when running the build:
`./gradlew check -Dbrowser=chrome`

