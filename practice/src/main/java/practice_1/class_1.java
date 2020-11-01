package practice_1;

import selenium.ChromeDriver;
import selenium.WebDriver;

public class class_1
{
@Test
public void set()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suyog Patil\\Desktop\\Auto\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(www.google.com);
	driver.close();
	System.out.println("Completed");
	}
}
