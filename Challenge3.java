package Task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);  

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);  
    }
}
