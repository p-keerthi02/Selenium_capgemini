package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name="KeyvalueData")
	public Object[][]getdata(){
		return new Object[][]{
			{"Browser","Chrome","1"},
			{"username","password","2"},
			{"Admin","admin123","3"}
		};
	}
		@DataProvider(name="KeyvalueData-1")
		public Object[][]getInfo(){
			return new Object[][]{
				{"Browser","firefox","1"},
				{"username","pwd","2"},
				{"Admin","user123","3"}
			};
	}
	@Test(dataProvider="KeyvalueData-1")
	public void readingFromDataProvider(String key,String value,String data ) {
		System.out.println("My Key is: "+key+"========>>>>My Value is:"+value);
	}
}
