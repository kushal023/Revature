package Assignment;

public class Customer {
	private String name, email;
	private long mobileNo;
	
	Customer(){};
	
	public Customer(long mobileNo, String name, String email) {
		this.mobileNo=mobileNo;
		this.name=name;
		this.email=email;
		
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
@Override
public String toString() {
	return "Customer[mobileNo="+mobileNo +", name="+name+", email="+email+"]";
}
}
