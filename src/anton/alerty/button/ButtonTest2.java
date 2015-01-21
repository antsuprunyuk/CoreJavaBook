package anton.alerty.button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest2 {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ButtonFrame2();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Buttons");
				frame.setVisible(true);
			}
		});
	}

}

class ButtonFrame2 extends JFrame {

	public void makeButton(String name, Color backgroundColor) {
		JButton button = new JButton(name);
		buttonPanel.add(button);
		//ColorAction action = new ColorAction(backgroundColor);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				buttonPanel.setBackground(backgroundColor);
			}
		});
	}

	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame2() {
		
		
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		buttonPanel = new JPanel();
		makeButton("yellow", Color.YELLOW);
		makeButton("green", Color.GREEN);
		makeButton("red", Color.RED);
		
		add(buttonPanel);
		
		/*
		//create buttons
		JButton yB = new JButton("yellow");
		JButton gB = new JButton("green");
		JButton rB = new JButton("red");
		
		buttonPanel = new JPanel();
		
		//add buttons
		buttonPanel.add(yB);
		buttonPanel.add(gB);
		buttonPanel.add(rB);
		
		add(buttonPanel);
		
		
		//create listeners (button actions)
		ColorAction yA = new ColorAction(Color.YELLOW);
		ColorAction gA = new ColorAction(Color.GREEN);
		ColorAction rA = new ColorAction(Color.RED);
		
		yB.addActionListener(yA);
		gB.addActionListener(gA);
		rB.addActionListener(rA);
		*/
		
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


































