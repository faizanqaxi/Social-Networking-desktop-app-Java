package Base;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfileGUI extends MainPageGUI {

	JLabel postPic = new JLabel();
	JLabel postDescription = new JLabel();

	
	ProfileGUI(){
		
		//Clearing the previous main content
		
		mainContentPanel.removeAll();
		mainContentPanel.updateUI(); //Main content cleared
		
		//Now making the main content for this tab
		
		// --------------------------- // 
		

		JLabel coverPic = new JLabel();
		
		coverPic.setBounds(10, 10, 1046, 200);
		coverPic.setBorder(panelsBorder);
		coverPic.setIcon(Images.resizeImage(LoggedInUser.getCoverPicPath(), 1046, 300));
		
		JButton coverPicup = new JButton("CHANGE COVER");
		coverPicup.setBounds(836, 210, 200, 30);
		coverPicup.setForeground(ourBackGroundColor);
		coverPicup.setBackground(ourThemeColor);
		coverPicup.setFont(myFont2);
		coverPicup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String imagePath = Images.getImagePath().toString();
				
				UserData.editRecord(LoggedInUser.getEmail(), "coverPicPath", imagePath);
				
				new ProfileGUI();
				dispose();
				
			}
			
		});
		JLabel profilePic = new JLabel();
		
		profilePic.setBounds(433, 130, 130, 130);
		profilePic.setBorder(profiLePicBorder);
		profilePic.setIcon(Images.resizeImage(LoggedInUser.getProfilePicPath(), 130, 130));
		
		

		JLabel nameLabel = new JLabel(LoggedInUser.getFirstName()+" " + LoggedInUser.getLastName());
		nameLabel.setBounds(433, 263, 200, 43);
		nameLabel.setForeground(ourThemeColor);
		nameLabel.setFont(myFont4);
		
		
		JButton addPost = new JButton("Add Post");
		addPost.setBounds(10, 278, 150, 30);
		addPost.setForeground(ourBackGroundColor);
		addPost.setBackground(ourThemeColor);
		addPost.setFont(myFont2);
		

		JTextArea postDescriptionTA  = new JTextArea();
		postDescriptionTA.setBounds(10, 310, 300, 30);
		postDescriptionTA.setBackground(ourBackGroundColor);
		postDescriptionTA.setForeground(ourThemeColor);
		postDescriptionTA.setFont(myFont4);
		postDescriptionTA.setEditable(true);
		postDescriptionTA.setBorder(new LineBorder(Color.BLACK));
		//SendTA.setWrapStyleWord(true);
		//SendTA.setLineWrap(true);
		//SendTA.setOpaque(false);
		postDescriptionTA.setVisible(true);
	
		
		addPost.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				
				
				String postDes = postDescriptionTA.getText().toString().trim();
				String imagePath = Images.getImagePath().toString();

				
				postPic.setBounds(10, 350, 500, 320);
				postPic.setBorder(profiLePicBorder);
				postPic.setIcon(Images.resizeImage(imagePath, 500, 320));
				

				
				postDescription.setBounds(10, 672, 500, 30);
				postDescription.setBorder(profiLePicBorder);
				postDescription.setForeground(ourThemeColor);
				postDescription.setBackground(ourBackGroundColor);
				postDescription.setFont(myFont4);
				postDescription.setText(postDes);
				
				//new ProfileGUI();
				
			}
			
		});
		

		mainContentPanel.add(postPic);
		mainContentPanel.add(postDescription);
		
		
		mainContentPanel.add(profilePic);
		mainContentPanel.add(coverPic);
		mainContentPanel.add(coverPicup);
		mainContentPanel.add(nameLabel);
		mainContentPanel.add(addPost);
		mainContentPanel.add(postDescriptionTA);
		
		// --------------------------- //
	

		//Setting color for navBarOnFocus
		
		HomeBtn.setBackground(ourThemeColor);
		ProfileBtn.setBackground(ourBlueThemeColor);
		EventsBtn.setBackground(ourThemeColor);
		FriendsBtn.setBackground(ourThemeColor);
		ChatBoxBtn.setBackground(ourThemeColor);
		SettingsBtn.setBackground(ourThemeColor);
		
		
	}
	
}

/*


		JLabel coverPic = new JLabel();

		coverPic.setBounds(10, 10, 1046, 300);
		coverPic.setBorder(panelsBorder);
		coverPic.setIcon(Images.resizeImage(LoggedInUser.getCoverPicPath(), 1046, 300));
		
		JLabel profilePic = new JLabel();
		
		profilePic.setBounds(453, 230, 130, 130);
		profilePic.setBorder(profiLePicBorder);
		profilePic.setIcon(Images.resizeImage(LoggedInUser.getProfilePicPath(), 130, 130));
		
		
		
		mainContentPanel.add(profilePic);
		mainContentPanel.add(coverPic);
		
		JButton coverPicup = new JButton("Change Cover");
		
		coverPicup.setBounds(750, 333, 200, 30);
		coverPicup.setFont(navBarFont);
		coverPicup.setForeground(ourBackGroundColor);
		coverPicup.setBackground(ourThemeColor);
		
		mainContentPanel.add(coverPicup);
		coverPicup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String imagePath = Images.getImagePath().toString();
				
				UserData.editRecord(LoggedInUser.getEmail(), "coverPicPath", imagePath);
				
				new ProfileGUI();
				dispose();
				
			}
			
		});
		

*/