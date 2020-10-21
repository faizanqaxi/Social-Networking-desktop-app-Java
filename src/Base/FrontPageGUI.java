package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Graphics;

public class FrontPageGUI{

	
	
	FrontPageGUI(){
		JFrame frontPageFrame = new JFrame("Tripie");
		
		frontPageFrame.setBounds(433, 134, 500, 500);
		frontPageFrame.setLayout(null);
		
		
		
		ImageIcon logo = new ImageIcon("D:\\University Work\\2nd semester\\OOP Project\\Logos\\logo2.jpg");
		
		JLabel LogoLabel = new JLabel(logo);
		
		Font myFont1 = new Font(Font.MONOSPACED, Font.PLAIN, 50);
		//Font myFont3 = new Font(Font.ITALIC, Font.BOLD, 50);
		Font myFont2 = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 50);
		
		//LogoLabel.setFont(myFont1);
		
		LogoLabel.setForeground(new Color(242, 232, 232));
		
		JButton LoginButton = new JButton("LOGIN");
		JButton SignUpButton = new JButton("SIGNUP");
		
		LoginButton.setBackground(new Color(154, 22, 121));
		SignUpButton.setBackground(new Color(154, 22, 121));
		
		LoginButton.setForeground(new Color(255, 255, 255));
		SignUpButton.setForeground(new Color(255, 255, 255));
		
		SignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUpGUI();
				frontPageFrame.dispose();
			}
		});
		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogInGUI();
				frontPageFrame.dispose();
			}
		});
		
		
		frontPageFrame.add(LoginButton);
		frontPageFrame.add(SignUpButton);
		frontPageFrame.add(LogoLabel);
		
		LogoLabel.setBounds(120, 20, 253, 253);
		
		LoginButton.setBounds(160, 300, 80, 30);
		SignUpButton.setBounds(260, 300, 80, 30);
		
		
		
		
		
		frontPageFrame.add(LogoLabel);
		frontPageFrame.add(LoginButton);
		frontPageFrame.add(SignUpButton);

		
		frontPageFrame.setResizable(false);
		
		
		frontPageFrame.getContentPane().setBackground(new Color(255, 255, 255));
		frontPageFrame.getContentPane().setForeground(new Color(255, 255, 255));
		
		frontPageFrame.setVisible(true);
		
		frontPageFrame.setDefaultCloseOperation(frontPageFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	

}
