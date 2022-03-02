import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import sun.jvm.hotspot.debugger.cdbg.basic.LazyBlockSym;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class DivisibleByThree {

	private JFrame frame;
	private JTextField TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleByThree window = new DivisibleByThree();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleByThree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 611, 144);
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel LB = new JLabel("Enter an Integer: ");
		LB.setBounds(33, 19, 168, 28);
		LB.setBackground(Color.RED);
		LB.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(LB);
		
		TF = new JTextField();
		TF.setForeground(Color.BLACK);
		TF.setBackground(Color.WHITE);
		TF.setBounds(319, 20, 253, 28);
		panel.add(TF);
		TF.setColumns(10);
		
		JLabel LB2 = new JLabel("");
		LB2.setFont(new Font("Arial", Font.BOLD, 14));
		LB2.setBounds(319, 60, 243, 33);
		panel.add(LB2);
		
		JButton BT = new JButton("Check");
		BT.setBackground(Color.WHITE);
		BT.setForeground(Color.BLACK);
		BT.setBounds(33, 58, 227, 35);
		BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String msg = TF.getText(); // Initialize String called 'msg' assigned to value of text field 'TF'
			    
				int x =	Integer.parseInt(msg); // Initialize integer called 'x' to the value of 'msg'
				
					if (x%3==0)	// Conditional that checks if the integer value of 'x' is divisible by 3				
					{
						LB2.setText(x + " is divisble by 3"); // Displays that 'x' is divisible by 3
					} 
					else // If 'x' is not divisible by 3, displays that it is not
					{
						LB2.setText(x + " is not divisible by 3");
					}
		
			}
		});
		panel.add(BT);
		
		
	}
}
