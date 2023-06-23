package Restservices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Users {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name= "useremail", nullable= false)
	private String usernemail;
	
	@Column (name="userpass" , nullable= false)
	private String userpass;
	
	public int getId() {
		return id;
	}	public void setId () {
			this.id =id;
	}
	
	public String getUseremail () {
		return getUseremail();
	}		public void setUseremail (String useremail) {
			this.usernemail =useremail;
	}
	
	public String getUserpass () {
		return userpass;
	} 		public void  setUserpass (String userpass) {
			this.userpass= userpass; }
}
		//@Repository
		//public interface InventoryRepository extends JpaRepository <Users, Long> {}

