package clinique.userlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clinique.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//div[contains(text(),'Sign In')]")).click();
		 driver.findElement(By.name("EMAIL_ADDRESS")).sendKeys("88stocksweb@gmail.com");
		 driver.findElement(By.id("form--signin--field--PASSWORD")).sendKeys("Theautocar1902@");
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Sign In']")).click();

	}

}
