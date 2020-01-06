package GenericMethods;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Filemanager {

	public static String getapplnurl() {
		String url="";
		try{
Properties pr = new Properties();
FileInputStream fis= new FileInputStream("./config.properties");
pr.load(fis);
url = pr.getProperty("url");
}
		catch(Exception e)
		{
			Reporter.log("Failed to read url",true);
		}
		return url;
		}

}
