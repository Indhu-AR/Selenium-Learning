package Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@aria-label='Account']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
    }
}
