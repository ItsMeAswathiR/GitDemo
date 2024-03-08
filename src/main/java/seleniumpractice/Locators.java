package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrme.driver", "C:\\Users\\DI18\\eclipse-workspace\\Selenium1\\driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Hema");
		driver.findElement(By.name("inputPassword")).sendKeys("Hema123");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Achu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Achu@123");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Achu123");		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9874563210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Achu");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);
//		login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("You are successfully logged in.");
		Thread.sleep(5000);
		//logout
		driver.findElement(By.xpath("//div[@class='login-container']/button")).click();
		System.out.println("You are successfully logged Out.");
		driver.quit();
		
	}

}
