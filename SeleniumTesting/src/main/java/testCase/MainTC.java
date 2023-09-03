package testCase;

import pages.*;
import leafground.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import org.openqa.selenium.JavascriptExecutor;

public class MainTC {
	
	
	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       JavascriptExecutor  js = (JavascriptExecutor) driver;
       
//       TextBox tb=PageFactory.initElements(driver,TextBox.class);
//       tb.FormFill(js,"https://demoqa.com/text-box","Sakthi","Sakthi@gmail.com","Siruseri-Chennai","Iyyappanthangal-Chennai");

//       Button bc=PageFactory.initElements(driver,Button.class);
//       bc.buttonClick("https://demoqa.com/buttons");
       
//       LinkClick cl=PageFactory.initElements(driver,LinkClick.class);
//       cl.clickLinks("https://demoqa.com/links",js);
       
//       CheckBox cb=PageFactory.initElements(driver,CheckBox.class);
//       cb.checkBoxCheck("https://demoqa.com/checkbox");
       
//       RadioButton rb=PageFactory.initElements(driver,RadioButton.class);
//       rb.radioButtonCheck("https://demoqa.com/radio-button");
    
//       UploadAndDownload ud=PageFactory.initElements(driver,UploadAndDownload.class);
//       ud.UploadDownloadCheck("https://demoqa.com/upload-download");
      
//       EditPage ep=PageFactory.initElements(driver,EditPage.class);
//       ep.EditCheck("http://www.leafground.com/pages/Edit.html","sakthi@gmail.com","Appended");
     
//       ButtonsPage bp=PageFactory.initElements(driver,ButtonsPage.class);
//       bp.ButtonCheck("http://www.leafground.com/pages/Button.html");
       
//       LinksPage lp=PageFactory.initElements(driver,LinksPage.class);
//       lp.LinksCheck("http://www.leafground.com/pages/Link.html");
     
//       DropdownPage dp=PageFactory.initElements(driver,DropdownPage.class);
//       dp.dropDownCheck("http://www.leafground.com/pages/Dropdown.html");
       
//       RadioButtonPage rbp=PageFactory.initElements(driver,RadioButtonPage.class);
//       rbp.radioButtonCheck("http://www.leafground.com/pages/radio.html");
       
//       CheckboxPage cbp=PageFactory.initElements(driver,CheckboxPage.class);
//       cbp.checkBoxPageCheck("http://www.leafground.com/pages/checkbox.html");
       
//       AlertPage al=PageFactory.initElements(driver,AlertPage.class);
//       al.alertHandle("http://www.leafground.com/pages/Alert.html");
       
//       FramePage fp=PageFactory.initElements(driver,FramePage.class);
//       fp.FramePageCheck("http://www.leafground.com/pages/frame.html");
       
//       DownloadPage dop=PageFactory.initElements(driver,DownloadPage.class);
//       dop.DownloadCheck("http://www.leafground.com/pages/download.html","http://www.leafground.com/pages/upload.html");
       
//       WindowHandle wh=PageFactory.initElements(driver, WindowHandle.class);
//       wh.WindowsPageCheck("http://www.leafground.com/pages/Window.html");
       
//       SimpleWebTable swt=PageFactory.initElements(driver, SimpleWebTable.class);
//       swt.WebTableCheck("http://www.leafground.com/pages/table.html");
       
       AdvancedWebTable awt=PageFactory.initElements(driver, AdvancedWebTable.class);
       awt.AdvanceWebTableCheck("http://www.leafground.com/pages/sorttable.html");
	}

}


                 