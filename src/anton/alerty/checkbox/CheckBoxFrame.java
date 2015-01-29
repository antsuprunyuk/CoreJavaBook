package anton.alerty.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxFrame extends JFrame {

	private JLabel label;
	private JCheckBox bold;
	private JCheckBox italic;
	
	public static final int FONTSIZE = 32;
	
	public CheckBoxFrame() {
		
		label = new JLabel("The quick brown fox jumps over a lazy dog.");
		Font f = new Font("Serif", Font.BOLD, FONTSIZE);
		label.setFont(f);
		add(label, BorderLayout.CENTER);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int mode = 0;
				if (bold.isSelected()) mode += Font.BOLD;
				if (italic.isSelected()) mode += Font.ITALIC;
				label.setFont(new Font("Monospaced", mode, FONTSIZE));
			}
		};
		
		JPanel checkBoxPanel = new JPanel();
		
		bold = new JCheckBox("Bold");
		bold.addActionListener(listener);
		bold.setSelected(true);
		checkBoxPanel.add(bold);
		
		italic = new JCheckBox("Italic");
		italic.addActionListener(listener);
		checkBoxPanel.add(italic);
		
		add(checkBoxPanel, BorderLayout.SOUTH);
		//pack();
		setSize(620, 400);
		
		
	}
	
}
