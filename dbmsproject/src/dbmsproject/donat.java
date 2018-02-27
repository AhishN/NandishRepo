package dbmsproject;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class donat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					donat frame = new donat();
					frame.setVisible(true);
				} catch (Exception e) {JOptionPane.showMessageDialog(null,e);
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public donat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnList = new JButton("View Donation list");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donati obj=new donati();
				obj.setVisible(true);
				donat.this.dispose();
		    
			}
		});
		btnList.setBounds(160, 222, 151, 23);
		contentPane.add(btnList);
		
		JButton btnClickHereTo = new JButton("Click here to Donate");
		
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insdonate obj=new insdonate();
				obj.setVisible(true);
				donat.this.dispose();
			}
		});
		btnClickHereTo.setBounds(160, 255, 151, 23);
		contentPane.add(btnClickHereTo);
		
		JButton button = new JButton("<-- Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			info obj=new info();
			obj.setVisible(true);
			donat.this.dispose();
			}
		});
		button.setBounds(192, 289, 89, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Desktop\\wildlife_sanctuaries_of_india.jpg"));
		lblNewLabel.setBounds(0, 0, 620, 513);
		contentPane.add(lblNewLabel);
	}

}
