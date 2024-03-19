package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrme.driver", "C:\\Users\\DI18\\eclipse-workspace\\Selenium1\\driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.134:8091/#/home");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
		//driver.close();
	}

}
