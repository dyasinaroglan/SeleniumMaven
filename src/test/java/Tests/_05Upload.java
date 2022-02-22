package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05Upload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");
        WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        upload.sendKeys("C:\\Users\\yasin\\Desktop\\indir.jfif");  //sendKeys diyoruz ama burada yazmamız gereken şey yükleyeceğimiz dosyanın pathi olacak.
    }
}
