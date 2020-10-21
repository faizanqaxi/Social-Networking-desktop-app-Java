package Base;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ChatsGUI extends MainPageGUI{
	public static User chatLoggedInUser;

	ChatsGUI(){
		
		//Clearing the previous main content
		
		mainContentPanel.removeAll();
		mainContentPanel.updateUI(); //Main content cleared
		
		//Now making the main content for this tab
		
		JLabel chatsLabel = new JLabel("Your Messages");
		chatsLabel.setBounds(190, 10, 200	,30);
		chatsLabel.setFont(navBarFont);
		chatsLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(chatsLabel);
		
		
		
		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourThemeColor);
		ProfileBtn.setBackground(ourThemeColor);
		EventsBtn.setBackground(ourThemeColor);
		FriendsBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setBackground(ourBlueThemeColor);
		SettingsBtn.setBackground(ourThemeColor);
		
		JTextArea MessageRev =new JTextArea(chatLoggedInUser.getChat());
		mainContentPanel.add(MessageRev);
		MessageRev.setBounds(150, 80, 250, 250);
		MessageRev.setBackground(ourBackGroundColor);
		MessageRev.setForeground(ourThemeColor);
		MessageRev.setFont(myFont4);
		MessageRev.setEditable(false);
		MessageRev.setBorder(new LineBorder(Color.BLACK));
		MessageRev.setWrapStyleWord(true);
		MessageRev.setLineWrap(true);
		MessageRev.setOpaque(false);
		MessageRev.setVisible(true);
		JScrollPane mrs=new JScrollPane();
		
		mrs.setBounds(150, 80, 250, 250);
		mrs.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		mrs.getViewport().setBackground(ourBackGroundColor);
		mrs.getViewport().add(MessageRev);
		mrs.setVisible(true);
		mainContentPanel.add(mrs);
		
		
		JLabel sendLabel = new JLabel("Send Message");
		sendLabel.setBounds(190, 350, 200	,30);
		sendLabel.setFont(navBarFont);
		sendLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(sendLabel);
		
		JTextArea SendTA =new JTextArea();
		mainContentPanel.add(SendTA);
		SendTA.setBounds(150, 400, 250, 250);
		SendTA.setBackground(ourBackGroundColor);
		SendTA.setForeground(ourThemeColor);
		SendTA.setFont(myFont4);
		SendTA.setEditable(true);
		SendTA.setBorder(new LineBorder(Color.BLACK));
		//SendTA.setWrapStyleWord(true);
		//SendTA.setLineWrap(true);
		//SendTA.setOpaque(false);
		SendTA.setVisible(true);
		JScrollPane sen=new JScrollPane();
		
		sen.setBounds(150, 400, 250, 250);
		sen.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		sen.getViewport().setBackground(ourBackGroundColor);
		sen.getViewport().add(SendTA);
		sen.setVisible(true);
		mainContentPanel.add(sen);

		JLabel emailLabel = new JLabel("Enter Email of friend ");
		emailLabel.setBounds(90, 670, 170,30);
		emailLabel.setFont(navBarFont);
		emailLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(emailLabel);
		
		JTextField emailTF = new JTextField();
		emailTF.setBounds(270, 670, 170,30);
		emailTF.setFont(navBarFont);
		emailTF.setForeground(ourThemeColor);
		
		mainContentPanel.add(emailTF);
		
		JButton send = new JButton("Send");
		send.setBounds(450, 670, 90,30);
		send.setFont(navBarFont);
		send.setForeground(ourThemeColor);
		send.setBackground(new Color(255,255,255));

		mainContentPanel.add(send);
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChatsData.editchatRecord(emailTF.getText().toString(), "chat", SendTA.getText().toString()+" from " +chatLoggedInUser.getEmail()); 
				new ChatsGUI();
				dispose();
			}
			
			
			
			
		});
		
	}
	
	
}
