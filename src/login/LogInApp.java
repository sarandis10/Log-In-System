package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import anotherPackage.SimpleWindow;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;

public class LogInApp {

	private JFrame frame;
	private JTextField textFieldUserName;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInApp window = new LogInApp();
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
	public LogInApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Sarandi's Log In App");
		
		
		JLabel labelTitle = new JLabel("Log In Application");
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelTitle.setBounds(268, 35, 167, 70);
		frame.getContentPane().add(labelTitle);
		
		JLabel labelUserName = new JLabel("Username");
		labelUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		labelUserName.setBounds(159, 165, 167, 33);
		frame.getContentPane().add(labelUserName);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		labelPassword.setBounds(159, 268, 167, 33);
		frame.getContentPane().add(labelPassword);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(370, 172, 116, 22);
		frame.getContentPane().add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(370, 275, 116, 22);
		frame.getContentPane().add(textFieldPassword);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=textFieldPassword.getText();
				String username=textFieldUserName.getText();
				String user="sarandis";
				String pass="123456";
				
				if(password.contains(pass) && username.contains(user)) {
					textFieldPassword.setText(null);
					textFieldUserName.setText(null);
					
					//SimpleWindow sw= new SimpleWindow();
					SimpleWindow.main(null);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "invalid login details","login Error",JOptionPane.ERROR_MESSAGE);
					textFieldPassword.setText(null);
					textFieldUserName.setText(null);
				}
				
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogIn.setToolTipText("");
		btnLogIn.setBounds(63, 374, 97, 25);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPassword.setText(null);
				textFieldUserName.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(314, 374, 97, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClose.setBounds(534, 374, 97, 25);
		frame.getContentPane().add(btnClose);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 103, 689, 2);
		frame.getContentPane().add(separator);
		
	}
}
