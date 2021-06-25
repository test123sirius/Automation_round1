package question2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class SignUp {
	 public String baseUrl ="http://jt-dev.azurewebsites.net/#/SignUp";  
	 

  
  @BeforeTest
  public void beforeTest() {	
		    
		    System.out.println("launching chrome browser"); 
	        System.setProperty("webdriver.chrome.driver"," C:\selenium-java-3.141.59\driver");
			WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);       
  }

  @Test
  public void register() {	
	 
	 WebElement logo= driver.findElement(By.xpath(".//*[@class='logo']"));
	 WebElement languageDropDown = driver.findElement(By.name("language"));
	 WebElement languageEnglish = driver.findElement(By.xpath(".//*[@class=\"ui-select-choices-row-inner\"]/div[contains(.,'English')]"));
	 WebElement languageDutch =  driver.findElement(By.xpath(".//*[@class=\"ui-select-choices-row-inner\"]/div[contains(.,'Dutch')]"));
	 WebElement firstName = driver.findElement(By.name("name"));
	 WebElement orgName = driver.findElement(By.name("orgName"));
	 WebElement email = driver.findElement(By.name("email"));
	 WebElement checkboxAgree =driver.findElement(By.xpath(".//*[@class=\"ui-checkbox\"]/input"));
	 WebElement submit = drvier,findElement(By.xpath(".//*[@class=\"form-group custom-form-group\"]/button"));
	 
	 languageDropDown.click(); // click the language dropdown
	 
	 firstName.sendKeys("Test QA"); // enter first Name
	 
	 orgName.sendKeys("Think Bridge"); // enter org name
	 
	 email.sendKeys("test@gmail.com"); // enter email
	 
	 checkboxAgree.click(); // Click checkbox
	 submit.click(); // submit the form
	 driver.close(;)
	 
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\OPIDI\\Desktop\\File 1\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("https://mailtrap.io/signin");
	 
		//puts an implicit wait for 10 seconds before throwing exceptions
   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   	//locate the email field
   	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

   	//set the field's value
   	email.sendKeys("myusername@gmail.com");

   	//locate the password field
   	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

   	//set the password's value
   	password.sendKeys("password");

   	//locate and click the submit button
   	driver.findElement(By.xpath("//input[@type='submit']")).click();

   	//locate Demo Inbox and click it
   	driver.findElement(By.xpath("//a[@title='Demo inbox']")).click();

   	//look for the given text in the list of web elements
   	List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'To get started using JabaTalks, please confirm your account.')]"));

   	//check if text has been found or not
   	if(allMessages.isEmpty()) {
		   System.out.println("Test not passed");
   	}else {
		   System.out.println("Test passed");
   	}
	 
	 
	}	
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
