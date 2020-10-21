package Base;

public class Organizer extends Id{
	String companyName;
	String companyLocation;
	String companyPhoneNo;
	
	Organizer(String firstName, String lastName, String email, String phoneNo, String password, String gender, String dob, String city, String companyName, String companyLocation, String companyPhoneNo)
	{
		super(firstName, lastName, email, phoneNo, password, gender, city, dob);
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyPhoneNo = companyPhoneNo;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	
	public String getCompanyName()
	{
		return this.companyName;
	}
	public void setCompanyLocation(String companyLocation)
	{
		this.companyLocation = companyLocation;
	}
	
	public String getCompanyLocation()
	{
		return this.companyLocation;
	}
	public void setCompanyPhoneNo(String companyPhoneNo)
	{
		this.companyPhoneNo = companyPhoneNo;
	}
	
	public String getCompanyPhoneNo()
	{
		return this.companyPhoneNo;
	}

}
