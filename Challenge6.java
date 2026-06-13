package Task2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge6 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/trains");
        Thread.sleep(3000);
        driver.findElement(By.id("from_station")).sendKeys("Chennai");
        driver.findElement(By.id("to_station")).sendKeys("Coimbatore");
        driver.findElement(By.id("trainFormButton")).click();

    }
}

