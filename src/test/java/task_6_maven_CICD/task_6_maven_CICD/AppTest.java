package task_6_maven_CICD.task_6_maven_CICD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest {
    WebDriver driver;

    @Test
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\satal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.demoblaze.com/");    
        
        Assert.assertTrue(driver.getTitle().contains("STORE"), "Title does not match");
        
        driver.quit();
    }
}