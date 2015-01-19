package anton.alerty.annonymmousinnerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import javax.swing.Timer;

import javax.swing.JOptionPane;

public class AnnonymousInnerClassTest {

	public static void main(String[] args) {


		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		JOptionPane.showMessageDialog(null, "Want to quit?");
		System.exit(0);
	}
}
	class TalkingClock {
		public void start(int interval, boolean beep) {
			ActionListener listener = new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					Date date = new Date();
					System.out.println("At the tone, the time is  " + date);
					if (beep) Toolkit.getDefaultToolkit().beep();
				}
			};
			javax.swing.Timer t = new javax.swing.Timer(interval, listener);
			t.start();
	}
}

