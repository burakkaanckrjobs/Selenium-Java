package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Download_Upload_Test {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();


        WebElement Download = driver.findElement(By.id("downloadButton"));
        Download.click();

        String path = "/Users//burak//Downloads";
        String fileName = "sampFile.jpeg";
        Thread.sleep(5000);
        boolean İsDowlaod = İsfiledowload(path,fileName);
        System.out.println(İsDowlaod);


        WebElement Upload = driver.findElement(By.id("uploadFile"));
        Upload.sendKeys("/Users/burak/OneDrive/Masaüstü/resim.png");
    }
    public  static  boolean İsfiledowload(String dowloadPath,String Filename)
    {
        File file = new File(dowloadPath);
        File[] files = file.listFiles();

        for (int i = 0; i<files.length; i++)
        {
            if(files[i].getName().equals(Filename))
            {
                return  true;
            }
        }
        return false;
    }
}

