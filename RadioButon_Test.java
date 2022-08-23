package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButon_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButoonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnable =yesRadioButoonLabel.isEnabled();
        if(isEnable)
        {
            yesRadioButoonLabel.click();
            System.out.println("Clicked YesRadio button");
        }

        WebElement yesRadioButoon = driver.findElement( By.id("yesRadio"));

        boolean isselected =yesRadioButoon.isEnabled();
        if(isselected) {
            System.out.println("Yes radşo button is selected");
        }
        WebElement output =driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement NoRadioButoon = driver.findElement( By.id("noRadio"));
        System.out.println(NoRadioButoon.isEnabled());
    }
}
