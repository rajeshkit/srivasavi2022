package revature.hibernatedemo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CustomerDetails")
@Table(name = "bankcustomer")
public class Customer implements Serializable {
	@Id
	@Column(name = "account_number")
	private int accountNo;
	@Column(name = "account_holder_name",nullable = false, length = 30)
	private String name;
	@Column(name="customer_email",unique = true, length = 50)
	private String email;
	private String phone;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
