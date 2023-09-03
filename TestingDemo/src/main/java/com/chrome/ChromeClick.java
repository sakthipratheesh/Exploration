package com.chrome;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class ChromeClick {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.navigate().to("https://www.google.com");
			chromeDriver.manage().window().maximize();
			chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("new year's eve");
			chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
			//chromeDriver.findElement(By.xpath("//*[@id=\"_M83OYZDROcTi2roPwKK8uAY63\"]/div[2]/div/div/div/div[3]")).click();
			//chromeDriver.findElement(By.className("TWO2xe")).click();
			//chromeDriver.findElement(By.xpath("//*[@id=\"_CM7OYdD0LdCJoASqm7XQCg31\"]/div[2]/div/div/div/div[3]/div[1]/div/img[1]")).click();
			chromeDriver.findElement(By.xpath("//*[@id=\"_CM7OYdD0LdCJoASqm7XQCg31\"]/div[2]/div/div/div/div[3]/div[1]/div/img[2]")).click();
			//*[@id="_CM7OYdD0LdCJoASqm7XQCg31"]/div[2]/div/div/div/div[3]/div[1]/div/img[2]
			/*result = chromeDriver.find_elements_by_xpath("//ol[@id="rso"]/li")[0] //make a list of results and get the first one
					result.find_element_by_xpath("./div/h3/a").click() //click its href
			chromeDriver.findElements(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div/div[1]/a")).click();
		
			results = chromeDriver.find_elements_by_xpath('//div[@class="r"]/a/h3')  # finds webresults
					results[0].click()*/
		}
	}


