package dbmsproject;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class faunalinfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					faunalinfo frame = new faunalinfo();
					frame.setVisible(true);
				} catch (Exception e) {JOptionPane.showMessageDialog(null,e);
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public faunalinfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClickToLoad = new JButton("Click to load");
		btnClickToLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try{
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
				    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kalyan12#");
				     String sql="select * from faunalcategories";
				     PreparedStatement st=con.prepareStatement(sql);
				     ResultSet rs=st.executeQuery();
				     table.setModel(DbUtils.resultSetToTableModel(rs));
				      con.close();}
				
				catch(Exception e)
				{JOptionPane.showMessageDialog(null,e);}
				 
			}
		});
		btnClickToLoad.setBounds(234, 11, 179, 23);
		contentPane.add(btnClickToLoad);
		
		JButton button = new JButton("<-- Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				visitorin obj=new visitorin();
				obj.setVisible(true);
				faunalinfo.this.dispose();
			}
		});
		button.setBounds(251, 377, 89, 23);
		contentPane.add(button);
		
		JButton btnClickHereFor = new JButton("Click Here For Catogorized View");
		btnClickHereFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try{
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
					    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kalyan12#");
					     String sql="select * from carnivorous";
					     String sqll="select * from Herbivorous";
					     String sqlll="select * from Venomous";
					     String sqllll="select * from Rare";
					     PreparedStatement st=con.prepareStatement(sql);
					     PreparedStatement stm=con.prepareStatement(sqll);
					     PreparedStatement s=con.prepareStatement(sqlll);
					     PreparedStatement stmt=con.prepareStatement(sqllll);
					     ResultSet rs=st.executeQuery();
					     ResultSet r=stm.executeQuery();
					     ResultSet rse=s.executeQuery();
					     ResultSet re=stmt.executeQuery();
					     table_1.setModel(DbUtils.resultSetToTableModel(rs));
					     table_2.setModel(DbUtils.resultSetToTableModel(r));
					     table_3.setModel(DbUtils.resultSetToTableModel(rse));
					     table_4.setModel(DbUtils.resultSetToTableModel(re));
					      con.close();}
					
					catch(Exception el)
					{JOptionPane.showMessageDialog(null,el);}
			}
		});
		btnClickHereFor.setBounds(202, 191, 237, 23);
		contentPane.add(btnClickHereFor);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kalyanaraman\\Desktop\\images\\african-safaris.jpg"));
		lblNewLabel.setBounds(-332, -98, 938, 514);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 47, 566, 133);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 225, 136, 133);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(156, 225, 151, 139);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(317, 227, 125, 139);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(452, 225, 128, 139);
		contentPane.add(scrollPane_4);
		
		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);
	}
}
