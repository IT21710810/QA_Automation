package StandardSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys("Your email");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]")).click();
    }
}
