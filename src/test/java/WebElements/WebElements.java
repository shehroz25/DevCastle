package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	private WebDriver driver;
	
	public WebElements(WebDriver driver){
	
		this.driver = driver;
	}
	
	public void openWebsite() {
		driver.get("https://alhikmahinternational.org/crm/public/login");
	}

	public void byIdvalue(String fieldId, String value) {
		WebElement inputfield = driver.findElement(By.id(fieldId));
		inputfield.sendKeys(value);
	}
	
	public void byId(String fieldId) {
		WebElement inputfield = driver.findElement(By.id(fieldId));
		inputfield.click();
	}

	public void bylinktext(String buttonID) {
		WebElement button = driver.findElement(By.linkText(buttonID));
		button.click();
	}

	public void selectDropdownOption(String dropdownId, String optiontext) {
		WebElement dropdown = driver.findElement(By.xpath(dropdownId));
		Select dropdownSelect = new Select(dropdown);
//	        dropdownSelect.selectByIndex(3);
//		dropdownSelect.selectByValue(optiontext);
		dropdownSelect.selectByVisibleText(optiontext);
	}

	public void byXpath(String buttonXpath) {
		WebElement button = driver.findElement(By.xpath(buttonXpath));
		button.click();
	}

	public void byName(String buttonID) {
		WebElement button = driver.findElement(By.name(buttonID));
		button.click();
	}
	
	public void bynamevalue(String fieldId, String value) {
		WebElement inputfield = driver.findElement(By.name(fieldId));
		inputfield.sendKeys(value);
	}
	
	public void byClassName(String buttonID) {
        WebElement button = driver.findElement(By.className(buttonID));
        button.click();
    }
	
	public void byClassNameValue(String fieldId, String value) {
		WebElement inputfield = driver.findElement(By.xpath(fieldId));
		inputfield.sendKeys(value);
	}
	
	public void byCSSValue(String fieldId, String value) {
		WebElement inputfield = driver.findElement(By.cssSelector(fieldId));
		inputfield.sendKeys(value);
	}
	
	public void clearTextField(String ID) {
        WebElement field = driver.findElement(By.name(ID));
        field.clear();
    }
	
	public void clearTextFieldCSS(String ID) {
        WebElement field = driver.findElement(By.cssSelector(ID));
        field.clear();
    }
	
	public void clearTextFieldXpath(String ID) {
        WebElement field = driver.findElement(By.xpath(ID));
        field.clear();
    }

}
