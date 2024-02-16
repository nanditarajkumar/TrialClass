package org.project;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JunitDemo {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void browserexit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Before
	
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void login() throws InterruptedException {
    driver.findElement(By.id("username")).sendKeys("NanditaRajkumar");
    driver.findElement(By.id("password")).sendKeys("Nandita1234");
    driver.findElement(By.id("login")).click();
    
    WebElement location = driver.findElement(By.name("location"));
    Select s = new Select(location);
    s.selectByVisibleText("New York");
    
    WebElement hotels = driver.findElement(By.id("hotels"));
    Select s1 = new Select(hotels);
    s1.selectByIndex(1);
    
    WebElement room = driver.findElement(By.name("room_type"));
    Select s2 = new Select(room);
    s2.selectByValue("Super Deluxe");
    
   WebElement no = driver.findElement(By.name("room_nos"));
    Select s3 = new Select(no);
    s3.selectByValue("5");
    
    WebElement datein = driver.findElement(By.name("datepick_in"));
    datein.clear();
    datein.sendKeys("25/04/2024");
    WebElement dateout = driver.findElement(By.name("datepick_out"));
    dateout.clear();
    dateout.sendKeys("27/04/2024");
    
    WebElement adult = driver.findElement(By.name("adult_room"));
    Select s4 = new Select(adult);
    s4.selectByValue("3");
    
    WebElement child = driver.findElement(By.id("child_room"));
    Select s5 = new Select(child);
    s5.selectByValue("2");
    
    driver.findElement(By.name("Submit")).click();
    
    driver.findElement(By.id("radiobutton_0")).click();
    driver.findElement(By.id("continue")).click();
    
    driver.findElement(By.id("first_name")).sendKeys("Dilip");
    driver.findElement(By.id("last_name")).sendKeys("Kumar");
    driver.findElement(By.id("address")).sendKeys("31/15,Arakkonam");
    driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
    WebElement card = driver.findElement(By.id("cc_type"));
    Select sl = new Select(card);
    sl.selectByValue("AMEX");
    
    WebElement exp = driver.findElement(By.id("cc_exp_month"));
    Select ex = new Select(exp);
    ex.selectByValue("4");
    
    
    WebElement year = driver.findElement(By.id("cc_exp_year"));
    Select yearr = new Select(year);
    yearr.selectByValue("2024");
    
    driver.findElement(By.name("cc_cvv")).sendKeys("812");
    driver.findElement(By.id("book_now")).click();

    
    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(200));
    WebElement od = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("order_no"))); 
  
    String text = od.getAttribute("value");
    System.out.println(text);
    

    
    
	}
	
	

}
