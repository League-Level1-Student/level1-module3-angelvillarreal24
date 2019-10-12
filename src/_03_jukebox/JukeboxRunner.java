package _03_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JukeboxRunner implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {

		JukeboxRunner test = new JukeboxRunner();

		test.buildUI();

	}

	void buildUI() {

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		button1.setText("All Star");
		button2.setText("Another One Bites the Dust");
		button3.setText("Bohemian Rhapsody");

		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Song test1 = new Song("AllStar.mp3");
		Song test2 = new Song("Dust.mp3");
		Song test3 = new Song("QBR.mp3");

		if (e.getSource() == button1) {
			System.out.println("button 1 was pressed");
			test1.loadFile();
			test1.play();

		} else if (e.getSource() == button2) {
			System.out.println("button 2 was pressed");
			test2.loadFile();
			test2.play();

		} else if (e.getSource() == button3) {
			System.out.println("button 3 was pressed");
			test3.loadFile();
			test3.play();

		} else {
			System.out.println("Bruh this doesn't work.");
		}

	}
}
