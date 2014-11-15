import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
static JFrame Login;
static JPanel panel;
private static JTextField txtUserId;
private static JTextField txtPassword;
private static JLabel lblNewLabel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login();
		
	}
	
	public static void Login(){
		Login = new JFrame("Login");	
		Login.setSize(800, 600);
		
		
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1)); // 3 rows, 1 column
		
		// make the window close when the X is pressed
		Login.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		//Login.getContentPane().add(panel, gbc_panel); // add mainPanel to the mainFrame
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Login.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblSfdfg = new JLabel("Login");
		GridBagConstraints gbc_lblSfdfg = new GridBagConstraints();
		gbc_lblSfdfg.insets = new Insets(0, 0, 5, 0);
		gbc_lblSfdfg.gridheight = 2;
		gbc_lblSfdfg.gridwidth = 6;
		gbc_lblSfdfg.gridx = 11;
		gbc_lblSfdfg.gridy = 7;
		Login.getContentPane().add(lblSfdfg, gbc_lblSfdfg);
		
		txtUserId = new JTextField();
		txtUserId.setText("user ID");
		GridBagConstraints gbc_txtUserId = new GridBagConstraints();
		gbc_txtUserId.insets = new Insets(0, 0, 5, 5);
		gbc_txtUserId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUserId.gridx = 12;
		gbc_txtUserId.gridy = 9;
		Login.getContentPane().add(txtUserId, gbc_txtUserId);
		txtUserId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.gridx = 12;
		gbc_txtPassword.gridy = 10;
		Login.getContentPane().add(txtPassword, gbc_txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 	For now loads the Advisor class
				 * 	Will eventually impliment a test bases on login credentials whehter or not it loads the Studnet or Instructor class respectively
				 */
				Advisor advisor = new Advisor();
				advisor.menu();
				
				
				
				
				
				//Work in progress...
				/**
				 * 		if: Student--> Load Student
				 * 		if: Instructor --> Load Instructor
				 *
				 */
				/**
				 * 	Does not work:
				 * 	There is a loop that causes if the login input is not correct, the is states but never goes back to check the input, ask me if you have questions....Robert
				 */
				/*
				//for now to test functionality, student will onyl work for a student login and Instructor will only work as Insstructr login::: anything else will generate an error
				while(!(txtUserId.equals("student") || txtUserId.equals("instructor"))){
					//JOptionPane.showMessageDialog(null,"Student");
					lblNewLabel.setText("Invalid User Credentials");
					lblNewLabel.setBackground(Color.black);
				}
				lblNewLabel.setText("Login Successful");
				/*if(txtUserId.equals("instructor")){
					JOptionPane.showMessageDialog(null,"Instructor");
					
				}
				else JOptionPane.showMessageDialog(null,"Student"); */
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 12;
		gbc_btnNewButton.gridy = 11;
		Login.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 12;
		gbc_lblNewLabel.gridy = 12;
		Login.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		Login.setVisible(true);	// show the mainFrame
		
	}

}
