package dbmsproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dbaupdate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dbaupdate frame = new dbaupdate();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dbaupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsert = new JButton("Workers");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				dbworker obj=new dbworker();
				obj.setVisible(true);
				dbaupdate.this.dispose();
			}
		});
		btnInsert.setBounds(173, 56, 109, 23);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Account");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dbaccount obj=new dbaccount();
			obj.setVisible(true);
			dbaupdate.this.dispose();
			
			}
		});
		btnDelete.setBounds(309, 124, 138, 23);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Faunal Info");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dbfaunalinfo obj=new dbfaunalinfo();
			obj.setVisible(true);
			dbaupdate.this.dispose();
			}
		});
		btnUpdate.setBounds(309, 90, 138, 23);
		contentPane.add(btnUpdate);
		
		JButton btnNewButton = new JButton("Donations");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dbdonate obj=new dbdonate();
			obj.setVisible(true);
			dbaupdate.this.dispose();
			}
		});
		btnNewButton.setBounds(173, 90, 109, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Visitor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dbvis obj=new dbvis();
			obj.setVisible(true);
			dbaupdate.this.dispose();
			}
		});
		btnNewButton_1.setBounds(173, 124, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Worker Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dbworkaccount obj=new dbworkaccount();
			obj.setVisible(true);
			dbaupdate.this.dispose();
			}
		});
		btnNewButton_2.setBounds(306, 56, 138, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnBack = new JButton("<- Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				info obj=new info();
				obj.setVisible(true);
				dbaupdate.this.dispose();
			}
		});
		btnBack.setBounds(251, 340, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Desktop\\Wildlife-Photos14.jpg"));
		lblNewLabel.setBounds(0, 0, 599, 374);
		contentPane.add(lblNewLabel);
	}
}
