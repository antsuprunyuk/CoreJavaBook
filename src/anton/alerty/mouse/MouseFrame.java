package anton.alerty.mouse;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseFrame extends JFrame{
 
	public MouseFrame() {
		add(new MouseComponent());
		pack();
	}	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new MouseFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(500,  500);
				frame.setVisible(true);
			}
		});
	}
}
