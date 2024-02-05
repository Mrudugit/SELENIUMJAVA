package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTCASSE001 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("csstestuser003@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Testuser003");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		String txtMsg1 = driver.findElement(By.xpath("//label[contains(@class,'blink_me')]")).getText();
		System.out.println(txtMsg1);
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	//	String productName = driver.findElement(By.xpath("//b[normalize-space()='ZARA COAT 3']")).getText();
//		for(WebElement wb : products) {
//			if(wb.getText().equals("ZARA COAT 3")) {
//				System.out.println(wb.getText());
//			}
//			else {
//				System.out.println(wb.getText());
//			}
//			
//		}
//
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		
		System.out.println(prod.getText());
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		}
}


//try {
//String errorMsg = driver.findElement(By.cssSelector("[class='invalid-feedback']")).getText();
//System.out.println(errorMsg);
//}
//catch(Exception e) {
//	System.out.println("exception Handled");
//}
//finally {
//	driver.close();
//}
