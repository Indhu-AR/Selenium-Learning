package Task2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
    }
}
