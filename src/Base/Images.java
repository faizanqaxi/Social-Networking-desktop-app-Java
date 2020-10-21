package Base;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Images {

	public static ImageIcon uploadImage(int desiredWidth, int desiredHeight) {
		
		final JFileChooser fc = new JFileChooser();
		int returnValue = fc.showOpenDialog(fc);
		
		String filePath = null;
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			filePath = fc.getSelectedFile().getAbsolutePath();
			JOptionPane.showMessageDialog(null, "Success ! ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Error ! ");
			System.exit(1);
		}
		
		ImageIcon image = resizeImage(filePath, desiredWidth, desiredHeight);
		
		return image;
	}
	
public static String getImagePath() {
		
		final JFileChooser fc = new JFileChooser();
		int returnValue = fc.showOpenDialog(fc);
		
		String filePath = null;
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			filePath = fc.getSelectedFile().getAbsolutePath();
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error Getting the image path you chose! ");
			System.exit(1);
		}
		
		
		return filePath;
	}
	
	public static ImageIcon resizeImage(String ImagePath, int desiredWidth, int desiredHeight) {
		
		ImageIcon myImg = new ImageIcon(ImagePath);
		Image img = myImg.getImage();
		Image newImg = img.getScaledInstance(desiredWidth, desiredHeight, img.SCALE_SMOOTH);
		
		ImageIcon image = new ImageIcon(newImg);
		
		return image;
	}
	
	
	
}
