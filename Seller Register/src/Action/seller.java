package Action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.Browser;
import Objects.Inspects;

public class seller extends Browser {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    public static void registration() throws Exception{
    	 File f=new File("E:\\Ram\\Seller Register\\SellerRegister.xlsx");
    		FileInputStream fi=new FileInputStream(f);
    		wb =new XSSFWorkbook(fi);
    		sh= wb.getSheetAt(0);
    		for(int i=1;i<=sh.getLastRowNum();i++)
    		{
    			System.out.println("i  "+i);
    			Thread.sleep(5000);
    			
    			try {
    				Inspects.Clik().click();
    		    	Thread.sleep(5000);
    		    	Inspects.Sli().click();
    		    	System.out.println("new click");
    		    	Thread.sleep(5000);
    		    	cell =sh.getRow(i).getCell(1);
    		    	Inspects.Name().sendKeys(cell.getStringCellValue());
    		    	cell =sh.getRow(i).getCell(2);
    		    	Inspects.Lname().sendKeys(cell.getStringCellValue());
    		    	cell =sh.getRow(i).getCell(3);
    		    	Inspects.Nick().sendKeys(cell.getStringCellValue());
    		    	cell=sh.getRow(i).getCell(4);
    		    	Inspects.Email().sendKeys(cell.getStringCellValue());
    		    	cell=sh.getRow(i).getCell(5);
    		    	Inspects.Password().sendKeys(cell.getStringCellValue());
    		    	Thread.sleep(5000);
    		    	cell=sh.getRow(i).getCell(6);
    		    	Inspects.Conform().sendKeys(cell.getStringCellValue());
    		    	Thread.sleep(5000);
    		    	Inspects.Submit().click();
    		    	Thread.sleep(5000);
    		 String s=driver.getTitle();
    		 String s1="Seller Profile";
    		 if(s.equals(s1)) {
    			 sh.getRow(i).createCell(7).setCellValue("Pass");
    			 FileOutputStream fos= new FileOutputStream(f);
    			 wb.write(fos);
    	
    			 
    		 }
    		 else {
    			 sh.getRow(i).createCell(7).setCellValue("Fail");
    			 FileOutputStream fos= new FileOutputStream(f);
    			 wb.write(fos);
    		 }
    		 
    		    	Inspects.Logout().click();
    			}
    			
    			catch(Exception exp)
    			{
    				
    			}
    			
    		}
    		
    
    }

}


//http://cubicitsolution.co.in/bookstore/index.php?route=account/register-seller
	
//	http://cubicitsolution.co.in/bookstore/index.php?route=seller/account-profile
		//Seller Profile
//Register seller account