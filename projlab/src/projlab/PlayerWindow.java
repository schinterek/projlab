package projlab;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PlayerWindow extends JFrame {
	int frameWidth = 400, frameHeight = 200;
	JTextField player1;
	JTextField player2;
	JButton bOk;
	
	public PlayerWindow()
	{
		super("Players");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(frameWidth, frameHeight);
		this.setResizable(false);
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(frameWidth,frameHeight));
		this.add(p);
		player1 = new JTextField(10);
		player2 = new JTextField(10);
		bOk = new JButton("OK");
		p.add(bOk);
		bOk.addActionListener(new okButtonListener());
		p.add(player1,BorderLayout.NORTH);
		p.add(player2,BorderLayout.SOUTH);
		player1.setHorizontalAlignment(JTextField.LEADING);
		player2.setHorizontalAlignment(JTextField.LEADING);
		player1.setText("1. Játékos");
		player2.setText("2. Játékos");
		this.setFocusable(true);
		this.setVisible(true);
		this.toFront();
		this.repaint();
		this.requestFocusInWindow();
		
	}
	
	class okButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Player p1 = new Player(player1.getText());
			Player p2 = new Player(player2.getText());
			Controller.getInstance().addPlayer(p1);
			Controller.getInstance().addPlayer(p2);
			p1.setWorker(Map.getInstance().getWorker(0));
			p2.setWorker(Map.getInstance().getWorker(1));
			
			p1.setControl("Up");
			p1.setControl("Left");
			p1.setControl("Down");
			p1.setControl("Right");
			p1.setControl("Shift");
			p1.setControl("Ctrl");
			p2.setControl("W");
			p2.setControl("A");
			p2.setControl("S");
			p2.setControl("D");
			p2.setControl("Q");
			p2.setControl("E");
			Map.getInstance().window.setVisible(true);
			dispose();
			
		}
		
	}

}
