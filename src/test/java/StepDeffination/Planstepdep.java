package StepDeffination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Planstepdep {
	WebDriver driver;
	@Given("^Open Demoblaze Application$")
	public void open_Demoblaze_Application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\ChromeDriver\\chrome.exe");
		ChromeOptions app = new ChromeOptions();
		app.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
	   WebElement tom =driver.findElement(By.id("login2"));
	   tom.click(); 
	}

	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
	    WebElement tom1 =driver.findElement(By.id("loginusername"));
	    tom1.sendKeys("jahan2");
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
	    WebElement tom2=driver.findElement(By.id("loginpassword"));
	    tom2.sendKeys("12345");
	}
	//boolean not working
	@Then("^Verify user can Login$")
	public void verify_user_can_Login() throws Throwable {
	    WebElement tom3=driver.findElement(By.xpath("//button[text()='Log in']"));
	    tom3.click();
	    Thread.sleep(3000);
	    boolean tom4= driver.findElement(By.id("nameofuser")).isDisplayed();
	    org.testng.Assert.assertTrue(tom4);
	
	   
	   driver.close();
	 	    
	 }
	//boolean not working
	@Then("^Click cart link$")
	public void click_cart_link() throws Throwable {
		WebElement tom4= driver.findElement(By.xpath("//a[text()='Cart']"));
		tom4.click();
		Thread.sleep(3000);
		boolean you = driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed();											
	org.testng.Assert.assertTrue(you);
		 
		driver.close();  
	}
	@Then("^Select DollsBears from dropdown$")
	public void select_DollsBears_from_dropdown() throws Throwable {
	 Select sl = new Select(driver.findElement(By.id("gh-cat")));
	// sl.selectByVisibleText("Dolls & Bears");
	// sl.selectByValue("12576");
	 sl.selectByIndex(7);
	}

	@Then("^Click Cearch$")
	public void click_Cearch() throws Throwable {
	WebElement you = driver.findElement(By.id("gh-btn"));
	you.click();	
	
	Thread.sleep(3000);
	driver.close();  
	}
	// Mouse Over
	@Then("^mouse hover Service$")
	public void mouse_hover_Service() throws Throwable {
	   Actions AC = new Actions (driver);
	   AC.moveToElement(driver.findElement(By.xpath("//span[text()='Services']"))).build().perform()
;	}

	@Then("^Click View all service$")
	public void click_View_all_service() throws Throwable {
	 WebElement Good= driver.findElement(By.xpath("//a[text()='View All Services']"));
	 Good.click();  
	 
	 Thread.sleep(3000);
	 driver.close();  
	 
	}
	  
	//KYES ENTER
	
	@Then("^Enter GOOGLE in Search Field$")
	public void enter_GOOGLE_in_Search_Field() throws Throwable {
	 WebElement Search= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[3]/div[3]/div/div/div/div[1]/input[2]"));
	 Search.sendKeys("GOOGLE");
	 WebElement Search2= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[3]/div[3]/div/div/div/div[1]/input[2]"));
	 Search2.sendKeys(Keys.ENTER);
	 
	}

	@Then("^Print Privious Close Result$")
	public void print_Privious_Close_Result() throws Throwable {
	String result = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[3]/div/div[4]/div/main/div[2]/div[2]/div/div[1]/div[2]")).getText();                                       
	 System.out.print("PRIVIOUS CLOSE IS" +result); 
	    
	 Thread.sleep(3000);
	 driver.close();    
	}
	@Then("^Print count of links availabe in page$")
	public void print_count_of_links_availabe_in_page() throws Throwable {
	List<WebElement> alllinks= driver.findElements(By.tagName("a"));
	System.out.println("Totat Link in this page"+alllinks.size());

	for(int i=0; i<alllinks.size();i++) {
		
	System.out.println(alllinks.get(i).getAttribute("href"));	
		
		//anything is link it has Attribute ="href"
		//href holds link name
		
	}
	Thread.sleep(3000);
	driver.close();  
	 
	}
	//Scrol Down
	@Then("^Click Sonyexperias(\\d+)$")
	public void click_Sonyexperias(int arg1) throws Throwable {
	 //((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	// Thread.sleep(3000);
	 		
		//WebElement x =driver.findElement(By.xpath("//a[text()='Sony xperia z5']"));
		// x.click();
		//Calendar
		JavascriptExecutor dale = (JavascriptExecutor) driver;

		dale.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value ='10/20/2023'");
		dale.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value ='10/25/2023'");
	
		Thread.sleep(3000);
		driver.close();
	}
	@Then("^Click Help for fram$")
	public void click_Help_for_fram() throws Throwable {
		 ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	    driver.switchTo().frame("classFrame");
	    
	    WebElement xy = driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a"));
	    xy.click();
	    
	    Thread.sleep(3000);
		driver.close();

	}
	@Then("^user name Writedown user field$")
	public void user_name_Writedown_user_field() throws Throwable {
		 ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	   WebElement io =driver.findElement(By.id("login1"));
	   io.sendKeys("Kashem");
	   WebElement k =driver.findElement(By.name("proceed"));
	   k.click();
	   
	   driver.switchTo().alert().accept();
	   
	   Thread.sleep(3000);
	   driver.close();	   
	}
	@Then("^Verify Display Clender page$")
	public void verify_Display_Clender_page(int arg1) throws Throwable {
	    
		 //((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		 
		 //JavascriptExecutor dale = (JavascriptExecutor) driver;
		
		//dale.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value ='10/20/2023'");
		//dale.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value ='10/25/2023'");
		
		//driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		//driver.close();
		
		
	} //// Multiple Window
	@Then("^Verify Display Login page$")
	public void verify_Display_Login_page() throws Throwable {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		WebElement x =driver.findElement(By.xpath("//a[text()='Paychex Flex login']"));
		x.click();
		
		Set<String> allwindow =driver.getWindowHandles();
		Iterator<String> ite= allwindow.iterator();
		String perentsWindow = ite.next();
		String Childwindow =ite.next();
		
		driver.switchTo().window(Childwindow);
		System.out.println("I am in Child Window");
		Thread.sleep(5000);
		
		driver.switchTo().window(perentsWindow);
		System.out.println("I am in perents Window");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
	