package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
	    inputForm.click();
	    WebElement checkBoxDemo = driver.findElement(By.xpath("//a[contains(text(),'Checkbox')]"));
	    checkBoxDemo.click();
	    WebElement checkbox = driver.findElement(By.id("gridCheck"));
	    checkbox.click();
	    WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
	    checkBoxThree.click();
	    boolean checkboxisSelected = checkbox.isSelected();
	    System.out.println(checkboxisSelected);
	    boolean checkBoxThreeIsSelected = checkBoxThree.isSelected();
	    System.out.println(checkBoxThreeIsSelected);

	}

}
