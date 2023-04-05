package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "D:\\drivers\\chromedriver_win32.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//WebElement selectdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
	//	Select dropdown = new Select(selectdropdown);
		//dropdown.selectByIndex(3);
	//	System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
	}

}
