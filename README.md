# Tipico_Assessment
In this project, we are comparing Selenium WebDriver to JavaScript WebDriver IO
Here is some information of what Selenium WebDriver is and what JavaScript WebDriver IO is.
Selenium WebDriver is a tool that is used to automate web application testing to verify that it works as expected. It supports many browsers such as Chrome, Firefox, IE, and Safari. It supports many different programming languages. Some scripting languages like Java, JavaScript, C#, Perl, Ruby, etc. Depending on the application to be tested, one can choose the script accordingly. Selenium WebDriver is open source, meaning it is free to use without purchase. 

WebdriverIO is a Javascript based test automation framework built over nodeJs. It is open source. It is easy to install. It lets you control a browser or a mobile application with just a few lines of code. It makes it possible to write super easy selenium tests with Javascript with either BDD or TDD test framework of your choice. 

To compare the two, Both Selenium WebDriver and WebDriverIO are open source and are used for browser testing. However, Selenium is used for automating browsers, while WebDriverIO is used for automating both browsers and native mobile apps.
 
Step 1: Go to trends.google.com
Step 2: Enter “Selenium WebDriver” to the “enter search term or a topic” input box and press Enter
Step 3: You should be redirected to the “Explore” page
Step 4: Enter “Javascript WebDriverIO” to the “+Compare” field and press Enter
Step 5: You should be on the “Compare” page
Step 6: Select “US => New York” from the filters
Step 7: Select “Past 90 days” from the filters
Step 8: Get the percentual ratio from the “Compared breakdown by metro” section and display it on the console. Make sure, that “Selenium Webdriver” is more popular than 
WebDriverIO when it comes to the actual numbers.


Steps to Download and Install Eclipse IDE
Before the start, please check if you have the Eclipse IDE installed on your system. If it’s not there on your machine, then please install it from the following Link:
https://www.eclipse.org/downloads/
For your note, there are different versions of Eclipse available like the Windows-32/64 bit, Linux, and Mac OS X operating systems. Hence, download the latest version of Eclipse that suits your system configuration.
After the completion of the previous step, locate and start the “eclipse.exe” from the folder where you’d saved the Eclipse binary. And define a path for the “Workspace,” which you’ll be using to set up the Selenium Webdriver project
Six Steps To Setup Selenium WebDriver Project in Eclipse
1) Add a New Java Project in Eclipse IDE
-Open Eclipse IDE, select “Java Project” from the list of project types to create a new module.
2) Enter the name of the project Eg-(Name of Project)
3) Create a New Package
-Right-click on the newly created project as a New-> Package.

4) Create a New Java Class
- Right-click on the newly created package to create a Java class as New->Class.

5) Download the required jar files
-Before we can proceed with writing test scripts, we have to download the following jars to let Selenium test scripts to execute.
- Download Required Jar Files For Selenium WebDriver, with JDK and JRE.
Download Selenium Webdriver jars from Selenium HQ Website (https://selenium.dev/downloads/), extract them, and place them in the “Jar Files” folder.
Poi-3.14-beta1-20151223.jar
Poi-OOXML-3.14-beta1-20151223.jar
Poi-OOXML-schemas-3.14-beta1-20151223.jar
XMLbeans-2.3.0.jar (Inside the OOXML-lib folder)
dom4j-1.6.1.jar (Inside the OOXML-lib folder)
-Download Apache log4j Jar File. Log4j is used to generate logs during test execution.
6) Add Jar Files in Project Build Path
- Right-click on the project “Project.” Select Build Path->Configure Build Path.
-Move to the Libraries tab and click on the “Add External JARs” option. It will open a pop-up for selecting the downloaded JARs.
 -Navigate to the “Lib” folder in which all the JARs are available. Select all of them (using Ctrl+A) and then click on the “Open” button. It’ll add all the JAR files in your project’s build path.
-click on the “OK” switch to close the window.
After this step all the jar files are added in the “Project” build path.


