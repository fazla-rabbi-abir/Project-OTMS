import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutFrame extends JFrame {
    private JRadioButton cardRadioButton, bkashRadioButton, cashRadioButton;

    public CheckoutFrame() {
        setTitle("CHECKOUT");
        setSize(1000, 700);
		setLocation(220,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Upper side title
        JLabel titleLabel = new JLabel("<html><b>CHECKOUT</b></html>", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        add(titleLabel, BorderLayout.NORTH);

        // Description line
        JLabel descriptionLabel = new JLabel("Enter your details ", SwingConstants.CENTER);
        add(descriptionLabel, BorderLayout.CENTER);

        // Left panel for user details
        JPanel leftPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        leftPanel.setBackground(Color.YELLOW);

        leftPanel.add(new JLabel("Full Name:"));
        leftPanel.add(new JTextField());

        leftPanel.add(new JLabel("Address:"));
        leftPanel.add(new JTextField());

        leftPanel.add(new JLabel("District/City:"));
        leftPanel.add(new JTextField());

        leftPanel.add(new JLabel("Postal Code:"));
        leftPanel.add(new JTextField());

        leftPanel.add(new JLabel("Mobile Number:"));
        leftPanel.add(new JTextField());

        leftPanel.add(new JLabel("Email:"));
        leftPanel.add(new JTextField());

        add(leftPanel, BorderLayout.WEST);

        // Right panel for payment methods
        JPanel rightPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));

        JLabel paymentLabel = new JLabel("Payment method");
        paymentLabel.setFont(new Font("Arial", Font.BOLD, 25));
        rightPanel.add(paymentLabel);

        cardRadioButton = new JRadioButton("Debit/Credit cards");
        bkashRadioButton = new JRadioButton("Bkash/Nagad");
        cashRadioButton = new JRadioButton("Cash on delivery");

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(cardRadioButton);
        paymentGroup.add(bkashRadioButton);
        paymentGroup.add(cashRadioButton);

        rightPanel.add(cardRadioButton);
        rightPanel.add(bkashRadioButton);
        rightPanel.add(cashRadioButton);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submit button action
                if (cardRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Payment method: Debit/Credit cards");
                } else if (bkashRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Payment method: Bkash/Nagad");
                } else if (cashRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Payment method: Cash on delivery");
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a payment method");
                }
            }
        });

        rightPanel.add(submitButton);

        add(rightPanel, BorderLayout.EAST);

        setVisible(true);
    }

}