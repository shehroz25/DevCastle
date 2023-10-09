package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.WebElements;

public class enroll_user {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElements webelement = new WebElements(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		webelement.openWebsite();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webelement.bynamevalue("email", "");
		webelement.bynamevalue("password", "");
		webelement.byXpath("//button[@class='btn btn-primary btn-block btn-lg shadow-lg mt-5']");
		
		webelement.bylinktext("Inquiry Management");
		webelement.bylinktext("View Inquiries");
		webelement.byClassName("bg-warning");
		webelement.selectDropdownOption("//select[@name='batch']","3");
		webelement.bynamevalue("guardian_phone","3232323232");
		webelement.bynamevalue("nic","3232323232");
		webelement.bynamevalue("address","Khanpur");
		webelement.bynamevalue("dob","06102002");
		webelement.selectDropdownOption("//select[@name='gender']","Female");
		webelement.bynamevalue("nationality","Pakistani");
		webelement.bynamevalue("degree","MS Computer");
		webelement.bynamevalue("institue","MIT");
		webelement.bynamevalue("year","2005");
		webelement.bynamevalue("grade","A+");
		webelement.bynamevalue("fee","100000");
		webelement.byXpath("/html/body/div[2]/div/section/div/div/div/section/div/div/div/div/div/form/div/div[16]/button");
	}

}
