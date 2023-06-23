package Restservices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="/admin")

public class Adminservices {
	
	
	@Column(name= "adminemail", nullable= false)
	private String adminnemail;
	
	@Column (name="adminpass" , nullable= false)
	private String adminpass;
	
	
	public String getUseremail () {
		return getAdminemail();
	}		private String getAdminemail() {
		return null;
	}
	public void setAdminemail (String useremail) {
			this.adminnemail =useremail;
	}
	
	public String getUserpass () {
		return adminpass;
	} 		public void  setAdminpass (String userpass) {
			this.adminpass= userpass; }
}

