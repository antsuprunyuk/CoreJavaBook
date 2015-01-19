package anton.alerty.nothelloworld;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NotHelloWorld {

	public static void main(String[] args) {

		float f=  1.2F;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new NotHelloWorldFrame();
				frame.setTitle("NotHelloWorldFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}	
	class NotHelloWorldFrame extends JFrame {
		public NotHelloWorldFrame() {
			add(new NotHelloWorldComponent());
			pack();
		}
	}
	
	class NotHelloWorldComponent extends JComponent {
		
		public static final int MESSAGE_X = 75;
		public static final int MESSAGE_Y = 100;
		
		private static final int DEFAULT_WIDTH = 300;
		private static final int DEFAULT_HEIGHT = 200;
		
		public void paintComponent(Graphics g) {
			g.drawString("Not a Hello World Program", MESSAGE_X, MESSAGE_Y);
		}
		
		public Dimension getPreferredSize() {
			return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		}
	}


