package Daythree;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot2 {
			public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com");
		        Thread.sleep(3000);
		        String frame = "error002";
		        File temp = driver.findElement(By.xpath("//input[@type='text']")).getScreenshotAs(OutputType.FILE);
		        File src = new File("./ErrorShots/" + frame + ".png");
		        FileHandler.copy(temp, src);
		        driver.quit();
	}

}