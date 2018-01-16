package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	private static Properties prop = new Properties();
	static {
		ClassLoader classLoader = FileUtils.class.getClassLoader();
		File file = new File(classLoader.getResource("resources/data.properties").getFile());
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static String getProperty(String propertyName) throws IOException {

		return prop.getProperty(propertyName);
	
	}
	
	public static String getFullFilePath(String fileName) {
		ClassLoader classLoader = FileUtils.class.getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file.getAbsolutePath();
	}
	
	

}
