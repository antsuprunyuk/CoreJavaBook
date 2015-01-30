package anton.alerty.text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextComponentFrame extends JFrame {
	
	public static final int TEXTAREA_ROWS = 8;
	public static final int TEXTAREA_COLUMNS = 20;
	
	public TextComponentFrame() {
		JPanel northPanel = new JPanel();
		GridLayout grid = new GridLayout(2, 2);
		northPanel.setLayout(grid);
		
		JTextField name = new JTextField();
		JPasswordField password = new JPasswordField();
		
		northPanel.add(new JLabel("Your name: ", SwingConstants.RIGHT));
		northPanel.add(name);
		northPanel.add(new JLabel("Insert password: ", SwingConstants.RIGHT));
		northPanel.add(password);
		
		add(northPanel, BorderLayout.NORTH);
		
		final JTextArea textArea = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel();
		JButton button = new JButton("Insert");
		southPanel.add(button);
		add(southPanel, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea.append("name: " + name.getText() + " password: " + new String(password.getPassword()) + "\n");
				 
			}
		});
		pack();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new TextComponentFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
