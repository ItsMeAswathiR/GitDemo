package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//use this string variable where the name changes dynamically so giving this string var in all sendkeys & in actual resullt
		String m = "Rahul";
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DI18\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DI18\\eclipse-workspace\\Selenium1\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(m);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
//		login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("You are successfully logged in.");
		driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
		driver.findElement(By.tagName("h2")).getText();
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		//here we are using concat where hello will be static and the username will be dynamically change and "," also static so static words given in string and dynamic we are using var
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+m+",");
		driver.findElement(By.xpath("//div[@class='login-container']/button")).click();
		//driver.close();


	}

}
