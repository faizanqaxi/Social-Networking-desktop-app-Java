package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
public class LogInGUI {

	private static Scanner x;
	
	private static boolean userFound;
	
	LogInGUI(){
		
		userFound = false;
		JFrame LogInFrame=new JFrame("TRIPIE LOGIN");
		LogInFrame.setVisible(true);
		LogInFrame.setBounds(433, 134, 500, 500);
		LogInFrame.setDefaultCloseOperation(LogInFrame.EXIT_ON_CLOSE);
		LogInFrame.setLayout(null);
		LogInFrame.setResizable(false);

		
		
		JPanel LogInPanel=new JPanel();
		LogInFrame.add(LogInPanel);
		LogInPanel.setLayout(null);
		LogInPanel.setSize(500,500);
		
		JLabel EmailLabel=new JLabel("Email");
		LogInPanel.add(EmailLabel);
		EmailLabel.setBounds(90,145 , 83, 30);
		
		JTextField EmailTF =new JTextField();
		LogInPanel.add(EmailTF);
		EmailTF.setBounds(170,147 , 170, 25);

		JLabel PasswordLabel=new JLabel("Password");
		LogInPanel.add(PasswordLabel);
		PasswordLabel.setBounds(90, 180, 83, 30);
		JPasswordField PasswordF=new JPasswordField();
		LogInPanel.add(PasswordF);
		PasswordF.setBounds(170,180, 170, 25);
		
		JButton SaveLogIn=new JButton("LogIn");
		LogInPanel.add(SaveLogIn);
		SaveLogIn.setBounds(250, 250, 80, 30);
	

		JButton CancelLogIn=new JButton("Cancel");
		LogInPanel.add(CancelLogIn);
		CancelLogIn.setBounds(150, 250, 80, 30);
		

		CancelLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrontPageGUI();
				LogInFrame.dispose();
			}
		});
		
		SaveLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				userFound = LoginData.verifyLogin(EmailTF.getText().toString(), PasswordF.getText().toString(), LoginData.loginDataPath);
				
				if(userFound) {
					
					UserData.traceUserData(EmailTF.getText().toString(), UserData.userDataPath);
					ChatsData.traceChatsData(EmailTF.getText().toString(), ChatsData.chatDataPath);
					new MainPageGUI();
					LogInFrame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Email or password please enter a valid one !");
				}
				
			}
		});
		
		SaveLogIn.setForeground(new Color(255, 255, 255));
		SaveLogIn.setBackground(new Color(154, 22, 121));
		
		CancelLogIn.setForeground(new Color(255, 255, 255));
		CancelLogIn.setBackground(new Color(154, 22, 121));
		
		LogInPanel.setBackground(new Color(255, 255, 255));
		LogInPanel.setForeground(new Color(154, 22, 121));
	}
	
	
}
