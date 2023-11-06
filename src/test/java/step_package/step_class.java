package step_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step_class {
	WebDriver driver;
	@Given("^Open amazon application$")
	public void open_amazon_application() throws Throwable {
	
		
		  System.setProperty("Webdriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");
		  EdgeOptions naz= new EdgeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new EdgeDriver();
		  driver.get("https://www.amazon.com");
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		  driver.manage().window().maximize(); 

	}

	@Then("^Enter item name$")
	public void enter_item_name() throws Throwable {
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
	}

	@Then("^Click on search icon$")
	public void click_on_search_icon() throws Throwable {
		
		WebElement sbton = driver.findElement(By.id("nav-search-submit-button"));
		sbton.click();
		
	}

	@Then("^Click on select item$")
	public void click_on_select_item() throws Throwable {
		
		WebElement sitm = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		sitm.click();
	}

	@Then("^Click on add cart$")
	public void click_on_add_cart() throws Throwable {
		
		WebElement adcrt = driver.findElement(By.id("add-to-cart-button"));
		adcrt.click();
		Thread.sleep(2000);
		
		
	}
	@Then("^Verify item added in cart$")
	public void verify_item_added_in_cart() throws Throwable {
		boolean h = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).isDisplayed();
		Assert.assertTrue(h);
		Thread.sleep(2000);    //this is for validation
		driver.close();
	}


	@Then("^Mouse over in Books page$")
	public void mouse_over_in_Books_page() throws Throwable {
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Books']"))).build().perform();
	    //Thread.sleep(2000);
	}

	@Then("^Click on Books page$")
	public void click_on_Books_page() throws Throwable {
	   WebElement musovr = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(11)"));
	   musovr.click();
	}

	@Then("^Print all links count$")
	public void print_all_links_count() throws Throwable {
	    List<WebElement> alllink= driver.findElements(By.tagName("a"));
	    System.out.println("Total links in this page" + alllink.size());
	    
	    for(int i=0; i<alllink.size(); i ++) {
	    	System.out.println(alllink.get(i).getAttribute("href"));
	    	}
	    driver.close();
	}

	}



