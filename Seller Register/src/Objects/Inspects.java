package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inspects extends Browser {
static WebElement element=null;

	
    static By Cli=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
    static By sli=By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/a");
    static By name=By.xpath("//*[@id=\"account\"]/div[1]/div/input");
    static By lname=By.xpath("//*[@id=\"account\"]/div[2]/div/input");
    static By nick=By.xpath("//*[@id=\"account\"]/div[3]/div/input");
    static By email=By.xpath("//*[@id=\"account\"]/div[4]/div/input");
    static By password=By.xpath("//*[@id=\"account\"]/div[5]/div/input");
    static By conform=By.xpath("//*[@id=\"account\"]/div[6]/div/input");
    static By submit=By.xpath("//*[@id=\"ms-submit-button\"]");
    static By logout=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li/a/span");
    public Inspects(WebDriver driver)
	{
		super();
	}
    public static WebElement  Clik()
	{
		element= driver.findElement(Cli);
		return element;
	}
    public static WebElement  Sli()
	{
		element= driver.findElement(sli);
		return element;
	}
    public static WebElement  Name()
   	{
   		element= driver.findElement(name);
   		return element;
   	}
    public static WebElement  Lname()
	{
		element= driver.findElement(lname);
		return element;
	}
    public static WebElement Nick()
   	{
   		element= driver.findElement(nick);
   		return element;
   	}
    public static WebElement Email()
   	{
   		element= driver.findElement(email);
   		return element;
   	}
    public static WebElement Password()
   	{
   		element= driver.findElement(password);
   		return element;
   	}
    public static WebElement Conform()
   	{
   		element= driver.findElement(conform);
   		return element;
   	}
    
    public static WebElement Submit()
   	{
   		element= driver.findElement(submit);
   		return element;
   	}
    public static WebElement Logout()
   	{
   		element= driver.findElement(logout);
   		return element;
   	}
}

