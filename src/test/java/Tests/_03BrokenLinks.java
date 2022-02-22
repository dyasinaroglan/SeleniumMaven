package Tests;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.HttpParams;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Locale;

public class _03BrokenLinks {


    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/broken");

        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImgUrl = brokenImage.getAttribute("src");
        //img--->hepsinde src attribute vardır.
        System.out.println(brokenImgUrl);


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);




        //status code 200 dönmesi başarılı olduğu anlamına gelir
        //status cıde 500 olsaydı hatalı olduğunu linkin bozuk olduğunu anlamamız gerekecekti.

        /*
        200 – Geçerli Bağlantı
        404 – Bağlantı bulunamadı
        400 – Kötü istek
        401 – Yetkisiz
        500 – Dahili Hata
         */


        }

    }

