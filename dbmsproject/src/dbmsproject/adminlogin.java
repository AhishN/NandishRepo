package dbmsproject;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class adminlogin extends JFrame {

	private JPanel contentPane;
	private JTextField UNField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adminlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(69, 95, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(69, 133, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		UNField = new JTextField();
		UNField.setBounds(151, 92, 86, 20);
		contentPane.add(UNField);
		UNField.setColumns(10);
		
	
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
			
				try{String username="system";
				    String pass="kalyan12#";
				    String usr=UNField.getText();
				    @SuppressWarnings("deprecation")
					String passw=passwordField.getText();
				    
					if(username.equals(usr)&&pass.equals(passw))
					{ 
					dbaupdate obj=new dbaupdate();
					obj.setVisible(true);
					adminlogin.this.dispose();}
					else JOptionPane.showMessageDialog(null,"invalid Credentials");}
				catch(Exception e)
				{JOptionPane.showMessageDialog(null,e);
				}
			}
		});
        		btnLogin.setBounds(101, 158, 89, 23);
		contentPane.add(btnLogin);
		adminlogin.this.getRootPane().setDefaultButton(btnLogin);
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(151, 130, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info obj=new info();
				obj.setVisible(true);
				adminlogin.this.dispose();
			}
		});
		btnCancel.setBounds(101, 191, 89, 23);
		contentPane.add(btnCancel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Desktop\\cc.jpg"));
		lblNewLabel_2.setBounds(-55, -21, 1129, 464);
		contentPane.add(lblNewLabel_2);
	}
}
