package WyzwanieSolo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Postac.Postac;

public class OknoWyzwania extends JFrame {
	private JPanel panel1, panel2, panel3;

	public OknoWyzwania(Postac postac) {
		setTitle("Era Brazu");
		setVisible(true);
		setSize(410, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(450, 170, 410, 410);

		panel1 = new Panel1(this, postac);
		panel2 = new Panel2(this);
		panel3 = new Panel3(this);
		setLayout(new FlowLayout());
		add(panel1);

	}

	public void panel2() {
		remove(panel1);
		// setLayout(new FlowLayout());
		add(panel2);
		panel2.setVisible(true);

		repaint();

	}

	public void panel3() {
		remove(panel2);
		// setLayout(new FlowLayout());
		add(panel3);
		panel3.setVisible(true);

		repaint();

	}

	public void panel1do3() {
		remove(panel1);
		// setLayout(new FlowLayout());
		add(panel3);
		panel3.setVisible(true);

		repaint();

	}

}
