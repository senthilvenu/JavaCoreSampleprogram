package collections;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Arraylsit {

	WebDriver driver;
	
	@Test	
	public void Asetup()
	{
						
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-committers-oxygen-1a-win32-x86_64\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		
						
	}
	
	@Test
	public void findLink() {
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("************print the size of List*********************");	
		System.out.println("Size of links: "+list.size());
		ArrayList<String> obj=new ArrayList<String>();
					
		for(WebElement ele:list) {
			
			try {
		
		obj.add(ele.getText());
			
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			System.out.println("************print the size of Array list*********************");	
			System.out.println("Size of Array list:"+ obj.size());
			int i=1;
			System.out.println("************print the Link Text*********************");
		for(String s:obj) {  
			
				
			System.out.println(i+ ".Array List: " +s );
			i++;
			if(s.contains("For work")){
				
				break;		
			}
			
		}
	
	}
	
	}
