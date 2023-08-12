import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(1,500)");
	    
	    Thread.sleep(2000);
	    js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	    
	    List<WebElement> values = driver.findElements(By.cssSelector("#product td:nth-child(4)"));
	    
	    int sum =0;
	    for(int i=0; i<values.size(); i++) {
	    	
	    	int value = Integer.parseInt(values.get(i).getText());
	    	System.out.println(value);
	    	sum = sum + value;
	    }
	    System.out.println("Total : " +sum);
	    
	    int exp = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

	    
	    
	}

}
