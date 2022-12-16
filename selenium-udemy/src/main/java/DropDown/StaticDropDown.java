package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(
                By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(staticDropdown);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("AED");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("INR");
        System.out.println(select.getFirstSelectedOption().getText());
    }
}
