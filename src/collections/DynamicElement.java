package collections;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {
	
	public WebDriver driver;
	
	
	public void DynamicHandling() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-1a-win32-x86_64\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		List<WebElement> list= driver.findElements(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/a[2]/img"));
		System.out.println(list.size());
		List<WebElement> list1= driver.findElements(By.xpath("//img[contains(@src,'//cdn25.vizury.com/ssp/IN_HDFC_DMP/']"));
		
		
		System.out.println(list1.size());
				
						
	}
	public static void main(String arg[]) {
		
		DynamicElement dyn = new DynamicElement();
		dyn.DynamicHandling();
		
		
	}
	
}
