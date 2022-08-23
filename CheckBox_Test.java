package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String HomeCheckBoxCssValue ="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement HomeCheckBox = driver.findElement(new By.ByCssSelector(HomeCheckBoxCssValue));
        HomeCheckBox.click();

        HomeCheckBox = driver.findElement(new By.ByCssSelector(HomeCheckBoxCssValue));

        String HomeCheckboxClassName = HomeCheckBox.getAttribute("class");
        if(HomeCheckboxClassName.equals("rct-icon rct-icon-check"))
        {
            System.out.println("Checkbox is Checked");
        }
        else
        {
            System.out.println("Checkbox is UnChecked");
        }
    }
}
