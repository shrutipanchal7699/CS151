import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
     public static void main(String[] args) {
			
    	 	JFrame frame = new JFrame();

			
			final MoveableShape shape1 = new CarShape(0, 0, CAR_WIDTH);
			final MoveableShape shape2 = new CarShape(0, 50, CAR_WIDTH);
			final MoveableShape shape3 = new CarShape(0, 100, CAR_WIDTH);
			final MoveableShape shape4 = new CarShape(0, 150, CAR_WIDTH);


			ShapeIcon icon1 = new ShapeIcon(shape1, ICON_WIDTH, ICON_HEIGHT);
			ShapeIcon icon2 = new ShapeIcon(shape2, ICON_WIDTH, ICON_HEIGHT);
			ShapeIcon icon3 = new ShapeIcon(shape3, ICON_WIDTH, ICON_HEIGHT);
			ShapeIcon icon4 = new ShapeIcon(shape3, ICON_WIDTH, ICON_HEIGHT);

			
			final JLabel label1 = new JLabel(icon1);
			final JLabel label2 = new JLabel(icon2);
			final JLabel label3 = new JLabel(icon3);
			final JLabel label4 = new JLabel(icon4);

			frame.setLayout(new GridLayout(4,1));
			frame.add(label1);
			frame.add(label2);
			frame.add(label3);
			frame.add(label4);

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
			
			//thread for the 1st car
			Thread paintThread1 = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						shape1.translate(15);
						frame.repaint();
						try {
							Thread.sleep(100);// how slow the car moves
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			
			//thread for the 2nd car
			Thread paintThread2 = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						shape2.translate(7);
						frame.repaint();
						try {
							Thread.sleep(10);// how slow the car moves
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});

			//thread for the 3rd car
			Thread paintThread3 = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						shape3.translate(1);
						frame.repaint();
						try {
							Thread.sleep(10);// how slow the car moves
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			
			//thread for the 4th car
			Thread paintThread4 = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						shape4.translate(10);
						frame.repaint();
						try {
							Thread.sleep(5);// how slow the car moves
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			
			
			//animation starts
			
			paintThread1.start();
			paintThread2.start();
			paintThread3.start();
			paintThread4.start();

		}

		private static final int ICON_WIDTH = 1000;
		private static final int ICON_HEIGHT = 1000;
		private static final int CAR_WIDTH = 50;
   
}
