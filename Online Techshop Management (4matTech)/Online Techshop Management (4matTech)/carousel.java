import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class carousel extends JPanel { 

    private String[] images;

    public carousel(String[] images) { 
        this.images = images; 

        JPanel carouselPanel = new JPanel();
        carouselPanel.setLayout(new BoxLayout(carouselPanel, BoxLayout.X_AXIS));

        int i = 0; 
        while (i < images.length) { 
            String image = images[i]; 
            JLabel label = new JLabel(new ImageIcon(image));
            label.setPreferredSize(new Dimension(800,350));
            label.setAlignmentY(Component.TOP_ALIGNMENT); 
            carouselPanel.add(label);
            i++; 
        }

        JScrollPane scrollPane = new JScrollPane(carouselPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(800,350)); 
		
        add(scrollPane);

        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int scrollPosition = scrollPane.getHorizontalScrollBar().getValue();

                int nextScrollPosition = scrollPosition + 800; 

                nextScrollPosition = nextScrollPosition % (800 * images.length); 

                scrollPane.getHorizontalScrollBar().setValue(nextScrollPosition);
            }
        });

        timer.start();
	}
}
