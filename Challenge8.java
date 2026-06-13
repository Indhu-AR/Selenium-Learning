package Task2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Challenge8 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Redmi phone");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}