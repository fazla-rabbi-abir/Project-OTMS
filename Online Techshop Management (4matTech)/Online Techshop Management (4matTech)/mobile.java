import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mobile extends JFrame {
	
	private ImageIcon backIcon;
 	
	private JLabel headline, anotherTitle, imageLabel, textLabel;
			
	private String[] titles;

	private String[][] imageNames,text;

	private String productName, productInfo,imagePath;
	
	private JButton backButton,buyButton,cartButton;
	
	private JPanel panel, anotherPanel, newPanel;
	
	private Cursor crsr;

    public mobile() {
        setTitle("4matTech");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(220,80);

        // "Back" button
		ImageIcon backIcon = new ImageIcon("./image/back.png");
		JButton backButton = new JButton(backIcon);
		backButton.setBounds(20, 20, 90, 40); // Set position and size
		backButton.setBorderPainted(false); // Remove border
		backButton.setContentAreaFilled(false); // Remove default background
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Close the Laptop frame
				dispose();

				// Open the Home Page
				new homepage().setVisible(true);            
			}
		});
		
        // Create a headline
        JLabel headline = new JLabel("Welcome to Mobile Section", SwingConstants.CENTER);
        headline.setFont(new Font("Lato", Font.BOLD, 24)); // Set font size and <style
        headline.setBounds(0, 0, 1000, 40); // Set position and size

        // Create a panel for the button and the headline
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set layout to null for absolute positioning
        panel.setPreferredSize(new Dimension(1000, 2400)); // Set preferred size
        panel.add(backButton); // Add the button to the panel
        panel.add(headline); // Add the headline to the panel

        String[] titles = {"iPhone", "Samsung", "Xiaomi", "Vivo"};

        // Create four new another panel
       
		
	for (int i = 0; i < 4; i++) 
	{
		JPanel anotherPanel = new JPanel();
		anotherPanel.setBounds(30, 80 + i*580 , 900, 560); // Set position and size
		Color lightBlue = new Color(37, 100, 192); // Create a light blue color 
		anotherPanel.setBackground(lightBlue); // Set background color to light blue       
		anotherPanel.setLayout(null); // Set layout to null for absolute positioning

		JLabel anotherTitle = new JLabel(titles[i], SwingConstants.CENTER);
		anotherTitle.setForeground(Color.WHITE); // Set text color to white
		anotherTitle.setFont(new Font("Lato", Font.BOLD, 24)); // Set font size and <style
		anotherTitle.setBounds(0, 0, 920, 40); // Set position and size
		anotherPanel.add(anotherTitle); // Add the title to the another panel

			String[][] imageNames = {
				{"./image/iPhone 14.jpg", "./image/iphone 15pro.jpeg", "./image/iphone 15pro max.jpeg"},
				{"./image/Galaxy Z Flip5.jpeg", "./image/Galaxy S23 Ultra.jpeg", "./image/Galaxy S21 FE 5G.jpg"},
				{"./image/Xiaomi 12 Pro.jpg", "./image/Redmi Note 11S.jpg", "./image/Xiaomi Pad 5 WiFi.jpg"},
				{"./image/vivo Y36.jpeg", "./image/vivo V27 5G.jpeg", "./image/vivo V29 5G.jpeg"}
			};

			


String[][] text = 
	{
		{"<html><b><big>iPhone 14</big></b><br><b style=\"color:blue;\">Price: 146,999 BDT</b><br>6.1\" OLED display, 12MP camera, Apple A15 Bionic processor, 6GB RAM, 3279mAh battery</html>",
		"<html><b><big>iPhone 15 Pro</big></b><br><b style=\"color:blue;\">Price: 199,999 BDT</b><br>6.1\" display, 48MP+12MP+12MP cameras, Apple A17 Bionic processor, 6GB RAM, 3650mAh battery</html>",
		"<html><b><big>iPhone 15 Pro Max</big></b><br><b style=\"color:blue;\">Price: 239,000 BDT</b><br>6.7\" OLED display, 48MP+12MP+12MP cameras, A17 Pro processor, 8GB RAM, 4422mAh battery</html>"},

		{"<html><b><big>Galaxy Z Flip5</big></b><br><b style=\"color:blue;\">Price: 183,999 BDT</b><br>6.7\" display, 12MP camera, Snapdragon 8 Gen 2 processor, 8GB RAM, 3700mAh battery</html>",
		"<html><b><big>Galaxy S23 Ultra</big></b><br><b style=\"color:blue;\">Price: 224,999 BDT</b><br>6.8\" Dynamic AMOLED display, 200MP camera, Snapdragon 8 Gen 2 processor, 8GB RAM, 5000mAh battery</html>",
		"<html><b><big>Galaxy S21 FE 5G</big></b><br><b style=\"color:blue;\">Price: 79,999 BDT</b><br>6.4\" display, 12MP camera, Snapdragon 888 5G processor, 6/8GB RAM, 4500mAh battery</html>"},
		
		{"<html><b><big>Xiaomi 12 Pro</big></b><br><b style=\"color:blue;\">Price: 99,999 BDT</b><br>6.7\" AMOLED display, 50MP camera, Snapdragon 8 Gen1 processor, 8GB RAM, 4600mAh battery</html>",
		"<html><b><big>Redmi Note 11S</big></b><br><b style=\"color:blue;\">Price: 24,999 BDT</b><br>6.43\" display, 108MP camera, MediaTek Helio G96 processor, 6/8GB RAM, 5000mAh battery</html>",
		"<html><b><big>Xiaomi Pad 5 WiFi</big></b><br><b style=\"color:blue;\">Price: 30,999 BDT</b><br>11\" IPS-LCD display, 13MP camera, Snapdragon 860 processor, 6GB RAM</html>"},

		{"<html><b><big>vivo Y36</big></b><br><b style=\"color:blue;\">Price: 24,999 BDT</b><br>6.64\" display, 50MP camera, MediaTek Dimensity 6020 processor, 8GB RAM, 5000mAh battery</html>",
		"<html><b><big>vivo V27 5G</big></b><br><b style=\"color:blue;\">Price: 54,999 BDT</b><br>6.78\" AMOLED display, 50MP camera, MediaTek Dimensity 7200 processor, 8/12GB RAM, 4600mAh battery</html>",
		"<html><b><big>vivo V29 5G</big></b><br><b style=\"color:blue;\">Price: 56,999 BDT</b><br>6.78\" AMOLED display, 50MP camera, Qualcomm Snapdragon 778G processor, 8/12GB RAM, 4600mAh battery</html>"}
	};

    for (int j = 0; j < 3; j++) {
		final int r = i; // Declare i as final
        final int c = j;
        JPanel newPanel = new JPanel();
        newPanel.setBounds(20 + j * 290, 50, 280, 470); // Set position and size
        newPanel.setBackground(Color.WHITE); // Set background color to white
        newPanel.setLayout(null); // Set layout to null for absolute positioning

        // Create an image label
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(5, 5, 270, 270); // Set position and size
        imageLabel.setIcon(ImageResizer.resizeImage(imageNames[i][j], 270, 270)); // Resize the image to 270x270
        newPanel.add(imageLabel); // Add the image label to the new panel

        // Create a text box
			JLabel textLabel = new JLabel(text[i][j]);
            textLabel.setFont(new Font("Lato", Font.PLAIN, 15));
			textLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			textLabel.setBounds(5, 280, 270, 130); // Set position and size
			newPanel.add(textLabel); // Add the text box to the new panel

        // Create a "Cart" button
		JButton cartButton = new JButton("Add to Cart");
        cartButton.setBounds(5, 410, 130, 40); // Set position and size
		cartButton.setBackground(Color.ORANGE);
        newPanel.add(cartButton); // Add the button to the new panel
		
		cartButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        // Pass product information to ProductDetailsFrame
          String productName = titles[r];
          String productInfo = text[r][c];
          String imagePath = imageNames[r][c];

           ProductDetailsFrame obj3 = new ProductDetailsFrame(productName, productInfo, imagePath);
           dispose();
		   obj3.setVisible(true);
		  }
		});
		
		JButton buyButton = new JButton("Buy Now");
        buyButton.setBounds(145, 410, 125, 40); // Set position and size
		Color skyColor = new Color(135, 206, 235); // RGB values for sky color
		buyButton.setBackground(skyColor);
		newPanel.add(buyButton); // Add the button to the new panel
		
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new CheckoutFrame().setVisible(true);            
			}
		});
		
        anotherPanel.add(newPanel); // Add the new panel to the another panel
    }
    // Add the another panel to the panel
    panel.add(anotherPanel);
}

        // Create a scroll pane and add the panel to it
        JScrollPane scrollPane = new JScrollPane(panel);
       // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 100, 900, 550);

        // Add the scroll pane to the frame
        add(scrollPane);

        setVisible(true);
    }

public ImageIcon resizeImage(String imagePath, int width, int height) 
	{
		try 
		{
			BufferedImage originalImage = ImageIO.read(new File(imagePath));
			Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = resizedImage.createGraphics();
			g2d.drawImage(tmp, 0, 0, null);
			g2d.dispose();
			return new ImageIcon(resizedImage);
		} 
		
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
