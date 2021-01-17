package groupprojectmusic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class ShortVideoData extends JFrame {

	private JPanel contentPane;
	
	private JTextField jtxtTitle;
	private JTextField jtxtDate;
	private JTextField jtxtDesc;
	private JTable table;
	private JTextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShortVideoData frame = new ShortVideoData();
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
	public ShortVideoData() {
		setTitle("Short Video Database");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 907, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		jtxtDate.setBounds(143, 39, 116, 20);
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Genre", "Animation", "Comedy", "Cartoon", "Drama" ,"Documentary", "Thriller"}));
		comboBox.setBounds(143, 101, 116, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setBounds(10, 105, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(322, 101, 101, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtxtTitle.setText("");
				jtxtDate.setText("");
				jtxtDesc.setText("");
				comboBox.setSelectedItem("Select Genre");
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(10, 158, 433, 73);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				/*
				String tbName = model.getValueAt(table.getSelectedRow(), 0) .toString();
				String tbDate = model.getValueAt(table.getSelectedRow(), 0) .toString();
				String tbDesc = model.getValueAt(table.getSelectedRow(), 0) .toString();
				jtxtTitle.setText(tbName);
				jtxtDate.setText(tbDate);
				jtxtDesc.setText(tbDesc);
				*/
				
				//String tbName = model.getValueAt(table.getSelectedRow(), 0) .toString();
				
				/*
				jtxtTitle.setText(),
				comboBox.getSelectedItem(),
				jtxtDate.getText(),
				jtxtDesc.getText(), */
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
		
		JButton btnNewButton_2 = new JButton("Delete");
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
		
		btnNewButton_2.setBounds(228, 6, 97, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("Export Text");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				try{
	                //the file path
	               File file = new File("C:\\Users\\User\\Desktop\\Lol.txt"); //change dir for file
	               //if the file not exist create one
	               if(!file.exists()){
	                   file.createNewFile();
	               }
	               
	               FileWriter fw = new FileWriter(file.getAbsoluteFile());
	               BufferedWriter bw = new BufferedWriter(fw);
	               
	               //loop for jtable rows
	               for(int i = 0; i < table.getRowCount(); i++){
	                   //loop for jtable column
	                   for(int j = 0; j < table.getColumnCount(); j++){
	                       bw.write(table.getModel().getValueAt(i, j)+" ");
	                   }
	                   //break line at the begin 
	                   //break line at the end 
	                   //bw.write("\n_________\n");
	                   bw.write("\n\n");
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
		});
		btnNewButton_6.setBounds(6, 39, 101, 23);
		panel_1.add(btnNewButton_6);
		
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
			                   //loop for jtable column
			                   for(int j = 0; j < table.getColumnCount(); j++){
			                       //bw.write(table.getModel().getValueAt(i, j)+" ");
		                //for (int i = 0; table.getRowCount(); i++) {
		                    //for (int j = 0; table.getColumnCount(); j++) {
		                        //write
		                        bw.write(table.getValueAt(i, j).toString()+",");
		                    }
		                    bw.newLine();//record per line 
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
		btnNewButton_7.setBounds(117, 39, 101, 23);
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_3 = new JButton("Print");
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
		btnNewButton_3.setBounds(335, 6, 88, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4_1 = new JButton("Menu");
		panel_1.add(btnNewButton_7);
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShortVideoData frame = new ShortVideoData();
		        //if (JOptionPane.showConfirmDialog(frmShortVideoDatabase,"Confirm if you want to exit", "Short Video Database System",
		        if (JOptionPane.showConfirmDialog(null,"Confirm if you want to exit", "Short Video Database System",
		        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
		        	dispose(); //close short video
		        	
		        	MainFrame mf = new MainFrame();
		        	mf.setVisible(true); //show main frame class
		        }
			}
		});
		
		btnNewButton_4_1.setBounds(334, 39, 89, 23);
		panel_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4 = new JButton("Info");
		btnNewButton_4.setBounds(228, 39, 97, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.setBounds(117, 6, 101, 23);
		panel_1.add(btnNewButton_5);
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
				
				
				
				//String tbName = model.getValueAt(table.getSelectedRow(), 0) .toString();
				
				//jtxtTitle.setText(tbName);
				/*
				jtxtTitle.getText(),
				comboBox.getSelectedItem(),
				jtxtDate.getText(),
				jtxtDesc.getText(), */
				
			}
		});
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Export File"
						+ "\n1. Export Text will save in format .txt file on desktop. " 
						+ "\n2. Export CSV will save in format .CSV \n "
						);
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(453, 11, 433, 370);
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
				
				//textField.setText(" " + tbCombo + tbName + tbDesc + tbDate);
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
		textArea.setBounds(10, 242, 433, 139);
		contentPane.add(textArea);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 433, 98);
		//frmShortVideoDatabase.getContentPane().add(scrollPane);
		
		/*
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Video Title", "Genre", "Date Released" , "Description", 
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(84);
			scrollPane.setViewportView(table);
		scrollPane.setColumnHeaderView(table);
		*/
	}
}
