import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    List<WebElement> urls = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	    System.out.println(urls.size());
	    String url = driver.findElement(By.cssSelector("//a[href*='soap']")).getAttribute("href");
	    
	    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	    
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int res = conn.getResponseCode();
	    System.out.println(res);
	    
	}

}
