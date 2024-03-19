package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected() );
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
		
		
	}

}
