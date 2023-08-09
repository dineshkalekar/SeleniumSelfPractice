package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest3 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	     driver.findElement(By.linkText("/forgot")).click();
		
	     driver.findElement(By.id("userid")).sendKeys("tdk496");
	     
	     driver.findElement(By.id("password")).sendKeys("SunnyDinu@33");
	     
	     driver.findElement(By.className("su-input-label su-dynamic-label")).sendKeys("SunnyDinu@33");
	     
	     driver.findElement(By.tagName("button")).click();
	     
	     driver.findElement(By.linkText("Forgot user ID or password?")).click();
	     
	     driver.close();
	     
	     
	     
	     
		
	}

}
