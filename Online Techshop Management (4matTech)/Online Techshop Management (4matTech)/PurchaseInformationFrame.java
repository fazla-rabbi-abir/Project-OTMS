import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PurchaseInformationFrame extends JFrame implements ActionListener {
    JPanel panel;
    JTextField nameField, addressField, paymentMethodField;
    JButton confirmButton;

    public PurchaseInformationFrame() {
        super("Confirm your Order");
        setBounds(220,80, 500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        // Create text fields
        nameField = new JTextField("Your Name");
        nameField.setBounds(20, 20, 200, 30);
        panel.add(nameField);

        addressField = new JTextField("Phone Number");
        addressField.setBounds(20, 70, 200, 30);
        panel.add(addressField);

        paymentMethodField = new JTextField("Payment method");
        paymentMethodField.setBounds(20, 120, 200, 30);
        panel.add(paymentMethodField);

        // Create "Confirm" button
        confirmButton = new JButton("Confirm Purchase");
        confirmButton.setBounds(20, 180, 150, 30);
        confirmButton.addActionListener(this);
        panel.add(confirmButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmButton) {
            // Handle "Confirm Purchase" button click
            // Retrieve information from text fields and process the purchase
            String name = nameField.getText();
            String address = addressField.getText();
            String paymentMethod = paymentMethodField.getText();

            // You can add your logic to process the purchase information here

            // For example, displaying a message
            JOptionPane.showMessageDialog(this, "Purchase confirmed!\nName: " + name
                    + "\nAddress: " + address + "\nPayment Method: " + paymentMethod);

            // Close the PurchaseInformationFrame
            dispose();
			
			new homepage().setVisible(true);            
        }
    }
}
