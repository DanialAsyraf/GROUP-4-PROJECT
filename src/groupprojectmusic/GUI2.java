package groupprojectmusic;


/**MUHAMMAD HAFIZ BIN SUKHRI
 * 275414
 */

import java.awt.EventQueue;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI2 extends javax.swing.JFrame{

	
	
	
	
	private JFrame DramaDatabase;
	private JTextField jtxtDramaName;
	private JTextField jtxtLanguage;
	private JTextField jtxtYear;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2();
					window.DramaDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DramaDatabase = new JFrame();
		DramaDatabase.getContentPane().setBackground(new Color(240, 255, 240));
		DramaDatabase.setTitle("Drama Genre System");
		DramaDatabase.setBounds(100, 100, 677, 407);
		DramaDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DramaDatabase.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setBounds(10, 11, 641, 136);
		DramaDatabase.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Drama Name");
		lblNewLabel.setBounds(10, 11, 86, 14);
		panel.add(lblNewLabel);
		
		jtxtDramaName = new JTextField();
		jtxtDramaName.setBounds(168, 8, 224, 20);
		panel.add(jtxtDramaName);
		jtxtDramaName.setColumns(10);
		
		jtxtLanguage = new JTextField();
		jtxtLanguage.setBounds(168, 39, 167, 20);
		panel.add(jtxtLanguage);
		jtxtLanguage.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Language");
		lblNewLabel_1.setBounds(10, 45, 86, 14);
		panel.add(lblNewLabel_1);
		
		jtxtYear = new JTextField();
		jtxtYear.setBounds(168, 73, 133, 20);
		panel.add(jtxtYear);
		jtxtYear.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year Released");
		lblNewLabel_2.setBounds(10, 76, 86, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "-", "Romance", "Comedy", "Action"}));
		comboBox.setBounds(169, 101, 116, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setBounds(10, 105, 46, 14);
		panel.add(lblNewLabel_3);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(10, 267, 641, 35);
		DramaDatabase.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						jtxtDramaName.getText(),
						comboBox.getSelectedItem(),
						jtxtLanguage.getText(),
						jtxtYear.getText(), 
						
				});
				
		
			}
			
		});
		btnNewButton.setBounds(6, 6, 101, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtxtDramaName.setText("");
				jtxtLanguage.setText("");
				jtxtYear.setText("");
				comboBox.setSelectedItem("Select Genre");
			
			}
		});
		btnNewButton_1.setBounds(282, 6, 101, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Error",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", "Error"
		                        ,JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }    
				
			}
		});
		btnNewButton_2.setBounds(543, 6, 88, 23);
		panel_1.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 158, 641, 98);
		DramaDatabase.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Drama Name", "Genre", "Language" , "Year Released", 
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 312, 641, 45);
		DramaDatabase.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 29));
		btnNewButton_5.setBounds(211, 11, 243, 34);
		panel_2.add(btnNewButton_5);
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DramaDatabase =new JFrame();
		        if (JOptionPane.showConfirmDialog(DramaDatabase,"Are You sure want to exit?","Confirmation",
		              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
		            System.exit(0);
		        }
			}
		});
	}
}
