package anton.alerty.mouse;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;


public class MouseComponent extends JComponent{
	
	private static final int SIDELENGTH = 50;
	private ArrayList<Rectangle2D> squares;
	private Rectangle2D current;
	
	public MouseComponent() {
		squares = new ArrayList<>();
		current = null;
		
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (Rectangle2D r : squares) {
			g2.draw(r);
		}
	}
	
	public Rectangle2D find(Point2D p) {
		for (Rectangle2D r : squares) {
			if (r.contains(p)) return r;
		}
		return null;
	}
	
	public void add(Point2D p) {
		double x = p.getX();
		double y = p.getY();
		
		current = new Rectangle2D.Double(x - SIDELENGTH, y - SIDELENGTH, SIDELENGTH, SIDELENGTH);
		squares.add(current);
		repaint();
	}

	public void remove(Rectangle2D r) {
		if (r == null) return;
		if (r == current) current = null;
		squares.remove(r);
		repaint();
	}
	
	private class MouseHandler extends MouseAdapter {
		
		public void mousePressed(MouseEvent event) {
			current = find(event.getPoint());
			if (current == null) add(event.getPoint());
		}
		
		public void mouseClicked(MouseEvent event) {
			current = find(event.getPoint());
			if (current != null && event.getClickCount() >= 2) remove(current);
		}
	}
	
	
	private class MouseMotionHandler implements MouseMotionListener {
		public void mouseMoved(MouseEvent event) {
			if (find(event.getPoint()) == null) setCursor(Cursor.getDefaultCursor());
			else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		}
		
		public void mouseDragged(MouseEvent event) {
			if (current != null) {
				int x = event.getX();
				int y = event.getY();
				
				current.setFrame(x - SIDELENGTH, y - SIDELENGTH, SIDELENGTH, SIDELENGTH);
				repaint();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
