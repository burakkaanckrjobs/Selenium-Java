package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //WebElement adframe = driver.findElement(new By.ByCssSelector("iframe[title='3rd party ad content']"));
        //driver.switchTo().frame(adframe);
        //WebElement CloseButtom =driver.findElement(By.id("cbb"));
        //CloseButtom.click();

        driver.switchTo().frame("frame1");
        WebElement parenBody =driver.findElement(By.tagName("body"));
        System.out.println(parenBody.getText());

        WebElement Childİframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(Childİframe);
        WebElement ChildBody =driver.findElement(By.tagName("p"));
        System.out.println(ChildBody.getText());


    }
}
