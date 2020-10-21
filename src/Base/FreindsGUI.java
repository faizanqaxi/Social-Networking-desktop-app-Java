package Base;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FreindsGUI extends MainPageGUI{
	FreindsGUI(){
		
		
		//Clearing the previous main content
		
		mainContentPanel.removeAll();
		mainContentPanel.updateUI(); //Main content cleared
		
		//Now making the main content for this tab
		
		JLabel friendsLabel = new JLabel("Friends");
		friendsLabel.setBounds(200, 200, 300, 300);
		friendsLabel.setFont(navBarFont);
		friendsLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(friendsLabel);
		
		
		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourThemeColor);
		ProfileBtn.setBackground(ourThemeColor);
		EventsBtn.setBackground(ourThemeColor);
		FriendsBtn.setBackground(ourBlueThemeColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		SettingsBtn.setBackground(ourThemeColor);
		
		
	}
	
	
}