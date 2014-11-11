import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;

public class JSONtest {
	
	public static void main(String []args){
	
		JSONexample JSon = new JSONexample("Brandon", "Nelson", "Bnelson", "1234");
	
		try {
			String userName = JSONUtilities.stringify(JSon);
			System.out.println(userName);
			HashMap<String, String> userNames = (HashMap<String, String>) JSONUtilities.parse(userName);
			String fname = userNames.get("firstName");
			String lname = userNames.get("lastName");
			String uname = userNames.get("username");
			String pword = userNames.get("password");
			System.out.println("First Name = " + fname);
			System.out.println("Last Name = " + lname);
			System.out.println("User Name = " + uname);
			System.out.println("Password = " + pword);
		}
		catch(JSONException e){
			e.printStackTrace();
		}
		
	}
}
