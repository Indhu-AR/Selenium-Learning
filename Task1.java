package pratice;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1 {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com");
				String expectedURL="https://www.amazon.com/";
				String actualURL=driver.getCurrentUrl();
				if(actualURL.equals(expectedURL)) {
					System.out.println("Matched!!   Test Case Passed!!");
				}else {
					System.out.println("Not Matched!!   Test Case Failed!!");
				}
				driver.quit();
			}
	}
