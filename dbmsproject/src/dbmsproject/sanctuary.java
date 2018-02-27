package dbmsproject;

import java.awt.EventQueue;


import javax.swing.ImageIcon; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class sanctuary {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sanctuary window = new sanctuary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sanctuary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("The Continued existence of Wildlife ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 107, 279, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Journey To \r\nThe Best\r\n\r\n\r\n Wildlife Sanctuary");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBackground(new Color(230, 230, 250));
		lblNewLabel.setBounds(0, -50, 460, 130);
		frame.getContentPane().add(lblNewLabel);
	
		JButton btnNewButton = new JButton("Explore");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			info obj=new info();
			obj.setVisible(true);
			frame.dispose();
	
			}
		});
		btnNewButton.setBounds(226, 330, 169, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("and Wilderness is important");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2.setBounds(33, 144, 250, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" to the quality of life of HUMANS!!!");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_3.setBounds(23, 175, 284, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(226, 369, 169, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label.setBackground(SystemColor.control);
	
		label.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Downloads\\deer-hd-desktop-wallpaper-1366x768.jpg"));
		label.setBounds(-276, 0, 943, 403);
		frame.getContentPane().add(label);
	}
}
