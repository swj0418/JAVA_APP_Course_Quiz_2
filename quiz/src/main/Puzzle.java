package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Puzzle extends JFrame implements ActionListener{
	public MyButton[] buttons;
	MyButton reset;
	JTextArea area;
	public static String Str = "";
	
	public Puzzle() {
		super("puzzle");
		
		JPanel pnl = new JPanel();
		JPanel pnl_2 = new JPanel();
		
		pnl.setLayout(new GridLayout(0, 3, 3, 2));
		
		buttons = new MyButton[9];
		for(int i = 0; i < 8; i++) {
			buttons[i] = new MyButton("" + (i+1));
		}
		buttons[8] = new MyButton(" ");
		
		for(int i = 0; i < 9; i++) {
			pnl.add(buttons[i]);
		}
		for(int i = 0; i < 9; i++) {
			buttons[i].addActionListener(this);
		}
		
		add(pnl, BorderLayout.CENTER);
		pnl_2.setSize(100, 300);
		area = new JTextArea();
		pnl_2.add(area);
		add(pnl_2, BorderLayout.NORTH);
		
		reset = new MyButton("reset");
		reset.setBackground(Color.RED);
		reset.setForeground(Color.BLACK);
		reset.addActionListener(this);
		add(reset, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		MyButton b = (MyButton) e.getSource();
		
		if(e.getSource() == reset) {
			Str = "";
			area.setText(Str);
			for(int i = 0; i < 8; i++) {
				buttons[i].setText("" + (i + 1));
			}
			buttons[8].setText(" ");
		}

		if(b.getText().equals(" ") == true) {
			return;
		}
		
		if(b.index == 0) {
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 1) {
			if(buttons[2].getText().equals(" ")) {
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[0].getText().equals(" ")) {
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 2) {
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 3) {
			if(buttons[0].getText().equals(" ")) {
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[6].getText().equals(" ")) {
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 4) {
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[1].getText().equals(" ")) {
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);			
		}
		if(b.index == 5) {
			if(buttons[2].getText().equals(" ")) {
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[8].getText().equals(" ")) {
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 6) {
			if(buttons[3].getText().equals(" ")) {
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 7) {
			if(buttons[6].getText().equals(" ")) {
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[8].getText().equals(" ")) {
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" ")) {
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
		if(b.index == 8) {
			if(buttons[5].getText().equals(" ")) {
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[7].getText().equals(" ")) {
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			Str += b.index;
			area.setText(Str);
		}
	}
	public static void main(String[] ar)
	{
		Puzzle p = new Puzzle();
	}

}
