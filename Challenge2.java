package Task2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge2 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        Thread.sleep(3000);
        driver.findElement(By.name("search_query")).sendKeys("India");
    	WebElement searchBtn = driver.findElement(By.id("search-icon-legacy"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click(0)", searchBtn);

 
    }
}

