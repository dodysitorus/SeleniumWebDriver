package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators {
    public static void main(String[] args) throws InterruptedException {
//        getDriver g = new getDriver();
//        g.getDrivers();

        final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //implicit Time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        //wait in java
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3")).sendKeys("test@gmail.com");
//        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("password123");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("083187312");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        
//        WebElement element = driver.findElement(By.id("inputUsername"));
//        element.sendKeys("test@gmail.com");
//        WebElement element1 = driver.findElement(By.name("inputPassword"));
//        element1.sendKeys("test123");

//        driver.close();
    }
}
