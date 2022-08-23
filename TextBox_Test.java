package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement Fullname = driver.findElement(By.id("userName"));
        Fullname.click();
        Fullname.sendKeys("ipek");

        WebElement Email=driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        Email.click();
        Email.sendKeys("deneme@outlook.com");

        WebElement Current_Address=driver.findElement(By.id("currentAddress"));
        Current_Address.click();
        Current_Address.sendKeys("Ankara ,Türkiye");

        WebElement Permanent_Address=driver.findElement(By.id("permanentAddress"));
        Permanent_Address.click();
        Permanent_Address.sendKeys("Ankara , Türkiye");

        WebElement submit= driver.findElement(new By.ByCssSelector("button.btn"));
        submit.click();


        ////////////

        WebElement nameText = driver.findElement((By.xpath("//div/p[@id='name']")));
        String name =nameText.getText();
        System.out.println(name);

        WebElement EmailText = driver.findElement((By.xpath("//div/p[@id='email']")));
        String Email_Text =EmailText.getText();
        System.out.println(Email_Text);

        WebElement Curent_Address_Text = driver.findElement((By.xpath("//div/p[@id='currentAddress']")));
        String Curent =Curent_Address_Text.getText();
        System.out.println(Curent);

        WebElement Permanent_Address_Text = driver.findElement((By.xpath("//div/p[@id='permanentAddress']")));
        String Parmanet =Permanent_Address_Text.getText();
        System.out.println(Parmanet);
    }
}
