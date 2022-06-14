package com.sgtesting.popupwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowDemo {

	public static void main(String[] args) throws Exception {
		
		launchbrowser();
		}
		public static void launchbrowser() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			WebDriver oBrowser=new ChromeDriver();
			
			oBrowser.get("https://www.gps-coordinates.net/my-location");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='__cond-31']/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\AutoIT Scripts\\autoITscript2.exe");
		}
}
