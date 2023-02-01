package seleniumDemo;
import java.util.*;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	@Test()
	public void main1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement ele=driver.findElement(By.xpath("//h3[text()='Multi Selection']/parent::div//input[@id='justAnInputBox']"));
		ele.click();
		System.out.println("vnoe");
		List<WebElement> option=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle comboTreeItemHover']/ancestor::ul//span//input"));
		System.out.println(option.size());
		for(WebElement sin:option)
		{
			System.out.println(sin.getText());
			if(sin.getText().equals("choice 3"))
			{
				sin.click();
			}
		}
	}
}