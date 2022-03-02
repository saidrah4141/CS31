import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;
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
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LB1 = new JLabel("new label");
		LB1.setHorizontalAlignment(SwingConstants.CENTER);
		LB1.setBounds(177, 54, 101, 85);
		panel.add(LB1);
		
		JLabel LB2 = new JLabel("new label");
		LB2.setHorizontalAlignment(SwingConstants.CENTER);
		LB2.setBounds(295, 54, 101, 85);
		panel.add(LB2);
		
		JLabel LB = new JLabel("new label");
		LB.setHorizontalAlignment(SwingConstants.CENTER);
		LB.setBounds(45, 54, 101, 85);
		panel.add(LB);
		
		JLabel LB3 = new JLabel("");
		LB3.setBounds(188, 193, 46, 14);
		panel.add(LB3);
		
		JButton BTN = new JButton("Play");
		BTN.setBounds(165, 146, 89, 23);
		panel.add(BTN);
		
		ImageIcon BLK = new ImageIcon(this.getClass().getResource("/BLK.png"));
		ImageIcon FDPLT = new ImageIcon(this.getClass().getResource("/FDPLT.png"));
		ImageIcon MTPLT = new ImageIcon(this.getClass().getResource("/MTPLT.png"));
		ImageIcon STICK = new ImageIcon(this.getClass().getResource("/stick.png"));
		ImageIcon TIGER = new ImageIcon(this.getClass().getResource("/tiger.png"));
		
	}
}
