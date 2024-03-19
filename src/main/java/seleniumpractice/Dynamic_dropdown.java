package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Options are loaded based upon user actions.That's why we call these dropdowns as dynamic dropdowns.it is used with indexes
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();

	}

}
