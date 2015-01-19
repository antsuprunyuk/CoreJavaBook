package anton.alerty.draw;

import java.awt.*;

import javax.swing.*;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D;

public class DrawTest {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new DrawFrame();
				frame.setTitle("DrawTest");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}	
		});
		
	}

}

class DrawFrame extends JFrame {
	public DrawFrame() {
		DrawComponent component = new DrawComponent();
		component.setBackground(Color.BLUE);
		add(component);
		pack();
	}
}

class DrawComponent extends JComponent{
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g) {
		Graphics2D graph2D = (Graphics2D) g;
		
		graph2D.drawString("Love is silence", 200, 200);
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		graph2D.draw(rect);
		graph2D.setPaint(new Color(0, 128, 128));
		graph2D.fill(rect);
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		graph2D.draw(ellipse);
		
		graph2D.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+radius, centerY + radius);
		graph2D.draw(circle);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}