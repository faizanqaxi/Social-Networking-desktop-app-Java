package Base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserData {
	
	public static Scanner x;
	
	public static String userDataPath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\userData.txt";
	
	public static void saveUserDataRecord(String FirstName, String LastName, String Email, String PhoneNo, String Password, String Gender, String City, String DOB, String bio, String age, String profilePicPath, String coverPicPath, String filePath) {
		try {
			//File writer can write to a file
			FileWriter fw = new FileWriter(filePath, true); //If the second parameter is false it overrides the file if it is true it appends to the file
			BufferedWriter bw = new BufferedWriter(fw); //It makes sure your string is more efficiently written to the file
			PrintWriter pw = new PrintWriter(bw); //It prints on the file
			
			pw.println(FirstName.trim() + "," + LastName.trim() + "," + Email.trim() + "," + PhoneNo.trim() + "," + Password.trim() + "," + Gender.trim() + "," + City.trim() + "," + DOB.trim() + "," + bio.trim() + "," + age.trim() + "," + profilePicPath.trim() + "," + coverPicPath.trim());
			pw.flush();
			pw.close();
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error Exception !");
		}
	}
	
public static void traceUserData(String searchEmail, String filePath){
		
		boolean found = false;
		
		String firstName = "";
		String lastName = "";
		String email = "";
		String phoneNo = "";
		String password = "";
		String gender = "";
		String city = "";
		String dob = "";
		String bio = "";
		String age = "";
		String profilePicPath = "";
		String coverPicPath = "";
		
		try {
			 
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				
				firstName = x.next().trim();
				lastName = x.next().trim();
				email = x.next().trim();
				phoneNo = x.next().trim();
				password = x.next().trim();
				gender = x.next().trim();
				city = x.next().trim();
				dob = x.next().trim();
				bio = x.next().trim();
				age = x.next().trim();
				profilePicPath = x.next().trim();
				coverPicPath = x.next().trim();
				
				if(email.trim().equals(searchEmail.trim())) {
					
					User user = new User(firstName, lastName, email, phoneNo, password, gender, city, dob, bio, age, profilePicPath, coverPicPath);
					
					MainPageGUI.LoggedInUser = user;
					
					
					found = true;
				}
				
			}
			x.close();
			
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error ! Trace user data " + e.getMessage());
		}
	}
	

	
	public static void editRecord(String searchEmail, String editTerm, String newValue){
		
		//Search email is the email for which you wanna edit editTerm is the term u wanna edit and newValue is the new value of it
		
		boolean found = false;
		
		String firstName = "";
		String lastName = "";
		String email = "";
		String phoneNo = "";
		String password = "";
		String gender = "";
		String dob = "";
		String city = "";
		String bio = "";
		String age = "";
		String profilePicPath = "";
		String coverPicPath = "";
		
		
		String newFirstName = "";
		String newLastName = "";
		String newPhoneNo = "";
		String newPassword = "";
		String newGender = "";
		String newDob = "";
		String newCity = "";
		String newBio = "";
		String newAge = "";
		String newProfilePicPath = "";
		String newCoverPicPath = "";
		
		String sfirstName = "firstName";
		String slastName = "lastName";
		String sphoneNo = "phoneNo";
		String spassword = "password";
		String sgender = "gender";
		String sdob = "dob";
		String scity = "city";
		String sbio = "bio";
		String sage = "age";
		String sprofilePicPath = "profilePicPath";
		String scoverPicPath = "coverPicPath";
		
		
		
		String tempFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\temp.txt";
		String oldFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\userData.txt" ;
		
		File newFile = new File(tempFilePath);
		File oldFile = new File(oldFilePath);
		
		try {
			 
			
			
			FileWriter fw = new FileWriter(tempFilePath, true); //If the second parameter is false it overrides the file if it is true it appends to the file
			BufferedWriter bw = new BufferedWriter(fw); //It makes sure your string is more efficiently written to the file
			PrintWriter pw = new PrintWriter(bw); //It prints on the file
			
			x = new Scanner(new File(oldFilePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				
				firstName = x.next().trim();
				lastName = x.next().trim();
				email = x.next().trim();
				phoneNo = x.next().trim();
				password = x.next().trim();
				gender = x.next().trim();
				city = x.next().trim();
				dob = x.next().trim();
				bio = x.next().trim();
				age = x.next().trim();
				profilePicPath = x.next().trim();
				coverPicPath = x.next().trim();
				
				
				newFirstName = firstName;
				newLastName = lastName;
				newPhoneNo = phoneNo;
				newPassword = password;
				newGender = gender;
				newDob = dob;
				newCity = city;
				newBio = bio;
				newAge = age;
				newProfilePicPath = profilePicPath;
				newCoverPicPath = coverPicPath;
				
				if(editTerm.equals(sfirstName)) {
					newFirstName = newValue.trim();
				}
				else if(editTerm.equals(slastName)) {
					newLastName = newValue.trim();
				}
				else if(editTerm.equals(sphoneNo)) {
					newPhoneNo = newValue.trim();
				}
				else if(editTerm.equals(spassword)) {
					newPassword = newValue.trim();
				}
				else if(editTerm.equals(sgender)) {
					newGender = newValue.trim();
				}
				else if(editTerm.equals(scity)) {
					newCity = newValue.trim();
				}
				else if(editTerm.equals(sdob)) {
					newDob = newValue.trim();
				}
				else if(editTerm.equals(sbio)) {
					newBio = newValue.trim();
				}
				else if(editTerm.equals(sage)) {
					newAge = newValue.trim();
				}
				else if(editTerm.equals(sprofilePicPath)) {
					newProfilePicPath = newValue.trim();
				}
				else if(editTerm.equals(scoverPicPath)) {
					newCoverPicPath = newValue.trim();
				}
				
				if(email.trim().equals(searchEmail.trim())) {
					
					pw.println(newFirstName.trim() + "," + newLastName.trim() + "," + email.trim() + "," + newPhoneNo.trim() + "," + newPassword.trim() + "," + newGender.trim() + "," + newCity.trim() + "," + newDob.trim() + "," + newBio.trim() + "," + newAge.trim() + "," + newProfilePicPath.trim() + "," + newCoverPicPath.trim());
	
					User UpdatedUser = new User(newFirstName, newLastName, email, newPhoneNo, newPassword, newGender, newCity, newDob, newBio, newAge, newProfilePicPath, newCoverPicPath);
					MainPageGUI.LoggedInUser = UpdatedUser;
					
				}
				
				else {
					
					pw.println(firstName.trim() + "," + lastName.trim() + "," + email.trim() + "," + phoneNo.trim() + "," + password.trim() + "," + gender.trim() + "," + city.trim() + "," + dob.trim() + "," + bio.trim() + "," + age.trim() + "," + profilePicPath.trim() + "," + coverPicPath.trim());

				}
				
			}

			x.close();
			pw.flush();
			pw.close();
			
			oldFile.delete();
			File dump = new File(oldFilePath);
			newFile.renameTo(dump);
			
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error ! user data " + e.getMessage());
		}
	}
	
}
