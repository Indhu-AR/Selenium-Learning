


package Dayfive;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
     
		   ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://datatables.net/examples/basic_init/scroll_x.html");
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        Thread.sleep(3000);

	        js.executeScript("window.scrollBy(0,900)");

	        Thread.sleep(3000);
	        js.executeScript("document.querySelector('.dt-scroll-body').scrollLeft=150");

	        Thread.sleep(3000);
	    }
	}
