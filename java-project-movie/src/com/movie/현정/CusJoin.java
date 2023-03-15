package com.movie.현정;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JRadioButton;

public class CusJoin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusJoin frame = new CusJoin();
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
	public CusJoin() {
		setTitle("ITWILL CINEMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 192, 203));
		tabbedPane.addTab("로그인", null, panel_1, null);
		
		JLabel loginIdLB_1 = new JLabel("아이디");
		loginIdLB_1.setBounds(300, 240, 57, 15);
		panel_1.add(loginIdLB_1);
		
		JLabel loginPWLB_1 = new JLabel("패스워드");
		loginPWLB_1.setBounds(300, 299, 57, 15);
		panel_1.add(loginPWLB_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(397, 237, 116, 21);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(397, 296, 116, 21);
		panel_1.add(textField_3);
		
		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.setBounds(267, 375, 97, 23);
		panel_1.add(loginBtn_1);
		
		JButton cancelBtn_1 = new JButton("취소");
		cancelBtn_1.setBounds(424, 375, 97, 23);
		panel_1.add(cancelBtn_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CusJoin.class.getResource("/com/movie/현정/LOGO4.png")));
		lblNewLabel_1.setBounds(300, 45, 211, 167);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("회원가입", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CusJoin.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel.setBounds(0, 0, 75, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(70, 118, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setBounds(70, 176, 107, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setBounds(70, 220, 92, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NAME");
		lblNewLabel_5.setBounds(70, 286, 57, 15);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PHONE");
		lblNewLabel_6.setBounds(469, 121, 57, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("BIRTHDAY");
		lblNewLabel_7.setBounds(469, 176, 92, 15);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("GENDER");
		lblNewLabel_8.setBounds(469, 223, 57, 15);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("E-MAIL");
		lblNewLabel_9.setBounds(469, 286, 57, 15);
		panel.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(173, 115, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 173, 116, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(173, 217, 116, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(172, 283, 116, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(549, 118, 116, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(549, 170, 116, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(549, 280, 199, 21);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.setBounds(301, 114, 86, 23);
		panel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FEMALE");
		rdbtnNewRadioButton.setBounds(544, 216, 75, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MALE");
		rdbtnNewRadioButton_1.setBounds(627, 216, 66, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(70, 245, 219, 15);
		panel.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBounds(254, 358, 97, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("메인으로");
		btnNewButton_2.setBounds(445, 358, 97, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_11 = new JLabel("*");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setBounds(173, 136, 116, 15);
		panel.add(lblNewLabel_11);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("마이페이지", null, panel_2, null);
	}
}
