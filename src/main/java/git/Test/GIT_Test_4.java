package git.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GIT_Test_4 
{

	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://shubhamdvispute.atlassian.net/jira/software/projects/SCRUM/boards/1/backlog");
		driver.manage().window().maximize();

	}

}
