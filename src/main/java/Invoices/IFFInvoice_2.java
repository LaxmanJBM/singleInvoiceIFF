package Invoices;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Browser;
public class IFFInvoice_2 extends Browser{
	
	
	@FindBy(xpath = "//img[@id='ctl00_btnNew']")
	private WebElement newBtn;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$img_book']")private WebElement jobNoD;
	@FindBy(xpath="//input[@id='amp_common_search_lookup_textbox_control__0']")private WebElement bookRefText;
//	@FindBy(xpath="//*[@id=\"amp_common_search_lookup_table_control_\"]/tbody//tr//td")private List<WebElement> allRef;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlOffice']")private WebElement office;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtimpCode']")private WebElement inportCode;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtinvStat']")private WebElement status;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlparty_type']")private WebElement partyType;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$Imgrev_AccName']")private WebElement partyD;
	@FindBy(xpath="//input[@id='amp_common_search_lookup_textbox_control__0']")private WebElement partyName;
	@FindBy(xpath="//*[@id=\"amp_common_search_lookup_table_control_\"]/tbody//tr//td")private List<WebElement> namesP;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtsalepr']")private WebElement salesPerson;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlcustOu']")private WebElement partyOU;
	@FindBy(xpath="ctl00$ContentPlaceHolder1$txtRegion")private WebElement partyGST;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$ctl00']")private WebElement placeOfSupplyD;
	@FindBy(xpath="//input[@id='amp_common_search_lookup_textbox_control__0']")private WebElement regionNameText;
	@FindBy(xpath="//*[@id=\"amp_common_search_lookup_table_control_\"]/tbody//tr//td")private List<WebElement> regionName;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtservice']")private WebElement service;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtshipper']")private WebElement shiperName;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtconsig']")private WebElement consigneeName;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtcustref']")private WebElement customerRef;
	@FindBy(xpath="//textarea[@name='ctl00$ContentPlaceHolder1$txtremarks']")private WebElement remarks;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$btnAddOptions']")private WebElement additionalOptions;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txt_OS_amt']")private WebElement osAmount;;
	@FindBy(xpath="/input[@name='ctl00$ContentPlaceHolder1$txtinvref1']")private WebElement invoiceRef;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtinvDt']")private WebElement invDate;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtdueDt']")private WebElement dueDate;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtFARef']")private WebElement FAVoucher;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtorigin']")private WebElement origin;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtdest']")private WebElement destination;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtroute']")private WebElement route;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddl_del_agst']")private WebElement deliveryAgaint;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlTaxType']")private WebElement taxType;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$lblOfficeGST']")private WebElement GSToffice;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chk_gstbyPOS']")private WebElement POSCheckBox;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtcravailable']")private WebElement crAvailable;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtcrAvailed']")private WebElement crAvailed;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtcrdays']")private WebElement crDay;
	@FindBy(xpath="//textarea[@name='ctl00$ContentPlaceHolder1$txtattndet']")private WebElement attnDetails;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtHouseDoc']")private WebElement houseDocRef;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlInvType']")private WebElement invoiceType;
	
	
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$btnAddNewEntry']")private WebElement addBtn1;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txt_slno']")private WebElement slNo;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$Img_tariff']")private WebElement jobNameD;
	@FindBy(xpath="//input[@id='amp_common_search_lookup_textbox_control__0']")private WebElement nameText;
	@FindBy(xpath="//*[@id=\"amp_common_search_lookup_table_control_\"]/tbody//tr//td")private List<WebElement> allTariffName;
	@FindBy(xpath="//textarea[@name='ctl00$ContentPlaceHolder1$txtg_dis']")private WebElement description;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlg_uom']")private WebElement uom;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtg_qty']")private WebElement qty;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtg_rate']")private WebElement rate;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlg_Cur']")private WebElement currency;
	@FindBy(xpath="//textarea[@name='ctl00$ContentPlaceHolder1$txtg_rem']")private WebElement tariffRemarks;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$btnAdd1']")private WebElement addBtnT;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$Button9']")private WebElement closeBtn;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_Chkbank']")private WebElement checkBox1;
	@FindBy(xpath="ctl00$ContentPlaceHolder1$ddlBank")private WebElement bank;
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_ChkInclu']")private WebElement checkBox2;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlincTariff']")private WebElement inclusiveCharges;
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder1$ddlCur']")private WebElement currencyTax;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$btnAddexh']")private WebElement applyBtn;
	@FindBy(xpath="//img[@id='ctl00_btnSave']")private WebElement saveBtn;
	@FindBy(xpath="//div[@class='fmBox ok']")private WebElement succMsg;
	@FindBy(xpath="//div[@class='fmBox err']")private WebElement errMsg;
	@FindBy(xpath="//a[text()='Close']")private WebElement closeBtnSucc;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$imgclosediv']")private WebElement popClose;
	@FindBy(xpath="//img[@id='ctl00_btnCancel']")private WebElement undo;
	@FindBy(xpath="//img[@id='ctl00_btnNew']")private WebElement newBtnS;
/*	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;	
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;
	@FindBy(xpath="")private WebElement;*/
	
	public IFFInvoice_2() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNewBtn() throws Exception {
		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		String mainpage = driver.getWindowHandle();
		while (it.hasNext()) {
			String str = it.next();
			if (!mainpage.equals(str)) {
				driver.switchTo().window(str);
			}
		}

		newBtn.click();
	}
	
	
	public void basicDetails(int excel) throws Exception {
		
		 FileInputStream file1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\IFFInvoice_Project\\Invoice _TestData\\IFF_INVOICE_TEST_DATA.xlsx");	
			
			
			XSSFWorkbook workbook=new XSSFWorkbook(file1);
			XSSFSheet sheet = workbook.getSheet("basicDetails");
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(7).getLastCellNum();
			System.out.println("BasicDet rowcount:"+rowcount+"BasicDe colcount"+colcount);

			for(int i=7;i<=rowcount;i++)
			{
				XSSFRow celldata = sheet.getRow(i);	
				try {
				System.out.println("VALUE OF ID ="+ celldata.getCell(1).getNumericCellValue());
				int idNo = (int) celldata.getCell(1).getNumericCellValue();
				
				if(idNo == excel) {
					
					
//JOB NO
					
					try {
					    String val = celldata.getCell(2).getStringCellValue();
					    jobNoD.click();
					    bookRefText.sendKeys(val);
					    bookRefText.sendKeys(Keys.ENTER);
						List<WebElement> col = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div/table/tbody//tr//td"));	
						
						for(int i1=2;i1<col.size();i1++)
						{
							if(col.get(i1).getText().equalsIgnoreCase(val))
							{
			     				col.get(i1).click();
			     				break;}	}
					}
					catch(Exception e) {
						System.out.println("Customer Exception ="+e);}	
					
					
//OFFICE
				/*	try {
						String val = celldata.getCell(3).getStringCellValue();
						if(office.isEnabled()) {
							office.sendKeys(val);
							
						}}
					catch(Exception e) {Thread.sleep(1000);}*/
					
					
//PARTY TYPE
					try {
						String val = celldata.getCell(6).getStringCellValue();
						Select s=new Select(partyType);
						Thread.sleep(1000);
						s.selectByVisibleText(val);
						Thread.sleep(1000);
						driver.switchTo().alert().accept();
						Thread.sleep(1500);
						System.out.println("Party Type in Invoice ="+partyType.getText().contains("Vendor"));
					if((partyType.getText().contains("Vendor")) || (partyType.getText().contains("Service Partner")) ) {
						Thread.sleep(1000);
						partyD.click();
						String party = celldata.getCell(7).getStringCellValue();
						partyName.sendKeys(party);
						partyName.sendKeys(Keys.ENTER);
						for(int i1=2;i1<namesP.size();i1++)
						{
							String value1 = namesP.get(i1).getText();
							if(value1.equalsIgnoreCase(party))
							{
								namesP.get(i1).click();
			     				break;}	}
						
					}}
					catch(Exception s) {Thread.sleep(1000);}
				
//PARTY OU
				try {
					if(partyOU.isEnabled()) {
						String val = celldata.getCell(9).getStringCellValue();
						Select s=new Select(partyOU);
						Thread.sleep(1000);
						s.selectByVisibleText(val);	
					}}
				catch(Exception e) {Thread.sleep(1000);}
		
//PLACE OF SUPPLY
				try {
					String region = celldata.getCell(11).getStringCellValue();
					placeOfSupplyD.click();
					regionNameText.sendKeys(region);
					regionNameText.sendKeys(Keys.ENTER);
					for(int i1=2;i1<regionName.size();i1++)
					{
						if(regionName.get(i1).getText().equalsIgnoreCase(region))
						{
							regionName.get(i1).click();
		     				break;}}}
				catch(Exception a) {Thread.sleep(1000);}
					
//REMARKS
				try {
					String remark = celldata.getCell(16).getStringCellValue();
					remarks.clear();
					Thread.sleep(1000);
					remarks.sendKeys(remark);}
				catch(Exception w) {Thread.sleep(1000);}
				
//INV/DUE DATE
				try {
					String inDate = celldata.getCell(17).getStringCellValue();
					String duDate = celldata.getCell(18).getStringCellValue();
					
					invDate.clear();
					JavascriptExecutor js2=(JavascriptExecutor)driver;
					js2.executeScript("arguments[0].value='"+ inDate +"'" , invDate);
					Thread.sleep(1500);
					dueDate.clear();
					JavascriptExecutor js3=(JavascriptExecutor)driver;
					js3.executeScript("arguments[0].value='"+ duDate +"'" , dueDate);}
				catch(Exception p) {Thread.sleep(1000);}
					
					
//TAX TYPE
				try {
					String tax = celldata.getCell(20).getStringCellValue();
					Select se=new Select(taxType);
					se.selectByVisibleText(tax);}
				catch(Exception c) {Thread.sleep(1000);}
				
//ATTN DETAILS
				try {
					String attn = celldata.getCell(21).getStringCellValue();
					Thread.sleep(1500);
					attnDetails.clear();
					attnDetails.sendKeys(attn);}
				catch(Exception e) {Thread.sleep(1000);}
				
				}}
				catch(NullPointerException a) {
					Thread.sleep(500);
				}
	}
	}
	
	
	public void tariffChargs(int excel) throws Exception{
		FileInputStream file1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\IFFInvoice_Project\\Invoice _TestData\\IFF_INVOICE_TEST_DATA.xlsx");	
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		XSSFSheet sheet = workbook.getSheet("tariffCharges");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(7).getLastCellNum();
		System.out.println("BasicDet rowcount:"+rowcount+"BasicDe colcount"+colcount);

		for(int i=7;i<=rowcount;i++)
		{
			XSSFRow celldata = sheet.getRow(i);	
			try {
			System.out.println("VALUE OF ID ="+ celldata.getCell(1).getNumericCellValue());
			int idNo = (int) celldata.getCell(1).getNumericCellValue();
			
			if(idNo == excel) {
				
//INVOICE TYPE
				Thread.sleep(1000);
				String invoice = celldata.getCell(2).getStringCellValue();
				Select se=new Select(invoiceType);
				se.selectByVisibleText(invoice);
				Thread.sleep(800);
				try {
				driver.switchTo().alert().accept();}
				catch(Exception e) {Thread.sleep(1000);}
				Thread.sleep(800);
			
				
//ADD BTN
			try {
				Thread.sleep(1000);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", addBtn1);}
			catch(Exception e) {Thread.sleep(1000);}
			
//SL NO
			try {
			    Thread.sleep(1500);
				int no = (int) celldata.getCell(3).getNumericCellValue();
				JavascriptExecutor js2=(JavascriptExecutor)driver;
				js2.executeScript("arguments[0].value='"+ no +"'" , slNo);}
			catch(Exception a) {Thread.sleep(1000);}
			
				
//JOB NAME
			try {
				Thread.sleep(1000);
				jobNameD.click();
				String tName = celldata.getCell(4).getStringCellValue();
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].value='"+ tName +"'" , nameText);
				nameText.sendKeys(Keys.ENTER);
	
				for(int i1=2;i1<allTariffName.size();i1++)
				{
					if(allTariffName.get(i1).getText().equalsIgnoreCase(tName))
					{
						allTariffName.get(i1).click();
	     				break;}	}}
			catch(Exception e) {Thread.sleep(1000);}
			
				
//DESC	
				Thread.sleep(1000);	
				try {
			String desc = celldata.getCell(5).getStringCellValue();
			description.clear();
			description.sendKeys(desc);	}
				catch(Exception a) {Thread.sleep(1000);}
			
//UOM
			Thread.sleep(1000);
			try {
				String uom1 = celldata.getCell(6).getStringCellValue();
				Select se2=new Select(uom);
				se2.selectByVisibleText(uom1);}
			catch(Exception a) {Thread.sleep(1000);}
			
//QTY
				Thread.sleep(1000);
				try {
				double qty1 = celldata.getCell(7).getNumericCellValue();
				Thread.sleep(1500);
				JavascriptExecutor js3=(JavascriptExecutor)driver;
				js3.executeScript("arguments[0].value='"+ qty1 +"'" , qty);}
				catch(Exception a) {Thread.sleep(1000);}
			
			
//RATE
				Thread.sleep(800);
				try {	
			rate.click();
	        double rateT = celldata.getCell(8).getNumericCellValue();
			JavascriptExecutor js4=(JavascriptExecutor)driver;
			js4.executeScript("arguments[0].value='"+ rateT +"'" , rate);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_Label1']")).click();}
			catch(Exception a) {Thread.sleep(1000);}
			
//CURRENCY		
			Thread.sleep(1000);
			try {
				String curr = celldata.getCell(9).getStringCellValue();
				Select se1=new Select(currency);
				se1.selectByVisibleText(curr);}
			catch(Exception a) {Thread.sleep(1000);}
			
			
			
//REMARKS
				Thread.sleep(1000);
				try {
				String rem = celldata.getCell(10).getStringCellValue();
				tariffRemarks.sendKeys(rem);}
				catch(Exception d) {Thread.sleep(1000);}
//ADD			
				Thread.sleep(2000);
				try {
				addBtnT.click();}
				catch(Exception e) {Thread.sleep(1500);}
			

				
			}}
			catch(NullPointerException a) {
				Thread.sleep(500);
			}
	
		}}
	
	public void otherDetails(int excel) throws Exception{
		FileInputStream file1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\IFFInvoice_Project\\Invoice _TestData\\IFF_INVOICE_TEST_DATA.xlsx");	
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(file1);
		XSSFSheet sheet = workbook.getSheet("otherDetails");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(7).getLastCellNum();
		System.out.println("BasicDet rowcount:"+rowcount+"BasicDe colcount"+colcount);

		for(int i=7;i<=rowcount;i++)
		{
			XSSFRow celldata = sheet.getRow(i);	
			try {
			System.out.println("VALUE OF ID ="+ celldata.getCell(1).getNumericCellValue());
			int idNo = (int) celldata.getCell(1).getNumericCellValue();
			
			if(idNo == excel) {
				
//SCROLLING
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,300)");
				
//BANK DETAILS
				try {
				checkBox1.click();
				if(checkBox1.isSelected()) {
				String bankD = celldata.getCell(2).getStringCellValue();
				Select s=new Select(bank);
				s.selectByVisibleText(bankD);}
				else{
					checkBox1.click();
					String bankD = celldata.getCell(2).getStringCellValue();
					Select s=new Select(bank);
					s.selectByVisibleText(bankD);
					}
				}
				catch(Exception s) {Thread.sleep(1000);}
				
//INCLUSIVE CHARGES
				try {
				checkBox2.click();
				if(checkBox2.isSelected()) {
				String inclusiveCh = celldata.getCell(3).getStringCellValue();
				Select ss=new Select(inclusiveCharges);
				ss.selectByVisibleText(inclusiveCh);}
				else{
					checkBox2.click();
					String inclusiveCh = celldata.getCell(3).getStringCellValue();
					Select ss=new Select(inclusiveCharges);
					ss.selectByVisibleText(inclusiveCh);
					}
				}
				catch(Exception p) {Thread.sleep(1000);}
								
//CURRENCY IN TAX
				
				try {
					String currency1 = celldata.getCell(4).getStringCellValue();
					Select s3=new Select(currencyTax);
					s3.selectByVisibleText(currency1);}
					catch(Exception p) {Thread.sleep(1000);}
				
//APPLY BUTTON
				try {
					Thread.sleep(1000);
					applyBtn.click();}
				catch(Exception a) {Thread.sleep(1000);}
				
				

				
			}}
			catch(NullPointerException a) {
				Thread.sleep(500);
			}
		}}
	
	
	public void saveBtn() throws Exception {
		
//Scroll on top side		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-450)");
//SAVE BUTTON
	/*	try {
			Thread.sleep(2000);
			saveBtn.click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
			
			System.out.println("Successful massage ="+succMsg.getText());//	*   Invoice Saved Successfully CHN/INV/00005/23-24      
			if(succMsg.getText().contains("	*   Invoice Saved Successfully ")) {
			Thread.sleep(1000);
			closeBtnSucc.click();
			
			Thread.sleep(1000);
			popClose.click();
			
			Thread.sleep(1000);
			undo.click();
			
			Thread.sleep(1000);
			newBtnS.click();
			
			}
		     
			
		}
		catch(Exception e) {Thread.sleep(1000);}	*/
		
		Thread.sleep(1500);
	try {
			saveBtn.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
//This is for Successful Booking Code...
	//		System.out.println("Succ massage ="+succMsg.getText());

			 if(succMsg.getText().contains("* Invoice Saved Successfully")) {        // * Invoice Saved Successfully CHN/INV/00007/23-24
						//	JOptionPane.showMessageDialog(null, "Booking Saved Successfully"+ exec);
				
				   Thread.sleep(1500);                 
				   closeBtnSucc.click();
				 
				   Thread.sleep(2000);	
				   popClose.click();
			      	
			      	
			       Thread.sleep(2000);
			       undo.click();
					 
				   Thread.sleep(2000);
				   newBtnS.click();		
							}}

	catch(Exception e) {                      // * Invoice updation failed. Please refer the error details.         
	
		Thread.sleep(1500);
//		System.out.println("Error Massage ="+errMsg.getText());
		if (errMsg.getText().contains("* Invoice updation failed. Please refer the error details.")) {	 // * Invoice updation failed. Please refer the error details.
			//	 JOptionPane.showMessageDialog(null, "*Booking updation failed. Please refer the error details."+ exec);
		 Thread.sleep(1500);
		WebElement close2 = driver.findElement(By.xpath("//a[text()='Close']"));
		close2.click();
		Thread.sleep(1500);
		WebElement errorIcon = driver.findElement(By.xpath("//img[@id='ctl00_ImgErrVal']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(errorIcon).click().build().perform();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//img[@id='closeButton']")).click();
	     
	     Thread.sleep(2000);
		   undo.click();
			 
		   Thread.sleep(2000);
		   newBtnS.click();
		}	
	}
	}
}
