package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.CommonFile;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser extends CommonFile{


		protected static WebDriver driver;

		public void initilization() throws Exception {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(cp);
			driver = new ChromeDriver(options);
			
	    	driver.get(readExcelFileFinal(3, 2));
			driver.manage().window().maximize();  

			
			
		/*	options.addArguments("headless");
			options.setHeadless(true);
			driver = new ChromeDriver(options);
			
			
			//WebDriverManager.chromedriver().setup();
			ChromeOptions options1=new ChromeOptions();
			options1.addArguments("--headless");
			options1.addArguments("--disable-gpu");
			driver=new ChromeDriver(options1);
			driver.get(readExcelFileFinal(3, 2)); 
			driver.manage().window().maximize(); */
		}

}
