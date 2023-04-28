import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Bookrental extends JFrame implements ActionListener {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=61,19
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("BOOKRENTAL ADVANCE");
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JButton btnNewButton,btnNewButton1 ;
	private JLabel lblNewLabel_1, lblNewLabel_1_1, lblNewLabel_2;
	private JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookrental frame = new Bookrental();
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
	public Bookrental() {
		setBackground(Color.WHITE);
		setTitle("BOOKRENTAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(64, 239, 102, 35);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);

		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT - JAVATPoint");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(33, 25, 501, 46);
		contentPane.add(lblNewLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(43, 174, 273, 35);
		contentPane.add(passwordField_1);
		
		textField = new JTextField();
		textField.setBounds(43, 105, 273, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Admin Login");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(404, 239, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Librarian Login");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(404, 213, 130, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(53, 151, 142, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(53, 83, 142, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(359, 151, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if (rdbtnNewRadioButton.isSelected()) {
			if (textField.getText().equals("Admin_01") && passwordField_1.getText().equals("AdminOne")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (textField.getText().equals("Admin_02") && passwordField_1.getText().equals("AdminTwo")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (textField.getText().equals("Admin_03") && passwordField_1.getText().equals("AdminThree")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
				lblNewLabel_2.setText("Invalid USER and PASS");
		}
		if (rdbtnNewRadioButton_1.isSelected()) {
			if (textField.getText().equals("Librarian_01") && passwordField_1.getText().equals("LibOne")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success Librarian", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (textField.getText().equals("Librarian_02") && passwordField_1.getText().equals("LibTwo")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success Librarian", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (textField.getText().equals("Librarian_03") && passwordField_1.getText().equals("LibThree")) {
				JOptionPane.showMessageDialog(getContentPane(), "LOGIN Success Librarian", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
				lblNewLabel_2.setText("Invalid USER and PASS");
		}
		
		
	}
}
