import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    
	   ChromeOptions option = new ChromeOptions();
	   FirefoxOptions option1 = new FirefoxOptions();
	   EdgeOptions option2 = new EdgeOptions();
	   option2.setAcceptInsecureCerts(true);
	   
	   //WebDriver driver = new ChromeDriver(option);
	    //WebDriver driver = new FirefoxDriver(option1);
	   WebDriver driver = new EdgeDriver(option2);
	   driver.get("https://expired.badssl.com/");
	   System.out.println(driver.getTitle());
	   
	   System.out.println("SSL_1");
	   System.out.println("SSL_2");
	}

}
