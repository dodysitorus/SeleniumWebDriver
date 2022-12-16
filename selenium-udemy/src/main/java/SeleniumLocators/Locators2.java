package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);

//        Using Chrome Driver
//        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();

//        Using Gecko Driver
        System.setProperty("webdriver.gecko.driver", dir+"/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //implicit Time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        call method getPassword()
        String password = getPassword(driver);

        String name = "rahul";

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
                "Hello " + name + ",");
        driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException{
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        //wait in java
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//        Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
//        0th index - Please use temporary password
//        1st index - rahulshettyacademy' to Login.

//        String[] passwordArray2 = passwordArray[1].split("'");
//        0th index - rahulshettyacademy
//        1st index - to Login.
//        String password = passwordArray2[0];
        String password = passwordArray[1].split("'")[0];
        return password;
    }

}


