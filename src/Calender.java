import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.path2usa.com/travel-companion/");
	    
	    driver.findElement(By.id("form-field-travel_comp_date")).click();

	    while(!driver.findElement(By.cssSelector("[class='flatpickr-current-month'][class='cur-month']")).getText().contains("April")) {
	    	Thread.sleep(2000);
	    	driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
	    }
	    
	    Thread.sleep(5000);
	    List<WebElement> ele = driver.findElements(By.cssSelector(".flatpickr-day"));
	    int count = ele.size();
	    
	    for(int i=0; i<count; i++) {
	    	
	    	String text = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
	    	Thread.sleep(5000);
	    	if(text.equalsIgnoreCase("10")) {
	    		driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
	    		break;
	    	}
	    }
	    
	    
	    
	    
	    
	}

}
