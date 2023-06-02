package marathonTestCase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ObjectsPackage.AmazonObjects;
import mainClassPackage.BaseClass;

public class AmazonTestCase extends BaseClass {

	@Test(priority = 2,enabled = false)
	public void amazonTest() throws InterruptedException {

		PageFactory.initElements(driver, AmazonObjects.class);
		amazonTestProcess();
	}

	public void amazonTestProcess() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AmazonObjects.searchTextBox.sendKeys("Bags");

		AmazonObjects.listbags.click();

		AmazonObjects.searchButton.click();

		String text = AmazonObjects.result.getText();

		System.out.println(text);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(5000);

		AmazonObjects.firstBrand.click();
		
		Thread.sleep(5000);
		
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;

		executor2.executeScript("window.scrollBy(0,350)", "");

		AmazonObjects.SecondBrand.click();

		String text2 = AmazonObjects.titleofFirstProduct.getText();

		System.out.println(text2);

		String text3 = AmazonObjects.Discountprice.getText();

		System.out.println("The Discount price" + text3);

		String text4 = AmazonObjects.actualPrice.getText();

		System.out.println("The Actual Price" + text4);

		String title = driver.getTitle();

		System.out.println(title);

	}

}
