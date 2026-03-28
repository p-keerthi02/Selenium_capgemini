package com.orangehrmselenium.uiframework.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	FileInputStream fis;
	Properties prop;
	FileOutputStream fos;
	
	public String getPropertyKeyValue(String key)throws IOException{
		fis = new FileInputStream("./src/test/resources/OrangeHRM_Common_Data/commondata.properties");
		prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	//write
	public void setPropertyPair(String key, String value) throws IOException {
		prop= new Properties();
		prop.setProperty(key, value);
		fos=new FileOutputStream("./src/test/resources/OrangeHRM_Common_Data/write.properties");
		prop.store(fos, "Updated Common Data");
		fos.close();
		
	}
}
