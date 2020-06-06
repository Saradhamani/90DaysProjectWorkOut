package stepDefenitions;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarWaleStepDefenition {
	
	public RemoteWebDriver driver;
	WebDriverWait wait;
	public CarWaleStepDefenition() {
		/* driver= new ChromeDriver(); */
	}
	@Given("Open Chrome Browser")
	public void openChromeBrowser() {
		/*
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * driver= new ChromeDriver();
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		System.setProperty("webdriver.chrome.silentOutput", "true"); 
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications");
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS); 
		options.merge(cap);
		
		driver = new ChromeDriver(options); 
		wait= new WebDriverWait(driver, 20);
	}

	@Given("Load the application URL")
	public void loadTheApplicationURL() {
	    driver.get("https://www.carwale.com/");
	}

	@Given("maximize the browser")
	public void maximizeTheBrowser() {
	   driver.manage().window().maximize();
	}

	@Given("Apply wait")
	public void applyWait() {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Click on Used")
	public void clickOnUsed() {
	    driver.findElementByXPath("//ul[@id='newUsedSearchOption']/li[2]").click();
	   
	}

	@Given("Select the City as Chennai")
	public void selectTheCityAsChennai() throws InterruptedException {
		
		System.out.println( "Before:"+driver.findElementById("usedCarsList").getText());
		driver.findElementById("usedCarsList").sendKeys("Chennai"); 
		Thread.sleep(3000); 
		driver.findElementByXPath("//a[@cityname='chennai,tamilnadu']").click(); 
	 
	    
	    
	}

	@Given("Select budget min as {int} Lakhs and max as {int} Lakhs")
	public void selectBudgetMinAsLakhsAndMaxAsLakhs(Integer int1, Integer int2) {
		/* driver.findElementById("upDownArrow").click(); */
		 WebElement minDropDown = driver.findElementById("minPriceList");
		   List<WebElement> min_list= minDropDown.findElements(By.tagName("li"));
		   for (WebElement webElement : min_list) {
			   if(webElement.getAttribute("data-min-price").equals(int1.toString())) {
				   webElement.click();
			   }
		   
		
	}
		   WebElement maxDropDown = driver.findElementById("maxPriceList");
		   List<WebElement> max_list= maxDropDown.findElements(By.tagName("li"));
		   for (WebElement webElement : max_list) {
			   if(webElement.getAttribute("data-max-price").equals(int2.toString())) {
				   webElement.click();
			   }
		   }
	}

	@Given("Click Search button")
	public void clickSearchButton() throws InterruptedException {
	    driver.findElementById("btnFindCar").click();
	    Thread.sleep(3000);
	    driver.findElementByLinkText("Don't show anymore tips").click();
	    Thread.sleep(3000);
	}

	@Given("Select Cars with Photos under Only Show Cars With")
	public void selectCarsWithPhotosUnderOnlyShowCarsWith() throws InterruptedException {
	    driver.findElementByXPath("//li[@name='CarsWithPhotos']").click();
	    Thread.sleep(3000);
	}

	@Given("Select Manufacturer as Hyundai")
	public void selectManufacturerAsHyundai() throws InterruptedException {
		WebElement HyundaiEle = driver.findElementByXPath("//span[@class='filterText' and contains(text(),'Hyundai')]");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		int y = HyundaiEle.getLocation().y+200;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='filterText' and contains(text(),'Hyundai')]").click();
	}

	@Given("Select Sub option for Manufacture as creta")
	public void selectSubOptionForManufactureAsCreta() {
		WebElement CretaEle = driver.findElementByXPath("//span[text()='Creta']");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		int y = CretaEle.getLocation().y+200;
		js.executeScript("window.scrollBy(0,"+y+")");
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//span[text()='Creta']")));
	    driver.findElementByXPath("//span[text()='Creta']").click();
	}

	@Given("Select Fuel type as Petrol")
	public void selectFuelTypeAsPetrol() throws InterruptedException {
		
		  WebElement fuelTypeEle =driver.findElementByXPath("//h3[contains(text(),'Fuel Type')]");
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,"+(fuelTypeEle.getLocation().y)+")");
		  Thread.sleep(2000);
		
		  Actions builder= new Actions(driver);
		  builder.moveToElement(fuelTypeEle).click().perform();
		 
		 
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//span[contains(text(),'Petrol')]")));
	   driver.findElementByXPath("//span[contains(text(),'Petrol')]").click();
	   Thread.sleep(3000);
	}

	@Given("Select Best Match as KM: Low to High")
	public void selectBestMatchAs() {
	   Select bestMatch=new Select(driver.findElementById("sort"));
	   bestMatch.selectByVisibleText("KM: Low to High");
	}

	@Given("Validate the Cars are listed with KMs Low to High")
	public void validateTheCarsAreListedWithKMsLowToHigh() {
	   List<WebElement>ListedCarsKM=driver.findElementsByClassName("slkms vehicle-data__item");
	   LinkedList<Integer>OnlyKmValues=new LinkedList<Integer>();
	  for(int i=0;i<ListedCarsKM.size();i++) {
		  
		  OnlyKmValues.add(Integer.parseInt(ListedCarsKM.get(i).getText().replaceAll("^[0-9]", "")));
		  
	  }
	  for(int i=0;i<OnlyKmValues.size();i++) {
		  if(OnlyKmValues.get(i)>OnlyKmValues.get(i+1)) {
			  Assert.fail();
		  }
	  }
	 System.out.println("The Cars are sorted with KM:Lowest to Highest and displayed");
	}

	@Given("Add the Least run KM to the WhishList")
	public void addTheLeastRunKMToTheWhishList() {
		Actions builder= new Actions(driver);
		WebElement shortListIcon = driver.findElementByXPath("//span[@class='shortlist-icon--inactive shortlist'][1]");
		builder.moveToElement(shortListIcon).click().perform();
		//driver.findElementByXPath("//span[@class='shortlist-icon--inactive shortlist'][1]").click();

	}

	@Given("Go to Wishlist and Click on More Details")
	public void goToWishlistAndClickOnMoreDetails() {
	    driver.findElementByXPath("//li[@class='action-box shortlistBtn']").click();
	    driver.findElementByPartialLinkText("More details »").click();
	}

	@When("All the details under Overview  are printed in the Same way as displayed in application")
	public void allTheDetailsUnderOverviewArePrintedInTheSameWayAsDisplayedInApplication() {
	  List<String>windowHandles = new LinkedList<String>(driver.getWindowHandles());
	  driver.switchTo().window(windowHandles.get(1));
	  WebElement overViewElements = driver.findElementByXPath("//div[@id='overview']//ul");
	  List<WebElement> listItems = overViewElements.findElements(By.tagName("li"));
	  System.out.println("\n");
	  for (WebElement webElement : listItems) {
		System.out.printf("%-50s%20s",webElement.findElement(By.xpath("div[1]")).getText(),webElement.findElement(By.xpath("div[2]")).getText()+"\n");
	}
	  driver.switchTo().window(windowHandles.get(0));
	}

	@Then("Close the Browser")
	public void closeTheBrowser() {
	   driver.quit();
	}

}
