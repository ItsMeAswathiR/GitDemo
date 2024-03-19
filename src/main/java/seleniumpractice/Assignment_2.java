package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rahul");
		System.out.println("Name provided");
		driver.findElement(By.name("email")).sendKeys("hello@gmail.com");
		System.out.println("email provided");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello123");
		System.out.println("Password provided");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement d= driver.findElement(By.id("exampleFormControlSelect1"));
		Select Gender = new Select(d);
		Gender.selectByIndex(1);
		System.out.println("Gender Selected");
		driver.findElement(By.id("inlineRadio2")).click();
		System.out.println("employement provided");
		driver.findElement(By.name("bday")).sendKeys("12-02-2000");
		System.out.println("DOB provided");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Submitted");
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	
		
		
		
		
		
	}

}
