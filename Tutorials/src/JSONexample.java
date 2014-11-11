import org.quickconnectfamily.json.*;
import java.io.Serializable;


public class JSONexample implements Serializable{

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	
	public JSONexample(String fname, String lname, String uname, String pword){
		firstName = fname;
		lastName = lname;
		username = uname;
		password = pword;
		
	}
}
