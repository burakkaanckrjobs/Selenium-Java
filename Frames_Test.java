package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);

        driver.switchTo().parentFrame();

        //List<WebElement> elementList = driver.findElement(By.cssSelector("div[id='framesWrapper'] div"));
        //String Paragraf = elementList.get(1).getText();
        //System.out.println(Paragraf);

        driver.switchTo().frame("frame2");

        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
        String Text2=heading2.getText();
        System.out.println(Text2);
         
    }
}
