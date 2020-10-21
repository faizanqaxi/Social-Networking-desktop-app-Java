package Base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LoginData{

	public static Scanner x;
	
	public static String loginDataPath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\LoginData.txt";
	
public static boolean verifyEmail(String searchEmail, String filePath) {
		
		boolean found = false;
		
		String email = "";
		
		try {
			 
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				email = x.next();
				
				if(email.trim().equals(searchEmail.trim())) {
					found = true;
				}
				
			}
			x.close();
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error !" + e.getMessage());
		}
		
		return found;
	}
	
	
	public static boolean verifyLogin(String searchEmail, String searchPassword, String filePath) {
		
		boolean found = false;
		
		String email = "";
		String password = "";
		
		try {
			 
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				email = x.next();
				password = x.next();
				
				if(email.trim().equals(searchEmail.trim()) && password.trim().equals(searchPassword.trim())) {
					found = true;
				}
				
			}
			x.close();
			
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error read record !" + e.getMessage());
		}
		return found;
	}
	
	public static void saveLoginRecord(String Email, String Password, String filePath) {
		try {
			//File writer can write to a file
			FileWriter fw = new FileWriter(filePath, true); //If the second parameter is false it overrides the file if it is true it appends to the file
			BufferedWriter bw = new BufferedWriter(fw); //It makes sure your string is more efficiently written to the file
			PrintWriter pw = new PrintWriter(bw); //It prints on the file
			
			pw.println(Email.trim() + "," + Password.trim());
			pw.flush();
			pw.close();
			
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error Exception !");
		}
	}
	

public static void editPassword(String searchEmail, String newPassword){
		
		boolean found = false;
		
		String email = "";
		String password = "";
		
		
		String tempFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\temp.txt";
		String oldFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\LoginData.txt" ;
		
		File newFile = new File(tempFilePath);
		File oldFile = new File(oldFilePath);
		
		try {
			 
			
			
			FileWriter fw = new FileWriter(tempFilePath, true); //If the second parameter is false it overrides the file if it is true it appends to the file
			BufferedWriter bw = new BufferedWriter(fw); //It makes sure your string is more efficiently written to the file
			PrintWriter pw = new PrintWriter(bw); //It prints on the file
			
			x = new Scanner(new File(oldFilePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				
				email = x.next().trim();
				password = x.next().trim();
				
				
				if(email.trim().equals(searchEmail.trim())) {
					
					pw.println(email + "," + newPassword.trim());
					
				}
				else {
					pw.println(email + "," + password);
					
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
			JOptionPane.showMessageDialog(null, "Error ! Signup data " + e.getMessage());
		}
	}

}
