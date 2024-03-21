package Task_1.Task;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	@Test
	
	public void openBrowser() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Keerthi Vardhani/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.coursera.org/");
    driver.manage().window().maximize();
    //search by classname
    WebElement search_class=driver.findElement(By.className("react-autosuggest__input"));
    if (search_class != null) {
        System.out.println("Element with classname found! "+search_class);
    } else {
        System.out.println("Element with classname not found!");
    }
    search_class.sendKeys("Google Data Analytics");
    search_class.sendKeys(Keys.RETURN);
    
   
    //search by css selector
    WebElement search_css_selector=driver.findElement(By.cssSelector("input[placeholder='What do you want to learn?']"));
    if (search_css_selector != null) {
        System.out.println("Element with CSS selector found! "+search_css_selector);
    } else {
        System.out.println("Element with CSS selector not found!");
    }
    search_css_selector.sendKeys("Data Science");
    driver.navigate().to("https://www.coursera.org/search?query=Data%20Science");
    
    //search by xpath
    WebElement search_xpath=driver.findElement(By.xpath("//input[@aria-label='What do you want to learn?']"));
    if (search_xpath != null) {
        System.out.println("Element with xpath found! "+search_xpath);
    } else {
        System.out.println("Element with xpath not found!");
    }
    search_xpath.clear();
    search_xpath.sendKeys("Data Analyst");
    driver.navigate().to("https://www.coursera.org/search?query=Data%20Analyst");
    
    //link text
    WebElement linkText =driver.findElement(By.linkText("Log In"));
    if (linkText != null) {
        System.out.println("Element with link text found! "+linkText);
    } else {
        System.out.println("Element with link text not found!");
    }
    linkText.click();
    
    //partial link text
    WebElement partialLinkText =driver.findElement(By.partialLinkText("Log"));
    if (partialLinkText != null) {
        System.out.println("Element with partial link text found! "+partialLinkText);
    } else {
        System.out.println("Element with partial link text not found!");
    }
     driver.quit();
	}
	 
	

}
