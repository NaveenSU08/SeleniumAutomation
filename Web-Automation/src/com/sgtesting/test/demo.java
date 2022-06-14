package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		/*logout();
		closeApplication();*/

	}
	
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demouser@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("userdemo");
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
