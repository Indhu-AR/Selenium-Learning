package Task2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Thread.sleep(3000);  

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }
}

