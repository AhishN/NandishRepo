package dbmsproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info frame = new info();
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
	public info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Database Administrator");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				adminlogin obj=new adminlogin();
			obj.setVisible(true);
			info.this.dispose();
			}
		});
		btnNewButton.setBounds(242, 139, 182, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Visitor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			visitorin obj=new visitorin();
			obj.setVisible(true);
			info.this.dispose();
			}
		});
		btnNewButton_1.setBounds(242, 173, 182, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Donations");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			donat obj=new donat();
			obj.setVisible(true);
			info.this.dispose();
			}
		});
		btnNewButton_2.setBounds(242, 207, 182, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Worker");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			workinfo obj=new workinfo();
			obj.setVisible(true);
			info.this.dispose();
			}
		});
		btnNewButton_3.setBounds(242, 242, 182, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<-- Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sanctuary obj=new sanctuary();
				obj.frame.setVisible(true);
				info.this.dispose();
				
			}
		});
		btnNewButton_4.setBounds(242, 276, 182, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Desktop\\images\\wild-animals-hd-wallpaper-download.jpg"));
		lblNewLabel.setBounds(-542, 0, 1196, 745);
		contentPane.add(lblNewLabel);
	}
}
