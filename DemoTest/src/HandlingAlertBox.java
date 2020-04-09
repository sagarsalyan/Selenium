import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;  
public class HandlingAlertBox {
	public static void main(String[] args) {  
        
	       // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","D:\\Basic\\Selenium\\chromedriver.exe");  
	  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver(); 
	        
	        // Launch Website  
	        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
	  
	        //Handling alert boxes  
	        //Click on generate alert button  
	        driver.findElement(By.linkText("Generate Alert Box")).click();  
	          
	        //Using Alert class to first switch to or focus to the alert box  
	        Alert alert = (Alert) driver.switchTo().alert();  
	          
	        //Using accept() method to accept the alert box  
	        alert.accept();  
	          
	        //Handling confirm box  
	        //Click on Generate Confirm Box  
	        driver.findElement(By.linkText("Generate Confirm Box")).click();  
	          
	          
	        Alert confirmBox = (Alert) driver.switchTo().alert();  
	          
	        //Using dismiss() command to dismiss the confirm box  
	        //Similarly accept can be used to accept the confirm box  
	        ((Alert) confirmBox).dismiss(); 
	        
	}
}
