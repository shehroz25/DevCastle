package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.WebElements;

public class course_status {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElements webelement = new WebElements(driver);
		
		webelement.openWebsite();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		webelement.bynamevalue("email", "");
		webelement.bynamevalue("password", "");
		webelement.byXpath("//button[@class='btn btn-primary btn-block btn-lg shadow-lg mt-5']");
		
		webelement.bylinktext("Course Management");
		webelement.bylinktext("View Courses");
		
		webelement.byClassName("bg-success");
		webelement.byClassName("bg-danger");

	}

}
