package Task3;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Challenge3 {
	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");        
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(5000);
        System.out.println("Page Title:"+driver.getTitle());        
        String frame = "error003";
        TakesScreenshot ts=(TakesScreenshot)driver;
        File temp=ts.getScreenshotAs(OutputType.FILE);
        File src = new File("./ErrorShots/" + frame + ".png");
        FileHandler.copy(temp,src);

	}

}