package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
// 2863001100000126
public class axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tripta Sahni\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "https://www.apple.com/in/";
	        driver.get(baseUrl);
	        WebElement openlink = driver.findElement(By.xpath("//div[@class='unit-wrapper']//child::a[@href='/in/iphone-13-pro/']"));
	        openlink.click();
	        
	        WebElement searchbutton= driver.findElement(By.xpath("//a[@id='ac-gn-link-search']"));
	        searchbutton.click();
	        WebElement searchbox= driver.findElement(By.xpath("//div[contains(@class,'ac-gn')]//child::input[@id='ac-gn-searchform-input']"));
	        		searchbox.sendKeys("AirPods");
	        		searchbox.sendKeys(Keys.RETURN);
		
	}

}