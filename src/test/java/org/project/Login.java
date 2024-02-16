package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("NanditaRajkumar");
		driver.findElement(By.id("password")).sendKeys("Nandita1234");
		driver.findElement(By.name("login")).click();
		driver.close();
			
	}

}
