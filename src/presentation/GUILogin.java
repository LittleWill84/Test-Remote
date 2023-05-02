package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField tUser;
	private JPasswordField password;
	private JButton bLoguin;

	/**
	 * Create the frame.
	 */
	public GUILogin() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lUser = new JLabel("Usuario:");
		lUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lUser.setBounds(41, 36, 57, 17);
		contentPane.add(lUser);
		
		JLabel lPassword = new JLabel("Contraseña:");
		lPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lPassword.setBounds(41, 80, 91, 14);
		contentPane.add(lPassword);
		contentPane.add(getTUser());
		contentPane.add(getPassword());
		contentPane.add(getBLoguin());
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public JTextField getTUser() {
		
		if (tUser == null) {
			tUser = new JTextField();
			tUser.setBounds(144, 36, 86, 20);
			tUser.setColumns(10);
		}
		return tUser;
	}
	public JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(144, 79, 86, 20);
		}
		return password;
	}
	public JButton getBLoguin() {
		if (bLoguin == null) {
			bLoguin = new JButton("Ingresar");
			bLoguin.setBounds(141, 124, 89, 23);
		}
		return bLoguin;
	}
	
	public void showMessage(String message) {

		JOptionPane.showMessageDialog(null, message);
	}
}
