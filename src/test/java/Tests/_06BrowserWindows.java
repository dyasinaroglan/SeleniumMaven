package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _06BrowserWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTab.click();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //getWindowHandles---bu kaç tane açılan pencere olduğunu gösterir.
        System.out.println(tabs.size());
        // TODO: 22.02.2022  kaç tane tab olduğunu kaç tane açık pencere olduğunu bize verir.
        driver.switchTo().window(tabs.get(1));
        //switch to --- geçiş yapmak.
        // TODO: 22.02.2022 açılır pencerelerden 1. indisteki pencereye geç. 0'dan saymaya başlar.
        System.out.println(driver.getCurrentUrl()); // TODO: 22.02.2022 bulunduğum sayfanın url sini al diyorum
        driver.close(); // TODO: 22.02.2022  sadece son açılan sayfayı kapatır.
    }
}
