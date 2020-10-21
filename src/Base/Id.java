package Base;

//import java.util.*;

public class Id {

	
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String username;
	protected String phoneNo;
	protected String password;
	protected String gender;
	protected String dob;
	protected String city;
	protected String age;
	protected String bio;
	protected String profilePicPath;
	protected String coverPicPath;
	protected String chat;

	
	Id()
	{
		
	}
	
	//Signup constructor
	
	Id(String firstName, String lastName, String email, String phoneNo, String password, String gender, String city, String dob)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.dob = dob;
		
	}
	
	//Constructor for user data
	
		
	
	Id(String firstName, String lastName, String email, String phoneNo, String password, String gender, String city, String dob, String bio, String age, String profilePicPath, String coverPicPath)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.bio = bio;
		this.age = age;
		this.profilePicPath = profilePicPath;
		this.coverPicPath = coverPicPath;
		
		
	}
	
	Id(String email,String chat)
	{
		this.email=email;

		this.chat=chat;
	}
	
	
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	
	public String getPhoneNo()
	{
		return this.phoneNo;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	
	public String getAge()
	{
		return this.age;
	}
	public void setBio(String bio)
	{
		this.bio = bio;
	}
	
	public String getBio()
	{
		return this.bio;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	
	public String getDob()
	{
		return this.dob;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public void setProfilePicPath(String profilePicPath)
	{
		this.profilePicPath = profilePicPath;
	}
	
	public String getProfilePicPath()
	{
		return this.profilePicPath;
	}
	public void setCoverPicPath(String coverPicPath)
	{
		this.coverPicPath = coverPicPath;
	}
	
	public String getCoverPicPath()
	{
		return this.coverPicPath;
	}
	
	public void setChat(String chat)
	{
		this.chat = chat;
	}
	
	public String getChat()
	{
		return this.chat;
	}
	
	
	
}
