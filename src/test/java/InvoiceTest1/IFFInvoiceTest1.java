package InvoiceTest1;
import java.io.FileInputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Browser;
import Invoices.IFFInvoice_1;
import Invoices.IFFInvoice_2;
import Utility.CommonFile;

public class IFFInvoiceTest1 extends Browser{
	
	IFFInvoice_1 jb1;
	IFFInvoice_2 jb2;

	@BeforeMethod
	public void setup() throws Exception {

		initilization();
		jb1 = new IFFInvoice_1();
		jb2 = new IFFInvoice_2();
		
		jb1.verifyLoginApp();
		Thread.sleep(1000);
		jb1.verifyIFFBtn();
		Thread.sleep(1000);
		jb1.verifyFinanceBtn();
		Thread.sleep(1000);
		jb1.verifySingleJobgBtn();
		Thread.sleep(1000);
		jb2.verifyNewBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}


	
	@Test(enabled =true)
	public void data() throws Exception {
		 FileInputStream file1=new FileInputStream("Invoice _TestData\\IFF_INVOICE_TEST_DATA.xlsx");	
			XSSFWorkbook workbook=new XSSFWorkbook(file1);
			XSSFSheet sheet = workbook.getSheet("basicDetails");
			int rowcount = sheet.getLastRowNum();
			int row= rowcount - 6;
			int colcount = sheet.getRow(7).getLastCellNum();
			System.out.println("rowcount in test:"+row+" colcount in test:"+colcount);
	
	//	System.out.println("ROW COUNT IN FINAL TEST ="+row);	
		for(int exec=1;exec<=row;exec++) {
			Thread.sleep(2000);
		jb2.basicDetails(exec);
		jb2.tariffChargs(exec);	
		jb2.otherDetails(exec);	
	//	jb2.saveBtn(exec);
		System.out.println("*** SINGLE JOB INVOICE DONE :"+exec+" ***");
	}
	
	}
	
	@Test(enabled =false)
	public void docker() throws Exception {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		WebDriver driver1=new RemoteWebDriver(new URL(""), cap);
		
	}
	

	@AfterMethod
	
	public void exit(ITestResult b) throws Throwable
	{
		if(ITestResult.FAILURE == b.getStatus())
		{	
			CommonFile.captureScreenshotFaildTC(driver,b.getName());
		}
		Thread.sleep(2500);
		driver.quit();
	
	}
}
