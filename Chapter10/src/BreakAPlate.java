import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
public class BreakAPlate {
	
	
	
	//THIS CHANGE WAS JUST MADE

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=130,319
	 */
	private final JSeparator separator = new JSeparator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 61, 139));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon BLK = new ImageIcon(this.getClass().getResource("/BLK.png"));
		ImageIcon FDPLT = new ImageIcon(this.getClass().getResource("/FDPLT.png"));
		ImageIcon MTPLT = new ImageIcon(this.getClass().getResource("/MTPLT.png"));
		ImageIcon STICK = new ImageIcon(this.getClass().getResource("/stick.png"));
		ImageIcon TIGER = new ImageIcon(this.getClass().getResource("/tiger.png"));
		
		JLabel LB1 = new JLabel("");
		LB1.setIcon(FDPLT);
		LB1.setHorizontalAlignment(SwingConstants.CENTER);
		LB1.setBounds(156, 54, 101, 85);
		panel.add(LB1);
		
		JLabel LB2 = new JLabel("");
		LB2.setIcon(FDPLT);
		LB2.setHorizontalAlignment(SwingConstants.CENTER);
		LB2.setBounds(283, 54, 101, 85);
		panel.add(LB2);
		
		JLabel LB = new JLabel("");
		LB.setIcon(FDPLT);
		LB.setHorizontalAlignment(SwingConstants.CENTER);
		LB.setBounds(32, 54, 101, 85);
		panel.add(LB);
		
		
		JLabel LB3 = new JLabel("");
		LB3.setIcon(BLK);
		LB3.setBounds(156, 179, 101, 82);
		panel.add(LB3);
		
		JButton BTN = new JButton("Play");
		BTN.setBackground(Color.LIGHT_GRAY);
		BTN.setEnabled(false);
		BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				    String eventName = BTN.getText(); // Assigns String eventName the text displayed on the the play/play again button
					int randomNum = (int)(Math.random() * 3); //Assigns a random number between 0 and 3, 0 inclusive
					
				  if (eventName.equals("Play")) 
				  {				  
					  
				  
					  switch(randomNum) // Switch that displays the prize based on how many plates were eaten based on a random number between 0-3
				{ 
				  
					  case 0:
						  LB.setIcon(MTPLT);
						  LB3.setIcon(STICK);
				   
						  break;
				  
					  case 1:
						  LB1.setIcon(MTPLT);
						  LB.setIcon(MTPLT);
						  LB3.setIcon(STICK);
					  
						  break;
				 
					  case 2:
						  LB2.setIcon(MTPLT);
						  LB.setIcon(MTPLT);
						  LB1.setIcon(MTPLT);
						  LB3.setIcon(TIGER);
					 
						  break;
				  
					  default:  
				}
					  BTN.setText("Play Again"); // Button displays "Play Again" after every round  
				   
				  }
				  else if(eventName.equals("Play Again")) // When the user clicks play again the game resets to its original view
				  {
					   	  BTN.setText("Play");
						  
					   	  BTN.setActionCommand("Play");
						  
					   	  LB2.setIcon(FDPLT);
						  
					   	  LB.setIcon(FDPLT);
						  
					   	  LB1.setIcon(FDPLT);
						  
					   	  LB3.setIcon(BLK);
						  
				  }
				  
				
				  
			
			}
		});
		BTN.setBounds(137, 145, 136, 23);
		panel.add(BTN);
		
		
		
		
	}
}
