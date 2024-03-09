package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//static dropdown
		//select dropdown are static
		/*So here we have to tell where exactly the select dropdown is present, right?	
		 * So you just navigated to this page,and now you have to give a knowledge to that select class
				that where that select tag dropdown is there.
				How would you give that knowledge?
				So that knowledge will be given
				if you give the WebElement of that dropdown.*/
		
	    WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(1000);
		Select s = new Select(dropdown);
		s.selectByIndex(3);
		s.getFirstSelectedOption().getText();
		s.selectByVisibleText("AED");
		s.selectByValue("INR");
		
	}

}
