package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("(//a[contains(text(),'Table')])[1]"));
		table.click();
		WebElement three = driver.findElement(By.xpath("//a[@data-dt-idx='3']"));
		three.click();
		WebElement brendenWagner = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[8]//td[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", brendenWagner);
		System.out.println(brendenWagner.getText());
	}

}
