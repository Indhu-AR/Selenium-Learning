package Task3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        Thread.sleep(3000);
        List<WebElement> dropdowns=driver.findElements(By.xpath("//div[@role='combobox']"));
        WebElement gender=dropdowns.get(3);
        WebElement male=driver.findElement(By.xpath("//span[text()='Male']"));
        male.click();
        System.out.println("Male is selected!!!");
        driver.quit();
	}

}