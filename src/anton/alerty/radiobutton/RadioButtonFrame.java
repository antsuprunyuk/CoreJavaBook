package anton.alerty.radiobutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrame extends JFrame{

	private static final int DEFAULT_SIZE = 24;
	private static final int SMALL_SIZE = 12;
	private static final int MEDIUM_SIZE = 18;
	private static final int LARGE_SIZE = 24;
	private static final int EXTRALARGE_SIZE = 36;
	
	private JLabel label;
	private ButtonGroup group;
	private JPanel buttonPanel;
	
	public RadioButtonFrame() {
		label = new JLabel("The quick brown fox jumps over a lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
		add(label, BorderLayout.CENTER);
		
		buttonPanel = new JPanel();
		group = new ButtonGroup();
		
		addButton("Small", SMALL_SIZE);
		addButton("Medium", MEDIUM_SIZE);
		addButton("Large", LARGE_SIZE);
		addButton("Extra large", EXTRALARGE_SIZE);
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	
	private void addButton(String name, final int size) {
		
		boolean selected = (size == DEFAULT_SIZE);
		JRadioButton button = new JRadioButton(name, selected);
		group.add(button);
		buttonPanel.add(button);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				label.setFont(new Font("Serif", Font.PLAIN, size));
				RadioButtonFrame.this.pack();
			}
		};
		
		button.addActionListener(listener);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new RadioButtonFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	
}