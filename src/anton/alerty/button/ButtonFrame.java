package anton.alerty.button;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame{

	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public static void main(String[] args) {
		JFrame frame = new ButtonFrame();
		frame.setVisible(true);
		//frame.setResizable(false);
	}
	
	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		//create buttons
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");
		
		buttonPanel = new JPanel();
		
		//add buttons to panel
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
		//add panel to frame
		add(buttonPanel, "East");
		//pack();
		
		//create button actions
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction blueAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);
		
		//assotiate actions with buttons
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(blueAction);
		redButton.addActionListener(redAction);
	}
	
	private class ColorAction implements ActionListener {
		private Color backgroundColor;
		
		public ColorAction(Color c) {
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event) {
			buttonPanel.setBackground(backgroundColor);
		}
	}
}
