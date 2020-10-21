package Base;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class SettingsGUI extends MainPageGUI{
	SettingsGUI(){
		

		//Clearing the previous main content
		
		mainContentPanel.removeAll();
		mainContentPanel.updateUI(); //Main content cleared
		
		//Now making the main content for this tab
		
		JLabel FirstNameLabel=new JLabel("First Name");
		mainContentPanel.add(FirstNameLabel);
		FirstNameLabel.setBounds(15, 15, 82, 30);
		
		JTextField FirstNameTF=new JTextField(LoggedInUser.getFirstName());
		mainContentPanel.add(FirstNameTF);
		FirstNameTF.setBounds(98, 18, 100, 25);
		
		
		
		JLabel LastNameLabel=new JLabel("Last Name");
		mainContentPanel.add(LastNameLabel);
		LastNameLabel.setBounds(210, 15, 83, 30);
		
		JTextField LastNameTF=new JTextField(LoggedInUser.getLastName());
		mainContentPanel.add(LastNameTF);
		LastNameTF.setBounds(293, 18, 100, 25);
		
		JButton NameUpdate=new JButton("Update");
		mainContentPanel.add(NameUpdate);
		NameUpdate.setBounds(405, 18, 95, 25);
		NameUpdate.setBackground(ourThemeColor);
		NameUpdate.setForeground(ourBackGroundColor);
		
		NameUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				UserData.editRecord(LoggedInUser.getEmail(), "firstName", FirstNameTF.getText().toString());
				UserData.editRecord(LoggedInUser.getEmail(), "lastName", LastNameTF.getText().toString());
				new SettingsGUI();
				dispose();
			}
		});
		
		
		JLabel EmailLabel=new JLabel("Email");
		mainContentPanel.add(EmailLabel);
		EmailLabel.setBounds(15, 55, 83, 30);
		
		JLabel EmailL = new JLabel(LoggedInUser.getEmail());
		mainContentPanel.add(EmailL);
		EmailL.setBounds(98, 57, 300, 25);
		
		
		JLabel PasswordLabel=new JLabel("Password");
		mainContentPanel.add(PasswordLabel);
		PasswordLabel.setBounds(15, 95, 83, 30);
		JPasswordField PasswordTF = new JPasswordField();
		mainContentPanel.add(PasswordTF);
		PasswordTF.setBounds(98, 97, 150, 25);
		
		JButton PasswordUpdate=new JButton("Update");
		mainContentPanel.add(PasswordUpdate);
		PasswordUpdate.setBounds(257, 97, 95, 25);
		PasswordUpdate.setBackground(ourThemeColor);
		PasswordUpdate.setForeground(ourBackGroundColor);
		PasswordUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				if(PasswordTF.getText().toString().length()<6){
					JOptionPane.showMessageDialog(null,"Invalid ! Password should be atleast 6 characters long");

				}
				
				else {
					
					UserData.editRecord(LoggedInUser.getEmail(), "password", PasswordTF.getText().toString());
					LoginData.editPassword(LoggedInUser.getEmail(), PasswordTF.getText().toString());
					new SettingsGUI();
					dispose();
					
				}
				
			}
		});
		
		JLabel PhoneNumberLabel=new JLabel("Phone Number");
		mainContentPanel.add(PhoneNumberLabel);
		PhoneNumberLabel.setBounds(15, 135, 110, 30);
		JTextField PhoneNumberTF=new JTextField(LoggedInUser.getPhoneNo());
		mainContentPanel.add(PhoneNumberTF);
		PhoneNumberTF.setBounds(125, 137, 150, 25);
		
		JButton PhoneNoUpdate=new JButton("Update");
		mainContentPanel.add(PhoneNoUpdate);
		PhoneNoUpdate.setBounds(284, 137, 95, 25);
		PhoneNoUpdate.setBackground(ourThemeColor);
		PhoneNoUpdate.setForeground(ourBackGroundColor);
		
		PhoneNoUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				UserData.editRecord(LoggedInUser.getEmail(), "phoneNo", PhoneNumberTF.getText().toString());
				new SettingsGUI();
				dispose();
			}
		});
		
		
		JLabel GenderLabel=new JLabel("Gender");
		mainContentPanel.add(GenderLabel);
		GenderLabel.setBounds(15, 175, 83, 30);
		
		JLabel GenderL=new JLabel(LoggedInUser.getGender());
		GenderL.setBounds(98, 175, 70, 30);
		mainContentPanel.add(GenderL);
		
		
		JLabel DOBLabel=new JLabel("Date of Birth");
		mainContentPanel.add(DOBLabel);
		DOBLabel.setBounds(15, 215, 110, 30);
		
		
		
		JTextField dateBox = new JTextField();
		mainContentPanel.add(dateBox);
		dateBox.setBounds(130, 220, 40, 20);
		
		
		
		JTextField monthBox = new JTextField();
		mainContentPanel.add(monthBox);
		monthBox.setBounds(180, 220, 40, 20);

		JTextField yearBox = new JTextField();
		mainContentPanel.add(yearBox);
		yearBox.setBounds(230, 220, 70, 20);
		
		JButton DateUpdate=new JButton("Update");
		mainContentPanel.add(DateUpdate);
		DateUpdate.setBounds(309, 220, 95, 25);
		DateUpdate.setBackground(ourThemeColor);
		DateUpdate.setForeground(ourBackGroundColor);
		
		
		
		DateUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int birthYear = Integer.parseInt(yearBox.getText().toString());
				int birthMonth = Integer.parseInt(monthBox.getText().toString());
				int birthDay = Integer.parseInt(dateBox.getText().toString());
				
				if(birthYear > 2019 || birthMonth > 12 || birthDay > 31) {
					
					JOptionPane.showMessageDialog(null,"Invalid Date of bith ! please enter a valid one !");
				
				}
				
				else {
					
					String DOB = dateBox.getText().toString() + "\\" + monthBox.getText().toString() + "\\" + yearBox.getText().toString();

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
					
					String newAge = new String(Integer.toString(age));
					
					UserData.editRecord(LoggedInUser.getEmail(), "dob", DOB);
					UserData.editRecord(LoggedInUser.getEmail(), "age", newAge);
					
					new SettingsGUI();
					dispose();
				}
			}
				
				
		}); 
		
		
		JLabel DLabel=new JLabel("D");
		mainContentPanel.add(DLabel);
		DLabel.setBounds(130, 242, 40, 20);
		
		JLabel MLabel=new JLabel("M");
		mainContentPanel.add(MLabel);
		MLabel.setBounds(180, 242, 40, 20);
		
		JLabel YLabel=new JLabel("Y");
		mainContentPanel.add(YLabel);
		YLabel.setBounds(230, 242, 40, 20);
		
		JLabel CityLabel=new JLabel("City");
		mainContentPanel.add(CityLabel);
		CityLabel.setBounds(15, 272, 83, 30);
		JTextField CityTF=new JTextField(LoggedInUser.getCity()); 
		mainContentPanel.add(CityTF);
		CityTF.setBounds(98, 274, 100, 25);
		
		JButton CityUpdate=new JButton("Update");
		mainContentPanel.add(CityUpdate);
		CityUpdate.setBounds(207, 274, 95, 25);
		CityUpdate.setBackground(ourThemeColor);
		CityUpdate.setForeground(ourBackGroundColor);
		
		CityUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				UserData.editRecord(LoggedInUser.getEmail(), "city", CityTF.getText().toString());
				new SettingsGUI();
				dispose();
			}
		});
		
		JLabel BioLabel=new JLabel("Bio");
		mainContentPanel.add(BioLabel);
		BioLabel.setBounds(15, 310, 83, 30); 
		mainContentPanel.add(BioLabel);
		
		JTextArea bioArea = new JTextArea();
		bioArea.setText(LoggedInUser.getBio());
		bioArea.setWrapStyleWord(true);
		bioArea.setLineWrap(true);
		//bioArea.setOpaque(false);
		
	   
		
		bioArea.setBackground(new Color(255,255,255));
		;
		bioArea.setBorder(UIManager.getBorder("BioLabel.border"));
		mainContentPanel.add(bioArea);
		bioArea.setBounds(98, 310, 240, 170);
		
		JScrollPane  biotextareasp= new JScrollPane(bioArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		mainContentPanel.add(biotextareasp);
		biotextareasp.setBounds(98, 310, 240, 170);
		
		JButton BioUpdate=new JButton("Update");
		mainContentPanel.add(BioUpdate);
		BioUpdate.setBounds(347, 310, 95, 25);
		BioUpdate.setBackground(ourThemeColor);
		BioUpdate.setForeground(ourBackGroundColor);
		
		BioUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bioArea.getText().toString().length()>128) {
					JOptionPane.showMessageDialog(null,"Bio should be 128 characters long");
					bioArea.setText(" ");
				}
				else {
				UserData.editRecord(LoggedInUser.getEmail(), "bio", bioArea.getText().toString());
				new SettingsGUI();
				dispose();

			}}
		});
		

		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourThemeColor);
		ProfileBtn.setBackground(ourThemeColor);
		EventsBtn.setBackground(ourThemeColor);
		FriendsBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		SettingsBtn.setBackground(ourBlueThemeColor);
		
		
	}
	
}