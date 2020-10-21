package Base;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class SignUpGUI {

	private static Scanner x;
	
	private static boolean userFound;
	
	SignUpGUI(){
		userFound = false;
		
		JFrame SignUpFrame=new JFrame("TRIPIE SIGNUP");
		SignUpFrame.setLayout(null);
		SignUpFrame.setBounds(383, 84, 600, 600);
		JPanel SignUpPanel= new JPanel();
		SignUpPanel.setSize(600, 600);
		SignUpPanel.setLayout(null);
		
		JLabel FirstNameLabel=new JLabel("First Name");
		SignUpPanel.add(FirstNameLabel);
		FirstNameLabel.setBounds(15, 15, 82, 30);
		
		JTextField FirstNameTF=new JTextField();
		SignUpPanel.add(FirstNameTF);
		FirstNameTF.setBounds(98, 18, 100, 25);
		
		
		JLabel LastNameLabel=new JLabel("Last Name");
		SignUpPanel.add(LastNameLabel);
		LastNameLabel.setBounds(210, 15, 83, 30);
		
		JTextField LastNameTF=new JTextField();
		SignUpPanel.add(LastNameTF);
		LastNameTF.setBounds(293, 18, 100, 25);

		
		
		JLabel EmailLabel=new JLabel("Email");
		SignUpPanel.add(EmailLabel);
		EmailLabel.setBounds(15, 55, 83, 30);
		
		JTextField EmailTF=new JTextField();
		SignUpPanel.add(EmailTF);
		EmailTF.setBounds(98, 57, 150, 25);
		
		JLabel EmailExampleLabel=new JLabel("(example@gmail.com)");
		SignUpPanel.add(EmailExampleLabel);
		EmailExampleLabel.setBounds(253, 57, 170, 30);
		
		JLabel PasswordLabel=new JLabel("Password");
		SignUpPanel.add(PasswordLabel);
		PasswordLabel.setBounds(15, 95, 83, 30);
		JPasswordField PasswordTF=new JPasswordField();
		SignUpPanel.add(PasswordTF);
		PasswordTF.setBounds(98, 97, 150, 25);
		
		JLabel PhoneNumberLabel=new JLabel("Phone Number");
		SignUpPanel.add(PhoneNumberLabel);
		PhoneNumberLabel.setBounds(15, 135, 110, 30);
		JTextField PhoneNumberTF=new JTextField();
		SignUpPanel.add(PhoneNumberTF);
		PhoneNumberTF.setBounds(125, 137, 150, 25);
		

		
		JLabel GenderLabel=new JLabel("Gender");
		SignUpPanel.add(GenderLabel);
		GenderLabel.setBounds(15, 175, 83, 30);
		
		JRadioButton maleRB=new JRadioButton("Male");
		maleRB.setActionCommand("Male");
		JRadioButton femaleRB=new JRadioButton("Female");
		femaleRB.setActionCommand("Female");
		JRadioButton otherRB=new JRadioButton("Other");
		otherRB.setActionCommand("Other");
		
		SignUpPanel.add(maleRB);
		maleRB.setBounds(98, 175, 70, 30);
		
		SignUpPanel.add(femaleRB);
		femaleRB.setBounds(173, 175, 70, 30);
		
		SignUpPanel.add(otherRB);
		otherRB.setBounds(248, 175, 70, 30);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRB);
		genderGroup.add(femaleRB);
		genderGroup.add(otherRB);
		
		
		JLabel DOBLabel=new JLabel("Date of Birth");
		SignUpPanel.add(DOBLabel);
		DOBLabel.setBounds(15, 215, 110, 30);
		
		Integer[] date = new Integer[31];
		for(int a = 0; a < date.length; a++) {
			date[a] = a + 1;
		}
		
		JComboBox dateBox = new JComboBox(date);
		SignUpPanel.add(dateBox);
		dateBox.setBounds(130, 220, 40, 20);
		
		Integer[] month = new Integer[12];
		for(int a = 0; a < month.length; a++) {
			month[a] =  a + 1;
		}
		
		JComboBox monthBox = new JComboBox(month);
		SignUpPanel.add(monthBox);
		monthBox.setBounds(180, 220, 40, 20);

		Integer[] year = new Integer[100];
		for(int a = 0; a < year.length; a++) {
			year[a] =  a + 1950;
		}
		
		JComboBox yearBox = new JComboBox(year);
		SignUpPanel.add(yearBox);
		yearBox.setBounds(230, 220, 70, 20);
		
		
		JLabel DLabel=new JLabel("D");
		SignUpPanel.add(DLabel);
		DLabel.setBounds(130, 242, 40, 20);
		
		JLabel MLabel=new JLabel("M");
		SignUpPanel.add(MLabel);
		MLabel.setBounds(180, 242, 40, 20);
		
		JLabel YLabel=new JLabel("Y");
		SignUpPanel.add(YLabel);
		YLabel.setBounds(230, 242, 40, 20);
		
		JLabel CityLabel=new JLabel("City");
		SignUpPanel.add(CityLabel);
		CityLabel.setBounds(15, 272, 83, 30);
		JTextField CityTF=new JTextField(); 
		SignUpPanel.add(CityTF);
		CityTF.setBounds(98, 274, 100, 25);
		
		
		
		JLabel UserTypeLabel=new JLabel("User Type");
		SignUpPanel.add(UserTypeLabel);

		UserTypeLabel.setBounds(15, 313, 83, 30);

		JRadioButton userRB=new JRadioButton("User");
		JRadioButton organizerRB=new JRadioButton("Organizer");
		JRadioButton serviceProviderRB=new JRadioButton("Service Provider");
		SignUpPanel.add(userRB);
		userRB.setBounds(98, 313, 83, 30);

		SignUpPanel.add(organizerRB);
		organizerRB.setBounds(180, 313, 83, 30);

		SignUpPanel.add(serviceProviderRB);
		serviceProviderRB.setBounds(278, 313, 150, 30);

		
		ButtonGroup userTypeGroup = new ButtonGroup();
		userTypeGroup.add(userRB);
		userTypeGroup.add(organizerRB);
		userTypeGroup.add(serviceProviderRB);
		
		
		JButton SaveSignUp=new JButton("SignUp");
		SignUpPanel.add(SaveSignUp);
		SaveSignUp.setBounds(290, 500, 80, 30);

		JButton CancelSignUp=new JButton("Cancel");
		SignUpPanel.add(CancelSignUp);
		CancelSignUp.setBounds(190, 500, 80, 30);
		
		CancelSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrontPageGUI();
				SignUpFrame.dispose();
			}
		});
		
		
		
		SaveSignUp.setBackground(new Color(154, 22, 121));
		CancelSignUp.setBackground(new Color(154, 22, 121));
		SaveSignUp.setForeground(new Color(255, 255, 255));
		CancelSignUp.setForeground(new Color(255, 255, 255));
		
		
		SignUpPanel.setBackground(new Color(255, 255, 255));
		SignUpPanel.setForeground(new Color(154, 22, 121));
		
		SignUpFrame.getContentPane().setBackground(new Color(255, 255, 255));
		SignUpFrame.getContentPane().setForeground(new Color(154, 22, 121));

		
		SignUpFrame.add(SignUpPanel);
		
		SignUpFrame.setVisible(true);
		
		SignUpFrame.setResizable(false);
		
		SignUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//action listener for sign up button
		SaveSignUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				userFound = LoginData.verifyEmail(EmailTF.getText().toString(), "D:\\University Work\\2nd semester\\OOP Project\\Files\\LoginData.txt");
				
					if(FirstNameTF.getText().toString().equals("")||LastNameTF.getText().toString().equals("")||EmailTF.getText().toString().equals("")||PasswordTF.getText().toString().equals("")||PhoneNumberTF.getText().toString().equals("")||genderGroup.isSelected(null)||CityTF.getText().toString().equals("")||userTypeGroup.isSelected(null)) {
						JOptionPane.showMessageDialog(null,"All fields are not entered");
					}
					else if(PasswordTF.getText().toString().length()<6){
						JOptionPane.showMessageDialog(null,"Password should be atleast 6 characters long");

						}
					else if(EmailTF.getText().toString().contains("@gmail.com")==false&&EmailTF.getText().toString().contains("@seecs.edu.pk")==false&&EmailTF.getText().toString().contains("@yahoo.com")==false&&EmailTF.getText().toString().contains("@hotmail.com")==false&&EmailTF.getText().toString().contains("@outlook.com")==false){
						JOptionPane.showMessageDialog(null,"Email is not valid");
						}
					
					else if(userFound) {
					JOptionPane.showMessageDialog(null,"You already have an account !");
					} 
					
					
					else {
			
			//	@SuppressWarnings("deprecation")
			
			//Validating dob
			
			int birthYear = Integer.parseInt(yearBox.getSelectedItem().toString());
			int birthMonth = Integer.parseInt(monthBox.getSelectedItem().toString());
			int birthDay = Integer.parseInt(dateBox.getSelectedItem().toString());
			
			if(birthYear > 2019 || birthMonth > 12 || birthDay > 31) {
				
				JOptionPane.showMessageDialog(null,"Invalid Date of bith ! please enter a valid one !");
			
			}
			
			else {
				
				int age = 0;
				
				LocalDate localDate = LocalDate.now();
				
				int currentYear = localDate.getYear();
				int currentMonth = localDate.getMonthValue();
				int currentDay = localDate.getDayOfMonth();
				
				if(birthMonth < currentMonth) {
					age = currentYear - birthYear;
				}
				else if(birthMonth > currentMonth) {
					age = currentYear - birthYear - 1;
				}
				else {
					if(birthDay <= currentDay) {
						age = currentYear - birthYear;
					}
					else {
						age = currentYear - birthYear - 1;
					}
				}
				
				
				
				User user = new User(FirstNameTF.getText().toString(),LastNameTF.getText().toString(),EmailTF.getText().toString(),PhoneNumberTF.getText().toString(),PasswordTF.getText().toString(), genderGroup.getSelection().getActionCommand(), CityTF.getText().toString(),dateBox.getSelectedItem().toString()+"/"+monthBox.getSelectedItem().toString()+"/"+yearBox.getSelectedItem().toString());	
				
				user.setAge(Integer.toString(age));
				
				
				user.setBio(" ");
				
				user.setProfilePicPath("D:\\University Work\\2nd semester\\OOP Project\\Images\\defaultProfilePic1.png".trim());
				user.setCoverPicPath("D:\\University Work\\2nd semester\\OOP Project\\Images\\defaulfCoverPic3.jpg".trim());
				
				user.setChat("NO message");
				
				MainPageGUI.LoggedInUser = user;
				ChatsGUI.chatLoggedInUser =user;
				LoginData.saveLoginRecord(user.getEmail(), user.getPassword(), LoginData.loginDataPath);
				UserData.saveUserDataRecord(user.getFirstName().trim(),user.getLastName().trim(),user.getEmail().trim(),user.getPhoneNo().trim(),user.getPassword().trim(),user.getGender().trim(),user.getCity().trim(),user.getDob().trim(), user.getBio().trim(), user.getAge().trim(), user.getProfilePicPath().trim(), user.getCoverPicPath().trim(), UserData.userDataPath);
				ChatsData.saveChatsDataRecord(user.getEmail(), user.getChat(), ChatsData.chatDataPath);
				new MainPageGUI();
				SignUpFrame.dispose();
				
			}
			
		}
					
			}});
		
		
		
		
		
	}
	
	
}