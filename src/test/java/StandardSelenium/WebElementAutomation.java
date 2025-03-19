package StandardSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
        DropDownList();
        Button();
        TextBox();
//        DynamicTable();
        LinkText();


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
//        identify the web element
        Select comboBox_fruits = new Select(driver.findElement(By.id("fruits")));

//        Select by visible Text - 1st option
        comboBox_fruits.selectByVisibleText("Banana");
        System.out.println("Banana");

//        select bye Index - 2nd option
        comboBox_fruits.selectByIndex(2);
        System.out.println("Apple");

//        select by value
        comboBox_fruits.selectByValue("grape");
        System.out.println("Grape");
    }

    public static void DropDownList() throws InterruptedException {
        Select dropdown_countries = new Select(driver.findElement(By.name("country")));

        dropdown_countries.selectByVisibleText("ANGOLA");
        System.out.println("ANGOLA");

        Thread.sleep(3000);

        dropdown_countries.selectByIndex(14);
        System.out.println("AUSTRIA");
    }

    public static void Button() {
        driver.findElement(By.name("submit"));
        System.out.println("Submit button has been clicked");
    }

    public static void TextBox() {
        driver.findElement(By.name("userName")).sendKeys("Abinaya");
        System.out.println("Abinaya");
    }

    public static void LinkText() {
        driver.findElement(By.linkText("your destination")).click();
        System.out.println("Navigated to SLIIT website");
    }

}
