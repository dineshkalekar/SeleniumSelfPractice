package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=2407014284539443509&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
	//	driver.findElement(By.linkText("Amazon miniTV")).click();
		
		driver.findElement(By.className("hm-icon-label")).click();
		
		driver.findElement(By.cssSelector("a[class=hmenu-item]")).click();
		
	//	driver.findElement(By.cssSelector("i[class=hm-icon nav-sprite]")).click();// tagName+placeholder method not work
		
	//	driver.findElement(By.linkText("All")).click(); //linkText method not working
		
		
		
	//	driver.findElement(By.cssSelector("span.hm-icon-label")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Most Gifted')]")).click(); // method is workong but internet Slow
		
		driver.findElement(By.cssSelector("div[data-rows=4]")).click(); 
		
		driver.findElement(By.cssSelector("div[role=treeitem]")).click();

	}

}
