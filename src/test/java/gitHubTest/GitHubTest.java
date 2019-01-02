package gitHubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubTest {
	
	@Test
	public void login() throws IOException{
		WebDriver wb = new FirefoxDriver();
		wb.manage().window().maximize();
		wb.get("https://www.google.com/");
		File src = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE); //casting two interfaces TakeScreenshot and Webdriver and stored it in file format
		FileUtils.copyFile(src, new File("D:\\Workspace\\WebdriverTest\\Screen shots\\google.jpg")); //FileUtils is a class supported by Apache, to handle the folder operations

	}

}
