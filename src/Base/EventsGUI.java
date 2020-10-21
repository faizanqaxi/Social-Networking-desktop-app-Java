package Base;

import javax.swing.JLabel;

public class EventsGUI extends MainPageGUI{

	EventsGUI(){
		
		
		//Clearing the previous main content
		
		mainContentPanel.removeAll();
		mainContentPanel.updateUI(); //Main content cleared
		
		//Now making the main content for this tab
		
		JLabel eventsLabel = new JLabel("Events");
		eventsLabel.setBounds(200, 200, 300, 300);
		eventsLabel.setFont(navBarFont);
		eventsLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(eventsLabel);
		
		
		
		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourThemeColor);
		ProfileBtn.setBackground(ourThemeColor);
		EventsBtn.setBackground(ourBlueThemeColor);
		FriendsBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		SettingsBtn.setBackground(ourThemeColor);
		
		
	}
	
}
