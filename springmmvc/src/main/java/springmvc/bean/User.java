package springmvc.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 private String email;
 private String uname;
 private String pass;
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the uname
 */
public String getUname() {
	return uname;
}
/**
 * @param uname the uname to set
 */
public void setUname(String uname) {
	this.uname = uname;
}
/**
 * @return the pass
 */
public String getPass() {
	return pass;
}
/**
 * @param pass the pass to set
 */
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "User [email=" + email + ", uname=" + uname + ", pass=" + pass + "]";
}
 
 
 
}
