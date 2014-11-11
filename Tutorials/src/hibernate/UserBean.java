package hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")

public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer numbers;
	
	@Column (name = "first_name")
	private String firstName;
	@Column (name = "last_name")
	private String lastName;
	private String email;
	private String password;
	
	
	public Integer getNumbers() {
		return numbers;
	}
	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
