import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accessories extends JFrame {
	
	
    public accessories() {
        setTitle("4matTech");
        setSize(1000, 700);
        setLocation(220,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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


		
        // headline
        JLabel headline = new JLabel("Welcome to accessories Section", SwingConstants.CENTER);
        headline.setFont(new Font("Lato", Font.BOLD, 24)); // Set font size and <style
        headline.setBounds(0, 20, 1000, 40); // Set position and size

        // panel for the button and the headline
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set layout to null for absolute positioning
        panel.setPreferredSize(new Dimension(1000, 3000)); // Set preferred size
        panel.add(backButton); // Add the button to the panel
        panel.add(headline); // Add the headline to the panel

        String[] titles = {"Casses", "Screen Protector", "Power Banks", "Speakers", "Headset"};

    //four new another panel
	for (int i = 0; i < 5; i++) 
	{
		JPanel anotherPanel = new JPanel();
		anotherPanel.setBounds(30, 80 + i*580 , 900, 570); // Set position and size
		Color lightBlue = new Color(37, 100, 192); // light red color 
		anotherPanel.setBackground(lightBlue); // Set background color to light red       
		anotherPanel.setLayout(null); // Set layout to null for absolute positioning

		JLabel anotherTitle = new JLabel(titles[i], SwingConstants.CENTER);
		anotherTitle.setForeground(Color.WHITE); // Set text color to white
		anotherTitle.setFont(new Font("Lato", Font.BOLD, 24)); // Set font size and <style
		anotherTitle.setBounds(0, 0, 920, 40); // Set position and size
		anotherPanel.add(anotherTitle); // Add the title to the another panel

			String[][] imageNames = {
						{"./image/Golden Field 8701.jpg", "./image/XIGMATEK-Astro EN40858.jpg", "./image/NZXT H7 Flow.jpg"},
						{"./image/Galaxy M31 Tempered Glass Cover.jpg", "./image/ESR Tempered Glass Protector.jpg", "./image/Skech Matrix SE Case + Glass Screen Protector.jpg"},
						{"./image/Anker 737 Power Bank.jpg", "./image/xiaomi mi power bank.jpg", "./image/Joyroom JR-L006.jpg"},
						{"./image/DigitalX X-L925BT.jpg", "./image/Sony SRS-XB13.jpg", "./image/Havit SK724 USB Speaker.jpg"},
						{"./image/airpods.jpg", "./image/headset.jpg", "./image/ShopMagics Wireless Earphones.jpg"}
					};

String[][] text = 
	{
		{"<html><b><big>Golden Field 8701B</big></b><br><b style=\"color:red;\">Price: 5,499 BDT  </b><s>6,000</s><br>Mid Tower lack Gaming Desktop Casing, 3 Cooling Fan (Built-In), ARGB Lighting Fan </html>",
		
		"<html><b><big>XIGMATEK-Astro EN40858</big></b><br><b style=\"color:red;\">Price: 4,499 BDT  </b><s>5,000</s><br>Mid Tower Tempered Glass ATX Gaming Casing, 4 Cooling Fan (Built-In), 2.5 “(internal) 2 Metal thickness </html>",
		
		"<html><b><big>NZXT H7 Flow</big></b><br><b style=\"color:red;\">Price: 14,499 BDT  </b><s>16,000</s><br>Mid-Tower Airflow Desktop Gaming Casing, 2 Cooling Fan (Built-In), SGCC Steel and Tempered Glass </html>"},


		{"<html><b><big>Galaxy M31 Tempered Glass Cover</big></b><br><b style=\"color:red;\">Price: 720 BDT  </b><s>1,000</s><br>Anti-Scratch, Screen Protector, Anti-oil，waterproof，HD</html>",
		
		"<html><b><big>ESR Tempered Glass Protector</big></b><br><b style=\"color:red;\">Price: 1,490 BDT  </b><s>2,000</s><br>Screen Protector for iPhone 15 Series, Anti-oil，waterproof，HD</html>",
		
		"<html><b style=\"font-size:1.2em;\">Skech Matrix SE Case + Glass Screen Protector </b><br><b style=\"color:red;\">Price: 1,790 BDT  </b><s>2,000</s><br>Scratch resistant material,Full screen coverage, Ultra clear with zero interference,Full access to all ports and controls </html>"},
		
		
		{"<html><b style=\"font-size:1.5em;\">Anker 737 Power Bank</b><br><b style=\"color:red;\">Price: 16,400 BDT  </b><s>18,000</s> <br>24,000mAh capacity, 140W max output,bi-directional charging, digital display,2 USB-C Ports (140W),1 USB-A Ports (18W)</html>",
		
		"<html><b style=\"font-size:1.5em;\">Xiaomi mi power bank</b><br><b style=\"color:red;\">Price: 2,500 BDT  </b><s>3,000</s> <br>Anti-Scratch, Screen Protector, Anti-oil, waterproof，HD</html>",
		
		"<html><b style=\"font-size:1.5em;\">Joyroom JR-L006</b><br><b style=\"color:red;\">Price: 3,200 BDT  </b><s>3,500</s> <br>10000mAh 3.7V (37Wh) Battery Capacity, Type-C, USB-A, Wireless Charging</html>"},


		{"<html><b style=\"font-size:1.2em;\">DigitalX X-L925BT 2.1 Multimedia Bluetooth Speaker</b><br><b style=\"color:red;\">Price: 4,400 BDT  </b><s>5,000</s><br>sleek 2.1 sound 54W RMS system with, Bluetooth, USB/SD/FM support, remote control, two 3' speakers, a 5.25' subwoofer</html>",
		
		"<html><b style=\"font-size:1.5em;\">Sony SRS-XB13</b><br><b style=\"color:red;\">Price: 5,000 BDT  </b><s>5,500 </s><br>cylindrical 2.1 sound system, 46mm speaker, Bluetooth 4.2, USB Type-C interface, 16 hours battery life</html>",
		
		"<html><b style=\"font-size:1.5em;\">Havit SK724 USB Speaker</b><br><b style=\"color:red;\">Price: 620 BDT  </b><s>700 </s><br>Lightweight, 2 colorful lighting design speaker, 4ohm impedance, 90Hz-20KHz frequency response,USB</html>"},
		
		
		{"<html><b style=\"font-size:1.7em;\">AirPodsPro Wireless Bluetooth Earbuds</b><br><b style=\"color:red;\">Price: 9,400 BDT  </b><s>10,000</s><br>high-quality, water-resistant audio device with Active Noise Cancellation, Adaptive EQ, and spatial audio, 30 hours of listening time with MagSafe</html>",

		"<html><b><big>JBL Live 660NC </big></b><br><b style=\"color:red;\">Price: 12,000 BDT  </b><s>15,000</s><br>Adaptive Noise Cancelling, Ambient Aware technology, and up to 50 hours of playtime with quick charging</html>",

		"<html><b><big>ShopMagics Wireless Bluetooth Earphones</big></b><br><b style=\"color:red;\">Price: 1,050 BDT  </b><s>1,100</s> <br>Bluetooth, high fidelity sound, are sweat proof, have hands-free calling</html>"}	
	};

    for (int j = 0; j < 3; j++) {
		final int r = i; // Declare i as final
        final int c = j;
        JPanel newPanel = new JPanel();
        newPanel.setBounds(20 + j * 290, 50, 280, 510); // Set position and size
        newPanel.setBackground(Color.WHITE); // Set background color to white
        newPanel.setLayout(null); // Set layout to null for absolute positioning

        //image label
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(5, 5, 270, 270); // Set position and size
        imageLabel.setIcon(ImageResizer.resizeImage(imageNames[i][j], 270, 270)); // Resize the image to 270x270
        newPanel.add(imageLabel); // Add the image label to the new panel

        // text box
			JLabel textLabel = new JLabel(text[i][j]);
            textLabel.setFont(new Font("Lato", Font.PLAIN, 15));
			textLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			textLabel.setBounds(5, 280, 270, 180); // Set position and size
			newPanel.add(textLabel); // Add the text box to the new panel

        // "Cart" button
        JButton cartButton = new JButton("Add to Cart");
        cartButton.setBounds(5, 460, 130, 40); // Set position and size
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
        buyButton.setBounds(145, 460, 125, 40); // Set position and size
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

        // scroll pane and add the panel to it
        JScrollPane scrollPane = new JScrollPane(panel);
       // scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 100, 900, 550);

        // Add the scroll pane to the frame
        add(scrollPane);

        setVisible(true);
    }

}