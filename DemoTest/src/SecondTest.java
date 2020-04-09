import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;  
public class SecondTest {
	public static void main(String[] args) {  
		
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver","D:\\Basic\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    
	    // Launch website  
	    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html"); 
	    
	 // Use the linkText locator method to find the link and perform click using click() method  
	     driver.findElement(By.linkText("This is a link")).click();  
	     driver.navigate().back();  
	       
	          // Click on the textbox and send value  
	     driver.findElement(By.id("fname")).sendKeys("JavaTpoint");  
	       
	        // Clear the text written in the textbox  
	     driver.findElement(By.id("fname")).clear();  
	          
	        // Click on the Submit button using click() command  
	     driver.findElement(By.id("idOfButton")).click();  
	   
	        // Locate the radio button by id and check it using click() function  
	     driver.findElement(By.id("female")).click();  
	          
	        // Locate the checkbox by cssSelector and check it using click() function  
	     driver.findElement(By.cssSelector("input.Performance")).click();  
	              
	        // Use Select class for selecting value from dropdown  
	    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
	    dropdown.selectByVisibleText("Manual Testing"); 
	    
	  //Maximize the browser  
        driver.manage().window().maximize();  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
	}
}
