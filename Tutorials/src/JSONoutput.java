import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import org.quickconnectfamily.json.*;
import org.quickconnectfamily.json.tests.*;

public class JSONoutput implements Serializable {
	
	public static void main(String[] args){
		
		userBean jsonBean = new userBean();
		
		catBean cat1 = new catBean();
		cat1.setColor("yellow");
		cat1.setHair(true);
		cat1.setType("Siamese");
		
		catBean cat2 = new catBean();
		cat2.setColor("pink");
		cat2.setHair(true);
		cat2.setType("hairless");
		
		catBean cat3 = new catBean();
		cat3.setColor("black");
		cat3.setHair(true);
		cat3.setType("kitten");
		
		dogBean dog1 = new dogBean();
		dog1.setColor("Green");
		dog1.setBreed("Yorkie");
		dog1.setSize("Small");
		dog1.setCat(cat1);
		dog1.addCat(cat2);
		dog1.addCat(cat3);
		
		jsonBean.setFirstName("Alex");
		jsonBean.setLastName("Ander");
		jsonBean.setUserName("Alexander");
		jsonBean.setPassword("12345");
		jsonBean.setDog(dog1);
		
				
		
		File jFile = new File("userBean.json");
		
		try{
			FileOutputStream userFile = new FileOutputStream(jFile);
			JSONOutputStream usersOut = new JSONOutputStream(userFile);
			usersOut.writeObject(jsonBean);
			usersOut.close();
		}
		catch(Exception E){
			E.printStackTrace();
		}
		
		try{
			FileInputStream ReadUserFile = new FileInputStream(jFile);
			JSONInputStream usersIn = new JSONInputStream(ReadUserFile);
			HashMap<String, Object> aUser = (HashMap<String, Object>)usersIn.readObject();
			usersIn.close();
			System.out.println(aUser);
			System.out.println(aUser.get("firstName"));
			System.out.println(aUser.get("color"));
			System.out.println(aUser.get("password"));
		}
		catch(Exception E){
			E.printStackTrace();
		}
		
	}
}