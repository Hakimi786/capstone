package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.logging.Logger;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String configPath = ".\\src\\test\\resources\\config.properties";
	private String log4JPath = ".\\src\\test\\resources\\log4j.properties";
	

	public Base(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(configPath));
			properties = new Properties(); // we create object of Properties class
			properties.load(reader); // we call .load method and pass reader as argument 
			reader.close();// we want to close the reader so the input stream should be closed
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
   
		}
		logger = logger.getLogger(log4JPath);
		//below line of code will configure the property of Log 4 J files. 
		PropertyConfigurator.configure(log4JPath); 
            
	}
	public static String getURL(){
		String url = properties.getProperty("url");
		return url;
	}
}

