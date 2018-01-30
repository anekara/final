package javagui.recousces.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JPasswordField;

public class login extends JFrame {
	private JPasswordField txtPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lUser = new JLabel("USER:");
		lUser.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lUser.setBounds(93, 75, 53, 23);
		getContentPane().add(lUser);
		
		JLabel lPassword = new JLabel("PASSWORD:");
		lPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lPassword.setBounds(41, 128, 105, 28);
		getContentPane().add(lPassword);
		
		final JTextField txtUser= new JTextField();
		txtUser.setBounds(156, 77, 131, 27);
		getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		final JLabel lmesg = new JLabel("");
		lmesg.setForeground(Color.RED);
		lmesg.setBounds(96, 24, 246, 28);
		getContentPane().add(lmesg);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				checkLogin check = new checkLogin(txtUser.getText(), txtPass.getText());
				
				try {
					String a=check.check();
						if(a!="0"){
							setVisible(false);
							main_w m = new main_w();
							
							m.setVisible(true);
							m.priv(a);
						}							
						else
							lmesg.setText("Το username ή ο κωδικός είναι λάθος");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(168, 193, 89, 23);
		getContentPane().add(btnLogin);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(156, 128, 131, 23);
		getContentPane().add(txtPass);
		
		
	}
}
