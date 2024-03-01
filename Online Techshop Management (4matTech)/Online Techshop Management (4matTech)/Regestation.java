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
import javax.swing.JCheckBox;

public class Regestation extends JFrame implements ActionListener
{
	private Container c;
	
	private JLabel heading, userName, userContact, passLabel, cnfrmpassLabel, textLabel;
	
	private Font f;
	
	private JButton signin, signup;
	
	private ConcreteWatermarkTextField tf, tf1;
	 
	private JPasswordField pf, pf1;
	
	private Cursor crsr;
	
	private JCheckBox cb;
	
	Regestation()
	{
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1000, 700);
		this.setTitle("Online Techshop Management System | Sign up");
		this.setLocationRelativeTo(null);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
	// font:
		f = new Font("Lato", Font.BOLD, 15);
		
	// heading:
		heading = new JLabel();
		heading.setText("——SIGN UP——");
		heading.setBounds(410,30,200,20);
		heading.setFont(new Font("Helvetica", Font.BOLD, 20));
		heading.setForeground(Color.BLUE);
		c.add(heading);
		
	// frame text show:
		userName = new JLabel();
		userName.setText("Name");
		userName.setBounds(310,125,150,20);
		userName.setFont(f);
		userName.setForeground(Color.BLUE);
		c.add(userName);
		
		userContact = new JLabel();
		userContact.setText("Phone or E-m@il");
		userContact.setBounds(310,165,150,20);
		userContact.setFont(f);
		userContact.setForeground(Color.BLUE);
		c.add(userContact);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(310,205,150,20);
		passLabel.setFont(f);
		passLabel.setForeground(Color.BLUE);
		//userLabel.setToolTipText("Is your password strong enough?");
		c.add(passLabel);
		
		cnfrmpassLabel = new JLabel("Confirm Password");
		cnfrmpassLabel.setBounds(310,245,150,20);
		cnfrmpassLabel.setFont(f);
		cnfrmpassLabel.setForeground(Color.BLUE);
		c.add(cnfrmpassLabel);
		
		textLabel = new JLabel();
		textLabel.setText("Already have an account?");
		textLabel.setBounds(395,515,250,30);
		textLabel.setFont(f);
		textLabel.setForeground(Color.BLUE);
		c.add(textLabel);
		
	// name, phone-mail text field:
		tf = new ConcreteWatermarkTextField("Enter your Name");
		tf.setBounds(560,120,200,30);
		tf.setFont(f);
		tf.setForeground(Color.BLACK);
		tf.setBackground(Color.WHITE);
		tf.setHorizontalAlignment(ConcreteWatermarkTextField.LEFT);
		c.add(tf);	
		
		tf1 = new ConcreteWatermarkTextField("Enter your Phone or E-m@il");
		tf1.setBounds(560,160,200,30);
		tf1.setFont(f);
		tf1.setForeground(Color.BLACK);
		tf1.setBackground(Color.WHITE);
		tf1.setHorizontalAlignment(ConcreteWatermarkTextField.LEFT);
		c.add(tf1);
		
	// password field:	
		pf = new JPasswordField();
		pf.setEchoChar('*');
		pf.setBounds(560,200,200,30);
		pf.setFont(f);
		pf.setForeground(Color.BLACK);
		pf.setBackground(Color.WHITE);
		c.add(pf);
		
		pf1 = new JPasswordField();
		pf1.setEchoChar('*');
		pf1.setBounds(560,240,200,30);
		pf1.setFont(f);
		pf1.setForeground(Color.BLACK);
		pf1.setBackground(Color.WHITE);
		c.add(pf1);

	// button cursor:
		crsr = new Cursor(Cursor.HAND_CURSOR);	
	
	// button create:
	// sign in:
		signin = new JButton("SIGN IN");
		signin.setBounds(390,550,200,30);
		signin.setFont(f);
		signin.setForeground(Color.BLACK);
		signin.setBackground(Color.BLUE);
		signin.setCursor(crsr);
		c.add(signin);
	
	// signup:
		signup = new JButton("SIGN UP");
		signup.setBounds(390,410,200,30);
		signup.setFont(f);
		signup.setForeground(Color.BLACK);
		signup.setBackground(Color.BLUE);
		signup.setCursor(crsr);
		c.add(signup);
		
	// checkbox:
		cb = new JCheckBox();
		cb.setText("I agree to the Terms & Conditions");
		cb.setBounds(310,300,300,30);
		cb.setFont(f);
		cb.setForeground(Color.BLUE);
		c.add(cb);

		signin.addActionListener(this);
	}
	
	// action-listener command:
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == signin) 
		{
			Login L = new Login();
			L.setVisible(true);
			//L.setResizable(false);
			dispose();
		}
	}

	// main function:
	public static void main(String args[])
	{
		Regestation rg = new Regestation();
		rg.setVisible(true);
	}
}