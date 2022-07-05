package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsType1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement inputForm = driver.findElement(By.className("nav-link"));
		//inputForm.click();
		WebElement messageTextBox = driver.findElement(By.id("single-input-field"));
		messageTextBox.sendKeys("hi");
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
		WebElement yourMessage = driver.findElement(By.id("message-one"));
		String text=yourMessage.getText();
		System.out.println(text);
		WebElement enterValueA = driver.findElement(By.cssSelector("input#value-a"));
		enterValueA.sendKeys("20");
		WebElement enterValueB = driver.findElement(By.cssSelector("input#value-b"));
		enterValueB.sendKeys("30");
		WebElement getTotal = driver.findElement(By.cssSelector("button#button-two"));
		getTotal.click();
		WebElement totalText = driver.findElement(By.id("message-two"));
		String text2 = totalText.getText();
		System.out.println(text2);
		//driver.quit();

	}

}
