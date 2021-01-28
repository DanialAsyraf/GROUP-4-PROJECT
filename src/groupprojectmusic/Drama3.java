package groupprojectmusic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.SystemColor;

public class Drama3 extends JFrame {

	private JPanel contentPane;
	
	private JTextField jtxtDramaName;
	private JTextField jtxtLanguage;
	private JTextField jtxtYearReleased;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drama3 frame = new Drama3();
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
	public Drama3() {
		setTitle("Drama Genre System");

		
		setBounds(100, 100, 699, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 51));
		panel.setLayout(null);
		panel.setBounds(10, 92, 670, 136);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Drama Name");
		lblNewLabel.setBounds(10, 11, 102, 14);
		panel.add(lblNewLabel);
		
		jtxtDramaName = new JTextField();
		jtxtDramaName.setColumns(10);
		jtxtDramaName.setBounds(143, 8, 194, 20);
		panel.add(jtxtDramaName);
		
		jtxtLanguage = new JTextField();
		jtxtLanguage.setColumns(10);
		jtxtLanguage.setBounds(480, 8, 128, 20);
		panel.add(jtxtLanguage);
		
		JLabel lblNewLabel_1 = new JLabel("Language");
		lblNewLabel_1.setBounds(384, 11, 86, 14);
		panel.add(lblNewLabel_1);
		
		jtxtYearReleased = new JTextField();
		jtxtYearReleased.setColumns(10);
		jtxtYearReleased.setBounds(480, 53, 128, 20);
		panel.add(jtxtYearReleased);
		
		JLabel lblNewLabel_2 = new JLabel("Year Released");
		lblNewLabel_2.setBounds(384, 56, 86, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-","Comedy", "Action","Romance"}));
		comboBox.setBounds(143, 52, 116, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setBounds(10, 56, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(20, 102, 92, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.setBounds(402, 102, 101, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(519, 102, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
		        if(table.getSelectedRow()==-1){
		            if(table.getRowCount()==0){

		                JOptionPane.showMessageDialog(null, "No data to delete ", 
		                        "Short Video Database System",JOptionPane.OK_OPTION);
		            }else{

		                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
		                        "Short Video Database System",JOptionPane.OK_OPTION);
		            }
		        }else{
		            model.removeRow(table.getSelectedRow());
		        }    
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						jtxtDramaName.getText(),
						comboBox.getSelectedItem(),
						jtxtLanguage.getText(),
						jtxtYearReleased.getText(), 
						
				});
				
				if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Drama Genre System Update confirmed","Drama Genre System",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			}
			
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtxtDramaName.setText("");
				jtxtLanguage.setText("");
				jtxtYearReleased.setText("");
				comboBox.setSelectedItem("Select Genre");
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(10, 502, 670, 108);
		contentPane.add(panel_1);
		
		JButton btnNewButton_7 = new JButton("Export CSV");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setDialogTitle("Specify a file save");
		        int userSelection = fileChooser.showSaveDialog(null);
		        if(userSelection == JFileChooser.APPROVE_OPTION){
		            File fileToSave = fileChooser.getSelectedFile();
		            //lets write to file
		         
		            try {
		                  FileWriter fw = new FileWriter(fileToSave + ".csv");
		                BufferedWriter bw = new BufferedWriter(fw);
		                
		                for(int i = 0; i < table.getRowCount(); i++){
			             
			                   for(int j = 0; j < table.getColumnCount(); j++){
			               
		                        bw.write(table.getValueAt(i, j).toString()+",");
		                    }
		                    bw.newLine();
		                }
		                JOptionPane.showMessageDialog(null, "Data Exported Succesfuly","Information",JOptionPane.INFORMATION_MESSAGE);
		                bw.close();
		                fw.close();
		            } catch (IOException ex) {
		               JOptionPane.showMessageDialog(null, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
		            }
		            
		            
		        }
			}
		});
		btnNewButton_7.setBounds(370, 6, 101, 23);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e1){
					System.err.format("No Printer found", e1.getMessage());
				}	
			}
		});
		btnNewButton_3.setBounds(564, 6, 96, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4_1 = new JButton("Exit");
		btnNewButton_4_1.setBackground(new Color(230, 230, 250));
		btnNewButton_4_1.setForeground(Color.RED);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		panel_1.add(btnNewButton_7);
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Drama3 frame = new Drama3();
		        //if (JOptionPane.showConfirmDialog(frmShortVideoDatabase,"Confirm if you want to exit", "Short Video Database System",
		        if (JOptionPane.showConfirmDialog(null,"Are You Sure Want to Exit?", "Drama Genre System",
		        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
		        	dispose(); //close short video
		        	
		       
		        }
			}
		});
		
		btnNewButton_4_1.setBounds(10, 55, 650, 42);
		panel_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_9 = new JButton("Import");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(196, 6, 96, 23);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Export Txt");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setDialogTitle("Specify a file save");
		        int userSelection = fileChooser.showSaveDialog(null);
		        if(userSelection == JFileChooser.APPROVE_OPTION){
		            File fileToSave = fileChooser.getSelectedFile();
		            //lets write to file
		         
		            try {
		                  FileWriter fw = new FileWriter(fileToSave + ".txt");
		                BufferedWriter bw = new BufferedWriter(fw);
		                
		              
			               for(int i = 0; i < table.getRowCount(); i++){
			                   
			                   for(int j = 0; j < table.getColumnCount(); j++){
			                       bw.write(table.getModel().getValueAt(i, j)+" ");
			                   }
			                
			                   bw.write("\n");
			               }
			              
			               bw.close();
			               
			               fw.close();
			               JOptionPane.showMessageDialog(null, "Data Exported");
			               
			               }catch(Exception ex){
			                   ex.printStackTrace();
			               }
		            
		            
		        }
				
			}
		});
		btnNewButton_10.setBounds(6, 6, 101, 23);
		panel_1.add(btnNewButton_10);
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setDialogTitle("Import File");
		        
		        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Text files" , "txt");
		       	fileChooser.setFileFilter(fileFilter);
		       
		        int userSelection = fileChooser.showOpenDialog(null);
		        
		
		        
		        if(userSelection == JFileChooser.APPROVE_OPTION){
		            File fileToImport = fileChooser.getSelectedFile();
		            
		         
		            try {
		     
		                BufferedReader br = new BufferedReader(new FileReader(fileToImport));
		                
		                Object[] tableLines = br.lines().toArray();
			            DefaultTableModel model = (DefaultTableModel)table.getModel();
		                
		                for(int i = 0; i < tableLines.length; i++)
			            {
			             
			            	
			            	String [] dataRow = tableLines[i].toString().split(" ");
			            	model.addRow(dataRow);
			            }
		                
		                JOptionPane.showMessageDialog(null, "Data Imported");
		                br.close();
		             
		            } catch (IOException ex) {
		            	JOptionPane.showMessageDialog(null, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
		            }
		            
		            
		        }
		        
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 239, 670, 252);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String tbName = model.getValueAt(table.getSelectedRow(), 0) .toString();
				String tbLanguage = model.getValueAt(table.getSelectedRow(), 2) .toString();
				//String tbCombo = model.getValueAt(table.getSelectedRow(), 2) .toString();
				String tbYear = model.getValueAt(table.getSelectedRow(), 3) .toString();
				String tbCombo = model.getValueAt(table.getSelectedRow(), 1) .toString();
				
				jtxtDramaName.setText(tbName);
				jtxtLanguage.setText(tbLanguage);
				comboBox.setSelectedItem(tbCombo);
				jtxtYearReleased.setText(tbYear);
				
			}
		});
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Drama Name", "Genre", "Language" , "Year Released", 
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane_1.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.info);
		panel_2.setBounds(0, 11, 671, 63);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_4 = new JLabel("DRAMA GENRE SYSTEM");
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 44));
		panel_2.add(lblNewLabel_4);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 433, 98);

	}
}