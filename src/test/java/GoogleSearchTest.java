
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception{
		//note: change the path to the location of your phantomjs executable
		File path=new File("C:\\Users\\xxxxx\\Documents\\Alrquitectura\\phantom\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		  System.setProperty("phantomjs.binary.path",path.getAbsolutePath());
		  driver = new PhantomJSDriver();
	}

	@Test
	public void testGoogleSearch() {
		driver.get("http://google.com");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
