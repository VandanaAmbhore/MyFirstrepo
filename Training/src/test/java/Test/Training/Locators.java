package Test.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Java/Driver_Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); //Enter URL
		//1. xpath: -- 2
				//absolute xath should not be used. -- html/body/div[1]/div[5]/div[2]/a 
				//only relative xpath should be used. -- //*[@id='firstname']
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Stefen");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("clark");
		driver.findElement(By.xpath("//div[@id='ADDRESS_GROUP']")).sendKeys("Lane number 6, stevenge");
		
		//id 
		driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.id("lastname")).sendKeys("Peter");
		
		//name
		driver.findElement(By.name("firstname")).sendKeys("Peter");
		driver.findElement(By.name("lastname")).sendKeys("Peter");
		
		//Link Text this is only for links
		driver.findElement(By.linkText("Sign in")).click();
		
		//Partial link text
		driver.findElement(By.partialLinkText("How to pick a")).click();
		
		//6. CSSSelector: ---2
		//if id is there--- #{id}
		//if class is there --- .{class}
		driver.findElement(By.cssSelector("#firstname")).sendKeys("testname");
		driver.findElement(By.cssSelector("#address1")).sendKeys("12 new strt");
				
		//7. class name: not useful  --4
		driver.findElement(By.className("ancAsb")).click();
			
		

	}

}
