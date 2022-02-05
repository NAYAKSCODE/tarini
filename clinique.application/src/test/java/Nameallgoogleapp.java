import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameallgoogleapp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_Oe']")).click();
		List<WebElement> allName = driver.findElements(By.xpath("//div[@class='EHzcec eejsDc']/ul/li/a/span"));
        for(WebElement wb:allName) {
        	System.out.println(wb.getText());
        }
	}

}
