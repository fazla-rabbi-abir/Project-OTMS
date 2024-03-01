import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaptopDetailsFrame extends JFrame implements ActionListener {
    JPanel panel1;
    JButton b1, b2,continueButton,backButton;
    JLabel nameLabel, infoLabel;
    ImageIcon productImage;

    public LaptopDetailsFrame(String productName, String productInfo, String imagePath) {
        super("My Cart");
        super.setBounds(220,80, 1000, 700);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(null);

        // Display product name
        nameLabel = new JLabel("Brand Name: " + productName);
		nameLabel.setFont(new Font("Lato", Font.BOLD, 24));
        nameLabel.setBounds(20, 15, 300, 30);
        panel1.add(nameLabel);

        // Display product information
        infoLabel = new JLabel("<html>" + productInfo + "</html>");
        infoLabel.setBounds(20, 35, 300, 400);
        panel1.add(infoLabel);

        // Display product image
        productImage = resizeImage(imagePath, 600, 400);
        JLabel imageLabel = new JLabel(productImage);
        imageLabel.setBounds(350, 20, 600, 400);
        panel1.add(imageLabel);
		
		continueButton = new JButton("Continue");
        continueButton.setBounds(20, 420, 100, 30);
        continueButton.addActionListener(this);
        panel1.add(continueButton);
		
		backButton = new JButton("Back");
        backButton.setBounds(130, 420, 100, 30);
        backButton.addActionListener(this);
        panel1.add(backButton);

        super.add(panel1);
		
		
    }
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continueButton) {
            // Handle "Continue" button click
            PurchaseInformationFrame purchaseFrame = new PurchaseInformationFrame();
			dispose();
            purchaseFrame.setVisible(true);
			//this.setVisible(false);
            // You might want to pass necessary information to PurchaseInformationFrame
        }
		 else if (e.getSource() == backButton) {
            // Handle "Back" button click
            dispose();
			homepage hp =  new homepage();
			hp.setVisible(true);
            // You might want to go back to the previous frame here
        }
        }

    
	public ImageIcon resizeImage(String imagePath, int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = resizedImage.createGraphics();
            g2d.drawImage(tmp, 0, 0, null);
            g2d.dispose();
            return new ImageIcon(resizedImage);
        }
		catch (IOException e)
		{
            e.printStackTrace();
            return null;
        }
  }
}