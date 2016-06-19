import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton[] buttons;
	private JTextField screen;
	private String[] labels = {" "," "," "," ","^2",
							  "7","8","9","+","%",
							  "4","5","6","-","AC",
							  "1","2","3","*","C",
							  "0",".","+/-","/","="};
	
	private double result =0;
	private String es = "="; //equal sign
	
	public calculator(){
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout (0,5));
		screen = new JTextField(30);
		screen.setText(" ");
		buttons = new JButton[25];
		
		for(int i =0; i<25; i++){
			buttons[i] = new JButton(labels[i]);
			panel.add(buttons[i]);
			if(i>4)
			buttons[i].addActionListener(this);
		}
		add(screen,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		pack();
		setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c = new calculator();
	}

}
