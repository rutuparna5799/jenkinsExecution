package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkins {
	
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RutuparnaPriyadarshi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println("Title of page:"+""+ driver.getTitle());
		System.out.println("URL of page:"+""+ driver.getCurrentUrl() );
		System.out.println("successfully executed");
		driver.close();
	}

}