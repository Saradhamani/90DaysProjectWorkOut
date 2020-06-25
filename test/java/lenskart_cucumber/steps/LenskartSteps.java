package lenskart_cucumber.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LenskartSteps {
	
	ChromeDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	Actions builder;
	
	@Given("Open the chrome browser")
	public void openTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions ();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		js= (JavascriptExecutor) driver;
		wait= new WebDriverWait(driver,50);
		builder=new Actions(driver);

	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
	    driver.manage().window().maximize();
	}

	@Given("Apply Wait")
	public void applyWait() {
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	}

	@Given("Go to Lenskart website")
	public void goToLenskartWebsite() {
		driver.get("https://www.lenskart.com/");
	}

	@Given("Mouseover on Contact Lenses")
	public void mouseoverOnContactLenses() {
	   WebElement contactLenseEle = driver.findElementByLinkText("Contact Lenses");
	   builder.moveToElement(contactLenseEle).perform();
	   
	}

	@Given("Click on Monthly under Explore By Disposability")
	public void clickOnMonthlyUnderExploreByDisposability() {
	  driver.findElementByXPath("//span[text()='Monthly']/..").click();
	}
	
	@Given("Select brand as Aqualens")
	public void SelectBrand() {
		driver.findElementByXPath("(//span[contains(text(),'Aqualens')])[2]").click();
	}
	@Given("Click on the first product")
	public void ClickFirstProd() {
		driver.findElementByXPath("//div[@class='col-md-12 no-padding text-color-black fw700 margin-b4']").click();
	}
	@Given("Click Buy Now")
	public void ClickBuyNow() {
		//builder.moveByOffset(00, 800).perform();;
		driver.findElementByXPath("//button[@class='thumbnail-btn'][2]").click();
		driver.findElementByXPath("//button[text()='BUY NOW']").click();
	}
	@Given("Select No of boxes as 2 and Power as -1 for both eyes")
	public void ChooseBoxAndEyePower() {
		List<WebElement> boxes = driver.findElementsByName("boxes");
		for (WebElement webElement : boxes) {
			Select box=new Select(webElement);
			box.selectByValue("2");
			
		}
		//right Eye power
		driver.findElementByXPath("//span[text()='Please Select']").click();
		driver.findElementByXPath("//div[text()='-1.00']").click();
		
		//Left Eye Power
		driver.findElementByXPath("//span[text()='Please Select']").click();
		driver.findElementByXPath("//div[text()='-1.00']").click();
	}
	
	@And("Type your name in User's name")
	public void TypeUserName() {
		driver.findElementById("example-text-input").sendKeys("Saradhamani");
	}
	
	@And("click Save and continue")
	public void SaveAndContinue() {
		driver.findElementByXPath("//button[text()='SAVE & CONTINUE']").click();
	}
	@When("Print total amount and click Proceed to Checkout")
	public void PrintTotalAmountAndCheckout() {
		String totalAmount = driver.findElementByXPath("//span[@class='span6 color-yellow text-left']").getText();
		System.out.println("\nTotal Order Amount is : "+totalAmount);
		driver.findElementByXPath("//span[text()='Proceed To Checkout']").click();
	}
	@Then ("Close the Browser")
	public void CloseApp() {
		driver.close();
	}
}
