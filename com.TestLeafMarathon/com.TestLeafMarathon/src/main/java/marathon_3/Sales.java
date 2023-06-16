package marathon_3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sales extends BaseClass {


	@BeforeTest
	public void setdata() {
		filedata = "Sales";

	}

	@DataProvider(name = "SalesData")
	public String[][] fetchDataforQuestions() throws IOException {
		String questionData[][] = DataDriven.excelConfig(filedata);

		return questionData;
	}

	@Test(dataProvider = "SalesData", enabled = true)
	public void salesManagement(String amount, String name) throws InterruptedException {
		
//		2. Click on the toggle menu button from the left corner

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement toogleButton = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));

		toogleButton.click();
		
//		3. Click View All and click Sales from App Launcher

		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));

		viewAll.click();
		
//		4. Click View All Key Deals in Key Deals 

		WebElement Sales = driver.findElement(By.xpath("//p[text()='Sales']"));

		Sales.click();

		Thread.sleep(5000);

		WebElement viewAll2 = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));

		driver.executeScript("arguments[0].scrollIntoView(true);", viewAll2);
		
		driver.executeScript("arguments[0].click();", viewAll2);
		
		Thread.sleep(5000);
		
//		6. Click on New

		WebElement New = driver.findElement(By.xpath("//div[@title='New']"));

		New.click();
		
//		7. Give Opportunity Name  (From Excel)  //	9. Give the Amount as 75000 (from Excel)

		WebElement Amount = driver.findElement(By.xpath("//input[@name='Amount']"));

		Amount.sendKeys(amount);

		WebElement Name = driver.findElement(By.xpath("//input[@name='Name']"));

		Name.sendKeys(name);
		
//		10. Select Close Date as tomorrow

		WebElement CloseDay = driver.findElement(By.xpath("//input[@name='CloseDate']"));

		CloseDay.click();

		Actions datamove = new Actions(driver);

		datamove.scrollToElement(CloseDay).build().perform();

		WebElement Todaysdate = driver.findElement(By.xpath("(//span[@class='slds-day'])[(text()='17')]"));

		Todaysdate.click();
		
//		8. Select Type as New Customer and Lead Source as Partner Referral

		WebElement Stage = driver.findElement(By.xpath(
				"(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']/span[text()='--None--'])[1]"));

		Stage.click();
		
//		11. Select Stage as Needs Analysis

		WebElement NeedAnalysis = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));

		NeedAnalysis.click();

		WebElement type = driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]"));

		Actions typeScroll = new Actions(driver);

		typeScroll.moveToElement(type).build().perform();

		driver.executeScript("arguments[0].click()", type);
		
//		12. Click on Primary Campaign  Source and Select the first option

		WebElement newCustomer = driver.findElement(By.xpath("//span[text()='New Customer']"));

		driver.executeScript("arguments[0].click()", newCustomer);

		WebElement leadSource = driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));

		Actions leadScroll = new Actions(driver);

		leadScroll.scrollToElement(leadSource).build().perform();

		driver.executeScript("arguments[0].click()", leadSource);

		WebElement partner = driver.findElement(By.xpath("//span[text()='Partner Referral']"));

		partner.click();

		WebElement primaryCampagin = driver
				.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));

		leadScroll.scrollToElement(leadSource).build().perform();

		driver.executeScript("arguments[0].click()", primaryCampagin);

		WebElement restApi = driver.findElement(By.xpath("//span[text()='REST API']"));

		WebDriverWait waitforClick = new WebDriverWait(driver, Duration.ofSeconds(10));

		waitforClick.until(ExpectedConditions.elementToBeClickable(restApi));

		restApi.click();

//		13. Click Save and Verify the opportunity is created"


		WebElement SaveButton = driver.findElement(By.xpath("//button[text()='Save']"));

		SaveButton.click();

		WebElement Notifications = driver
				.findElement(By.xpath("//div[@title='Dhruv Rakshith Aravindh']"));

		String VerifyNotifications = Notifications.getText();

		System.out.println("The new Created Sales peoples are"+VerifyNotifications);

		String title = driver.getTitle();

		System.out.println("The title of the page is" + title);
		
//		14. Close the browser
	}

}
