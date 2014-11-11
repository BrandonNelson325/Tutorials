import java.io.Serializable;

public class userBean implements Serializable{
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private dogBean dog;
	
	public userBean() {

	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public dogBean getDog() {
		return dog;
	}

	public void setDog(dogBean dog) {
		this.dog = dog;
	}
	
}
