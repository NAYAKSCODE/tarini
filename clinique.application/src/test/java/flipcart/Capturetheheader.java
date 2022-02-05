package flipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturetheheader {

	public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 driver.findElement(By.name("q")).sendKeys("mobile");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
