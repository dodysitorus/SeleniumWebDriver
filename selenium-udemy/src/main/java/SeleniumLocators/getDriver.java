package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDriver{
   public void getDrivers(){
       final String dir = System.getProperty("user.dir");
       System.out.println("current dir = " + dir);
       System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
       WebDriver driver = new ChromeDriver();

    }
}
