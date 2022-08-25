package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Auto_Complete_Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();

        WebElement İnput =driver.findElement(By.id("autoCompleteMultipleInput"));
         İnput.sendKeys("R");

         //List<WebElement> suggestions = driver.findElement(By.cssSelector("auto-complete__option"));
         
        /*for(WebElement sugestiom : suggestions)
         {
             String text = sugestiom.getText();

             System.out.println(sugestiom.getText());
             if(text.toLowerCase().contains("r"))
             {
                 System.out.println(text+"has r letter");

                 if(text.equalsIgnoreCase("Red"))
                 {
                     sugestiom.click();
                     break;
                 }
             }
         }*/
    }
}
