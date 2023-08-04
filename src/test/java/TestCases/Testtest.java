package TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Testtest {

   @Test
   public void testing() {
	  
	   System.out.println(" TIme : "+System.currentTimeMillis());
	   
	   
	   Date date = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
	   System.out.println(formatter.format(date));
   }
}
