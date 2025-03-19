package StandardSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String args[]) throws InterruptedException{
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login.php/");

        Thread.sleep(2000);

        WebElement email_phoneTxt = driver.findElement(By.id("email"));
        WebElement password_Txt = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.name("login"));

        email_phoneTxt.sendKeys("your email");
        password_Txt.sendKeys("your password");
        loginBtn.click();

//        OR easy method
//        driver.findElement(By.id("email")).sendKeys("your email);
//        driver.findElement(By.id("pass")).sendKeys("your password");
//        driver.findElement(By.name("login")).click();

    }
}
