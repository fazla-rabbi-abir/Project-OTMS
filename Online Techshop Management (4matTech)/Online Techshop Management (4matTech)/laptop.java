import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class laptop extends JFrame {
	

    public laptop() {
        setTitle("Product Frame");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(220,80);

        //JPanel with a vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.white);

		JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        headerPanel.setBackground(Color.white);

        //label for the headline
        JLabel headline = new JLabel("Welcome to Laptop Section", SwingConstants.CENTER);
        headline.setFont(new Font("Lato", Font.BOLD, 24)); // Set font size and <style
        headline.setBounds(0, 0, 1000, 40); // Set position and size

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

		headerPanel.add(backButton);
        headerPanel.add(headline);

        // Add the header panel to the main panel
        mainPanel.add(headerPanel);
		
        
        //  four panels for the products
        for (int i = 0; i < 5; i++) {
			final int r = i; // Declare i as final
			JPanel productPanel = new JPanel();
			productPanel.setPreferredSize(new Dimension(950, 540));
			productPanel.setBackground(Color.WHITE);
			productPanel.setLayout(null);

			String[] imageNames = { "./image/Apple MacBook Pro12.jpg", "./image/Asus VivoBook S15 M533.jpg", "./image/HP Laptop - 15-dw2021nl.jpg", "./image/msi pulse gl66.jpg", "./image/MACKBOOK AIR M2.jpg"};
			//label for the image
			JLabel imageLabel = new JLabel();
			imageLabel.setBounds(10, 15, 700, 450);
			imageLabel.setIcon(ImageResizer.resizeImage(imageNames[i], 700, 450)); // Resize the image to 270x270
			imageLabel.setBorder(BorderFactory.createLineBorder(Color.black, 5));

        String[] text = 
		{
			"<html><b><big>Apple MacBook Pro12</big></b><br>* Brand: Apple <br>* Processor: Apple M3 chip 8-core CPU cores<br>* Ram: 8GB unified memory<br>* SSD: 512GB<br>* Display: 14.2-inch Liquid Retina XDR display<br>* Info: Wi-Fi 6 (802.11ax), Force Touch trackpad, Touch ID, No dedicated graphics, 1080p FaceTime HD camera<br>* Battery: Up to 22 hours Apple TV app movie playback<br>* Weight (kg): 1.22<br>* Colours: Space Gray, Silver<br>* Warranty:  one-year warranty, extendable to three years with AppleCare+<br><big>Price: 200,000</big><br><s>250,000 </s>20%</html>",

			"<html><b><big>Asus VivoBook S15 M533</big></b><br>* Brand: Asus<br>* Processor: Intel Core i7-1355U<br>* Ram: 32GB LPDDR5<br>* SSD: 1TB M.2 NVMe SSD<br>* Display: 13.3-inch, 16:10, 2.8K (2880 x 1800) aspect ratio ASUS Lumina OLED display<br>* Info: Wi-Fi 6 (802.11ax), Precision touchpad, No fingerprint sensor, Integrated Intel Iris Xe Graphics, HD Webcam<br>* Battery: Up to 10 hours<br>* Weight (kg): Pink & Silver <br>* Colours: Varies by model<br>* Warranty:  one-year warranty<br><big>Price: 135,500</big><br><s>150,000 </s>15%</html>",

			"<html><b><big>HP Laptop - 15-dw2021nl</big></b><br>* Brand: HP<br>* Processor: Intel® Core™ i5-1035G1 <br>* Ram: 8 GB DDR4-2666 SDRAM<br>* SSD: 512 GB <br>* Display: 39.6 cm (15.6\") diagonal FHD, SVA, anti-glare, micro-edge, WLED-backlit, 220 nits, 45% NTSC (1920 x 1080)<br>*  Realtek RTL8821CE Wi-Fi and Bluetooth 4.2, multi-touch gesture touchpad, and HP TrueVision HD Camera.<br>* Battery: 3-cell, 41 Wh Li-ion, Up to 6 hours and 15 minutes<br>* Weight (kg): Starting at 1.75<br>* Colours: Gray <br>* Warranty:  one-year warranty<br><big>Price: 98,500</big><br><s>110,000 </s>11%</html>",

			"<html><b><big>Asus VivoBook 15 X1502ZA</big></b><br>   * Brand: Asus <br>   * Product Id: 33.01.006.1621 <br>   *Processor: Core i5(12th (Intel))<br>   *Ram: 8GB (Upgrade-able)<br>   *SSD: 512GB (Upgrade-able)<br>*Display: LED 15.6 inches<br>   *Wifi, Touchpad, Speaker, Microphone, Dedicated Graphics & Webcam<br>   *Battery: 3 Hours <br>   *Weight (kg): 1.70 <br>   *Colours: Terra Cotta <br>   *2 year warranty<br> <big>Price: 81,500</big><br><s>90,000 </s>9%</html>",

			"<html><b><big>MACKBOOK AIR M2</big></b><br>   * Brand: Apple <br>   * Product Id: 33.01.006.1762 <br>   *Processor: 11th Generation<br>   *Ram: 8GB (Upgrade-able)<br>   *SSD: 512GB (Upgrade-able)<br>*Display: LED 14.5 inches<br>   *Wifi, Touchpad, Finger Print Sensor, Dedicated Graphics & Webcam<br>   *Battery: 5 to 6 hours <br>   *Weight (kg): 1.58 <br>   *Colours: Gold <br>   *3 year warranty<br> <big>Price: 1,65,000</big><br><s>180,000 </s>9%</html>"
		};


            //label for the text
            JLabel textLabel = new JLabel(text[i]);
            textLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            textLabel.setBounds(715, 15, 250, 450);
            textLabel.setHorizontalAlignment(JLabel.CENTER);
            textLabel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
			
			//Define the size of the button
			int targetWidth = 40;
			int targetHeight = 40;

			//  buttons with resized image icons
			JButton cartButton = new JButton(ImageResizer.resizeImage("./image/cart_icon.png", targetWidth, targetHeight));
			JButton buyButton = new JButton(ImageResizer.resizeImage("./image/buy_now.png", targetWidth, targetHeight));

			// Set the background color of the buttons to white
			cartButton.setBackground(Color.WHITE);
			buyButton.setBackground(Color.WHITE);

			// Set the size and position of the buttons
			cartButton.setBounds(10, 10, 500, targetHeight);
			buyButton.setBounds(100, 10, 500, targetHeight);

			// Add the buttons to the product panel
			productPanel.add(cartButton);
			productPanel.add(buyButton);

			//panel for the buttons
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBounds(10, 470, 955, 85);
			buttonPanel.add(cartButton);
			buttonPanel.add(buyButton);


		cartButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Pass product information to LaptopDetailsFrame
        String productInfo = text[r];
        String imagePath = imageNames[r];

        int brandIndex = productInfo.indexOf("Brand: ");
        int nextBreak = productInfo.indexOf("<br>", brandIndex);
        String productName = productInfo.substring(brandIndex + 7, nextBreak).trim(); // 7 is the length of "Brand: "

        LaptopDetailsFrame obj3 = new LaptopDetailsFrame(productName, productInfo, imagePath);
        dispose();
        obj3.setVisible(true);
    }
});
		
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new CheckoutFrame().setVisible(true);            
			}
		});
		
		
			// Add the image, text, and buttons to the product panel
            productPanel.add(imageLabel);
            productPanel.add(textLabel);
            productPanel.add(buttonPanel);

            // Add the product panel to the main panel
            mainPanel.add(productPanel);
        }

        //JScrollPane and add the main panel to it
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Add the scroll pane to the frame
        add(scrollPane);

        setVisible(true);
    }

}
