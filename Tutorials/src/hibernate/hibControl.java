package hibernate;

import java.io.Serializable;

public class hibControl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//variables needed
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	//here is the constructor; takes the values passed by hibView and assigns them locally
	public hibControl(String fname, String lname, String email, String password) {
		// TODO Auto-generated constructor stub
		this.firstName = fname;
		this.lastName = lname;
		this.email  = email;
		this.password  = password;
	}
	
	//runs the control
	public void run(){
		
		//creates an instance of the hibernate compatible bean
		UserBean Ubean = new UserBean();
		
		//assigns the values to the hibernate compatible bean
		Ubean.setFirstName(this.firstName);
		Ubean.setLastName(this.lastName);
		Ubean.setEmail(this.email);
		Ubean.setPassword(this.password);
		
		//calls the model which communicates with the database via hibernate
		hibModel mod = new hibModel();
		
		//passes in the instance of the bean
		mod.addToDb(Ubean);
	
	}
}
