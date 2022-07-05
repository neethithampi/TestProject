package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
	    inputForm.click();
	    WebElement radioButtonsDemo = driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
	    radioButtonsDemo.click();
	    WebElement maleRadiobtn = driver.findElement(By.id("inlineRadio1"));
	    maleRadiobtn.click();
	    WebElement showSelectedValue = driver.findElement(By.id("button-one"));
	    showSelectedValue.click();
	    boolean isSelectedmale = maleRadiobtn.isSelected();
	    System.out.println(isSelectedmale);
	    WebElement displayMessage = driver.findElement(By.id("message-one"));
	    String text = displayMessage.getText();
	    System.out.println(text);
	}

}
