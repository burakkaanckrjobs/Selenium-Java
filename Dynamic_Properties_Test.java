package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dynamic_Properties_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebElement label = driver.findElement(By.xpath("//div/p"));
        String Mesage = label.getText();
        System.out.println(Mesage);
        WebElement FirstButton = driver.findElement(By.id("enableAfter"));

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(FirstButton));
        FirstButton.click();

        WebElement ColorChangeButton = driver.findElement(By.id("colorChange"));
        String ClassName = ColorChangeButton.getAttribute("class");
        System.out.println("Before Change : "+ClassName);

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.attributeToBe(ColorChangeButton,"class","mt-4 text-danger btn btn-primary"));
        String ClassName1 = ColorChangeButton.getAttribute("class");
        System.out.println("After Change : "+ClassName1);

        WebDriverWait wait2 =new WebDriverWait(driver,Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();






    }
}
