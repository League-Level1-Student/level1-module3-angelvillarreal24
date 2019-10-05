package _03_jukebox;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JukeboxRunner implements ActionListener {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();

		button1.addActionListener(null);
		button2.addActionListener(null);
		button3.addActionListener(null);

	Song test1 = new Song("AllStar.mp3");

	test1.loadFile();

	test1.play();


	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
