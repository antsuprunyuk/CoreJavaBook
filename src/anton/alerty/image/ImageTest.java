package anton.alerty.image;

import java.awt.*;
import javax.swing.*;

public class ImageTest {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ImageFrame();
				frame.setTitle("ImageFrame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class ImageFrame extends JFrame {
	public ImageFrame() {
		add(new ImageComponent());
		pack();
	}
}

class ImageComponent extends JComponent {
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 300;
	private Image image;
	
	public ImageComponent() {
		image = new ImageIcon("icon.gif").getImage();
	}
	
	public void paintComponent(Graphics g) {
		if (image == null) return;
		
		int imageWidth = image.getWidth(this);
		int imageHeight = image.getHeight(this);		
		g.drawImage(image, 0, 0, null);
		
		for (int i = 0; i * imageWidth <= getWidth(); i++) {
			for (int j = 0; j * imageHeight <= getHeight(); j++) {
				if (i + j > 0) {
					g.copyArea(0, 0, imageWidth, imageHeight,  i * imageWidth,  j * imageHeight);
				}
			}
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}