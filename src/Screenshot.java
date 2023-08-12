

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://google.com");
	    
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
        try {
            FileUtils.copyFile(screenshot, new File("screenshot//screenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        driver.close();
	}

}
