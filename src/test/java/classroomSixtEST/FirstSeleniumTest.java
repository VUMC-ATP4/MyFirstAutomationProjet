package classroomSixtEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;


    @Test
    public void myFirstSeleniumTest() throws InterruptedException {
        final String baseUrl = "http://shop.acodemy.lv/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Online shop – acodemy – Just another WordPress site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
    }

    @Test
    public void myTestTwo(){
        final String baseUrl = "https://www.delfi.lv/";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "DELFI - Vadošais ziņu portāls Latvijā - DELFI";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        driver.quit();
    }

}
