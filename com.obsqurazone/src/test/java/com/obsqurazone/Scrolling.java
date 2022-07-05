package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("(//a[contains(text(),'Table')])[1]"));
		table.click();
		WebElement sanFrancisco = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[9]//td[3]"));
		//WebElement next = driver.findElement(By.xpath("//a[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", sanFrancisco);
		System.out.println(sanFrancisco.getText());
		//js.executeScript("arguments[0].scrollIntoView();", next);
		//next.click();
		//js.executeScript("window.scrollBy(0,-1000)");

	}

}
