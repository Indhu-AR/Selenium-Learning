package Dayfour;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fourprogram {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/dropdowns");
        WebElement heroes = driver.findElement(By.id("superheros"));
        Select selectHero = new Select(heroes);
        // Selecting options
        selectHero.selectByIndex(0);
        Thread.sleep(1000);
        selectHero.selectByValue("aq");
        Thread.sleep(1000);
        selectHero.selectByVisibleText("Captain America");
        Thread.sleep(1000);
        // ✅ Get First Selected Option
        WebElement firstSelected = selectHero.getFirstSelectedOption();
        System.out.println("First Selected Option: " + firstSelected.getText());
        // ✅ Get All Selected Options
        List<WebElement> allSelected = selectHero.getAllSelectedOptions();
        System.out.println("All Selected Options:");
        for (WebElement option : allSelected) {
            System.out.println(option.getText());
        }
        // ✅ Get All Options in Dropdown
        List<WebElement> allOptions = selectHero.getOptions();
        System.out.println("All Dropdown Options:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
