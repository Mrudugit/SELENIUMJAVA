package seleniumJava;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement serachId = driver.findElement(By.className("demo"));
		serachId.sendKeys("CBSE Updates 2024");
		serachId.sendKeys(Keys.ENTER);
		
		
		//Robot r = new Robot();
		
		
		

	}

}
