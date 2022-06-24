package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;
    private WebDriverWait wait;

    public static WebDriver getDriver(String browser){

        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver =  new ChromeDriver();
                break;
            default:
                System.out.println("Wrong browser type for webriver. Getting default driver");
                WebDriverManager.chromedriver().setup();
                driver =  new ChromeDriver();
                break;
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
