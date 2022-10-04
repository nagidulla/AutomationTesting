package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagendra\\Downloads\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://adactinhotelapp.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("username")).sendKeys("nagendra123");
	 driver.findElement(By.id("password")).sendKeys("25121999");
	 driver.findElement(By.id("login")).click();
	 String a = driver.getTitle();
	 String e = "Adactin.com - Search Hotel";
	 if (a==e) {
		 System.out.println("Test pased");
	 }
	 else {
		 System.out.println("Test failed");
	 }
}
}
