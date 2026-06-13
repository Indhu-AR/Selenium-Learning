package Dayone;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstprogram {
	public static void main(String[] args) {
		//1.system configuration
		System.setProperty("webdriver,chrome.driver","D:\\KARNAN\\Downloads\\ASS\\learnSelenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.getCurrentUrl();
		//driver.getSessionId();
		//driver.close();
		String url =driver.getCurrentUrl();
		System.out.println("Current URL is:"+url);
		//driver.quit();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}