package marathon_3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Questions extends BaseClass {

//	1) Automate 2 Salesforce testcases in different browsers
//	2) Move common steps/code to Parent class(project specific method)
//	3) Move data to excel sheet and pass multiple data to data provider
//	4) Run all of them in parallel
//	5) Confirm the reports shows all details(index.html and email report)
//
//	Pre-requisite: 
//
//	a) Go to https://developer.salesforce.com/signup (Manually)
//	b) Complete Sign up 
//	c) Have your own username and password
//
//
//	Note: Make sure to add code to handle notifications and to manage Chrome newest version
//
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			ChromeDriver driver = new ChromeDriver(options);
//
//	Test case : 001 (Chrome)
//
//	1. Launch https://login.salesforce.com/ 
//	2. Login to Salesforce with your username and password

//

	@BeforeTest
	public void setdata() {
		filedata = "marathon3";

	}

	@DataProvider(name = "QuestionData")
	public String[][] fetchDataforQuestions() throws IOException {
		String questionData[][] = DataDriven.excelConfig(filedata);

		return questionData;
	}

	@Test(dataProvider = "QuestionData", enabled = false)
	public void launchSalesforce(String questions, String detailsDesc) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		3. Click on the App Launcher (dots)
		WebElement toogleButton = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));

		toogleButton.click();

//		4. Click View All

		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));

		viewAll.click();

//		5. Type Content on the Search box

		WebElement searchInput = driver
				.findElement(By.xpath("//label[text()='Search apps or items...']/following::div[1]/input"));

		searchInput.sendKeys("Content");

//		6. Click the Content Link

		WebElement contentLink = driver.findElement(By.xpath("//p[contains(text(),'Conte')]"));

		contentLink.click();

		Thread.sleep(5000);

//		8. Verify the Chatter title on the page  and Clicking the chatter tab.

		WebElement chatter = driver.findElement(By.xpath("//span[contains(text(),'Chatter')]"));

		driver.executeScript("arguments[0].click();", chatter);

		String chattertitle = driver.getTitle();

		System.out.println(chattertitle);

//		9. Click the Question tab

		WebElement question = driver.findElement(By.xpath("//span[text()='Question']"));

		question.click();

		Thread.sleep(5000);

//		11. Type Details with data (coming from Excel)//	Type Question with data (coming from Excel)

		WebElement questionfromExcel = driver.findElement(By.xpath(
				"//label[@class='inputLabel cuf-questionTitleLabel uiLabel-top form-element__label uiLabel']/following::textarea"));

		questionfromExcel.sendKeys(questions);

		WebElement details = driver
				.findElement(By.xpath("(//div[@id='outerContainer']/div[1]/span/following::div)[3]/p"));

		details.sendKeys(detailsDesc);

//		12. Click Ask

		System.out.println("Successful -------------------1st testCase");

		WebElement Ask = driver.findElement(By.xpath("//button[text()='Ask']"));

		Ask.click();

		Thread.sleep(3000);

//		13. Confirm the question appears

		WebElement questionAppearElement = driver
				.findElement(By.xpath("//span[text()='What are the different Course available?']"));

		String verifyQuestion = questionAppearElement.getText();

		System.out.println(verifyQuestion);

		String title = driver.getTitle();

		System.out.println("The title of the page is" + title);

	}

}
