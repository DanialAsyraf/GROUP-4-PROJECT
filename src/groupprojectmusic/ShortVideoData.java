package groupprojectmusic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class ShortVideoData extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	
	Genre g = new Genre();
	
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
		setResizable(false);
		setTitle("Short Video Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 216);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 11, 109, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setBounds(10, 65, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				textArea.setText("Click to enter the User Portal");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.setText("Welcome to the Short Video Main Menu"
						+ "\nWhich one are you User or Admin?"
						+ "\n"
						+ "\nSelect the button for further action");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				UserView VW = new UserView();
				VW.setVisible(true); //show short video
				setVisible(false); //close view for main
			}
		});
		btnNewButton_1.setBounds(10, 11, 89, 23);
		panel.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 89, 9);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 99, 89, 9);
		panel.add(separator_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null,"Confirm if you want to exit", "Short Video Main Menu",
		        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.setText("Exit the program" 
						+ "\nBye!");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.setText("Welcome to the Short Video Main Menu"
						+ "\nWhich one are you User or Admin?"
						+ "\n"
						+ "\nSelect the button for further action");
			}
		});
		btnNewButton_2.setBounds(10, 119, 89, 23);
		panel.add(btnNewButton_2);
		
		textArea = new JTextArea();
		textArea.setBounds(129, 11, 246, 155);
		contentPane.add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LoginForm LF = new LoginForm();
				LF.setVisible(true); //show short video
				setVisible(false); //close view for main
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.setText("Click to Enter the Admin Portal");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.setText("Welcome to the Short Video Main Menu"
						+ "\nWhich one are you User or Admin?"
						+ "\n"
						+ "\nSelect the button for further action");
			}
		});
	}
}
