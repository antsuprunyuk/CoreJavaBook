package anton.alerty.simpleframe;

import java.awt.*;
import javax.swing.*;

public class SimpleFrameTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new SizedFrame();
				frame.setTitle("SizedFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				MyComponent component = new MyComponent();
				frame.getContentPane().add(component);
			}
		});
		
	}
}

class SizedFrame extends JFrame{
	public SizedFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		setSize(screenWidth / 4, screenHeight / 4);
		setLocationByPlatform(true);
		
		Image img = new ImageIcon("Tower.gif").getImage();
		setIconImage(img);
	}
}

class MyComponent extends JComponent {
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y =100;
	
	public void paintComponent(Graphics g) {
		g.drawString("First Frame Message", MESSAGE_X, MESSAGE_Y);
	}
}