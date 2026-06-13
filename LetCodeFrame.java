package Dayfour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LetCodeFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/frame");
        Thread.sleep(2000);
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
        driver.switchTo().frame(frame);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='fname']"));
        firstName.sendKeys("Jothi");
        WebElement lastName = driver.findElement(By.name("lname"));
        lastName.sendKeys("K");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("jothi@gmail.com");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.quit(); 
    }
}
