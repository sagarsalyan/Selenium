import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;  
public class pulimunchiTest {
	public static void main(String[] args) {  
			
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver","D:\\Basic\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    
	 // Launch website  
	    driver.navigate().to("http://localhost:4200/"); 
	    
	    driver.findElement(By.linkText("Search")).click();  
	    
	 // Close the Browser  
        driver.close();  
		    
		    
	}
}
