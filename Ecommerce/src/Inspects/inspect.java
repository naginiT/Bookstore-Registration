package Inspects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class inspect extends Browser {
	static WebElement element=null;

	
    static By Cli=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	 static By reg=By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/a");
	 static By name=By.name("firstname");
	 static By lname=By.name("lastname");
	 static By email=By.name("email");
	 static By telephone=By.name("telephone");
	 static By fax=By.name("fax");
	 static By company=By.name("company");
	 static By address=By.name("address_1");
	 static By address2=By.name("address_2");
	 static By city=By.name("city");
	 static By postcode=By.name("postcode");
	 static By country=By.xpath("//*[@id=\"input-country\"]");
	 //static By region=By.xpath("//*[@id=\"input-zone\"]");
	 static By region=By.cssSelector("#input-zone");
	 static By password=By.name("password");
	 static By conform=By.name("confirm");
	 static By agrree=By.name("agree");
	 static By submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	 static By logout=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li/a/span");
	 public inspect(WebDriver driver)
		{
			super();
		}
		 
	
	 public static WebElement  Clik()
		{
			element= driver.findElement(Cli);
			return element;
		}
	 public static WebElement  New()
		{
			element= driver.findElement(reg);
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

	 public static WebElement Email()
		{
			element= driver.findElement(email);
			return element;
		}	
	 public static WebElement Telephone()
		{
			element= driver.findElement(telephone);
			return element;
		}	
	 public static WebElement Fax()
		{
			element= driver.findElement(fax);
			return element;
		}	
	 public static WebElement Company()
		{
			element= driver.findElement(company);
			return element;
		}
	 public static WebElement Address()
		{
			element= driver.findElement(address);
			return element;
		}

	 public static WebElement Address2()
		{
			element= driver.findElement(address2);
			return element;
		}
	 public static WebElement City()
		{
			element= driver.findElement(city);
			return element;
		}
	 public static WebElement Postcode()
		{
			element= driver.findElement(postcode);
			return element;
		}
	 public static Select Country()
		{
			
		
		 Select select=new Select(driver.findElement(country));
			return select;
		}
	 public static Select Region()
		{
		 Select select=new Select(driver.findElement(region));
			return select;
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
	
	 public static WebElement Agree()
		{
			element= driver.findElement(agrree);
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

