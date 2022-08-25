package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBar_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");
        driver.manage().window().maximize();

        WebElement startStopButton = driver.findElement(By.id("startStopButton"));
        startStopButton.click();
        WebElement progressBar = driver.findElement(By.cssSelector("div[role='progressbar']"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(100));
        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("button[class='mt-3 btn btn-primary']"),"id","resetButton"));


        //wait.until(ExpectedConditions.attributeToBe(progressBar,"aria-valuenow","50"));
        //startStopButton.click();






    }
}