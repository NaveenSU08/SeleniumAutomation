package com.sgtesting.pomassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvAssigP2 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginasAdmin();
		createUser1();
		logout();
		loginasuser1();
		createUser2();
		logout();
		loginasuser2();
		createUser3();
		logout();
		loginasuser3();
		logout();
		loginAsUser2();
		modifyPasswordforUser3();
		logout();
		loginasUser3();
		logout();
		loginAsUser1();
		modifyPasswordforUser2();
		logout();
		loginasUser2();
		logout();
		loginasAdmin();
		modifyPasswordforUser1();
		logout();
		loginasUser1();
		logout();
		loginasUser2();
		deleteUser3();
		logout();
		loginasUser1();
		deleteUser2();
		logout();
		loginasAdmin();
		deleteUser1();
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

	private static void loginasAdmin()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser1()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getaddUserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("Demo");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getEmail().sendKeys("DemoUser1@gmail.com");
			Thread.sleep(1000);
			oPage.getUsername().sendKeys("DemoUser1");
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

	private static void createUser2()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getaddUserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("Demo");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("User2");
			Thread.sleep(1000);
			oPage.getEmail().sendKeys("DemoUser2@gmail.com");
			Thread.sleep(1000);
			oPage.getUsername().sendKeys("DemoUser2");
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("welcome234");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("welcome234");
			Thread.sleep(4000);
			oPage.getcreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void createUser3()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getaddUserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("Demo");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("User3");
			Thread.sleep(1000);
			oPage.getEmail().sendKeys("DemoUser3@gmail.com");
			Thread.sleep(1000);
			oPage.getUsername().sendKeys("DemoUser3");
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("welcome345");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("welcome345");
			Thread.sleep(4000);
			oPage.getcreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("welcome123");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
			oPage.getexploreactiTime().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("welcome234");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
			oPage.getexploreactiTime().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser3");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("welcome345");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
			oPage.getexploreactiTime().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginAsUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("welcome123");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginAsUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser2");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("welcome234");
			Thread.sleep(1000);
			oPage.getloginButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyPasswordforUser1()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser1().click();
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("demouser1");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("demouser1");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyPasswordforUser2()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser2().click();
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("demouser2");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("demouser2");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyPasswordforUser3()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser3().click();
			Thread.sleep(1000);
			oPage.getuserPassword().sendKeys("demouser3");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("demouser3");
			Thread.sleep(2000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("demouser1");
			Thread.sleep(2000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser2");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("demouser2");
			Thread.sleep(2000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser3");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("demouser3");
			Thread.sleep(2000);
			oPage.getloginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser1()
	{
		try
		{

			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser1().click();
			Thread.sleep(2000);
			oPage.getdeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser2()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser2().click();
			Thread.sleep(2000);
			oPage.getdeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser3()
	{
		try
		{
			oPage.getclickUserButton().click();
			Thread.sleep(1000);
			oPage.getClickDemoUser3().click();
			Thread.sleep(2000);
			oPage.getdeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(3000);
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
