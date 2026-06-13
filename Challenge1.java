package Task3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Challenge1 {
		  public static void main(String[] args) throws Exception{
	            System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
	            WebDriver driver=new ChromeDriver();
	            driver.get("https://www.facebook.com/");
	            Thread.sleep(5000);
	            WebElement email=driver.findElement(By.name("email"));
	            System.out.println("Height: " + email.getSize().getHeight());
	            System.out.println("Width: " + email.getSize().getWidth());
	            System.out.println("X location: " + email.getLocation().getX());
	            System.out.println("Y location: " + email.getLocation().getY());

	        } 
}
