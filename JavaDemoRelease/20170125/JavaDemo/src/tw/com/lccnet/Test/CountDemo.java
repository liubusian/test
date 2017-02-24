package tw.com.lccnet.Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CountDemo extends JFrame {

	private JPanel contentPane;
	private JTextField aNum;
	private JTextField bNum;
	private JTextField cNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountDemo frame = new CountDemo();
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
	public CountDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		aNum = new JTextField();
		aNum.setBounds(65, 46, 96, 21);
		contentPane.add(aNum);
		aNum.setColumns(10);
		
		bNum = new JTextField();
		bNum.setColumns(10);
		bNum.setBounds(65, 92, 96, 21);
		contentPane.add(bNum);
		
		cNum = new JTextField();
		cNum.setColumns(10);
		cNum.setBounds(65, 146, 96, 21);
		contentPane.add(cNum);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count(Integer.parseInt(aNum.getText()), Integer.parseInt(bNum.getText()), Integer.parseInt(cNum.getText()));
			}
		});
		btnNewButton.setBounds(261, 173, 87, 23);
		contentPane.add(btnNewButton);
	}
	
	public void count(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
