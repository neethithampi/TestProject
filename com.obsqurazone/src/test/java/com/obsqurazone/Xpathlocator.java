package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
	    inputForm.click();
		WebElement messageTextBox = driver.findElement(By.xpath("//form[@method='POST']//input[@id='single-input-field']"));
		messageTextBox.sendKeys("hi");
		WebElement showMessage = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		showMessage.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String text=yourMessage.getText();
		System.out.println(text);
		WebElement enterValueA = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='value-a']"));
		enterValueA.sendKeys("20");
		WebElement enterValueB = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='value-b']"));
		enterValueB.sendKeys("30");
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement totalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String text2 = totalText.getText();
		System.out.println(text2);
	}

}
