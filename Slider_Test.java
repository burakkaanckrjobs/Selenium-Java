package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Test{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));

        Actions action =new Actions(driver);
        action.dragAndDropBy(slider,10,0).perform();

        WebElement sliderValue = driver.findElement(By.cssSelector(".range-slider__tooltip__label"));
        String value = sliderValue.getText();

        System.out.println("Recent value :"+value);

        WebElement BoxValue = driver.findElement(By.id("sliderValue"));
        String value1 =BoxValue.getAttribute("value");
        System.out.println("Slider Value : "+value1);




    }
}
