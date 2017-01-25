package tw.com.lccnet.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("帳號");
		label.setBounds(21, 28, 46, 15);
		
		JLabel label_1 = new JLabel("密碼");
		label_1.setBounds(21, 68, 46, 15);
		
		JLabel label_2 = new JLabel("姓名");
		label_2.setBounds(21, 111, 46, 15);
		
		JLabel label_3 = new JLabel("郵件");
		label_3.setBounds(21, 154, 46, 15);
		
		JLabel label_4 = new JLabel("手機");
		label_4.setBounds(21, 197, 46, 15);
		
		JLabel label_5 = new JLabel("地址");
		label_5.setBounds(21, 240, 46, 15);
		
		textField = new JTextField();
		textField.setBounds(77, 22, 127, 21);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(78, 65, 127, 21);
		
		textField_1 = new JTextField();
		textField_1.setBounds(77, 108, 127, 21);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 194, 127, 21);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(77, 237, 127, 21);
		textField_3.setColumns(10);
		
		JButton button = new JButton("註冊");
		button.setBounds(82, 280, 87, 23);
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(label_4);
		contentPane.add(label_5);
		contentPane.add(textField);
		contentPane.add(passwordField);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 20, 536, 285);
		contentPane.add(scrollPane);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 151, 127, 21);
		contentPane.add(textField_4);
	}
}
