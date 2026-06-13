package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        // First Name
        driver.findElement(By.id("firstName")).sendKeys("Indhu");

        // Last Name
        driver.findElement(By.id("lastName")).sendKeys("AR");

        // Email
        driver.findElement(By.id("userEmail")).sendKeys("indhu@gmail.com");

        // Gender
        driver.findElement(By.xpath("//label[text()='Female']")).click();

        // Mobile
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");

        // DOB
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.className("react-datepicker__month-select")).sendKeys("May");
        driver.findElement(By.className("react-datepicker__year-select")).sendKeys("2002");
        driver.findElement(By.xpath("//div[text()='15']")).click();

        // Subjects (FIXED PART)
        driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(text(),'Maths')]"))).click();

        // Scroll down (IMPORTANT FIX)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        // Hobbies
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//label[text()='Sports']"))).click();

        // Address
        driver.findElement(By.id("currentAddress"))
              .sendKeys("Chennai, Tamil Nadu");

        // State
        driver.findElement(By.id("state")).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[text()='NCR']"))).click();

        // City
        driver.findElement(By.id("city")).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[text()='Delhi']"))).click();

        // Scroll to submit (VERY IMPORTANT)
        js.executeScript("window.scrollBy(0,300)");

        // Submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}