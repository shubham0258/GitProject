package git.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GIT_Test_1 
{
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		
		WebElement signup=driver.findElement(By.xpath("//a[@href='/login']"));
		signup.click();
	}

}
