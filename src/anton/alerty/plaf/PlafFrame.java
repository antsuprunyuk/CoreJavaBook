package anton.alerty.plaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlafFrame extends JFrame{

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private JPanel buttonPanel;
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new PlafFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("PlafFrame");
				frame.setVisible(true);
			}
		});
	}

	public PlafFrame() {
		buttonPanel = new JPanel();
		setSize(DEFAULT_WIDTH * 2, DEFAULT_HEIGHT);
		
		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo plaf : infos) {
			makeButton(plaf.getName(), plaf.getClassName());
			System.out.println(plaf.getName() + "\n" + plaf.getClassName() + "\n");
		}
		add(buttonPanel);
		//pack();
	}
	
	
	private void makeButton(String name, final String plafName) {
		JButton button = new JButton(name);
		buttonPanel.add(button);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				try {
					UIManager.setLookAndFeel(plafName);
					SwingUtilities.updateComponentTreeUI(PlafFrame.this);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
