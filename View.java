import java.awt.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.*;
import java.awt.event.*;
public class View {

static	JFrame frame;


/**
 * @wbp.nonvisual location=278,257
 */
static  ScrollPane scrollPane;
static  JTable table = new JTable();
static 	GroupLayout groupLayout;
static JTextArea textArea;
/**
 * @wbp.nonvisual location=288,177
 */

/**
 * @wbp.nonvisual location=308,197
 */

//String to contian the information to print in the text area
static String test;

/**Scrollpane for the textArea as report size grows beyond the limit of the frame:
			*********************************************************
			*		Important: THIS IS NOT CONFIGURED YET			*
			*														*
			*********************************************************     */

public static ScrollPane report_scrollPane = new ScrollPane();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this shows the GUI
		try {
			Show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	//THis is the method for the GUI: If you want it to show up in the frame and it is not in this mehtod...it will not display on the screen
	//when the button is clicked and the View object is created
	public static void Show() throws FileNotFoundException{
		frame = new JFrame("Report");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//Problem when closing the this window
		//It closed the entire application
		//Should only close this specific window
		
		// perform certain actions when the window is closed
				frame.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
	
						
						System.exit(0);
					}
					
				});
		
		
		//Layout for the textArea 
		JTextArea textArea = new JTextArea();
		GroupLayout groupLayout_1 = new GroupLayout(frame.getContentPane());
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(47)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(32)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 517, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout_1);
		frame.setVisible(true);
		
		// the contents of this string will be displayed on the textArea
		String test = "This is where the report information goes...";
		textArea.setText(test);
		
		
		
	}
}
