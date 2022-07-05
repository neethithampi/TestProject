package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input')]"));
	    inputForm.click();
	    WebElement radioButtonsDemo = driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
	    radioButtonsDemo.click();
	    WebElement femaleRadiobtn = driver.findElement(By.id("inlineRadio2"));
	    femaleRadiobtn.click();
	    boolean isSelectedFemale = femaleRadiobtn.isSelected();
	    System.out.println(isSelectedFemale);
	    WebElement female = driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
	    String text = female.getText();
	    System.out.println(text);
	    boolean isDisplayedFemale = female.isDisplayed();
	    System.out.println(isDisplayedFemale);
	    
	    

	}

}
