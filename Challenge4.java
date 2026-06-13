package Task3;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Challenge4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com");
	        Thread.sleep(3000);
	        String actualTitle=driver.getTitle();
	        String expectedTitle="Facebook Page";
	        System.out.println(driver.getTitle());
	        if(actualTitle.equals(expectedTitle)) {
	        	System.out.println("Title matched1!");
	        }else {
	        	System.out.println("Title not matched1!");
	        String frame = "error004";
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File temp=ts.getScreenshotAs(OutputType.FILE);
	        File src = new File("./ErrorShots/" + frame + ".png");
	        FileHandler.copy(temp,src);
	        }
	        driver.quit();
	}

}
