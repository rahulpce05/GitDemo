import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SellIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
		 * WebDriver driver = new EdgeDriver();
		 * 
		 * System.setProperty("webdriver.geco.driver", "drivers//gecodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		  
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    
	    WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
	    
	    System.out.println(footerDriver.findElements(By.tagName("a")).size());
	    
	    WebElement colDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    
	    System.out.println(colDriver.findElements(By.tagName("a")).size());
	    
	    for(int i=1; i<colDriver.findElements(By.tagName("a")).size(); i++) {
	    	String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
	    	colDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
	    	Thread.sleep(5000);
	    }
	    	Set<String> handles = driver.getWindowHandles();
	    	
	    	Iterator itr = handles.iterator();
	    	while(itr.hasNext()) {
	    		driver.switchTo().window((String) itr.next());
	    		System.out.println(driver.getTitle());

	    	}
	    }
	    
	    //driver.close();
	    
	    
	  


	}

