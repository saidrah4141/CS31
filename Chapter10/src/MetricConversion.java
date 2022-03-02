import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.lang.*
;
import java.awt.SystemColor;
import javax.swing.SwingConstants;public class MetricConversion {

	private JFrame frame;
	private final JComboBox CB = new JComboBox();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 178);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 310, 139);
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LB = new JLabel("Select a conversion type: ");
		LB.setFont(new Font("Tahoma", Font.BOLD, 11));
		LB.setBounds(20, 21, 160, 22);
		panel.add(LB);
		
		JLabel LB2 = new JLabel("");
		LB2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		LB2.setBounds(20, 95, 212, 21);
		panel.add(LB2);
		
		
		CB.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters", "Gallons to Litres", "Pounds to Kilograms"}));
		CB.setBounds(20, 53, 266, 31);
		panel.add(CB);
	
		
		CB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if (CB.getSelectedItem().equals("Inches to Centimeters")) // Condition statement that displays conversion of "Inches to Centimeters" if the option is selected
				{
					LB2.setText("1 inch = 2.54 centimeters");
				}

				else if (CB.getSelectedItem().equals("Feet to Meters")) // Condition statement that displays conversion of "Feet to Meters" if the option is selected
				{
					LB2.setText("1 foot = 0.3048 meteres");

				}
				else if (CB.getSelectedItem().equals("Gallons to Litres"))// Condition statement that displays conversion of "Gallons to Litres" if the option is selected
				{
					LB2.setText("1 gallon = 4.5461 litres");

				}
				else if (CB.getSelectedItem().equals("Pounds to Kilograms"))// Condition statement that displays conversion of "Pounds to Kilograms" if the option is selected
				{
					LB2.setText("1 pound = 0.4536 kilograms");
				}
			
			}
		});
		
	  		
			
			
		}
				
		
		
	
	}

