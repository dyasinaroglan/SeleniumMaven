package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class _04DownLoad {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");
        //öncelikle download butonuna tıklamamız gerekiyor.
        WebElement downLoad = driver.findElement(By.id("downloadButton"));
        downLoad.click();

        String indirilenlerPath = "C:\\Users\\yasin\\Downloads"; //dosyanın indiği klasörün path i
        String fileName = "sampleFile.jpeg"; //inen dosyanın ismi
        boolean isDownLoad = isDownload(indirilenlerPath,fileName);

    }
    public static boolean isDownload(String indirilenlerPath, String fileName){
        File file = new File(indirilenlerPath); // indirilenler dosyasının içine bakacak tek tek
        //indirilenleri bir dizinin içine atmamız lazım. hepsini tek tek bakacak ve diziye atacak
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].getName().equals(fileName)){  //dizinin i. elemanını getName ini getir. fileName ile kıyasla
                //aynı ise true dön
                files[i].delete();
                return true;
            }
        }
        return false;
    }
}
