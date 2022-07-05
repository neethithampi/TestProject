package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver","C:\\Users\\AMMU\\Desktop\\TestNg\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
				email.sendKeys("neethi.thampi");
				WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
				password.sendKeys("neethi111");
				WebElement login = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy'or@name='login']"));
				login.click();
				
				
			}

		


	}


