package revature.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	private int loanId;
	private String loanName;
	private float loanAmount;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	
}
