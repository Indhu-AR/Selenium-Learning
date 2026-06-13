	package Daytwo;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Secondprogram {
		public static void main(String[] args) {
			        System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
			        ChromeDriver driver = new ChromeDriver();
			        driver.get("https://www.instagram.com/");
			        WebElement mobile = driver.findElement(By.name("email"));
			        mobile.sendKeys("abc@gmail.com");
			        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			        password.sendKeys("12345");
			        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello");
			        driver.findElement(By.xpath("//buttom[text()='Log in']"));
			        driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
			        driver.findElement(By.partialLinkText("Forgotten")).click();	       
		}
	}