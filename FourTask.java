package Dayfour;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FourTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Indhu\\OneDrive\\Desktop\\Java\\SeleniumLearning\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement MultipleDropDown=driver.findElement(By.id("superheros"));
        Select fruitDropDown=new Select(MultipleDropDown);     
        System.out.println("Is this multiple drop down box"+ fruitDropDown.isMultiple());
        fruitDropDown.selectByIndex(0);       
        Thread.sleep(3000);
        fruitDropDown.selectByValue("aq");
        Thread.sleep(3000);
        fruitDropDown.selectByVisibleText("Batman");
        Thread.sleep(3000);        
        fruitDropDown.deselectByIndex(0);
        Thread.sleep(3000);
        fruitDropDown.deselectByValue("aq");
        Thread.sleep(3000);
        fruitDropDown.deselectByVisibleText("Batman");        
        System.out.println("First Selected:"+fruitDropDown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        List<WebElement> allSelectedOptions=fruitDropDown.getOptions();
        for(WebElement option:allSelectedOptions) {
        	System.out.println(option.getText());        	
        }
        Thread.sleep(3000);
        fruitDropDown.deselectAll();       
        Thread.sleep(3000);
        driver.close();

	}

}
