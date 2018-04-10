package Execution;

import org.testng.annotations.Test;

import Action.seller;
import Objects.Browser;


public class Execution {
	@Test
	public void Signin() throws Exception
	{
		
		Thread.sleep(5000);

		Browser.Browserc();
		Thread.sleep(5000);
		//Login.Logins();
	
	seller.registration();

	}
}