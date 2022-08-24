package Test;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Link_Test {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        WebElement Brokenimage = driver.findElement(By.xpath("//div/img[1]"));


        System.out.println("Link");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);
        int  StatusCode =response.getStatusLine().getStatusCode();

        if(StatusCode == 200)
        {
            System.out.println("Valid Link!");
        } else if (StatusCode ==500)
        {
            System.out.println("Broken Link!");
        }

        String brokenimageUrl=Brokenimage.getAttribute("src");
        HttpGet requestImage = new HttpGet(brokenimageUrl);
        HttpResponse responseImage = client.execute(requestImage);
        int  StatusCodeImage =responseImage.getStatusLine().getStatusCode();
        if(StatusCodeImage == 200)
        {
            System.out.println("Valid image!");
        } else if (StatusCodeImage ==500)
        {
            System.out.println("Broken image!");
        }
    }
}
