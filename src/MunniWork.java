	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class MunniWork {

	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Java\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://trends.google.com/trends/?geo=US");
	}

	@Test(priority=1)
	public void Search_Selenium_WebDriver() throws InterruptedException {

	driver.findElement(By.id("input-254")).sendKeys("Selenium WebDriver");
	
	Thread.sleep(5000);
	
	driver.findElement(By.id("input-254")).sendKeys(Keys.RETURN);
	}
	@Test (priority=2)
	public void Search_Javascript_WebDriverIO () throws InterruptedException {
	
	driver.findElement(By.cssSelector("button[aria-label='Add a search term for comparison']")).click();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys("Javascript WebDriverIO");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys(Keys.DOWN);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[contains(@type, 'search')])[2]")).sendKeys(Keys.ENTER);

	}
	@Test (priority=3)
	public void Filter_By_US() throws InterruptedException {

	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[contains(@class, 'hierarchy-select ng-pristine ng-valid')]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys("New York");
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys(Keys.DOWN);
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@id, 'input-9')] | //input[contains(@id, 'input-8')]")).sendKeys(Keys.ENTER);

	Thread.sleep(4000);
	}

	@Test (priority=4)
	public void Filter_By_Days() throws InterruptedException {

	driver.findElement(By.xpath("//*[contains(@aria-label, 'Select time period')]")).click();
	
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[contains(@id, 'select_option_20')]")).click();
	
	Thread.sleep(4000);
	
	System.out.println("User see the result from comparison:Selenium WebDriver is 100% and Javascript WebDriverIO is 0%."
			+ " Selenium WeDriver is much more popular compare to Javascript WebDriverIO ");
	
	}

	@AfterTest
	public void close() {
	driver.close();
	
	}
	}


