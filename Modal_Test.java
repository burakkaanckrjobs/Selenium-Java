package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal_Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();

        WebElement showSmallModal = driver.findElement(By.id("showSmallModal"));
        showSmallModal.click();

        WebElement samllModalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(samllModalText.getText());
        WebElement closeSmallModal =driver.findElement(By.id("closeSmallModal"));
        closeSmallModal.click();


        WebElement showLargeModal = driver.findElement(By.id("showLargeModal"));
        showLargeModal.click();

        WebElement longModalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(longModalText.getText());

        WebElement closeLargeModal =driver.findElement(By.id("closeLargeModal"));
        closeLargeModal.click();



    }
}
