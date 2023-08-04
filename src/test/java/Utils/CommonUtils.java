package Utils;

import java.io.FileReader;
import java.util.Properties;

public class CommonUtils {

	public String readPropertyFile(String Location) throws Exception {
		  FileReader reader=new FileReader(System.getProperty("user.dir")+"\\propertyFile.properties"); 
        
        Properties p=new Properties();  
        p.load(reader); 
        String location=Location.replace(" " ,"_");          
        return  p.getProperty(location) ;
   }
}
