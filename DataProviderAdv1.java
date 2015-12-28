package testNG;


import org.testng.annotations.Test;


@Test(dataProviderClass=TestDataFile.class, dataProvider="data")
public class LearningTestNGParameters {

	public void registerUser(String firstname,
							 String lastname,
							 String email, 
							 String id){
	System.out.println(firstname);
	System.out.println(lastname);
	System.out.println(email);
	System.out.println(id);
	}
	
@Test(dataProviderClass=TestDataFile.class, dataProvider="logindata")
public class LoginUser {

	public void registerUser(String email, String id){

	System.out.println(email);
	System.out.println(id);
	}
	
}

-------------------------------------------------------------------------------

package testNG;

import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data")
		public static Object[][] testData(){
		Object[][] obj = new Object[3][4];
		obj[0][0]="Amit";
		obj[0][1]="Sele";
		obj[0][2]="Amit@abc.com";
		obj[0][3]="1234";
		obj[1][0]="Sant";
		obj[1][1]="Sele";
		obj[1][2]="Sant@abc.com";
		obj[1][3]="2134";
		obj[2][0]="bhav";
		obj[2][1]="Sele";
		obj[2][2]="bhav@abc.com";
		obj[2][3]="3212";
				
		
		
		return obj;
		
	}

@DataProvider(name="logindata")
		public static Object[][] logintestData(){
		Object[][] obj = new Object[3][2];

		obj[0][0]="Amit@abc.com";
		obj[0][1]="1234";

		obj[1][0]="Sant@abc.com";
		obj[1][1]="2134";

		obj[2][0]="bhav@abc.com";
		obj[2][1]="3212";
				
		
		
		return obj;
		
	}

}
