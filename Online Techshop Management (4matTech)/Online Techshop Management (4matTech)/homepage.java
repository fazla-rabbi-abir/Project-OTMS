import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homepage extends JFrame {
	
	private ImageIcon icon, icon1, icon2;
 	
	private JLabel imageLabel, mobiles, laptop, accessories;
		
	private ConcreteWatermarkTextField searchBar;
	
	private String[] accessoriesOptions, laptopOptions, mobileOptions;
	
	private JButton b1, imageButton1, imageButton2, laptopButton, mobile;
	
	private JPanel productPanel;

	private ConcreteCarousel carousel;
	
	private Cursor crsr;

    public homepage() {
        setTitle("4matTech");
        setSize(1000, 700);
        setLocation(220,80);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(40, 10, 100, 100);
		ImageIcon icon = new ImageIcon("./image/rsz_4mattech.jpg");
		imageLabel.setIcon(icon);
		add(imageLabel);

			ConcreteWatermarkTextField searchBar = new ConcreteWatermarkTextField("Search in 4matTech");
			searchBar.setBounds(300,40,280,30);
			searchBar.setFont(new Font("Lato", Font.BOLD, 20));
			add(searchBar);

		crsr = new Cursor(Cursor.HAND_CURSOR);

			
			 JButton b1 = new JButton("Search");
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setFont(new Font("Lato", Font.BOLD, 15));
			b1.setBounds(580,40,100,30);
			b1.setLayout(null);
			b1.setCursor(crsr);
			add(b1);

			JButton imageButton1 = new JButton();
			imageButton1.setBounds(730, 10, 70, 70);
			ImageIcon icon1 = new ImageIcon("./image/online-shop.png");
			imageButton1.setIcon(icon1);
			imageButton1.setOpaque(false);
			imageButton1.setContentAreaFilled(false);
			imageButton1.setBorderPainted(false);
			imageButton1.setCursor(crsr);
			add(imageButton1);

			JButton imageButton2 = new JButton();
			imageButton2.setBounds(830, 10, 70, 70);
			ImageIcon icon2 = new ImageIcon("./image/logout.png");
			imageButton2.setIcon(icon2);
			imageButton2.setOpaque(false);
			imageButton2.setContentAreaFilled(false);
			imageButton2.setBorderPainted(false);
			imageButton2.setCursor(crsr);
			add(imageButton2);
			
			imageButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login().setVisible(true);            
			}
		});

		
				JLabel mobiles = new JLabel("PHONES");
				mobiles.setBounds(155, 90, 75, 30);
				mobiles.setFont(new Font("Lato", Font.BOLD, 17));
				add(mobiles);

				String[] mobileOptions = {"iPhone", "Samsung", "Xiaomi", "Vivo"};
				JComboBox<String> mobileComboBox = new JComboBox<String>(mobileOptions);
				mobileComboBox.setName("Phone");
				mobileComboBox.setBounds(230, 90, 100, 30);
				mobileComboBox.setFont(new Font("Lato", Font.BOLD, 15));
				add(mobileComboBox);

				JLabel laptop = new JLabel("LAPTOP");
				laptop.setBounds(400, 90, 100, 30);
				laptop.setFont(new Font("Lato", Font.BOLD, 17));
				add(laptop);

				String[] laptopOptions = {"Apple", "Asus", "Hp", "MSI"};
				JComboBox<String> laptopComboBox = new JComboBox<String>(laptopOptions);
				laptopComboBox.setName("Laptop");
				laptopComboBox.setBounds(470, 90, 100, 30);
				laptopComboBox.setFont(new Font("Lato", Font.BOLD, 15));

				add(laptopComboBox);

				JLabel accessories = new JLabel("ACCESSORIES");
				accessories.setBounds(620, 90, 130, 30);
				accessories.setFont(new Font("Lato", Font.BOLD, 17));
				add(accessories);

				String[] accessoriesOptions = {"Casses", "Screen Protector", "Power Banks", "Speakers", "Headset"};
				JComboBox<String> accessoriesComboBox = new JComboBox<String>(accessoriesOptions);
				accessoriesComboBox.setName("Accessories");
				accessoriesComboBox.setBounds(750, 90, 150, 30);
				accessoriesComboBox.setFont(new Font("Lato", Font.BOLD, 15));
				add(accessoriesComboBox);
		 
			
		JButton laptopButton = new JButton("Laptop");
        laptopButton.setIcon(ImageResizer.resizeImage("./image/laptop.jpg", 140, 100));
        laptopButton.setVerticalTextPosition(SwingConstants.TOP);
        laptopButton.setHorizontalTextPosition(SwingConstants.CENTER);
        laptopButton.setFont(laptopButton.getFont().deriveFont(Font.BOLD));
        laptopButton.setBounds(250, 500, 150, 130);
        laptopButton.setBorder(null);
        laptopButton.setCursor(crsr);
        laptopButton.setContentAreaFilled(false);
		laptopButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		laptopButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
        laptopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new laptop().setVisible(true);            
			}
		});
		add (laptopButton);
			
		JButton mobileButton = new JButton("Mobile");
        mobileButton.setIcon(ImageResizer.resizeImage("./image/mobile.jpg", 100, 100));
        mobileButton.setVerticalTextPosition(SwingConstants.TOP);
        mobileButton.setHorizontalTextPosition(SwingConstants.CENTER);
        mobileButton.setFont(mobileButton.getFont().deriveFont(Font.BOLD));
        mobileButton.setBounds(450, 500, 110, 130);
        mobileButton.setBorder(null);
        mobileButton.setCursor(crsr);
        mobileButton.setContentAreaFilled(false);
		mobileButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
		mobileButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
        mobileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new mobile().setVisible(true);            
			}
		});
		add (mobileButton);
			
		JButton accessButton = new JButton("accessories");
        accessButton.setIcon(ImageResizer.resizeImage("./image/accessories.jpg", 140, 100));
        accessButton.setVerticalTextPosition(SwingConstants.TOP);
        accessButton.setHorizontalTextPosition(SwingConstants.CENTER);
        accessButton.setFont(accessButton.getFont().deriveFont(Font.BOLD));
        accessButton.setBounds(600, 500, 150, 130);
        accessButton.setCursor(crsr);
        accessButton.setBorder(null);
        accessButton.setContentAreaFilled(false);
		accessButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        accessButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
        accessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new accessories().setVisible(true);            
			}
		});
		add (accessButton);
			
			
					JPanel productPanel = new JPanel();
					productPanel.setBounds(100,130,800,350);
					productPanel.setLayout(null); 

					String[] images = new String[11];

					for(int k=1; k<12; k++) 
					{
						images[k-1] = "./image/image" + k + ".jpg";
					}

					ConcreteCarousel carousel = new ConcreteCarousel(images);
					carousel.setBounds(0, 0, 800, 350); 
					productPanel.add(carousel);

					add(productPanel);


			
        setVisible(true);    
		}

}
