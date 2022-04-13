package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) throws InterruptedException {

    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tripta Sahni\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.amazon.in/";
        driver.get(baseUrl);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));  //xpath:  //input[@id="twotabsearchtextbox"]
        searchBox.sendKeys("books");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();

        WebElement title = driver.findElement(By.xpath("//span[contains(@class,\"a-size-base-plus\")][1]"));
        String titleName = title.getText();
        System.out.println("First Book: "+titleName);

    }
}