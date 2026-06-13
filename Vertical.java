package Dayfive;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertical {

    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
     
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://getdataden.com/docs/grid/layout/custom-css/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(3000);
        js.executeScript("document.querySelector('.data-den-grid-main').scrollTop=150");

        Thread.sleep(3000);

        driver.quit();
    }
}
