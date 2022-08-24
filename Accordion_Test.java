package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion_Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/accordian");
        driver.manage().window().maximize();

        WebElement show = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String  Classshow = show.getText();

        if(!Classshow.equals("collapse")) {
            WebElement section1Heading = driver.findElement(By.id("section1Heading"));
            section1Heading.click();
            WebElement section1Content =driver.findElement(By.tagName("p"));
            System.out.println(section1Content.getText());
        }
    }
}
