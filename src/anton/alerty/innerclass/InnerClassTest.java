package anton.alerty.innerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {

		TalkingClock clock = new TalkingClock(300_000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		
	}
}

class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int i, boolean b) {
		interval = i;
		beep = b;
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		ActionListener listener2 = new TimePrinter2();
		Timer t = new Timer(interval, listener);
		Timer t2 = new Timer(interval * 3, listener2);
		t.start();
		t2.start();
		System.out.println("START");
	}
	
	private class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone, the time is" + now);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
	
	private class TimePrinter2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone, the time is" + now);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}
