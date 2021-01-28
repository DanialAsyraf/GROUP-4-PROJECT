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

public class UserView extends JFrame {

	private JPanel contentPane;
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
					UserView frame = new UserView();
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
	public UserView() {
		setType(Type.POPUP);
		setResizable(false);
		setTitle("Short Video User View");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 754, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Genre g = new Genre();
		String[] gender = g.genreList;
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(501, 158, 228, 37);
		contentPane.add(panel_1);
		
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
		btnNewButton_3.setBounds(121, 6, 96, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_9 = new JButton("Import File");
		btnNewButton_9.setBounds(10, 6, 101, 23);
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 481, 394);
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
		textArea.setBounds(501, 13, 228, 136);
		contentPane.add(textArea);
		
		JButton btnNewButton_7 = new JButton("Exit");
		btnNewButton_7.setBounds(640, 382, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null,"Back to main menu?", "Short Video User View",
		        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					ShortVideoData SVM = new ShortVideoData();
					SVM.setVisible(true); //show SVM
					setVisible(false); //close view for main
				}
			}
		});
		btnNewButton.setBounds(541, 382, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.exit();
			}
		});
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 433, 98);
	}
}
