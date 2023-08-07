package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseClass {

	public static WebDriver driver;

	public Logger logger;

	private Object OutType;
	
	//public rb resourcebundle;
	

	@BeforeClass
	@Parameters("browser")
	public void Setup(String br) {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		logger = LogManager.getLogger(this.getClass());
		// WebDriverManager.chromedriver().setup();

		if (br.equals("chrome")) {
			driver = new ChromeDriver(o);
		} else if (br.equals("edge")) {
			// driver.new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://kite.zerodha.com/");
		driver.get("https://in.tradingview.com/");
		driver.manage().window().maximize();
		

	}

	@AfterClass

	public void TearDown() {

		//driver.close();
	}
	public String captureScreen(String tname)throws IOException {
		
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesscreenshot= (TakesScreenshot)driver;
		File source = takesscreenshot.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("user.dir")+"\\screenshots\\"+ tname+"_"+timeStamp+".png";
		try {
			FileUtils.copyFile(source,new File(destination));
		}catch (Exception e) {
			e.getMessage();
			return destination;
		}
		return destination;
		
		
	}

}
