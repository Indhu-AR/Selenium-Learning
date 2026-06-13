package Dayfour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class Global {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");
        WebElement iframetab = driver.findElement(By.id("iFrame"));
        iframetab.click();
        WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
        driver.switchTo().frame(frame);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        WebElement onlineTrainingImage = driver.findElement(By.xpath("//img[@data-attachment-id=\"1981\"]"));
        onlineTrainingImage.click();

    }
}