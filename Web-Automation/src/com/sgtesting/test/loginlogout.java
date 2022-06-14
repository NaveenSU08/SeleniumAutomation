package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogout {

	public static WebDriver oBrowser=null;


	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		logout();
		closeApplication();

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
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
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
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
