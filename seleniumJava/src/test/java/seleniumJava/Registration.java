package seleniumJava;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(100));
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("firstName")).sendKeys("Mrudula");
		driver.findElement(By.id("lastName")).sendKeys("CSS");
		driver.findElement(By.id("userEmail")).sendKeys("csstestuser003@gmail.com");
		
		//driver.findElement(By.xpath("//select[@class='custom-select ng-pristine ng-valid ng-touched']")).sendKeys("student");
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='custom-select ng-pristine ng-valid ng-touched']")));
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='custom-select ng-pristine ng-valid ng-touched']")));
//		List<WebElement> list= dropdown.getAllSelectedOptions();
//		System.out.println(list);
//		dropdown.selectByValue("student");
		driver.findElement(By.id("userPassword")).sendKeys("Testuser003");
		driver.findElement(By.id("confirmPassword")).sendKeys("Testuser003");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
;	}

}
