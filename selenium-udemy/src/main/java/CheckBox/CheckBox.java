package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.cssSelector("input[id*='_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='_SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='_SeniorCitizenDiscount']")).isSelected());

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkboxes.size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
//        int i = 0;
//        while (i < 2){
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
        for (int i = 0 ; i < 2 ; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println("Success add 2 Adult pasenggers");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
