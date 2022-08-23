package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbok_test_2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        WebElement sportCheckbox =driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnaled = sportCheckbox.isEnabled();
        System.out.println(isEnaled);

        WebElement sportCheckboxlabel = driver.findElement((new By.ByCssSelector("label[for='hobbies-checkbox-1'")));

        if(isEnaled)
        {
            try {
                sportCheckbox.click();
                System.out.println("Entred Try Block");
            }
            catch (ElementClickInterceptedException e)
            {
                sportCheckboxlabel.click();
                System.out.println("Entered cath Block");
            }
        }
        boolean isSeleceted =sportCheckbox.isEnabled();
        System.out.println(isSeleceted);
    }
}
