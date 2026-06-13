package pratice;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com");
				String title=driver.getTitle();
				System.out.println("Page Title:"+title);
				String windowID=driver.getWindowHandle();
				System.out.println("Window ID:"+windowID);
				
				driver.quit();

			}

	}
