package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JquerySelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
	    inputForm.click();
	    WebElement jquerySelect2 = driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
	    jquerySelect2.click();
	    WebElement states1 = driver.findElement(By.xpath("(//span[@id='select2-hsqc-container']"));
	    states1.click();
	    Select select = new Select(states1);
	    select.selectByIndex(4);
	    //WebElement newMexico = driver.findElement(By.xpath("//ul[@id='select2-uvv5-results']//li[@id='select2-uvv5-result-4x4x-NM']"));
	    
		//newMexico.click();
		

	}

}
