package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyXpath {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println();
		
//	driver.findElement(By.xpath("(//*[contains(@type,'text')])[3]")).click(); //for click on mobile number
	
	
	driver.findElement(By.xpath("(//*[contains(@type,'text')])[3]")).sendKeys("997799129"); // for entering mobile number not workig
	
	driver.findElement(By.linkText("")).click(); //for click on mobile number

		
		
	
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();	//for click on more option
		
	//	driver.findElement(By.cssSelector("img[alt=Sign in]")).click();
	}

}
