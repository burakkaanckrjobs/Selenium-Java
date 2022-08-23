package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

               ///Double Click//
       WebElement DoubleClickButton =  driver.findElement(By.id("doubleClickBtn"));
        Actions  action = new Actions(driver);
        action.doubleClick(DoubleClickButton).perform();

        WebElement Doublemessage = driver.findElement((By.id("doubleClickMessage")));
        String messageText = Doublemessage.getText();
        System.out.println(messageText);

            // Right Click //
        WebElement RightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(RightClickButton).perform();

        WebElement Rightmessage = driver.findElement((By.id("rightClickMessage")));
        String messageText2  = Rightmessage.getText();
        System.out.println(messageText2);

        // Click me //

        WebElement DynamicClickBtm = driver.findElement(By.xpath("//div/button[starts-with(text(),'Click Me')]"));
        DynamicClickBtm.click();

        WebElement Clickmessage = driver.findElement((By.id("dynamicClickMessage")));
        String messageText3 = Clickmessage.getText();
        System.out.println(messageText3);



    }
}


