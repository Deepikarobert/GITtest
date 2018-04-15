package samplrGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGitTest {
@Test
public void logintest() throws IOException
{
	 WebDriver wd = new FirefoxDriver();
	    wd.manage().window().maximize();
	    wd.get("https://www.flipkart.com/");
	    //2 interface cant b connected/integrated,so casting used here
	    //screenshot can b taken as file,takescreenshot--interface,wd--interface
	    File src= ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	    //fileutils--converting file object to physical object
	    FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\WebDriverTest\\Screenshot\\Google.jpg"));
}
}
