package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {
	private Properties prop;
	
	public String getproperty(String key) throws IOException
	{	
		FileInputStream fis;
	   
		
		String path=System.getProperty("user.dir")+"src/main/java/com/guru99/ui/configuration/congiguration.properties";
				
				
				try {
					fis = new FileInputStream(path);
				 prop=new Properties();
					
				      prop.load(fis);
				     
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				 String provalue=prop.getProperty(key);
				return provalue;
		
			
		
		
	
	}
	
}
