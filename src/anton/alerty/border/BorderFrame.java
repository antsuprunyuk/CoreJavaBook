package anton.alerty.border;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import anton.alerty.radiobutton.RadioButtonFrame;

public class BorderFrame extends JFrame{

	private JPanel demoPanel;
	private JPanel buttonPanel;
	private ButtonGroup group;
	
	public BorderFrame() {
		demoPanel = new JPanel();
		buttonPanel = new JPanel();
		group = new ButtonGroup();
		
		addRadioButton("Lowered bevel", BorderFactory.createLoweredBevelBorder());
		addRadioButton("Raised bevel", BorderFactory.createRaisedBevelBorder());
		addRadioButton("Etched bevel", BorderFactory.createEtchedBorder());
		addRadioButton("Line bevel", BorderFactory.createLineBorder(Color.BLUE));
		addRadioButton("Matte bevel", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
		addRadioButton("Empty bevel", BorderFactory.createEmptyBorder());
		
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, "Border types");
		buttonPanel.setBorder(titled);
		
		setLayout(new GridLayout(2, 1));
		add(buttonPanel);
		add(demoPanel);
		pack();
	}

	private void addRadioButton(String name, final Border b) {
		JRadioButton button = new JRadioButton(name);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				demoPanel.setBorder(b);
			}
		});
		group.add(button);
		buttonPanel.add(button);
	}
	
	
	
	
	
	

	
	
	
	public static void main(String[] args) {
		JFrame frame = new BorderFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
