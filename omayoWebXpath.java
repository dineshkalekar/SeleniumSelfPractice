package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayoWebXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click(); // // 4. text contains xpath 
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();// 4. text contains xpath 
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();// 4. text contains xpath 
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();// 4. text contains xpath 
		
		driver.findElement(By.linkText("Home")).click(); // using by linkText method
		
		
		driver.findElement(By.xpath("//span[contains(@id,'blogsmenu')]")).click(); // xpath normal method
		driver.findElement(By.xpath("//span[contains(@id,'blogsmenu')]")).click();// xpath normal method
		driver.findElement(By.xpath("//span[contains(@id,'blogsmenu')]")).click();// xpath normal method
		driver.findElement(By.xpath("//span[contains(@id,'blogsmenu')]")).click();// xpath normal method
		
		
	//	driver.findElement(By.linkText("Selenium143")).click();  //work done
		
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("fzgzgz");
		
		

	}

}
