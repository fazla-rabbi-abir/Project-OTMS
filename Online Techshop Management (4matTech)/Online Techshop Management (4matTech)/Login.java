import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Login extends JFrame implements ActionListener
{
    private ImageIcon icon, img, btnimg1, btnimg2;

	private Container c;
	
	private JLabel userLabel, passLabel, imgLabel, mottoLabel, mottoLabel1, mottoLabel2, mottoLabel3, heading, textLabel, textLabel1, textLabel2;
	
	private Font f;
	
	private JTextField tf;
	
	private JPasswordField pf;
	
	private JButton signin, signup;
	
	private Cursor crsr;

    public Login()
	{
        initComponent();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1000, 700);
        setLocation(220,80);

        setTitle("Online Techshop Management System | Sign in");
        setResizable(false);
		setVisible(true);
    }

    public void initComponent()
	{	
        icon = new ImageIcon(getClass().getResource("title logo.png"));
		
	// background color:	
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
	// font:
		f = new Font("Lato", Font.BOLD, 15);
		
	// heading:
		heading = new JLabel();
		heading.setText("——SIGN IN——");
		heading.setBounds(420,40,200,50);
		heading.setFont(new Font("Helvetica", Font.BOLD, 20));
		heading.setForeground(Color.BLUE);
		c.add(heading);
		
	// frame text show:
		userLabel = new JLabel();
		userLabel.setText("Phone or E-m@il");
		userLabel.setBounds(600,100,150,50);
		userLabel.setFont(f);
		userLabel.setForeground(Color.BLUE);		// text color
		//userLabel.setOpaque(true);
		//userLabel.setBackground(Color.BLACK);		// text background color
		c.add(userLabel);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(600,160,150,50);
		passLabel.setFont(f);
		passLabel.setForeground(Color.BLUE);
		//userLabel.setToolTipText("Is your password strong enough?");
		c.add(passLabel);
		
	// signup info:
		textLabel = new JLabel();
		textLabel.setText("forgotten password?");
		textLabel.setBounds(650,215,200,50);
		textLabel.setFont(f);
		textLabel.setForeground(Color.BLUE);
		c.add(textLabel);
	
		textLabel1 = new JLabel();
		textLabel1.setText("Not a member yet?");
		textLabel1.setBounds(630,360,150,50);
		textLabel1.setFont(f);
		textLabel1.setForeground(Color.BLUE);
		c.add(textLabel1);
		
		textLabel2 = new JLabel();
		textLabel2.setText("Sign up now !");
		textLabel2.setBounds(645,380,150,50);
		textLabel2.setFont(f);
		textLabel2.setForeground(Color.BLUE);
		c.add(textLabel2);
		
	// image set:
		img = new ImageIcon(getClass().getResource("shop logo.png"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(50, 80, img.getIconWidth(),img.getIconHeight());
		c.add(imgLabel);
		
	// shop motto: 
		mottoLabel = new JLabel();
		mottoLabel.setText("Embrace the power of innovation:");
		mottoLabel.setBounds(50,330,300,50);
		mottoLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
		mottoLabel.setForeground(Color.BLUE);
		//mottoLabel.setIconTextGap(12);
		c.add(mottoLabel);
		
		mottoLabel1 = new JLabel();
		mottoLabel1.setText("Today's technology is tomorrow's history,");
		mottoLabel1.setBounds(50,370,400,50);
		mottoLabel1.setFont(new Font("Helvetica", Font.BOLD, 18));
		mottoLabel1.setForeground(Color.BLUE);
		c.add(mottoLabel1);

		mottoLabel2 = new JLabel();
		mottoLabel2.setText("So dare to dream,");
		mottoLabel2.setBounds(50,400,400,50);
		mottoLabel2.setFont(new Font("Helvetica", Font.BOLD, 18));
		mottoLabel2.setForeground(Color.BLUE);
		c.add(mottoLabel2);  		
		
		mottoLabel3 = new JLabel();
		mottoLabel3.setText("Create and shape the future.");
		mottoLabel3.setBounds(50,430,400,50);
		mottoLabel3.setFont(new Font("Helvetica", Font.BOLD, 18));
		mottoLabel3.setForeground(Color.BLUE);
		c.add(mottoLabel3); 
		
	// phone-mail text field:
		tf = new JTextField();
		tf.setBounds(600,140,200,30);
		tf.setFont(f);
		tf.setForeground(Color.BLACK);
		tf.setBackground(Color.WHITE);
		tf.setHorizontalAlignment(JTextField.LEFT);
		c.add(tf);	
		
	// password field:	
		pf = new JPasswordField();
		pf.setEchoChar('*');
		pf.setBounds(600,200,200,30);
		pf.setFont(f);
		pf.setForeground(Color.BLACK);
		pf.setBackground(Color.WHITE);
		c.add(pf);
		
	// button cursor:
		crsr = new Cursor(Cursor.HAND_CURSOR);
		
	// button image:
		//btnimg1 = new ImageIcon(getClass().getResource("login.png"));
		//btnimg2 = new ImageIcon(getClass().getResource("logout.png"));
		
	// button create:
	// sign in:
		signin = new JButton("SIGN IN");
		signin.setBounds(600,280,200,30);
		signin.setFont(f);
		signin.setForeground(Color.BLACK);
		signin.setBackground(Color.BLUE);
		signin.setCursor(crsr);
		c.add(signin);
	
	// signup:
		signup = new JButton("SIGN UP");
		signup.setBounds(600,430,200,30);
		signup.setFont(f);
		signup.setForeground(Color.BLACK);
		signup.setBackground(Color.BLUE);
		signup.setCursor(crsr);
		c.add(signup);
		
		signin.addActionListener(this);
		signup.addActionListener(this);
    }
	
	// action-listener command:
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == signin) 
		{
			String userName = tf.getText();
			String password = pf.getText();

			if ((userName.equals("shakilarahman@gmail.com") && password.equals("1234")) ||
				(userName.equals("01601699066") && password.equals("abir")) ||
				(userName.equals("01766657637") && password.equals("nazmul")) ||
				(userName.equals("01535209265") && password.equals("sourav")) ||
				(userName.equals("01722377302") && password.equals("nijhum"))) 
			{
				JOptionPane.showMessageDialog(null, "Welcome, \n you're successfully logged in");

				dispose();
				// Show the Regestation frame
				homepage homePage = new homepage();
				homePage.setVisible(true);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Invalid Credentials Provided. \n \n \n We couldn't find an account, \n that matches what you entered !!", "WARNING", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if (e.getSource() == signup) 
			{
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							Regestation registrationFrame = new Regestation();
							registrationFrame.setVisible(true);
							dispose();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				});
			}

	}
    
}