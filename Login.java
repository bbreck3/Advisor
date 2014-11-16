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
<<<<<<< HEAD
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
=======
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719

public class Login {
static JFrame Login;
static JPanel panel;
private static JTextField txtUserId;
private static JTextField txtPassword;
<<<<<<< HEAD
static JLabel validation_label; //this must global as it can change throughout the class and its state needs to be saved throughout
=======
private static JLabel lblNewLabel;
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login();
		
	}
<<<<<<< HEAD
	//Set up the login frame
=======
	
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719
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
		
<<<<<<< HEAD
		// sets up the login panel with the gridbag layout contraints
=======
		
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
<<<<<<< HEAD
		
		//Create a login label
		JLabel login_label = new JLabel("Login");
		
		//create textfield for user to input ID
		txtUserId = new JTextField();
		txtUserId.setText("user ID");
		txtUserId.setColumns(10);
		
		
		//create textfield for user to input password
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		
		//sets up the login button
		JButton login_button = new JButton("Login");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp_userId= txtUserId.getText();
				String temp_userpsswd= txtUserId.getText();
				
				// Was supposed to impliment login validation, but doesnot work
				/*while(!(temp_userId.equals("Advisor") && temp_userpsswd.equals("password"))){
				 * 
				 * 
				validation_label.setText("INVALIN LOGIN: User or Password Incorrect! Plase try again!");
				
				}*/
				Advisor advisor = new Advisor();
				advisor.menu(); 
=======
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
				
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719
				
				
				
				
<<<<<<< HEAD
				
			}
		});
		
		//sets up a validation label to print and error if the current credentials are not valid
		validation_label = new JLabel("test");
		GroupLayout groupLayout = new GroupLayout(Login.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(335)
							.addComponent(login_button))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(223)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtUserId, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
								.addComponent(validation_label)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(339)
							.addComponent(login_label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(262, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(258)
					.addComponent(login_label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtUserId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(login_button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(validation_label)
					.addGap(185))
		);
		Login.getContentPane().setLayout(groupLayout);
=======
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
>>>>>>> 459b1c1234a0c1a18ff4957cf177f36c8058a719
		Login.setVisible(true);	// show the mainFrame
		
	}

}
