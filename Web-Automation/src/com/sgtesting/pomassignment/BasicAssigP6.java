package com.sgtesting.pomassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssigP6 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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

	private static void createCustomer()
	{
		try
		{
			oPage.getTaskButton().click();
			Thread.sleep(1000);
			oPage.getAddNew().click();
			Thread.sleep(1000);
			oPage.getNewCustomer().click();
			Thread.sleep(1000);
			oPage.getEnterCustomerName().sendKeys("DemoCustomer");
			Thread.sleep(1000);
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createProject()
	{
		try
		{
			oPage.getAddNew().click();
			Thread.sleep(1000);
			oPage.getnewProject().click();
			Thread.sleep(1000);
			oPage.getEnterProjectName().sendKeys("DemoProject");
			Thread.sleep(1000);
			oPage.getCreateProject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyProject()
	{
		try
		{
			oPage.getNPSettingButton().click();
			Thread.sleep(1000);
			oPage.getmodifyProjectclick().click();
			Thread.sleep(1000);
			oPage.getmodifyProjectInput().clear();
			Thread.sleep(1000);
			oPage.getmodifyProjectInput().sendKeys("Modify Project");
			Thread.sleep(1000);
			oPage.getNPSettingButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteProject()
	{
		try
		{
			oPage.getNPSettingButton().click();
			Thread.sleep(1000);
			oPage.getActionPButton().click();
			Thread.sleep(1000);
			oPage.getdeleteProject().click();
			Thread.sleep(1000);
			oPage.getdeletePPermently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
	{
		try
		{
			oPage.getNCSettingButton().click();
			Thread.sleep(1000);
			oPage.getActionCButton().click();
			Thread.sleep(1000);
			oPage.getdeleteCustomer().click();
			Thread.sleep(1000);
			oPage.getdeleteCPermently().click();
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
