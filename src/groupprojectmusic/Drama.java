
package groupprojectmusic;




	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.Color;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.awt.Font;


	import javax.swing.border.EmptyBorder;
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
	import java.awt.SystemColor;


	public class Drama extends JFrame{
		
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
						Drama frame = new Drama();
						frame.DramaDatabase.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Drama() {
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
			panel.setBounds(10, 75, 641, 72);
			DramaDatabase.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Drama Name");
			lblNewLabel.setBounds(10, 11, 86, 14);
			panel.add(lblNewLabel);
			
			jtxtDramaName = new JTextField();
			jtxtDramaName.setBounds(106, 8, 224, 20);
			panel.add(jtxtDramaName);
			jtxtDramaName.setColumns(10);
			
			jtxtLanguage = new JTextField();
			jtxtLanguage.setBounds(496, 8, 133, 20);
			panel.add(jtxtLanguage);
			jtxtLanguage.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Language");
			lblNewLabel_1.setBounds(385, 11, 86, 14);
			panel.add(lblNewLabel_1);
			
			jtxtYear = new JTextField();
			jtxtYear.setBounds(496, 39, 133, 20);
			panel.add(jtxtYear);
			jtxtYear.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Year Released");
			lblNewLabel_2.setBounds(385, 42, 86, 14);
			panel.add(lblNewLabel_2);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "-", "Romance", "Comedy", "Action"}));
			comboBox.setBounds(106, 39, 116, 22);
			panel.add(comboBox);
			
			JLabel lblNewLabel_3 = new JLabel("Genre");
			lblNewLabel_3.setBounds(10, 45, 46, 14);
			panel.add(lblNewLabel_3);
			
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(250, 235, 215));
			panel_1.setForeground(Color.RED);
			panel_1.setBounds(10, 267, 641, 35);
			DramaDatabase.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JButton btnNewButton = new JButton("Add");
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
			btnNewButton.setBounds(6, 6, 116, 23);
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
			btnNewButton_1.setBounds(390, 6, 116, 23);
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
			btnNewButton_2.setBounds(535, 6, 96, 23);
			panel_1.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Save Data");
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_3.setBounds(157, 6, 116, 23);
			panel_1.add(btnNewButton_3);
			
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
			panel_2.setBounds(10, 312, 641, 56);
			DramaDatabase.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			
			JButton btnNewButton_5 = new JButton("Exit");
			btnNewButton_5.setForeground(Color.RED);
			btnNewButton_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 29));
			btnNewButton_5.setBounds(205, 11, 243, 34);
			panel_2.add(btnNewButton_5);
			
			JPanel panel_3 = new JPanel();
			panel_3.setForeground(SystemColor.activeCaptionBorder);
			panel_3.setBackground(SystemColor.info);
			panel_3.setBounds(10, 11, 641, 53);
			DramaDatabase.getContentPane().add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_4 = new JLabel("DRAMA GENRE SYSTEM");
			lblNewLabel_4.setForeground(SystemColor.textHighlight);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 28));
			lblNewLabel_4.setBounds(159, 11, 331, 42);
			panel_3.add(lblNewLabel_4);
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
