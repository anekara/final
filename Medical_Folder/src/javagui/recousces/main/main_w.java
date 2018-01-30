package javagui.recousces.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main_w extends JFrame {

	private JPanel contentPane;
	String priv;
	private JTextField txtOnoma;
	private JTextField txtEponumo;
	private JTextField txtHmer;
	private JTextField txtOmada;
	private JTextField txtPath;
	private JTextField txtAler;
	private JTextField txtTil;
	private JTextField txtEgr;
	private JTextField txtKod;
	private JTextField txtNotes;
	private String dik;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_w frame = new main_w();
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
	public main_w() {
		
		
		setTitle("\u0399\u03B1\u03C4\u03C1\u03B9\u03BA\u03AE \u039A\u03B1\u03C1\u03C4\u03AD\u03BB\u03B1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lonoma = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		lonoma.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lonoma.setBounds(24, 33, 63, 21);
		contentPane.add(lonoma);
		
		JLabel leponimo = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		leponimo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		leponimo.setBounds(24, 65, 75, 21);
		contentPane.add(leponimo);
		
		JLabel lhme = new JLabel("\u0397\u03BC. \u0393\u03AD\u03BD.:");
		lhme.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lhme.setBounds(24, 97, 75, 21);
		contentPane.add(lhme);
		
		JLabel lomad = new JLabel("\u039F\u03BC\u03AC\u03B4\u03B1 \u0391\u03AF\u03BC\u03B1\u03C4\u03BF\u03C2:");
		lomad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lomad.setBounds(24, 140, 130, 21);
		contentPane.add(lomad);
		
		JLabel lpathisi = new JLabel("\u03A0\u03AC\u03B8\u03B7\u03C3\u03B7:");
		lpathisi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lpathisi.setBounds(24, 190, 63, 21);
		contentPane.add(lpathisi);
		
		JLabel lalergies = new JLabel("\u0391\u03BB\u03BB\u03B5\u03C1\u03B3\u03AF\u03B5\u03C2:");
		lalergies.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lalergies.setBounds(24, 242, 85, 21);
		contentPane.add(lalergies);
		
		JLabel ltil = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		ltil.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ltil.setBounds(24, 290, 85, 21);
		contentPane.add(ltil);
		
		JLabel lhmegr = new JLabel("\u0397\u03BC\u03B5\u03C1. \u0395\u03B3\u03B3\u03C1. :");
		lhmegr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lhmegr.setBounds(24, 336, 104, 21);
		contentPane.add(lhmegr);
		
		JLabel lkodikos = new JLabel("\u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2:");
		lkodikos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lkodikos.setBounds(24, 386, 75, 21);
		contentPane.add(lkodikos);
		
		JLabel lnotes = new JLabel("\u03A3\u03B7\u03BC\u03B5\u03B9\u03CE\u03C3\u03B5\u03B9\u03C2:");
		lnotes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lnotes.setBounds(24, 434, 93, 21);
		contentPane.add(lnotes);
		
		txtOnoma = new JTextField();
		txtOnoma.setBounds(183, 33, 262, 21);
		contentPane.add(txtOnoma);
		txtOnoma.setColumns(10);
		
		txtEponumo = new JTextField();
		txtEponumo.setColumns(10);
		txtEponumo.setBounds(183, 68, 262, 21);
		contentPane.add(txtEponumo);
		
		txtHmer = new JTextField();
		txtHmer.setColumns(10);
		txtHmer.setBounds(183, 100, 262, 21);
		contentPane.add(txtHmer);
		
		txtOmada = new JTextField();
		txtOmada.setColumns(10);
		txtOmada.setBounds(183, 143, 262, 21);
		contentPane.add(txtOmada);
		
		txtPath = new JTextField();
		txtPath.setColumns(10);
		txtPath.setBounds(183, 193, 262, 21);
		contentPane.add(txtPath);
		
		txtAler = new JTextField();
		txtAler.setColumns(10);
		txtAler.setBounds(183, 245, 262, 21);
		contentPane.add(txtAler);
		
		txtTil = new JTextField();
		txtTil.setColumns(10);
		txtTil.setBounds(183, 293, 262, 21);
		contentPane.add(txtTil);
		
		txtEgr = new JTextField();
		txtEgr.setColumns(10);
		txtEgr.setBounds(183, 339, 262, 21);
		contentPane.add(txtEgr);
		
		txtKod = new JTextField();
		txtKod.setColumns(10);
		txtKod.setBounds(183, 389, 262, 21);
		contentPane.add(txtKod);
		
		txtNotes = new JTextField();
		txtNotes.setColumns(10);
		txtNotes.setBounds(183, 437, 480, 140);
		contentPane.add(txtNotes);
		
		final JButton btnKat = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		btnKat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String kwdikos= txtKod.getText();
				String onoma= txtOnoma.getText();	
				String eponimo=txtEponumo.getText();
				String hm_gen=txtHmer.getText();
				String om_aimatos=txtOmada.getText();
				String pathisi=txtPath.getText();
				String allergies=txtAler.getText();
				String tilephono=txtTil.getText();
				String hm_eggrafis=txtEgr.getText();
				String simioseis=txtNotes.getText();
				jdbc c = new jdbc();
				c.cnc();
				String query = "SELECT * FROM kartela WHERE kwdikos='"+kwdikos+"'";
				StatementImpl stmt = null;
				try {
					stmt = (StatementImpl) c.conn.createStatement();
				} catch (SQLException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			
				ResultSet rs = null;
				try {
					rs = stmt.executeQuery(query);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				try {
					while(rs.next())
					{
					    
					}
				
				rs.last();
			
				if(rs.getRow()<1){
					 query = "INSERT INTO kartela(kwdikos,onoma,eponimo,hm_gen,om_aimatos,pathisi,allergies,tilephono,hm_eggrafis,simioseis) " +
							"VALUES(?,?,?,?,?,?,?,?,?,?)";
				}
				else{
					query = "UPDATE kartela SET kwdikos=?,onoma=?,eponimo=?,hm_gen=?,om_aimatos=?,pathisi=?,allergies=?,tilephono=?,hm_eggrafis=?,simioseis=? WHERE kwdikos='"+kwdikos+"'"; 
								
				}
				
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				PreparedStatement prest = null;
				try {
					prest = (PreparedStatement) c.conn.prepareStatement(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            try {
				prest.setString(1, kwdikos);
	            prest.setString(2, onoma);
	            prest.setString(3, eponimo);
	            prest.setString(4, hm_gen);
	            prest.setString(5, om_aimatos);
	            prest.setString(6, pathisi);
	            prest.setString(7, allergies);
	            prest.setString(8, tilephono);
	            prest.setString(9, hm_eggrafis);
	            prest.setString(10, simioseis);
	           
	            
	            } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
				stmt = (StatementImpl) c.conn.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					prest.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog( contentPane, "Η καταχώρηση ολοκληρώθηκε!!!");
				txtKod.setText("");
				txtOnoma.setText("");
				txtEponumo.setText("");
				txtHmer.setText("");
				txtOmada.setText("");
				txtPath.setText("");
				txtAler.setText("");
				txtTil.setText("");
				txtEgr.setText("");
				txtNotes.setText("");
				
			}
			
		});
		
		btnKat.setBounds(183, 611, 117, 40);
		contentPane.add(btnKat);
		
		JButton btnRes = new JButton("\u039A\u03B1\u03B8\u03B1\u03C1\u03B9\u03C3\u03BC\u03CC\u03C2");
		btnRes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtKod.setText("");
				txtOnoma.setText("");
				txtEponumo.setText("");
				txtHmer.setText("");
				txtOmada.setText("");
				txtPath.setText("");
				txtAler.setText("");
				txtTil.setText("");
				txtEgr.setText("");
				txtNotes.setText("");
			}
		});
		btnRes.setBounds(310, 611, 104, 40);
		contentPane.add(btnRes);
		
		txtSearch = new JTextField();
		txtSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtSearch.setText("");
			}
			
		});
		txtSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7...");
		txtSearch.setBounds(197, 2, 147, 20);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String searchKey=txtSearch.getText();
				jdbc cc = new jdbc();
				cc.cnc();
				Statement stmt;
				try {
					stmt = cc.conn.createStatement();
				
				String query = "SELECT * FROM kartela WHERE kwdikos='"+searchKey+"'";
				ResultSet rs = stmt.executeQuery(query) ;
				
				
				while(rs.next())
				{
					txtOnoma.setText(rs.getString(2));
					txtEponumo.setText(rs.getString(3));
					txtHmer.setText(rs.getString(4));
					txtOmada.setText(rs.getString(5));
					txtPath.setText(rs.getString(6));
					txtAler.setText(rs.getString(7));
					txtTil.setText(rs.getString(8));
					txtEgr.setText(rs.getString(9));
					txtKod.setText(rs.getString(1));
					txtNotes.setText(rs.getString(10));
					
				    
				}
				rs.last();
				if(rs.getRow()<1){
					JOptionPane.showMessageDialog( contentPane, "Ο κωδικός που ζητήσατε δεν υπάρχει...");
				}
				cc.conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(356, 1, 89, 23);
		contentPane.add(btnSearch);
	}
	
	public void priv(String dik){
		
		
		if (dik.indexOf("gram") != -1){
			txtNotes.setEditable(false);
		}
		if (dik.indexOf("gia") != -1){			
			txtOnoma.setEditable(false);
			txtEponumo.setEditable(false);
			txtHmer.setEditable(false);
			txtOmada.setEditable(false);
			txtPath.setEditable(false);
			txtAler.setEditable(false);
			txtTil.setEditable(false);
			txtEgr.setEditable(false);
			txtKod.setEditable(false);
			
		}
		if (dik.indexOf("nos") != -1) {
			txtOnoma.setEditable(false);
			txtEponumo.setEditable(false);
			txtHmer.setEditable(false);
			txtOmada.setEditable(false);
			txtPath.setEditable(false);
			txtAler.setEditable(false);
			txtTil.setEditable(false);
			txtEgr.setEditable(false);
			txtKod.setEditable(false);
			txtNotes.setEditable(false);
		}
		
		
	}
}
