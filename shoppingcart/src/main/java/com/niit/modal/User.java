package com.niit.modal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "User")
@Component
public class User {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
private int userid; 
	
	@Column
private String username;
	@Column
private String emailaddress;
	@Column
private String password;
    @Column
private int mobilenumber;
    @Column
private String address;


public int getUserId() {
 return userid;
}
public void setUserId(int userid) {
 this.userid = userid;
}
public String getUserName() {
 return username;
}
public void setUserName(String username) {
 this.username = username;
}
public String getEmailAddress() {
 return emailaddress;
}
public void setEmailAddress(String emailaddress) {
 this.emailaddress = emailaddress;
}
public String Password() {
	 return password;
}
public void setPassword(String password) {
 this.password = password;
}
public int getMobileNumber() {
	 return mobilenumber;
}
public void setMobileNumber(int mobilenumber) {
 this.mobilenumber = mobilenumber;
}
public String getAddress() {
 return address;
}
public void setAddress(String address) {
 this.address = address;
}

}