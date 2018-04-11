package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Inspects.Browser;
import Inspects.inspect;




public class User extends Browser {
	static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFCell cell;
    public static void re() throws Exception{
    	/*Addprobleminspects.Clik().click();
    	Thread.sleep(5000);
    	Addprobleminspects.User().sendKeys(Addproblem_Data.user1);
    	Addprobleminspects.pass().sendKeys(Addproblem_Data.pass1);
		Thread.sleep(5000);*/
    	

    File f=new File("E:\\Ram\\Ecommerce\\Register.xlsx");
	FileInputStream fi=new FileInputStream(f);
	wb =new XSSFWorkbook(fi);
	sh= wb.getSheetAt(0);
	System.out.println(sh.getLastRowNum());
	
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		System.out.println("i  "+i);
		Thread.sleep(5000);
		
		try {
			inspect.Clik().click();
			System.out.println("clicked");
	    	Thread.sleep(5000);
	    	inspect.New().click();
	    	System.out.println("new click");
	    	Thread.sleep(5000);
			cell =sh.getRow(i).getCell(1);
			inspect.Name().sendKeys(cell.getStringCellValue());
			System.out.println("name "+cell.getStringCellValue());
			cell =sh.getRow(i).getCell(2);
			inspect.Lname().sendKeys(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
			cell =sh.getRow(i).getCell(3);
			inspect.Email().sendKeys(cell.getStringCellValue());
			cell =sh.getRow(i).getCell(4);
			//inspect.Telephone().sendKeys(cell.getStringCellValue());
			
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
		       long h =(long)cell.getNumericCellValue();
		         String l=String.valueOf(h);
		    
		                     Thread.sleep(5000);
		                     inspect.Telephone().sendKeys(l); 
		    }
		        
			
			
			
			
			cell=sh.getRow(i).getCell(5);
			//inspect.Fax().sendKeys(cell.getStringCellValue());
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
		       int h =(int)cell.getNumericCellValue();
		         String l=String.valueOf(h);
		    
		                     Thread.sleep(5000);
		                     inspect.Fax().sendKeys(l); 
		    }
			else  {
				inspect.Fax().sendKeys(cell.getStringCellValue());
		}
			cell=sh.getRow(i).getCell(6);
			inspect.Company().sendKeys(cell.getStringCellValue());
			cell=sh.getRow(i).getCell(7);
			inspect.Address().sendKeys(cell.getStringCellValue());
			cell=sh.getRow(i).getCell(8);
			inspect.Address2().sendKeys(cell.getStringCellValue());
			cell=sh.getRow(i).getCell(9);
			inspect.City().sendKeys(cell.getStringCellValue());
			cell=sh.getRow(i).getCell(10);
			//inspect.Postcode().sendKeys(cell.getStringCellValue());
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
		       int h =(int)cell.getNumericCellValue();
		         String l=String.valueOf(h);
		    
		                     Thread.sleep(5000);
		                     inspect.Postcode().sendKeys(l); 
		    }
			else  {
				inspect.Postcode().sendKeys(cell.getStringCellValue());
		}
			Thread.sleep(5000);
			
			/*cell=sh.getRow(i).getCell(11);
			inspect.Country().selectByValue(cell.getStringCellValue());
			inspect.Country().selectByVisibleText(cell.getStringCellValue());
			inspect.Country().selectByIndex(1);
			Thread.sleep(5000);*/
			cell=sh.getRow(i).getCell(12);
			inspect.Region().selectByVisibleText(cell.getStringCellValue());
			cell=sh.getRow(i).getCell(13);
			//inspect.Password().sendKeys(cell.getStringCellValue());
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
		       int h =(int)cell.getNumericCellValue();
		         String l=String.valueOf(h);
		    
		                     Thread.sleep(5000);
		                     inspect.Password().sendKeys(l); 
		    }
			else  {
				inspect.Password().sendKeys(cell.getStringCellValue());
		}
			cell=sh.getRow(i).getCell(14);
			//inspect.Conform().sendKeys(cell.getStringCellValue());
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    {
		       int h =(int)cell.getNumericCellValue();
		         String l=String.valueOf(h);
		    
		                     Thread.sleep(5000);
		                     inspect.Conform().sendKeys(l); 
		    }
			else  {
				inspect.Conform().sendKeys(cell.getStringCellValue());
		}
			inspect.Agree().click();
			inspect.Submit().click();
			Thread.sleep(5000);
			
			String s=driver.getTitle();
   		 String s1="Register Account";
   		 if(s.equals(s1)) {
   			 sh.getRow(i).createCell(15).setCellValue("Fail");
   			 FileOutputStream fos= new FileOutputStream(f);
   			 wb.write(fos);
   	
   			 
   		 }
   		 else {
   			 sh.getRow(i).createCell(15).setCellValue("Pass");
   			 FileOutputStream fos= new FileOutputStream(f);
   			 wb.write(fos);
   		 }
			inspect.Logout().click();
			
		}
		catch (Exception exp){
			
			System.out.println("hi");
		}
				
			
}
}
}
