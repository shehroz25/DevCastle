package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.WebElements;

public class edit_user {

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
		webelement.bylinktext("View Users");
		webelement.byXpath("//i[@class='bi bi-pencil-square text-success fs-5']");
		
		webelement.clearTextField("name");
		webelement.bynamevalue("name", "shehroz");
		
		webelement.selectDropdownOption("//select[@name='role_id']","Receptionist");
		
		webelement.clearTextField("number");
		webelement.bynamevalue("number", "4444444");
		
		webelement.byXpath("//button[@class='btn btn-success me-1 mb-1']");
		
	}

}
