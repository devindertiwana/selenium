package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "D:\\drivers\\chromedriver_win32.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.gmail.com");
		//driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("identifierId")).sendKeys("devindertiwana");		
		driver.findElement(By.linkText("Learn more")).click();
		System.out.println(driver.findElement(By.id("identifierNext")).click());
		//driver.quit();
	}

}
