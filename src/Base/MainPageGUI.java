package Base;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPageGUI extends JFrame {
	
	//Data members 
	
	
	public static User LoggedInUser;
	
	//Making the panels we will be adding to our main frame
	
	JPanel topContentPanel = new JPanel();
	JPanel leftContentPanel = new JPanel();
	JPanel mainContentPanel = new JPanel();
	
	//Making the fonts we will be using
	
	Font navBarFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 18);
	Font myFont1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
	Font myFont2 = new Font(Font.SERIF, Font.BOLD, 18);
	Font myFont3 = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 30);
	Font myFont4 = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 20);
	
	//Making the border we will be using
	
	/*
	Border panelsBorder = BorderFactory.createLineBorder(Color.black);
	Border profiLePicBorder = BorderFactory.createLineBorder(Color.black);
	*/
	
	Border panelsBorder = BorderFactory.createEtchedBorder(1);
	Border profiLePicBorder = BorderFactory.createEtchedBorder(0);
	
	//Making the color we will be using
	
	Color ourThemeColor = new Color(154, 22, 121);
	Color ourBlueThemeColor = new Color(94, 84, 93);
	Color ourBackGroundColor = new Color(255, 255, 255);
	
	//Making the components to be used in the navigationbar
	
	ImageIcon mainPagelogo = new ImageIcon("D:\\University Work\\2nd semester\\OOP Project\\Logos\\logo4.jpg");
	ImageIcon searchLogo = new ImageIcon("D:\\University Work\\2nd semester\\OOP Project\\Logos\\searchLogo4.jpg");

	
	JLabel mainPageLogoLabel = new JLabel(mainPagelogo);
	
	JButton HomeBtn = new JButton("HOME");
	JLabel SearchLabel = new JLabel("Search");
	JTextField SearchTf = new JTextField();
	JButton SearchBtn = new JButton(searchLogo);
	JButton ProfileBtn = new JButton("PROFILE");
	JButton EventsBtn = new JButton("EVENTS");
	JButton FriendsBtn = new JButton("FRIENDS");
	JButton ChatBoxBtn = new JButton("Chats");
	JButton SettingsBtn = new JButton("SETTINGS");
	JButton LogoutBtn = new JButton("LOGOUT");

	
	//Making the components to be used in the side bar
	
	JButton uploadBtn = new JButton("Upload");
	JLabel NameLabel = new JLabel(LoggedInUser.getFirstName()+" " + LoggedInUser.getLastName());
	JLabel CityLabel = new JLabel(LoggedInUser.getCity());
	JLabel AgeLabel = new JLabel("Age " + LoggedInUser.getAge());
	JTextArea bioTextArea = new JTextArea();
	JScrollPane  bioTextAreaScrollPane = new JScrollPane(bioTextArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
	
	
	//Constructor
	
	MainPageGUI(){
		
		//Setting our main window layout
		
		this.setLayout(null);
		
		//Setting our main window title
		
		this.setTitle("Tripie");
		
		//Setting all the panels
		
		topContentPanel.setLayout(null);
		topContentPanel.setBounds(0, 0, 1366, 50);
		topContentPanel.setBorder(panelsBorder);
		topContentPanel.setBackground(ourBackGroundColor);
		topContentPanel.setForeground(ourThemeColor);
		
		
		leftContentPanel.setLayout(null);
		leftContentPanel.setBounds(0, 50, 300, 718);
		leftContentPanel.setBorder(panelsBorder);
		leftContentPanel.setBackground(ourBackGroundColor);
		leftContentPanel.setForeground(ourThemeColor);
		
		mainContentPanel.setLayout(null);
		mainContentPanel.setBounds(300, 50, 1066, 718);
		mainContentPanel.setBorder(panelsBorder);
		mainContentPanel.setBackground(ourBackGroundColor);
		mainContentPanel.setForeground(ourThemeColor);
		
		//Now setting the components for top panel
		
		
		mainPageLogoLabel.setBounds(0, 0, 150, 49);
		
		HomeBtn.setBounds(150, 0, 130, 49);
		HomeBtn.setForeground(ourBackGroundColor);
		HomeBtn.setBackground(ourBlueThemeColor);
		HomeBtn.setFont(navBarFont);
		HomeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				new MainPageGUI();
				dispose();
				
			}
			
		});
		
		
		SearchLabel.setBounds(290, 0, 130, 49);
		SearchLabel.setBackground(ourBackGroundColor);
		SearchLabel.setForeground(ourThemeColor);
		SearchLabel.setFont(navBarFont);
		
		
		SearchTf.setBounds(370, 5, 180, 40);
		
		SearchBtn.setBounds(555, 10, 30, 30);
		
		ProfileBtn.setBounds(610, 0, 130, 49);
		ProfileBtn.setForeground(ourBackGroundColor);
		ProfileBtn.setBackground(ourThemeColor);
		ProfileBtn.setFont(navBarFont);
		ProfileBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				new ProfileGUI();
				dispose();
				
				HomeBtn.setBackground(ourThemeColor);
				ProfileBtn.setBackground(ourBlueThemeColor);
				
				
			}
			
		});
		
		
		EventsBtn.setBounds(740, 0, 130, 49);
		EventsBtn.setForeground(ourBackGroundColor);
		EventsBtn.setBackground(ourThemeColor);
		EventsBtn.setFont(navBarFont);
		
		
		EventsBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				new EventsGUI();
				dispose();

				HomeBtn.setBackground(ourThemeColor);
				EventsBtn.setBackground(ourBlueThemeColor);
				
				
			}
			
		});
		
		FriendsBtn.setBounds(870, 0, 130, 49);
		FriendsBtn.setForeground(ourBackGroundColor);
		FriendsBtn.setBackground(ourThemeColor);
		FriendsBtn.setFont(navBarFont);
		
		FriendsBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new FreindsGUI();
				dispose();
				
				HomeBtn.setBackground(ourThemeColor);
				FriendsBtn.setBackground(ourBlueThemeColor);
				
				
			}
			
		});
		
		ChatBoxBtn.setBounds(983, 0, 130, 49);
		ChatBoxBtn.setForeground(ourBackGroundColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setFont(navBarFont);
		ChatBoxBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ChatsGUI();
				dispose();

				
				HomeBtn.setBackground(ourThemeColor);
				ChatBoxBtn.setBackground(ourBlueThemeColor);
				
			}
			
		});
		
		SettingsBtn.setBounds(1113, 0, 123, 49);
		SettingsBtn.setForeground(ourBackGroundColor);
		SettingsBtn.setBackground(ourThemeColor);
		SettingsBtn.setFont(navBarFont);
		SettingsBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new SettingsGUI();
				dispose();
				
				HomeBtn.setBackground(ourThemeColor);
				SettingsBtn.setBackground(ourBlueThemeColor);
				
			}
			
		});
		
		
		
		LogoutBtn.setBounds(1236, 0, 130, 50);
		LogoutBtn.setForeground(ourBackGroundColor);
		LogoutBtn.setBackground(ourThemeColor);
		LogoutBtn.setFont(navBarFont);
		
		LogoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrontPageGUI();

				HomeBtn.setBackground(ourThemeColor);
				LogoutBtn.setBackground(ourBlueThemeColor);
				
				dispose();
			}
		});
		
		//Now adding all the components to top panel
		
		topContentPanel.add(mainPageLogoLabel);
		topContentPanel.add(HomeBtn);
		topContentPanel.add(SearchLabel);
		topContentPanel.add(SearchTf);
		topContentPanel.add(SearchBtn);
		topContentPanel.add(ProfileBtn);
		topContentPanel.add(EventsBtn);
		topContentPanel.add(FriendsBtn);
		topContentPanel.add(LogoutBtn);
		topContentPanel.add(ChatBoxBtn);
		topContentPanel.add(SettingsBtn);
		
		
		//Now setting the components for left content panel
		
		
		
		JLabel profilePic = new JLabel();

		
		profilePic.setBounds(25, 50, 250, 250);
		profilePic.setBorder(profiLePicBorder);
		profilePic.setIcon(Images.resizeImage(LoggedInUser.getProfilePicPath(), 250, 250));
		
		
		
		uploadBtn.setBounds(170, 370, 100, 30);
		uploadBtn.setForeground(ourBackGroundColor);
		uploadBtn.setBackground(ourThemeColor);
		uploadBtn.setFont(myFont2);
		
		uploadBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				String imagePath = Images.getImagePath().toString();
				
				UserData.editRecord(LoggedInUser.getEmail(), "profilePicPath", imagePath);
				
				new MainPageGUI();
				dispose();
				
			}
			
		});
		
		NameLabel.setBounds(40, 400, 200, 60);
		NameLabel.setForeground(ourThemeColor);
		NameLabel.setFont(myFont4);
		
		CityLabel.setBounds(40, 450, 200, 60);
		CityLabel.setForeground(ourThemeColor);
		CityLabel.setFont(myFont4);
		
		AgeLabel.setBounds(40, 500, 200, 60);
		AgeLabel.setForeground(ourThemeColor);
		AgeLabel.setFont(myFont4);
		
		bioTextArea.setText(LoggedInUser.getBio());
		bioTextArea.setWrapStyleWord(true);
		bioTextArea.setLineWrap(true);
	   //textArea.setOpaque(false);
		bioTextArea.setEditable(false);
	    //textArea.setFocusable(false);
		bioTextArea.setBackground(ourBackGroundColor);
		bioTextArea.setForeground(ourThemeColor);
		bioTextArea.setFont(myFont4);
	//	bioTextArea.setBorder(UIManager.getBorder("panelsBorder"));
		bioTextArea.setBounds(40, 565, 240, 170);
		
		bioTextAreaScrollPane.setBounds(40, 565, 240, 170);
		//textareasp.setBackground(new Color(154, 22, 121));
		
		
		//Adding the components to the left content panel
		
		
		leftContentPanel.add(profilePic);
		leftContentPanel.add(uploadBtn);
		leftContentPanel.add(NameLabel);
		leftContentPanel.add(CityLabel);
		leftContentPanel.add(AgeLabel);
		leftContentPanel.add(bioTextArea);
		leftContentPanel.add(bioTextAreaScrollPane);
		
		
		
		//Adding components to the main content panel
		
		JLabel mainContentLabel = new JLabel("Newsfeed");
		mainContentLabel.setBounds(200, 200, 300, 300);
		mainContentLabel.setFont(navBarFont);
		mainContentLabel.setForeground(ourThemeColor);
		
		mainContentPanel.add(mainContentLabel);
		


		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourBlueThemeColor);
		ProfileBtn.setBackground(ourThemeColor);
		EventsBtn.setBackground(ourThemeColor);
		FriendsBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		SettingsBtn.setBackground(ourThemeColor);
		
		
		//Adding all the panels to our main window
		
		this.add(topContentPanel);
		this.add(leftContentPanel);
		this.add(mainContentPanel);
		
 
		//Now setting our main window to full screen
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true); 
		
		this.setVisible(true); 
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	
}

