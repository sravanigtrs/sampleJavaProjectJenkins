package locators.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\git\\sampleJavaProjectJenkins\\srvs\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		 driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 // This step will result in an alert on screen
		 WebElement element = driver.findElement(By.xpath("//input[@style='margin-right:15px;width: 83px;']"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		 element.click();
		 Alert al=driver.switchTo().alert();
		 String text = al.getText();
		 System.out.println(text);
		
	}
	
	

}
