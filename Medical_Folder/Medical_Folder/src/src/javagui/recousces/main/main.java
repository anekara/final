package javagui.recousces.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		/* vash */
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
	 * @return 
	 */
	
	public main() {
		setTitle("\u0399\u0391\u03A4\u03A1\u0399\u039A\u039F\u03A3 \u03A6\u0391\u039A\u0395\u039B\u039F\u03A3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 747);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("exit");
		mnFile.add(mntmExit);		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		
		JPanel paneldata = new JPanel();
		paneldata.setBounds(0, 0, 736, 454);
		desktopPane.add(paneldata);
		
		JLabel lblOnoma = new JLabel("ONOMA:");
		
		JLabel label = new JLabel("\u0395\u03A0\u03A9\u039D\u03A5\u039C\u039F:");
		
		JLabel label_1 = new JLabel("\u0397\u039C/\u0393\u0395\u039D\u039D\u0397\u03A3\u0397\u03A3:");
		
		JLabel label_2 = new JLabel("\u039F\u039C\u0391\u0394\u0391 \u0391\u0399\u039C\u0391\u03A4\u039F\u03A3:");
		
		JLabel label_3 = new JLabel("\u03A0\u0391\u0398\u0397\u03A3\u0397:");
		
		JLabel label_4 = new JLabel("\u0391\u039B\u039B\u0395\u03A1\u0393\u0399\u0395\u03A3:");
		
		JLabel lblNewLabel = new JLabel("\u03A4\u0397\u039B/\u0395\u03A0\u0399\u039A\u039F\u0399\u039D\u03A9\u039D\u0399\u0391\u03A3:");
		
		JLabel lblNewLabel_1 = new JLabel("\u0397\u039C/\u0395\u0393\u0393\u03A1\u0391\u03A6\u0397\u03A3:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lbloy = new JLabel("\u039A\u03A9\u0394\u0399\u039A\u039F\u03A3 \u0391\u03A3\u0398\u0395\u039DOY\u03A3:");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNotes = new JLabel("Notes :");
		GroupLayout gl_paneldata = new GroupLayout(paneldata);
		gl_paneldata.setHorizontalGroup(
			gl_paneldata.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_paneldata.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(label_3)
							.addGap(31)
							.addComponent(textField_4, 483, 483, 483))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(label_4)
							.addGap(18)
							.addComponent(textField_5, 483, 483, 483))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOnoma)
								.addComponent(label)
								.addComponent(label_1))
							.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_paneldata.createSequentialGroup()
									.addGap(18)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_paneldata.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, 481, 481, 481)))))
						.addGroup(gl_paneldata.createSequentialGroup()
							.addComponent(lbloy)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_paneldata.createSequentialGroup()
							.addComponent(lblNotes)
							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_paneldata.setVerticalGroup(
			gl_paneldata.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_paneldata.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
						.addComponent(lblOnoma)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_paneldata.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbloy)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_paneldata.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_paneldata.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_paneldata.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNotes)
							.addContainerGap())))
		);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setViewportView(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		paneldata.setLayout(gl_paneldata);
		
		JPanel panelbutton = new JPanel();
		panelbutton.setBackground(SystemColor.menu);
		panelbutton.setForeground(Color.BLACK);
		panelbutton.setBounds(0, 453, 736, 104);
		desktopPane.add(panelbutton);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setIcon(new ImageIcon(main.class.getResource("/javagui/recousces/main/ok.gif")));
		btnAccept.setToolTipText("ACCEPT");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panelbutton.add(btnAccept);
		
		JButton btnCancel = new JButton("Delete");
		btnCancel.setIcon(new ImageIcon(main.class.getResource("/javagui/recousces/main/erase.gif")));
		panelbutton.add(btnCancel);
		
		JButton btnNea = new JButton("NEA \u0395\u0393\u0393\u03A1\u0391\u03A6\u0397");
		btnNea.setEnabled(false);
		btnNea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnNea);
		contentPane.setLayout(gl_contentPane);
	}
	
	
}
