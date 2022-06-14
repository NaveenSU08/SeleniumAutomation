package com.sgtesting.pomassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssigP1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getaddUserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("Demo");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("User");
			Thread.sleep(1000);
			oPage.getEmail().sendKeys("DemoUser@gmail.com");
			Thread.sleep(1000);
			oPage.getUsername().sendKeys("DemoUser");
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("welcome123");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("welcome123");
			Thread.sleep(4000);
			oPage.getcreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oPage.getdemouserbutton().click();
			Thread.sleep(1000);
			oPage.getdeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getlogoutButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
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
