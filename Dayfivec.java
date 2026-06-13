package Dayfive;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dayfivec {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_custom_select.asp");
        WebElement dropdown = driver.findElement(By.xpath("(//div[@class='custom-select'])[1]"));
        dropdown.click();
        Thread.sleep(2000);
        WebElement toyota = driver.findElement(By.xpath("//div[@class='select-items']//div[text()='Toyota']"));
        toyota.click();
        WebElement selectedValue = driver.findElement(By.xpath("//div[@class='select-selected']"));
        String text = selectedValue.getText();		   
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", toyota);
        System.out.println("Selected Option is: " + text);
    }
}