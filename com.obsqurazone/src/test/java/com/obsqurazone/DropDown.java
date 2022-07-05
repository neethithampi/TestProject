package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement dropDown1 = driver.findElement(By.xpath("(//select[contains(@class,'js-states form-control select2')])[1]"));
		dropDown1.click();
		Select select = new Select(dropDown1);
	//	select.selectByIndex(2);
	//	select.selectByValue("Red");
		select.selectByVisibleText("Green");
		select.deselectAll();

	}

}
