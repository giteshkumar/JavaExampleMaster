
public class Employee {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private String mobile;
	
	private int age;
	private String address;
	
	private String dept;

	private String laptopType;
	
	public Employee(String firstName, String lastName, String emailAddress, String mobile, String dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.mobile = mobile;
		this.dept = dept;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLaptopType() {
		return laptopType;
	}

	public void setLaptopType(String laptopType) {
		this.laptopType = laptopType;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", mobile=" + mobile + ", age=" + age + ", address=" + address + ", dept=" + dept + ", laptopType="
				+ laptopType + "]";
	}
	
	
	
	
}
