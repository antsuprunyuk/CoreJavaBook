package anton.alerty.font;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class FontTest {

	public static void main(String[] args) {
/*
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String s : fontNames) {
			System.out.println(s);
*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new FontFrame();
				frame.setTitle("TestFont");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class FontFrame extends JFrame {
	public FontFrame() {
		add(new FontComponent());
		pack();
	}
}

class FontComponent extends JComponent {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Font f = (new Font("Monospaced", Font.BOLD, 34));
		g2.setFont(f);
		String message = "Hello, World!";
		
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(message, context);
		
		double x = (getWidth() - bounds.getWidth()) / 2;
		double y = (getHeight() - bounds.getHeight()) / 2;
		
		double ascent = -bounds.getY();
		double baseY = y + ascent;
		g2.drawString(message, (int) x, (int) y);
		g2.setPaint(Color.LIGHT_GRAY);
		Rectangle2D rec2 = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
		g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
		g2.draw(rec2);
		g2.drawString(message, (int) 10, (int) 10);
		Image image = new ImageIcon("cuguar.jpg").getImage();
		g.drawImage(image, 100, 100, null);
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}