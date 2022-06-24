package fr.springboot.employe.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

/*@Entity
@Table(name= "emplyees")
public class Employee implements Serializable {  */

@Document(collection= "emplyees")
	public class Employee  {
	/*private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "employee_ID")*/
	
	@Id
    private String id;
	
	//@NotNull
	//@Column(name="first_name")
	private String firstName;
	
	//@NotNull
	//@Column(name="last_name")
	private String lastName;
	
	//@NotNull
	//@Column(name="email_id")
	private String emailId;
    
	 public Employee(String id, String firstName, String lastName, String emailId) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public Employee() {
			super();
		}
	//  supprimer à cause des annotation @Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	 
	
}
