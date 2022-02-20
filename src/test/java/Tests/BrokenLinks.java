package Tests;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.HttpParams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Locale;

public class BrokenLinks {


    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/broken");
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

        //status code 200 dönmesi başarılı olduğu anlamına gelir
        //status cıde 500 olsaydı hatalı olduğunu linkin bozuk olduğunu anlamamız gerekecekti.


        }

    }

