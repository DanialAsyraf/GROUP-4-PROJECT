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
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;

public class ShortVideoAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtTitle;
	private JTextField jtxtDate;
	private JTextField jtxtDesc;
	private JTable table;
	private JTextArea textArea;
	
	Genre g = new Genre();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShortVideoAdmin frame = new ShortVideoAdmin();
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
	public ShortVideoAdmin() {
		setType(Type.POPUP);
		setResizable(false);
		setTitle("Short Video Database");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 855, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 11, 433, 136);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Video Title");
		lblNewLabel.setBounds(10, 11, 65, 14);
		panel.add(lblNewLabel);
		
		jtxtTitle = new JTextField();
		jtxtTitle.setColumns(10);
		jtxtTitle.setBounds(143, 8, 261, 20);
		panel.add(jtxtTitle);
		
		jtxtDate = new JTextField();
		jtxtDate.setColumns(10);
		jtxtDate.setBounds(143, 39, 188, 20);
		panel.add(jtxtDate);
		
		JLabel lblNewLabel_1 = new JLabel("Date Released");
		lblNewLabel_1.setBounds(10, 45, 86, 14);
		panel.add(lblNewLabel_1);
		
		jtxtDesc = new JTextField();
		jtxtDesc.setColumns(10);
		jtxtDesc.setBounds(143, 70, 261, 20);
		panel.add(jtxtDesc);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setBounds(10, 76, 86, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		
		Genre g = new Genre();
		String[] gender = g.genreList;
		
		comboBox.setModel(new DefaultComboBoxModel(gender));

		comboBox.setBounds(143, 101, 116, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setBounds(10, 105, 46, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(10, 158, 826, 37);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				
				
				model.addRow(new Object[]{
						
						jtxtTitle.getText(),
						comboBox.getSelectedItem(),
						jtxtDate.getText(),
						jtxtDesc.getText(), 

				});
				
				if (table.getSelectedRow() == -1){
			           if (table.getRowCount() == 0){
			           JOptionPane.showMessageDialog(null, "Short Video Database System Update confirmed","Short Video Database System",
			                   JOptionPane.OK_OPTION);
			           }
			       }   
			}
			
		});
		btnNewButton.setBounds(6, 6, 101, 23);
		panel_1.add(btnNewButton);
		
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
		btnNewButton_3.setBounds(327, 6, 96, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(117, 6, 101, 23);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(228, 6, 92, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_10 = new JButton("Export Text");
		btnNewButton_10.setBounds(596, 7, 109, 20);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("Import File");
		btnNewButton_9.setBounds(715, 6, 101, 23);
		panel_1.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		            //lets write to file
		         
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
		                //fw.close();
		                
		            } catch (IOException ex) {
		            	JOptionPane.showMessageDialog(null, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
		            }
		            
		            
		        }
		        
			}
		});
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
		                
		              //loop for jtable rows
			               for(int i = 0; i < table.getRowCount(); i++){
			                   //loop for jtable column
			                   for(int j = 0; j < table.getColumnCount(); j++){
			                       bw.write(table.getModel().getValueAt(i, j)+" ");
			                   }
			                   bw.write("\n");
			               }
			               //close BufferedWriter
			               bw.close();
			               //close FileWriter 
			               fw.close();
			               JOptionPane.showMessageDialog(null, "Data Exported");
			               
			               }catch(Exception ex){
			                   ex.printStackTrace();
			               }
		            
		            
		        }
				
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtxtTitle.setText("");
				jtxtDate.setText("");
				jtxtDesc.setText("");
				comboBox.setSelectedItem("Select Genre");
			}
		});
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel(); 
				
				if (table.getSelectedRowCount() == 1) {
					String title = jtxtTitle.getText();
					String date = jtxtDate.getText();
					String desc = jtxtDesc.getText();
					String genre = (String) comboBox.getSelectedItem();
					
					model.setValueAt(title, table.getSelectedRow(), 0);
					model.setValueAt(date, table.getSelectedRow(), 2);
					model.setValueAt(desc, table.getSelectedRow(), 3);
					model.setValueAt(genre, table.getSelectedRow(), 1);
				}
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 206, 826, 165);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String tbName = model.getValueAt(table.getSelectedRow(), 0) .toString();
				String tbDate = model.getValueAt(table.getSelectedRow(), 2) .toString();
				//String tbCombo = model.getValueAt(table.getSelectedRow(), 2) .toString();
				String tbDesc = model.getValueAt(table.getSelectedRow(), 3) .toString();
				String tbCombo = model.getValueAt(table.getSelectedRow(), 1) .toString();
				
				jtxtTitle.setText(tbName);
				jtxtDate.setText(tbDate);
				comboBox.setSelectedItem(tbCombo);
				jtxtDesc.setText(tbDesc);
				
				textArea.setText(
						"Short Vdeo Info" +
						"\nTitle : " + tbName +
						"\nDate Released : " + tbDate +
						"\nGenre : "+ tbCombo + 
						"\nDescription : " + tbDesc);
			}
		});
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Video Title", "Genre", "Date Released" , "Description", 
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(84);
		scrollPane_1.setViewportView(table);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(453, 11, 383, 136);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(10, 382, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("Exit");
		btnNewButton_7.setBounds(747, 382, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null,"Are you sure to logout?", "Short Video Database System",
		        	JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					LoginForm LF = new LoginForm();
					LF.setVisible(true); //show SVM
					setVisible(false); //close view for main
				}
			}
		});
		btnNewButton_4.setBounds(648, 382, 89, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.exit();
			}
		});
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
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 433, 98);
	}
}
