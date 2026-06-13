package Dayfive;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Dayfive1 {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Open website
        driver.get("https://demo.guru99.com/test/guru99home/");
        // Scrolling in Javascript execution
        WebElement iframeText = driver.findElement(
                By.xpath("//*[text()='Iframe will not show if you have adblocker enabled']")
        );
        js.executeScript("arguments[0].scrollIntoView(false);", iframeText);
    }
}