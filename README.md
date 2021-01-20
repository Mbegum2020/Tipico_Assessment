# Tipico_Assessment
In this project, we are comparing Selenium WebDriver to JavaScript WebDriver IO. 
Here is some information of what Selenium WebDriver is and what JavaScript WebDriver IO is.
Selenium WebDriver is a tool that is used to automate web application testing to verify that it works as expected. It supports many browsers such as Chrome, Firefox, IE, and Safari. It supports many different programming languages. Some scripting languages like Java, JavaScript, C#, Perl, Ruby, etc. Depending on the application to be tested, one can choose the script accordingly. Selenium WebDriver is open source, meaning it is free to use without purchase. 

WebdriverIO is a Javascript based test automation framework built over nodeJs. It is open source. It is easy to install. It lets you control a browser or a mobile application with just a few lines of code. It makes it possible to write super easy selenium tests with Javascript with either BDD or TDD test framework of your choice. 

To compare the two, Both Selenium WebDriver and WebDriverIO are open source and are used for browser testing. However, Selenium WebDriver is used for automating browsers, while WebDriverIO is used for automating both browsers and native mobile apps.
 
Installation instructions : Steps to Download and Install Eclipse IDE

Before the start, please check if you have the Eclipse IDE installed on your system. If it’s not there on your machine, then please install it from the following Link:
https://www.eclipse.org/downloads/
For your note, there are different versions of Eclipse available like the Windows-32/64 bit, Linux, and Mac OS X operating systems. Hence, download the latest version of Eclipse that suits your system configuration.
After the completion of the previous step, locate and start the “eclipse.exe” from the folder where you’d saved the Eclipse binary. And define a path for the “Workspace,” which you’ll be using to set up the Selenium Webdriver project

Configuration instructions: Six Steps To Setup Selenium WebDriver Project in Eclipse

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

Below is a step by step outline of what is taking place in the script in plain English.

Step 1: Go to trends.google.com
Step 2: Enter “Selenium WebDriver” to the “enter search term or a topic” input box and press Enter
Step 3: You should be redirected to the “Explore” page
Step 4: Enter “Javascript WebDriverIO” to the “+Compare” field and press Enter
Step 5: You should be on the “Compare” page
Step 6: Select “US => New York” from the filters
Step 7: Select “Past 90 days” from the filters
Step 8: Get the percentual ratio from the “Compared breakdown by metro” section and display it on the console. Make sure, that “Selenium Webdriver” is more popular than 
WebDriverIO when it comes to the actual numbers.

TestNG Framework is used for this project: Run the project as TestNG

import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class MunniWork {

	WebDriver driver;//calling on the WebDriver every time with name driver
	@BeforeTest
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Java\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//Go to browser and opens the web page
	driver.get("https://trends.google.com/trends/?geo=US");
	}

	@Test(priority=1)
	public void Search_Selenium_WebDriver() throws InterruptedException {
	//Go to search field and input Selenium WebDriver
	driver.findElement(By.id("input-254")).sendKeys("Selenium WebDriver");
	//wait statement of 3 seconds
	Thread.sleep(5000);
	//takes the locator and enters the value and returns the result
	driver.findElement(By.id("input-254")).sendKeys(Keys.RETURN);
	}
	@Test (priority=2)
	public void Search_Javascript_WebDriverIO () throws InterruptedException {
	//takes the locator and enters the value and enters click
	driver.findElement(By.cssSelector("button[aria-label='Add a search term for comparison']")).click();
	
	//wait statement
	Thread.sleep(1000);

	//Go to search field and input Javascript WebDriver IO
	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys("Javascript WebDriverIO");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys(Keys.DOWN);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys(Keys.ENTER);

	}
	@Test (priority=3)
	public void Filter_By_US() throws InterruptedException {
	//Select “US => New York” from the filters
	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[contains(@class, 'hierarchy-select ng-pristine ng-valid')]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys("New York");
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys(Keys.DOWN);
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys(Keys.ENTER);

	//wait statement
	Thread.sleep(4000);
	}

	@Test (priority=4)
	public void Filter_By_Days() throws InterruptedException {
	//Select “Past 90 days” from the filters
	driver.findElement(By.xpath("//*[contains(@aria-label, 'Select time period')]")).click();
	
	//wait statement
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[contains(@id, 'select_option_20')]")).click();
	
	Thread.sleep(4000);
	
	//Get the percentage ratio from the “Compared breakdown by metro” section and display it on the console.
	System.out.println("User see the result from comparison:Selenium WebDriver is 100% and Javascript WebDriverIO is 0%."
		+ " Selenium WeDriver is much more popular compare to Javascript WebDriverIO ");
	
	}

	@AfterTest
	public void close() {
	//Closing the browser
	driver.close();
	
	}
	}


