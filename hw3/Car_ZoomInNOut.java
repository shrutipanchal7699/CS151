import java.awt.*;
import javax.swing.*;

public class Car_ZoomInNOut {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		CarIcon car = new CarIcon(50);
		JLabel carLabel = new JLabel(car);

		JButton zoomIn = new JButton("Zoom In");
		JButton zoomOut = new JButton("Zoom Out");

		
		carLabel.setPreferredSize(new Dimension(car.getIconWidth() * 2, car.getIconHeight() * 2));
		zoomIn.addActionListener(event -> {
			car.setIconWidth(car.getIconWidth() * 2);
			
			if (carLabel.getHeight() < car.getIconHeight() * 2) {
				carLabel.setPreferredSize(new Dimension(car.getIconWidth()*2 , car.getIconHeight() *2));
				frame.setSize(new Dimension(300 , 300));
			}
			carLabel.repaint();
			// Re-enables zoomOut
			if ( car.getIconWidth() <= 150 ) {
				zoomIn.setEnabled(true);
				}
				
		});

		zoomOut.addActionListener(event -> {
			
			if (car.getIconWidth() >= 75) {
				zoomOut.setEnabled(true);
			}
			
				
			car.setIconWidth(car.getIconWidth() / 2);
			if (carLabel.getHeight() > car.getIconHeight() * 2) {
				carLabel.setPreferredSize(new Dimension(car.getIconWidth()*2, car.getIconHeight() * 2));
			}
			carLabel.repaint();
		});		frame.setLayout(new FlowLayout());
		frame.add(zoomIn);
		frame.add(zoomOut);
		frame.add(carLabel);

		frame.pack();
		frame.setPreferredSize(new Dimension(200, 200));
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}