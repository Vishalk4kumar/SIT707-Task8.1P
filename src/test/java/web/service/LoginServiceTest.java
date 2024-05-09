package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("vishal");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("vishal_pass");
		
		// Find dob element
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("11-15-1997");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "success");
		
		driver.close();
	}
	
	 @Test
	    public void testInvalidUsername() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        System.out.println("Driver info: " + driver);

	        driver.navigate().to("file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
	        sleep(5);

	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("invalid_user");

	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("vishal_pass");

	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("11-15-1997");

	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertNotEquals(title, "success");

	        driver.close();
	    }
	 
	 @Test
	    public void testInvalidPassword() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        System.out.println("Driver info: " + driver);

	        driver.navigate().to("file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
	        sleep(5);

	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("vishal");

	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("invalid_pass");

	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("11-15-1997");

	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertNotEquals(title, "success");

	        driver.close();
	    }
	 
	 @Test
	    public void testInvalidDateOfBirthFormat() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        System.out.println("Driver info: " + driver);

	        driver.navigate().to("file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
	        sleep(5);

	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("vishal");

	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("vishal_pass");

	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("01-01-1997"); // Incorrect format

	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertNotEquals(title, "success");

	        driver.close();
	    }
	 
	 @Test
	    public void testEmptyFields() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        System.out.println("Driver info: " + driver);

	        driver.navigate().to("file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
	        sleep(5);

	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();

	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();

	        ele = driver.findElement(By.id("dob"));
	        ele.clear();

	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertNotEquals(title, "success");

	        driver.close();
	    }

	 @Test
	    public void testCaseSensitiveUsername() {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\narwa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        System.out.println("Driver info: " + driver);

	        driver.navigate().to("file:///D:\\Vishal Aus Docx\\Deakin University Documents\\Trimester 3\\SIT707\\java_projects\\8.1P-resources\\pages\\login.html");
	        sleep(5);

	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("Vishal"); // Username with different case

	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("vishal_pass");

	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("1997-11-15");

	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertNotEquals(title, "success");

	        driver.close();
	    }
}
