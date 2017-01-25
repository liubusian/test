package tw.com.lccnet.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tw.com.lccnet.Factory.DaoFactory;
import tw.com.lccnet.info.MemberDao;
import tw.com.lccnet.info.MemberDaoImpl;
import tw.com.lccnet.pojo.Member;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMember extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPassword;
	private JTextField txtAge;
	private JTextField txtAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setTitle("新增會員資料");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("姓名");
		label.setBounds(26, 28, 46, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("密碼");
		label_1.setBounds(26, 75, 46, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("年齡");
		label_2.setBounds(26, 122, 46, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("地址");
		label_3.setBounds(26, 167, 46, 15);
		contentPane.add(label_3);
		
		txtName = new JTextField();
		txtName.setBounds(90, 25, 188, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(90, 72, 188, 21);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(90, 119, 188, 21);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(90, 164, 188, 21);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JButton button = new JButton("新增");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Member m = new Member();
				
				m.setName(txtName.getText());
				m.setAge((short)Integer.parseInt(txtAge.getText()));
				m.setAddress(txtAddress.getText());
				m.setPassword(txtPassword.getText());
				
				MemberDao mDao = DaoFactory.GetMemberDao();
				
				mDao.AddMember(m);

				clearMethod();
			}
		});
		button.setBounds(39, 205, 87, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("清除");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearMethod();
			}

			
		});
		button_1.setBounds(176, 205, 87, 23);
		contentPane.add(button_1);
	}
	
	private void clearMethod() {
		txtName.setText("");
		txtAge.setText("");
		txtAddress.setText("");
		txtPassword.setText("");
	}
}
