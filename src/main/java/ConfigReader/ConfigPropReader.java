package ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropReader {

	
	private Properties prop;
	private FileInputStream ip;
	
    public Properties initLangProp( String language) throws IOException  {
    	 
    	System.out.println( " lang is : "+language);
    	
    	prop = new Properties();
    	
    	switch ( language.toLowerCase()) {
    	case "uk":
    		ip=new FileInputStream(".\\src\\main\\resources\\lang.English.properties");
    		break;
    		
    	case "germany":
    		ip=new FileInputStream(".\\src\\main\\resources\\lang.Germany.properties");
    		break;
    	default:
    		System.out.println("lang not found..." +language);
    		break;
    	}
    	prop.load(ip);
		return prop;
    }
}
