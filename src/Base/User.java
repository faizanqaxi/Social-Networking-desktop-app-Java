package Base;


public class User extends Id{

	User[] friends;
	User[] tripMates;
	
	
	User()
	{
		super();
	}
	
	//Signup Constructor
	
	
	User(String firstName, String lastName, String email, String phoneNo, String password, String gender, String city, String dob)
	{
		super(firstName, lastName, email, phoneNo, password, gender, city, dob);
		
	}
	
	
	
	//UserData Constructor
	
	User(String firstName, String lastName, String email, String phoneNo, String password, String gender, String city, String dob, String bio, String age, String profilePicPath, String coverPicPath)
	{
		super(firstName, lastName, email, phoneNo, password, gender, city, dob, bio, age, profilePicPath, coverPicPath);
		
		
	}
	User(String email,String chat){
		super(email,chat);
	}
	
	User(User obj){
		this.firstName = obj.firstName;
		this.lastName = obj.lastName;
		this.email = obj.email;
		this.phoneNo = obj.phoneNo;
		this.password = obj.password;
		this.gender = obj.gender;
		this.dob = obj.dob;
		this.city = obj.city;
	}
	
	
}
