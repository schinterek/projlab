package projlab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Window extends JFrame {
	int frameWidth = 800, frameHeight = 800;
	JTextField foszoveg;
	public JButton gomb1;
	public JButton gomb2;
	//public JButton gomb3;
	public JButton[][] player;
	public Image im;
	public String value;
	public JTextField cmd;
	//public State state = State.Vege;
	//public Jatekos jatekos= new Jatekos();
	//public Lista lista;

	public Window(int mapsize,Cell[][] cells) {
		// frame
		super("Factory");
		if(mapsize==12) {
			frameHeight=620;
			player=new JButton[12][12];
			}
		else {
			 player = new JButton[17][17];
		}
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(frameWidth, frameHeight);
		this.setResizable(false);
		
		// frame layout
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // top to bottom
		
		// top panel
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(frameWidth, 100));
		this.add(topPanel);
		foszoveg = new JTextField(40);
		foszoveg.setPreferredSize(new Dimension(frameWidth, 30));
		foszoveg.setText("Jatek inditasa");
		foszoveg.setEditable(false);
		foszoveg.setBackground(Color.WHITE);
		foszoveg.setHorizontalAlignment(JTextField.CENTER);
		gomb1 = new JButton("Jatek kezelese");
		//gomb1.addActionListener(new jatekButtonActionListener());
		gomb2 = new JButton("Jatek feladasa");
		//gomb3 = new JButton();
		gomb2.addActionListener(new vegeButtonActionListener());
		gomb1.setPreferredSize(new Dimension(250, 30));
		gomb2.setPreferredSize(new Dimension(250, 30));
		gomb1.setBackground(new java.awt.Color(152, 251, 152));
		gomb2.setBackground(new java.awt.Color(255, 153, 153));
		topPanel.setLayout(new BorderLayout(100, 30));
		topPanel.setBackground(new java.awt.Color(255, 255, 204));
		topPanel.add(foszoveg, BorderLayout.SOUTH);
		topPanel.add(gomb2, BorderLayout.EAST);
		topPanel.add(gomb1, BorderLayout.WEST);
		//topPanel.add(gomb3);
		
		// bottom panel
		JPanel botPanel = new JPanel();
		if(mapsize==12) {
			botPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 12));
			botPanel.setPreferredSize(new Dimension(frameWidth,450));
			}
		else {
			botPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 15));
			botPanel.setPreferredSize(new Dimension(frameWidth,620));
		}
		this.add(botPanel);
		botPanel.setBackground(new java.awt.Color(255, 255, 204));
		JPanel playerPanel = new JPanel();
		//JPanel enemyPanel = new JPanel();
		if(mapsize==12) {
			playerPanel.setLayout(new GridLayout(12,12));
		}
		else {
		playerPanel.setLayout(new GridLayout(17,17));}
		//enemyPanel.setLayout(new GridLayout(10,10));
		instantiateButtonGrid(player, playerPanel, cells);
		//instantiateButtonGrid(enemy, enemyPanel, "enemy");
		botPanel.add(playerPanel);
		//botPanel.add(enemyPanel);
		JPanel lastPanel= new JPanel();
		lastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		lastPanel.setPreferredSize(new Dimension(frameWidth,40));
		lastPanel.setBackground(new java.awt.Color(255, 255, 204));
		this.add(lastPanel);
		lastPanel.add(new JLabel("A jatekmezo"));
		//botPanel.add(new JLabel("Ellenf�l j�t�kmez�"));
		playerPanel.addKeyListener(new Keylist());
		botPanel.addKeyListener(new Keylist());
		lastPanel.addKeyListener(new Keylist());
		topPanel.addKeyListener(new Keylist());
		this.addKeyListener(new Keylist());
		
		
	}
	class vegeButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent ae){
			Controller.getInstance().step("b");
		
	}
	}
	
	private void instantiateButtonGrid(JButton[][] buttons, JPanel panel, Cell[][] cells) {
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setPreferredSize(new Dimension(35,35));
				buttons[i][j].setIcon(new ImageIcon(cells[i][j].print()));
				//buttons[i][j].addActionListener(new mezoButtonActionListener());
				panel.add(buttons[i][j]);
			}
		}
	}
	
	public void refreshMap(Cell[][] cells) {
		for (int j = 0; j < player.length; j++) {
			for (int i = 0; i < player[j].length; i++) {
				player[j][i].setIcon(new ImageIcon(cells[i][j].print()));
				validate();
			}
		}
	}
	public void close() {
	}
public class Keylist implements KeyListener{
	
	Keylist() {
		super();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		String key=KeyEvent.getKeyText(e.getKeyCode());
		Controller.getInstance().step(key);
		System.out.println("mukodik");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
}
