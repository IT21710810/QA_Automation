package StandardSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String args[]) throws InterruptedException{
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login.php/");
    }
}
