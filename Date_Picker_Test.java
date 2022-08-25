package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Date_Picker_Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();

        WebElement datePickerMonthYearInput = driver.findElement(By.id("datePickerMonthYearInput"));
        datePickerMonthYearInput.click();

        WebElement montElement= driver.findElement(By.className("react-datepicker__month-select"));
        String Text;
        Select select = new Select(montElement);
        select.selectByVisibleText("March");


        WebElement yearElement =driver.findElement(By.className("react-datepicker__year-select"));

        select = new Select(yearElement);
        select.selectByVisibleText("1997");

        List<WebElement> daysElement = (List<WebElement>) driver.findElement(By.cssSelector("react-datepicker__day"));

        for (WebElement dayelement : daysElement)
        {
            String text = dayelement.getText();

        if(text.equals("9"))
        {
            dayelement.click();
            break;
        }
        }
    }
}
