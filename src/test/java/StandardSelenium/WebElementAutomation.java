package StandardSelenium;

import org.openqa.selenium.WebDriver;
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
//        CheckBoxes();
//        ComboBoxes();
//        DropDownList();
//        Button();
//        TextBox();
//        DynamicTable();
//        LinkText();


    }

    public static void OptionButton() {
    }
}
