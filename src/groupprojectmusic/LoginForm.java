package groupprojectmusic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField passwordField;
	
	Genre g = new Genre();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Admin Login ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 219);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 310, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(0, 14, 89, 14);
		panel.add(lblNewLabel_1);
		
		textUser = new JTextField();
		textUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
					
					String password = passwordField.getText();
					String username = textUser.getText();
					
					if (password.contains("admin") && username.contains("admin")) {
						passwordField.setText(null);
						textUser.setText(null);
						ShortVideoAdmin SVD = new ShortVideoAdmin();
						SVD.setVisible(true); //show SVM
						setVisible(false); //close view for main
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
						passwordField.setText(null);
						textUser.setText(null);
					}
					
				}
			}
		});
		textUser.setBounds(72, 11, 238, 20);
		panel.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(0, 48, 89, 14);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
					
					String password = passwordField.getText();
					String username = textUser.getText();
					
					if (password.contains("admin") && username.contains("admin")) {
						passwordField.setText(null);
						textUser.setText(null);
						ShortVideoAdmin SVD = new ShortVideoAdmin();
						SVD.setVisible(true); //show SVM
						setVisible(false); //close view for main
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
						passwordField.setText(null);
						textUser.setText(null);
					}
					
				}
			}
		});
		passwordField.setBounds(72, 45, 238, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String password = passwordField.getText();
				String username = textUser.getText();
				
				if (password.contains("admin") && username.contains("admin")) {
					passwordField.setText(null);
					textUser.setText(null);
					ShortVideoAdmin SVD = new ShortVideoAdmin();
					SVD.setVisible(true); //show SVM
					setVisible(false); //close view for main
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					textUser.setText(null);
				}
				
			}
		});
		btnNewButton.setBounds(10, 99, 310, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShortVideoData SVM = new ShortVideoData();
				SVM.setVisible(true); //show SVM
				setVisible(false); //close view for main
			}
		});
		btnNewButton_1.setBounds(10, 143, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null,"Confirm if you want to exit", "SV Admin Login",
		        		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setBounds(233, 143, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
