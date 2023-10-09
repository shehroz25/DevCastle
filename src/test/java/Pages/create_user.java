package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.WebElements;

public class create_user {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElements webelement = new WebElements(driver);
		
		webelement.openWebsite();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webelement.bynamevalue("email", "");
		webelement.bynamevalue("password", "");
		webelement.byXpath("//button[@class='btn btn-primary btn-block btn-lg shadow-lg mt-5']");
		
		webelement.bylinktext("User Management");
		webelement.bylinktext("Add User");
		webelement.bynamevalue("name", "yasir");
		webelement.bynamevalue("email", "yasir@gmail.com");
		webelement.selectDropdownOption("//select[@name='role_id']","Coordinator");
		webelement.bynamevalue("number", "3333333");
		webelement.byXpath("//button[@class='btn btn-primary me-1 mb-1']");
	}

}
