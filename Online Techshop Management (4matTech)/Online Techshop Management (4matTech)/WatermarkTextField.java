import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public abstract class WatermarkTextField extends JTextField {
    private String watermark; // The text to be displayed as watermark

    public WatermarkTextField(String watermark) {
        this.watermark = watermark;

        // Add a document listener to repaint the component whenever the text changes
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                repaint(); // Repaint the component when text is inserted
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                repaint(); // Repaint the component when text is removed
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                repaint(); // Repaint the component when text is changed
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method to paint the component

        // Check if the text field is empty and not focused
        if(getText().isEmpty() && !(FocusManager.getCurrentKeyboardFocusManager().getFocusOwner() == this)){
            Graphics2D g2 = (Graphics2D)g.create(); // Create a copy of the graphics object
            g2.setFont(new Font("Lato", Font.BOLD, 15)); // Set the font for the watermark
            g2.setColor(new Color(115, 115, 115)); // Set the color to light black
            g2.drawString(watermark, 10, 20); // Draw the watermark string at the specified location
            //g2.dispose(); // Dispose the graphics object
        }
    }
}
