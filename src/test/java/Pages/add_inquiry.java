package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.WebElements;

public class add_inquiry {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElements webelement = new WebElements(driver);
		
		webelement.openWebsite();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webelement.bynamevalue("email", "");
		webelement.bynamevalue("password", "");
		webelement.byXpath("//button[@class='btn btn-primary btn-block btn-lg shadow-lg mt-5']");
		
		webelement.bylinktext("Inquiry Management");
		webelement.bylinktext("Add Inquiry");
		
		webelement.bynamevalue("name", "saddaam");
		webelement.bynamevalue("email", "saddaam@gmail.com");
		webelement.bynamevalue("guardian_name", "student");
		webelement.selectDropdownOption("//select[@name='course']","UI");
		webelement.bynamevalue("phone_number", "8989897");
		webelement.byXpath("//button[@class='btn btn-primary me-1 mb-1']");



	}

}
