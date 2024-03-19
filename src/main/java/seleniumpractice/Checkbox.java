package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='_chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='_chk_IndArm']")).isSelected());
		
		//how to get the count of checkbox present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
