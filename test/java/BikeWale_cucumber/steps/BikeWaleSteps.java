package BikeWale_cucumber.steps;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BikeWaleSteps {

	ChromeDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@Given("Launch the Chrome Browser")
	public void LaunchTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		
		driver= new ChromeDriver(options);
		js=(JavascriptExecutor)driver;
		
	}
	@And("Maximize the Browser")
	public void MaximizeTheBrowser() {
		driver.manage().window().maximize();
	}
	@And("Apply Wait")
	public void ApplyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Go to https://www.bikewale.com/")
	public void GotoBikeWaleWebsite() throws InterruptedException {
		driver.get("https://www.bikewale.com/");
		Thread.sleep(1000);
	}
	@And("Go to Menu")
	public void GotoMenu() {
		driver.findElementByXPath("//div[@class='leftfloat']/span").click();
	}
	
	@And("Click New Bikes")
	public void ClickNewBikes() {
		driver.findElementByXPath("//ul[@class=\"navUL\"]/li[2]/a").click();
	}
	
	@And("Click compare bikes")
	public void ClickCompareBikes() {
		driver.findElementByLinkText("Compare Bikes").click();
	}
	
	@And("Click Add icon in Add bike1 to add first bike")
	public void ClickAddBike1() {
		driver.findElementByXPath("//span[@class='label-count' and text()='1']/preceding-sibling::span").click();
	}
	@And("Choose First Bike Brand as Royal Enfield")
	public void chooseFirstBikeBrand() {
		driver.findElementByXPath("//p[text()='brand']/../div").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("//li[@class='active-result' and contains(text(),'Royal Enfield')]").click();
	}
	@And("Choose First Bike Model as Thunderbird 350")
	public void chooseFirstBikeModel() {
		driver.findElementByXPath("//p[text()='model']/../div").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("//li[@class='active-result' and contains(text(),'Thunderbird 350')]").click();
		
	}
	
	@And("Click Add icon in Add bike2 to add second bike")
	public void clickAddBike2() {
		driver.findElementByXPath("//span[@class='label-count' and text()='2']/preceding-sibling::span").click();
		}
	
	@And("Choose First Bike Brand as Jawa")
	public void chooseSecondBikeBrand() {
		driver.findElementByXPath("(//p[text()='brand']/../div)[2]").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("(//li[@class='active-result' and contains(text(),'Jawa')])[2]").click();
	}
	@And("Choose First Bike Model as 42")
	public void ChooseSecondBikeModel() {
		driver.findElementByXPath("(//p[text()='model']/../div)[2]").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("//li[@class='active-result' and contains(text(),'42')]").click();
		
	}
	@And("Choose version as Dual Channel ABS - BS VI")
	public void ChooseSecondBikeVersion() {
		driver.findElementByXPath("(//p[text()='version']/../div)[2]").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("//li[@class='active-result' and contains(text(),'Dual Channel ABS - BS IV')]").click();
	}
	
	@And("choose Add Bike 3")
	public void clickAddBike3() {
		driver.findElementByXPath("//span[@class='label-count' and text()='3']/preceding-sibling::span").click();
		}
	@And("choose brand Kawasaki")
	public void chooseThirdBikeBrand() {
		driver.findElementByXPath("(//p[text()='brand']/../div)[3]").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("(//li[@class='active-result' and contains(text(),'Kawasaki')])[3]").click();
	}
	@And("Choose model as Ninja 300")
	public void ChooseThirdBikeModel() {
		driver.findElementByXPath("(//p[text()='model']/../div)[3]").click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElementByXPath("//li[@class='active-result' and contains(text(),'Ninja 300')]").click();
		
	}
	
	@And("Click Compare Button")
	public void ClickCompareButton() {
		driver.findElementById("btnCompare").click();
		
	}
	
	@When("Find and Print the maximum over all rating of all the bikes and find the max")
	public void findAndPrintMaximumOverallRating() {
		
		List<WebElement>BikeBrands=driver.findElementsByXPath("//a[@class='item-target-link underline-none ']/p");
		List<WebElement>BikeModel=driver.findElementsByXPath("//a[@class='item-target-link underline-none ']/h2");
		WebElement reviewsEle = driver.findElementByXPath("//li[text()='Reviews']");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElementByXPath("//li[text()='Reviews']").click();
		List<WebElement>ratings=driver.findElementsByXPath("//div[@class='rating-block']/span/span[2]");
		List<Float>ratingsAsNum= new LinkedList<Float>();
		int count=0;
		for(WebElement ele:ratings) {
			
			ratingsAsNum.add(Float.parseFloat(ele.getText()));
			System.out.println("Bike Brand: "+BikeBrands.get(count).getText()+" Model: "+ BikeModel.get(count).getText()+ " Rating:"+ele.getText());
			count++;
		}
		Float max = Collections.max(ratingsAsNum);
		System.out.println("Maximum Ratings for :"+ BikeBrands.get(ratingsAsNum.indexOf(max)).getText()+"  Rating : "+ max);
		
	}
	@Then("Close the Browser")
	public void closeBrowser() {
		driver.close();
	}
}
