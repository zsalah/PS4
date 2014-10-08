/*
 * Author Zulfiqar Salahuddin
 */

package MainPackage;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField startingAmount;
	private JTextField totalYears;
	private JTextField annualInterest;
	private JTextField futureValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		JPanel splitPanel = new JPanel();
		splitPanel.setBounds(22, 24, 387, 175);
		frame.getContentPane().add(splitPanel);
		splitPanel.setLayout(null);
		
		JLabel InvestmentAmount = new JLabel("Investment Amount");
		InvestmentAmount.setFont(new Font("QuickType II", Font.PLAIN, 14));
		InvestmentAmount.setBounds(10, 11, 154, 32);
		splitPanel.add(InvestmentAmount);
		
		startingAmount = new JTextField();
		startingAmount.setBounds(220, 11, 140, 32);
		splitPanel.add(startingAmount);
		startingAmount.setColumns(10);
		
		JLabel Years = new JLabel("Years");
		Years.setFont(new Font("QuickType II", Font.PLAIN, 14));
		Years.setHorizontalAlignment(SwingConstants.LEFT);
		Years.setBounds(10, 58, 130, 25);
		splitPanel.add(Years);
		
		totalYears = new JTextField();
		totalYears.setBounds(220, 54, 140, 32);
		splitPanel.add(totalYears);
		totalYears.setColumns(10);
		
		JLabel AnnualInterestRate = new JLabel("Annual Interest Rate");
		AnnualInterestRate.setHorizontalAlignment(SwingConstants.LEFT);
		AnnualInterestRate.setFont(new Font("QuickType II", Font.PLAIN, 14));
		AnnualInterestRate.setBounds(10, 105, 154, 14);
		splitPanel.add(AnnualInterestRate);
		
		JLabel futurevalue = new JLabel("Future Value");
		futurevalue.setFont(new Font("QuickType II", Font.PLAIN, 14));
		futurevalue.setHorizontalAlignment(SwingConstants.LEFT);
		futurevalue.setBounds(10, 150, 130, 14);
		splitPanel.add(futurevalue);
		
		annualInterest = new JTextField();
		annualInterest.setBounds(220, 97, 140, 32);
		splitPanel.add(annualInterest);
		annualInterest.setColumns(10);
		
		futureValue = new JTextField();
		futureValue.setBounds(220, 141, 140, 32);
		splitPanel.add(futureValue);
		futureValue.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				futureValue.setBackground(Color.LIGHT_GRAY);
				
				double starting = Double.parseDouble(startingAmount.getText());
				double years = Double.parseDouble(totalYears.getText());
				double rate = Double.parseDouble(annualInterest.getText());
				
				double total;
				
				calculate tester = new calculate();
				
				total = tester.returnFutureValue(starting, rate, years);
				
				futureValue.setText("$" + total);
		
			}
		});
		calculateButton.setBounds(250, 210, 127, 41);
		frame.getContentPane().add(calculateButton);
	}
}
