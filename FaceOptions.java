package Dayfour;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FaceOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wwww.facebook.com");
        WebElement dayDropDown = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDropDown);
        List<WebElement> allDays = selectDay.getOptions();
        System.out.println("All Day Options:");
        for (WebElement day : allDays) {
            System.out.println(day.getText());
        }

        driver.quit();
        

	}

}
