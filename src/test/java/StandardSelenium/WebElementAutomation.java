package StandardSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAutomation {

    //    create public webdriver object
    public static WebDriver driver;

    public static void main(String args[]) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/HP/OneDrive/Desktop/Software%20Quality%20Assurance%20Professional%20Program/Automation%20html%20file/Web%20elements.html");

//       Calling methods
        OptionButton();
        CheckBoxes();
        ComboBoxes();
//        DropDownList();
//        Button();
//        TextBox();
//        DynamicTable();
//        LinkText();


    }


    public static void OptionButton() {
//        Identify the web element
        WebElement option1 = driver.findElement(By.id("vfb-7-1"));
        WebElement option2 = driver.findElement(By.id("vfb-7-2"));
        WebElement option3 = driver.findElement(By.id("vfb-7-3"));

//        Trigger the action
        option1.click();

//        Validation
        if (option1.isSelected()) {
            System.out.println("Option button 1 has been selected");
        } else {
            System.out.println("Option button 1 didn't selected");
        }
    }

    public static void CheckBoxes() {
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));

        checkbox1.click();
        checkbox2.click();

        if (checkbox1.isSelected() && checkbox2.isSelected()) {
            System.out.println("Check box 1 and 2 has been selected");
        } else {
            System.out.println("Check box 1 and 2 didn't selected");
        }
    }

    public static void ComboBoxes() {
    }
}
