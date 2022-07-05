package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
		inputForm.click();
		WebElement checkBoxDemo = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxDemo.click();
		WebElement selectAll = driver.findElement(By.id("button-two"));
		selectAll.click();
		WebElement checkBoxOne = driver.findElement(By.id("check-box-one"));
		boolean checkBoxOneIsSelected = checkBoxOne.isSelected();
		System.out.println(checkBoxOneIsSelected);
		WebElement checkBoxTwo = driver.findElement(By.id("check-box-two"));
		boolean checkBoxTwoIsSelected = checkBoxTwo.isSelected();
		System.out.println(checkBoxTwoIsSelected);
		WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
		boolean checkBoxThreeIsSelected = checkBoxThree.isSelected();
		System.out.println(checkBoxThreeIsSelected);
		WebElement checkBoxFour = driver.findElement(By.id("check-box-four"));
		boolean checkBoxFourIsSelected = checkBoxFour.isSelected();
		System.out.println(checkBoxFourIsSelected);
		
		

	}

}
