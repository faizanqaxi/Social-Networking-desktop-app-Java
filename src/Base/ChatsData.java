package Base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ChatsData  {
	
	public static Scanner x;
	
	public static String chatDataPath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\ChatsData.txt";
	
	public static void saveChatsDataRecord( String Email, String chat, String filePath) {
		try {
			//File writer can write to a file
			FileWriter fw = new FileWriter(filePath, true); //If the second parameter is false it overrides the file if it is true it appends to the file
			BufferedWriter bw = new BufferedWriter(fw); //It makes sure your string is more efficiently written to the file
			PrintWriter pw = new PrintWriter(bw); //It prints on the file
			
			pw.println(Email.trim() + "," + chat.trim() );
			pw.flush();
			pw.close();
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error Exception !");
		}
	}
	
public static void traceChatsData(String searchemail, String filePath){
		
		boolean found = false;
		
		
		String email = "";
		
		String chat = "";
		
		try {
			 
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]"); //By what characters are the string field seperated in the file
			
			while(x.hasNext() && !found) {
				
	
				email = x.next().trim();
				
				chat = x.next().trim();
				
				if(email.trim().equals(searchemail.trim())) {
					
					User user = new User(searchemail,chat);
					
					ChatsGUI.chatLoggedInUser = user;
					
					
					found = true;
				}
				
			}
			x.close();
			
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error ! Trace user data " + e.getMessage());
		}
	}
	

	
	public static void editchatRecord(String searchEmail, String editTerm, String newValue){
		
		//Search email is the email for which you wanna edit editTerm is the term u wanna edit and newValue is the new value of it
		
		boolean found = false;
	
		String email = "";
		String chat = "";
		
		
		
		String newchat = "";
		
		
		String schat = "chat";
		
		
		
		String tempFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\tempchat.txt";
		String oldFilePath = "D:\\University Work\\2nd semester\\OOP Project\\Files\\ChatsData.txt" ;
		
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
				chat = x.next().trim();
				
				
				
				newchat = chat;
				
				if(editTerm.equals(schat)) {
					newchat = newValue.trim();;
				}
				
				if(email.trim().equals(searchEmail.trim())) {
					
					pw.println( email + "," + newchat);
					found=true;
					
					
				}
				
				else {
					
					
					pw.println(email + "," + chat);

				}
				if(found=false) {
					JOptionPane.showMessageDialog(null, "no user found !");

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
