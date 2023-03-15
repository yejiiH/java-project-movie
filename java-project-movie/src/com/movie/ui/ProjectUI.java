package com.movie.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.movie.dao.PriceInfoDao;
import com.movie.dto.Customer;
import com.movie.dto.Payment;
import com.movie.dto.PriceInfo;
import com.movie.dto.Seat;
import com.movie.service.CusService;
import com.movie.service.MovieService;
import com.movie.service.PaymentService;
import com.movie.service.SeatService;
import com.movie.성민.PaymentSelect;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class ProjectUI extends JFrame {

	private JPanel contentPane;
	private JTextField loginIdTextField;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField phoneTextField;
	private JTextField birthTextField;
	private JTextField emailTextField;
	private JPanel seatSelectPanel;

	MovieService movieService = new MovieService();
	CusService cusService = new CusService();
	PaymentSelect paymentSelect = new PaymentSelect();
	PriceInfoDao priceInfoDao = new PriceInfoDao();

	private Customer loginCus = null;
	private int PayCount = 3;
	private String hall_name = "";
	private String gender = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectUI frame = new ProjectUI();
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
	public ProjectUI() {
		setFont(new Font("바탕체", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.setBackground(Color.WHITE);
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);

		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.WHITE);
		mainTabbedPane.addTab("예매 홈", null, homePanel, null);
		homePanel.setLayout(null);

		JButton movie1Btn = new JButton("예매하기");
		movie1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login == 20) {
					mainTabbedPane.setSelectedIndex(2);
					movieTabbedPane.setSelectedIndex(0);
				} else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다");
					
				}
			}
		});
		movie1Btn.setBounds(42, 360, 97, 23);
		homePanel.add(movie1Btn);

		JButton movie2Btn = new JButton("예매하기");
		movie2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login == 20) {
					mainTabbedPane.setSelectedIndex(2);
					movieTabbedPane.setSelectedIndex(1);
				} else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다");
					
				}
			}
		});
		movie2Btn.setBounds(187, 360, 97, 23);
		homePanel.add(movie2Btn);

		JButton movie3Btn = new JButton("예매하기");
		movie3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login == 20) {
					mainTabbedPane.setSelectedIndex(2);
					movieTabbedPane.setSelectedIndex(2);
				} else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다");
					
				}
			}
		});
		movie3Btn.setBounds(340, 360, 97, 23);
		homePanel.add(movie3Btn);

		JButton movie4Btn = new JButton("예매하기");
		movie4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login == 20) {
					mainTabbedPane.setSelectedIndex(2);
					movieTabbedPane.setSelectedIndex(3);
				} else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다");
					
				}
			}
		});
		movie4Btn.setBounds(489, 360, 97, 23);
		homePanel.add(movie4Btn);

		JButton movie5Btn = new JButton("예매하기");
		movie5Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (login == 20) {
					mainTabbedPane.setSelectedIndex(2);
					movieTabbedPane.setSelectedIndex(4);
				} else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다");
					
				}
			}
		});
		movie5Btn.setBounds(645, 360, 97, 23);
		homePanel.add(movie5Btn);

		loginBtn = new JButton("login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					mainTabbedPane.setSelectedIndex(1);
					cusTabbedPane.setSelectedIndex(1);
				
			}
		});
		loginBtn.setBounds(599, 21, 73, 32);
		homePanel.add(loginBtn);

		joinBtn = new JButton("join");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(0);
			}
		});
		joinBtn.setBounds(515, 21, 73, 32);
		homePanel.add(joinBtn);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie2.jpg")));
		lblNewLabel.setBounds(183, 85, 122, 190);
		homePanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie3.jpg")));
		lblNewLabel_1.setBounds(333, 98, 122, 165);
		homePanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie4.jpg")));
		lblNewLabel_2.setBounds(489, 98, 110, 165);
		homePanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie5.jpg")));
		lblNewLabel_3.setBounds(632, 101, 110, 157);
		homePanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/movie1.jpg")));
		lblNewLabel_4.setBounds(37, 96, 134, 171);
		homePanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_5.setBounds(27, 10, 129, 65);
		homePanel.add(lblNewLabel_5);

		myPageBtn = new JButton("MyPage");
		myPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(2);
				try {

					cusNameTF.setText(loginCus.getCus_name());
					cusNicknameTF.setText(loginCus.getCus_nickname());
					cusEmailTF.setText(loginCus.getCus_email());
					cusBrithTF.setText(loginCus.getCus_birthday() + "");
					cusPhoneTF.setText(loginCus.getCus_phone());

					cusResTF.setText(paymentSelect.selectByID(loginCus.getCus_id()));

				} catch (Exception e1) {

				}

			}
		});
		myPageBtn.setBounds(680, 21, 97, 32);
		homePanel.add(myPageBtn);

		JLabel lblNewLabel_11 = new JLabel("탑건-매버릭");
		lblNewLabel_11.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_11.setBounds(47, 276, 97, 20);
		homePanel.add(lblNewLabel_11);

		JLabel lblNewLabel_28 = new JLabel("토르 - 러브 앤 썬더");
		lblNewLabel_28.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_28.setBounds(175, 271, 143, 28);
		homePanel.add(lblNewLabel_28);

		JLabel lblNewLabel_29 = new JLabel("헤어질 결심");
		lblNewLabel_29.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_29.setBounds(351, 270, 108, 32);
		homePanel.add(lblNewLabel_29);

		JLabel lblNewLabel_30 = new JLabel("마녀");
		lblNewLabel_30.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_30.setBounds(524, 268, 81, 36);
		homePanel.add(lblNewLabel_30);

		JLabel lblNewLabel_31 = new JLabel("범죄도시2");
		lblNewLabel_31.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_31.setBounds(651, 272, 115, 25);
		homePanel.add(lblNewLabel_31);

		JLabel movie1time = new JLabel("");
		movie1time.setBounds(50, 294, 111, 56);
		homePanel.add(movie1time);
		try {
			movie1time.setText("<html>" + movieService.findBymoviehall("1회차").getM_Start_Time() + "<p>~ "
					+ movieService.findBymoviehall("1회차").getM_End_Time());
		} catch (Exception e3) {
		}

		JLabel movie2time = new JLabel("");
		movie2time.setBounds(204, 294, 111, 56);
		homePanel.add(movie2time);
		try {
			movie2time.setText("<html>" + movieService.findBymoviehall("2회차").getM_Start_Time() + "<p>~ "
					+ movieService.findBymoviehall("2회차").getM_End_Time());
		} catch (Exception e3) {
		}

		JLabel movie3time = new JLabel("");
		movie3time.setBounds(351, 297, 111, 56);
		homePanel.add(movie3time);
		try {
			movie3time.setText("<html>" + movieService.findBymoviehall("3회차").getM_Start_Time() + "<p>~ "
					+ movieService.findBymoviehall("3회차").getM_End_Time());
		} catch (Exception e3) {
		}

		JLabel movie4time = new JLabel("");
		movie4time.setBounds(490, 296, 111, 56);
		homePanel.add(movie4time);
		try {
			movie4time.setText("<html>" + movieService.findBymoviehall("4회차").getM_Start_Time() + "<p>~ "
					+ movieService.findBymoviehall("4회차").getM_End_Time());
		} catch (Exception e3) {
		}

		JLabel movie5time = new JLabel("");
		movie5time.setBounds(645, 297, 111, 56);
		homePanel.add(movie5time);
		try {
			movie5time.setText("<html>" + movieService.findBymoviehall("5회차").getM_Start_Time() + "<p>~ "
					+ movieService.findBymoviehall("5회차").getM_End_Time());

		} catch (Exception e3) {
		}
		reaminseat1 = new JLabel("");
		reaminseat1.setBounds(42, 388, 102, 31);
		homePanel.add(reaminseat1);

		reaminseat2 = new JLabel("");
		reaminseat2.setBounds(189, 388, 102, 31);
		homePanel.add(reaminseat2);

		reaminseat3 = new JLabel("");
		reaminseat3.setBounds(347, 389, 102, 31);
		homePanel.add(reaminseat3);

		reaminseat4 = new JLabel("");
		reaminseat4.setBounds(497, 389, 102, 31);
		homePanel.add(reaminseat4);

		reaminseat5 = new JLabel("");
		reaminseat5.setBounds(649, 388, 102, 31);
		homePanel.add(reaminseat5);

		JPanel cusPanel = new JPanel();
		mainTabbedPane.addTab("회원페이지", null, cusPanel, null);
		cusPanel.setLayout(new BorderLayout(0, 0));

		JPanel myPanel_1 = new JPanel();
		myPanel_1.setLayout(null);
		myPanel_1.setBackground(Color.WHITE);
		cusPanel.add(myPanel_1, BorderLayout.NORTH);

		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(12, 10, 73, 52);
		myPanel_1.add(lblNewLabel_17);

		JLabel lblNewLabel_32 = new JLabel("이름");
		lblNewLabel_32.setBounds(173, 86, 57, 15);
		myPanel_1.add(lblNewLabel_32);

		JLabel lblNewLabel_33 = new JLabel("닉네임");
		lblNewLabel_33.setBounds(173, 129, 57, 15);
		myPanel_1.add(lblNewLabel_33);

		JLabel lblNewLabel_34 = new JLabel("생년월일");
		lblNewLabel_34.setBounds(173, 174, 57, 15);
		myPanel_1.add(lblNewLabel_34);

		JLabel lblNewLabel_35 = new JLabel("연락처");
		lblNewLabel_35.setBounds(173, 230, 57, 15);
		myPanel_1.add(lblNewLabel_35);

		JLabel lblNewLabel_36 = new JLabel("이메일");
		lblNewLabel_36.setBounds(173, 282, 57, 15);
		myPanel_1.add(lblNewLabel_36);

		JLabel lblNewLabel_37 = new JLabel("예매내역");
		lblNewLabel_37.setBounds(446, 86, 57, 15);
		myPanel_1.add(lblNewLabel_37);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(242, 83, 116, 21);
		myPanel_1.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 126, 116, 21);
		myPanel_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(242, 171, 116, 21);
		myPanel_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(242, 227, 116, 21);
		myPanel_1.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(242, 279, 116, 21);
		myPanel_1.add(textField_4);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(446, 111, 158, 181);
		myPanel_1.add(textPane);

		JButton btnNewButton_2 = new JButton("회원정보수정");
		btnNewButton_2.setBounds(359, 354, 116, 23);
		myPanel_1.add(btnNewButton_2);

		cusTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		cusPanel.add(cusTabbedPane, BorderLayout.CENTER);

		JoinPanel = new JPanel();
		cusTabbedPane.addTab("회원가입", null, JoinPanel, null);
		JoinPanel.setLayout(null);
		JoinPanel.setBackground(Color.WHITE);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_8.setBounds(23, 10, 75, 49);
		JoinPanel.add(lblNewLabel_8);

		JLabel lblNewLabel_2_1 = new JLabel("아이디");
		lblNewLabel_2_1.setBounds(70, 85, 57, 15);
		JoinPanel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("비밀번호");
		lblNewLabel_3_1.setBounds(70, 176, 107, 15);
		JoinPanel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_4_1 = new JLabel("비밀번호 확인");
		lblNewLabel_4_1.setBounds(70, 214, 92, 15);
		JoinPanel.add(lblNewLabel_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("이름");
		lblNewLabel_5_1.setBounds(70, 286, 57, 15);
		JoinPanel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_6_1 = new JLabel("핸드폰");
		lblNewLabel_6_1.setBounds(469, 121, 57, 15);
		JoinPanel.add(lblNewLabel_6_1);

		JLabel lblNewLabel_7_1 = new JLabel("생일");
		lblNewLabel_7_1.setBounds(469, 176, 92, 15);
		JoinPanel.add(lblNewLabel_7_1);

		JLabel lblNewLabel_8_1 = new JLabel("성별");
		lblNewLabel_8_1.setBounds(469, 233, 57, 15);
		JoinPanel.add(lblNewLabel_8_1);

		JLabel lblNewLabel_9 = new JLabel("E-MAIL");
		lblNewLabel_9.setBounds(469, 286, 57, 15);
		JoinPanel.add(lblNewLabel_9);

		idTextField = new JTextField();
		idTextField.setColumns(10);
		idTextField.setBounds(173, 82, 116, 21);
		JoinPanel.add(idTextField);

		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(172, 283, 116, 21);
		JoinPanel.add(nameTextField);

		phoneTextField = new JTextField();
		phoneTextField.setColumns(10);
		phoneTextField.setBounds(549, 118, 116, 21);
		JoinPanel.add(phoneTextField);

		birthTextField = new JTextField();
		birthTextField.setColumns(10);
		birthTextField.setBounds(549, 170, 116, 21);
		JoinPanel.add(birthTextField);

		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(549, 280, 140, 21);
		JoinPanel.add(emailTextField);

		JButton btnNewButton_9 = new JButton("중복확인");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (cusService.findById(idTextField.getText()) != null) {
						idinfolabel.setText("중복된 아이디 입니다.");
					} else if (idTextField.getText().equals("")) {
						idinfolabel.setText("아이디를 입력해주세요");
					} else {
						idinfolabel.setText("사용가능한 아이디 입니다.");
					}
				} catch (Exception e1) {
				}
			}
		});
		btnNewButton_9.setBounds(301, 81, 86, 23);
		JoinPanel.add(btnNewButton_9);

		maleRadioButton = new JRadioButton("남");
		maleRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (maleRadioButton.isSelected()) {
					if (maleRadioButton.isSelected()) {
						gender = "M";
						genderinfolabel.setText("");

					} else {
						gender = null;
					}
					femaleRadioButton.setSelected(false);
				}
			}
		});
		maleRadioButton.setBounds(544, 226, 75, 23);
		JoinPanel.add(maleRadioButton);

		femaleRadioButton = new JRadioButton("여");
		femaleRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (femaleRadioButton.isSelected()) {
					if (femaleRadioButton.isSelected()) {
						gender = "F";
						genderinfolabel.setText("");
					} else {
						gender = null;
					}
					maleRadioButton.setSelected(false);
				}
			}
		});
		femaleRadioButton.setBounds(627, 226, 66, 23);
		JoinPanel.add(femaleRadioButton);

		JLabel passwordCLB = new JLabel("*");
		passwordCLB.setForeground(Color.RED);
		passwordCLB.setBounds(172, 244, 124, 17);
		JoinPanel.add(passwordCLB);
		// 회원가입
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = idTextField.getText();
					String password = passwordField.getText();
					String passwordC = passwordFieldC.getText();
					String nickname = nicknameTextField.getText();
					String name = nameTextField.getText();
					String phone = phoneTextField.getText();
					String date;
					date = birthTextField.getText();

					String email = emailTextField.getText();
					Date birth = new SimpleDateFormat("yyyyMMdd").parse(date);

					if (password.equals(passwordC)) {
						passwordCLB.setText("* 비밀번호일치");
					} else {
						passwordCLB.setText("* 비밀번호불일치");
						return;

					}
					Customer cus = new Customer(id, 1, nickname, name, password, birth, gender, phone, email, 0, 1);
					boolean a = cusService.addCustomer(cus);
					if (a && gender != null) {
						JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
						mainTabbedPane.setSelectedIndex(0);
					} else {
						JOptionPane.showMessageDialog(null, "잘못 입력되었습니다.");

					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "회원정보를 정확히 입력해주세요");

				}

			}
		});
		btnNewButton_1_1.setBounds(254, 358, 97, 23);
		JoinPanel.add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("메인으로");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_2_1.setBounds(445, 358, 97, 23);
		JoinPanel.add(btnNewButton_2_1);

		idinfolabel = new JLabel("");
		idinfolabel.setForeground(Color.RED);
		idinfolabel.setBounds(164, 104, 223, 15);
		JoinPanel.add(idinfolabel);

		nicknameTextField = new JTextField();
		nicknameTextField.setColumns(10);
		nicknameTextField.setBounds(173, 122, 116, 21);
		JoinPanel.add(nicknameTextField);

		JLabel lblNewLabel_2_1_1 = new JLabel("닉네임");
		lblNewLabel_2_1_1.setBounds(70, 125, 57, 15);
		JoinPanel.add(lblNewLabel_2_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(173, 173, 116, 21);
		JoinPanel.add(passwordField);

		passwordFieldC = new JPasswordField();
		passwordFieldC.setBounds(173, 211, 116, 21);
		JoinPanel.add(passwordFieldC);

		genderinfolabel = new JLabel("");
		genderinfolabel.setForeground(Color.RED);
		genderinfolabel.setBounds(466, 258, 223, 15);
		JoinPanel.add(genderinfolabel);

		loginPanel = new JPanel();
		cusTabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		loginPanel.setBackground(new Color(255, 240, 245));

		JLabel loginIdLB_1 = new JLabel("ID");
		loginIdLB_1.setFont(new Font("굴림", Font.PLAIN, 13));
		loginIdLB_1.setBounds(286, 206, 57, 15);
		loginPanel.add(loginIdLB_1);

		JLabel loginPWLB_1 = new JLabel("PASSWORD");
		loginPWLB_1.setFont(new Font("굴림", Font.PLAIN, 13));
		loginPWLB_1.setBounds(286, 265, 84, 15);
		loginPanel.add(loginPWLB_1);

		loginIdTextField = new JTextField();
		loginIdTextField.setColumns(10);
		loginIdTextField.setBounds(383, 203, 116, 21);
		loginPanel.add(loginIdTextField);

		JButton loginBtn_1 = new JButton("로그인");
		loginBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = loginIdTextField.getText();
					String password = loginPasswordField.getText();
					int result = cusService.login(id, password);
					if (result == 0) {
						JOptionPane.showMessageDialog(null, "로그인 하셨습니다");
						loginProcess(id);
					} else if (result == 1) {
						JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다");
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");

					}
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}
		});
		loginBtn_1.setBounds(263, 308, 97, 23);
		loginPanel.add(loginBtn_1);

		JButton cancelBtn_1 = new JButton("취소");
		cancelBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(0);
			}
		});
		cancelBtn_1.setBounds(423, 308, 97, 23);
		loginPanel.add(cancelBtn_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/LOGO4.png")));
		lblNewLabel_1_1.setBounds(286, 26, 213, 167);
		loginPanel.add(lblNewLabel_1_1);

		loginPasswordField = new JPasswordField();
		loginPasswordField.setBounds(383, 262, 116, 18);
		loginPanel.add(loginPasswordField);

		JButton findIdPWBtn = new JButton("아이디,패스워드찾기");
		findIdPWBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(4);

			}
		});
		findIdPWBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		findIdPWBtn.setBounds(299, 358, 191, 23);
		loginPanel.add(findIdPWBtn);

		myPanel = new JPanel();
		myPanel.setLayout(null);
		myPanel.setBackground(Color.WHITE);
		cusTabbedPane.addTab("마이페이지", null, myPanel, null);

		JLabel lblNewLabel_17_1 = new JLabel("");
		lblNewLabel_17_1.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_17_1.setBounds(12, 10, 73, 52);
		myPanel.add(lblNewLabel_17_1);

		JLabel cusNameLB = new JLabel("이름");
		cusNameLB.setBounds(173, 86, 57, 15);
		myPanel.add(cusNameLB);

		JLabel cusNicknameLB = new JLabel("닉네임");
		cusNicknameLB.setBounds(173, 129, 57, 15);
		myPanel.add(cusNicknameLB);

		JLabel cusBirthLB = new JLabel("생년월일");
		cusBirthLB.setBounds(173, 174, 57, 15);
		myPanel.add(cusBirthLB);

		JLabel cusPhoneLB = new JLabel("연락처");
		cusPhoneLB.setBounds(173, 230, 57, 15);
		myPanel.add(cusPhoneLB);

		JLabel cusEmailLB = new JLabel("이메일");
		cusEmailLB.setBounds(173, 282, 57, 15);
		myPanel.add(cusEmailLB);

		JLabel cusResLB = new JLabel("예매내역");
		cusResLB.setBounds(446, 86, 57, 15);
		myPanel.add(cusResLB);

		cusNameTF = new JTextField();
		cusNameTF.setColumns(10);
		cusNameTF.setBounds(242, 83, 140, 21);
		myPanel.add(cusNameTF);

		cusNicknameTF = new JTextField();
		cusNicknameTF.setColumns(10);
		cusNicknameTF.setBounds(242, 126, 140, 21);
		myPanel.add(cusNicknameTF);

		cusBrithTF = new JTextField();
		cusBrithTF.setColumns(10);
		cusBrithTF.setBounds(242, 171, 140, 21);
		myPanel.add(cusBrithTF);

		cusPhoneTF = new JTextField();
		cusPhoneTF.setColumns(10);
		cusPhoneTF.setBounds(242, 227, 140, 21);
		myPanel.add(cusPhoneTF);

		cusEmailTF = new JTextField();
		cusEmailTF.setColumns(10);
		cusEmailTF.setBounds(242, 279, 140, 21);
		myPanel.add(cusEmailTF);

		cusResTF = new JTextPane();
		cusResTF.setBounds(446, 111, 263, 191);
		myPanel.add(cusResTF);

		JButton btnNewButton_2_2 = new JButton("회원정보수정");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainTabbedPane.setSelectedIndex(1);
				cusTabbedPane.setSelectedIndex(3);

			}
		});
		btnNewButton_2_2.setBounds(359, 354, 116, 23);
		myPanel.add(btnNewButton_2_2);

		updatePanel = new JPanel();
		updatePanel.setLayout(null);
		updatePanel.setBackground(Color.WHITE);
		cusTabbedPane.addTab("회원정보수정", null, updatePanel, null);

		JLabel lblNewLabel_22 = new JLabel("닉네임");
		lblNewLabel_22.setBounds(296, 73, 57, 15);
		updatePanel.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("패스워드");
		lblNewLabel_23.setBounds(296, 111, 57, 15);
		updatePanel.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("생년월일");
		lblNewLabel_24.setBounds(296, 182, 57, 15);
		updatePanel.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("성별");
		lblNewLabel_25.setBounds(296, 221, 57, 15);
		updatePanel.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("휴대폰번호");
		lblNewLabel_26.setBounds(296, 292, 70, 15);
		updatePanel.add(lblNewLabel_26);

		JRadioButton mymaleRBt = new JRadioButton("남");
		mymaleRBt.setBounds(387, 217, 47, 23);
		updatePanel.add(mymaleRBt);

		JRadioButton myfemaleRBt = new JRadioButton("여");
		myfemaleRBt.setBounds(456, 217, 47, 23);
		updatePanel.add(myfemaleRBt);

		mynicknameTF = new JTextField();
		mynicknameTF.setColumns(10);
		mynicknameTF.setBounds(387, 73, 116, 21);
		updatePanel.add(mynicknameTF);

		mybirthTF = new JTextField();
		mybirthTF.setColumns(10);
		mybirthTF.setBounds(387, 179, 116, 21);
		updatePanel.add(mybirthTF);

		myphoneTF = new JTextField();
		myphoneTF.setColumns(10);
		myphoneTF.setBounds(387, 289, 116, 21);
		updatePanel.add(myphoneTF);

		JLabel lblNewLabel_38 = new JLabel("패스워드확인");
		lblNewLabel_38.setBounds(296, 143, 87, 15);
		updatePanel.add(lblNewLabel_38);

		JLabel lblNewLabel_39 = new JLabel("이메일");
		lblNewLabel_39.setBounds(296, 260, 57, 15);
		updatePanel.add(lblNewLabel_39);

		myemailTF = new JTextField();
		myemailTF.setColumns(10);
		myemailTF.setBounds(387, 257, 116, 21);
		updatePanel.add(myemailTF);

		JLabel lblNewLabel_40 = new JLabel("");
		lblNewLabel_40.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_40.setBounds(12, 10, 75, 47);
		updatePanel.add(lblNewLabel_40);

		JLabel updateCusPWLB = new JLabel("*");
		updateCusPWLB.setForeground(new Color(255, 0, 0));
		updateCusPWLB.setBounds(515, 143, 87, 15);
		updatePanel.add(updateCusPWLB);

		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					cusService.deleteInfo(loginCus.getCus_id());
					loginCus = null;
					
					
					cusTabbedPane.setSelectedIndex(1);
					mainTabbedPane.setSelectedIndex(0);
					logoutProcess();
					JOptionPane.showMessageDialog(null, "회원탈퇴 되었습니다.");
				} catch (Exception e1) {

				}
			}
		});
		btnNewButton_1.setBounds(231, 353, 97, 23);
		updatePanel.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("정보수정완료");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String cus_password = mypasswordTF1.getText();
					String cus_passwordC = mypasswordTF2.getText();

					loginCus.setCus_nickname(mynicknameTF.getText());
					loginCus.setCus_password(mypasswordTF1.getText());
					loginCus.setCus_password(mypasswordTF2.getText());
					loginCus.setCus_email(myemailTF.getText());
					loginCus.setCus_phone(myphoneTF.getText());

					loginCus.setCus_birthday(new SimpleDateFormat("yyyyMMdd").parse(mybirthTF.getText()));

					if (mypasswordTF1.getText().equals(mypasswordTF2.getText())) {
						updateCusPWLB.setText("* 비밀번호 일치");
						JOptionPane.showMessageDialog(null, "정보수정이 완료되었습니다.");
						cusService.updateInfo(loginCus);
						mainTabbedPane.setSelectedIndex(0);

					} else {
						updateCusPWLB.setText("* 비밀번호 불일치");
						JOptionPane.showMessageDialog(null, "비밀번호를 일치시켜주세요.");

						return;
					}
				} catch (Exception e1) {

				}
			}
		});
		btnNewButton_3.setBounds(456, 353, 116, 23);
		updatePanel.add(btnNewButton_3);

		mypasswordTF1 = new JPasswordField();
		mypasswordTF1.setBounds(387, 108, 116, 23);
		updatePanel.add(mypasswordTF1);

		mypasswordTF2 = new JPasswordField();
		mypasswordTF2.setBounds(387, 140, 116, 23);
		updatePanel.add(mypasswordTF2);

		findIdPWPanel = new JPanel();
		findIdPWPanel.setBackground(Color.WHITE);
		findIdPWPanel.setLayout(null);
		cusTabbedPane.addTab("찾기", null, findIdPWPanel, null);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setIcon(new ImageIcon(ProjectUI.class.getResource("/com/movie/현정/logo5.png")));
		lblNewLabel_10.setBounds(12, 10, 75, 52);
		findIdPWPanel.add(lblNewLabel_10);

		JLabel lblNewLabel_41 = new JLabel("아이디찾기");
		lblNewLabel_41.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_41.setBounds(175, 133, 77, 27);
		findIdPWPanel.add(lblNewLabel_41);

		findIdNameTF = new JTextField();
		findIdNameTF.setColumns(10);
		findIdNameTF.setBounds(305, 111, 116, 21);
		findIdPWPanel.add(findIdNameTF);

		findIdPhoneTF = new JTextField();
		findIdPhoneTF.setColumns(10);
		findIdPhoneTF.setBounds(305, 155, 116, 21);
		findIdPWPanel.add(findIdPhoneTF);

		JButton findIdBtn = new JButton("아이디찾기");
		findIdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = findIdNameTF.getText();
					String phone = findIdPhoneTF.getText();

					String result = cusService.findId(name, phone);
					if (result != null) {
						JOptionPane.showMessageDialog(null, result + "");
					} else {
						JOptionPane.showMessageDialog(null, "성함, 연락처를 모두 올바르게 입력해주세요.");
					}

				} catch (Exception e1) {

				}
			}
		});
		findIdBtn.setBounds(505, 136, 116, 23);
		findIdPWPanel.add(findIdBtn);

		JLabel lblNewLabel_42 = new JLabel("비밀번호찾기");
		lblNewLabel_42.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_42.setBounds(175, 280, 97, 27);
		findIdPWPanel.add(lblNewLabel_42);

		findPwIdTF = new JTextField();
		findPwIdTF.setColumns(10);
		findPwIdTF.setBounds(305, 259, 116, 21);
		findIdPWPanel.add(findPwIdTF);

		findPwNameTF = new JTextField();
		findPwNameTF.setColumns(10);
		findPwNameTF.setBounds(305, 305, 116, 21);
		findIdPWPanel.add(findPwNameTF);

		JButton findPWBtn = new JButton("비밀번호찾기");
		findPWBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id = findPwIdTF.getText();
					String name = findPwNameTF.getText();

					String result = cusService.findPassword(id, name);
					if (result != null) {
						JOptionPane.showMessageDialog(null, result + "");
					} else {
						JOptionPane.showMessageDialog(null, "아이디, 성함 모두 올바르게 입력해주세요.");
					}

				} catch (Exception e1) {

				}
			}
		});
		findPWBtn.setBounds(505, 283, 116, 23);
		findIdPWPanel.add(findPWBtn);

		JLabel lblNewLabel_43 = new JLabel("이름");
		lblNewLabel_43.setBounds(305, 96, 57, 15);
		findIdPWPanel.add(lblNewLabel_43);

		JLabel lblNewLabel_44 = new JLabel("연락처");
		lblNewLabel_44.setBounds(305, 142, 57, 15);
		findIdPWPanel.add(lblNewLabel_44);

		JLabel lblNewLabel_45 = new JLabel("아이디");
		lblNewLabel_45.setBounds(305, 245, 57, 15);
		findIdPWPanel.add(lblNewLabel_45);

		JLabel lblNewLabel_46 = new JLabel("이름");
		lblNewLabel_46.setBounds(305, 290, 57, 15);
		findIdPWPanel.add(lblNewLabel_46);

		moviePanel = new JPanel();
		moviePanel.setBackground(Color.WHITE);
		mainTabbedPane.addTab("영화상세", null, moviePanel, null);
		moviePanel.setLayout(new BorderLayout(0, 0));

		movieTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		moviePanel.add(movieTabbedPane, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		movieTabbedPane.addTab("영화1", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie2.jpg")));
		lblNewLabel_6.setBounds(41, 40, 217, 305);
		panel_2.add(lblNewLabel_6);

		JLabel movie1Label = new JLabel("");
		movie1Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie1Label.setBounds(270, 66, 465, 268);
		panel_2.add(movie1Label);
		try {
			movie1Label.setText("<html>" + movieService.findBymoviehall("1회차").getM_Introduce());

			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					mainTabbedPane.setSelectedIndex(3);
					hall_name = "1회차";
					try {
						movieService.remainUpdate(hall_name);
						ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
						if (seat.get(0).getSeat_valid() == 0) {
							seatSelectCHK.setSelected(true);
							seatSelectCHK.setEnabled(false);
						} else {
							seatSelectCHK.setSelected(false);
							seatSelectCHK.setEnabled(true);
						}

						if (seat.get(1).getSeat_valid() == 0) {
							seatSelectCHK2.setSelected(true);
							seatSelectCHK2.setEnabled(false);
						} else {
							seatSelectCHK2.setSelected(false);
							seatSelectCHK2.setEnabled(true);
						}

						if (seat.get(2).getSeat_valid() == 0) {
							seatSelectCHK3.setSelected(true);
							seatSelectCHK3.setEnabled(false);
						} else {
							seatSelectCHK3.setSelected(false);
							seatSelectCHK3.setEnabled(true);
						}

						if (seat.get(3).getSeat_valid() == 0) {
							seatSelectCHK4.setSelected(true);
							seatSelectCHK4.setEnabled(false);
						} else {
							seatSelectCHK4.setSelected(false);
							seatSelectCHK4.setEnabled(true);
						}

						if (seat.get(4).getSeat_valid() == 0) {
							seatSelectCHK5.setSelected(true);
							seatSelectCHK5.setEnabled(false);
						} else {
							seatSelectCHK5.setSelected(false);
							seatSelectCHK5.setEnabled(true);
						}

						if (seat.get(5).getSeat_valid() == 0) {
							seatSelectCHK6.setSelected(true);
							seatSelectCHK6.setEnabled(false);
						} else {
							seatSelectCHK6.setSelected(false);
							seatSelectCHK6.setEnabled(true);
						}

						if (seat.get(6).getSeat_valid() == 0) {
							seatSelectCHK7.setSelected(true);
							seatSelectCHK7.setEnabled(false);
						} else {
							seatSelectCHK7.setSelected(false);
							seatSelectCHK7.setEnabled(true);
						}

						if (seat.get(7).getSeat_valid() == 0) {
							seatSelectCHK8.setSelected(true);
							seatSelectCHK8.setEnabled(false);
						} else {
							seatSelectCHK8.setSelected(false);
							seatSelectCHK8.setEnabled(true);
						}

						if (seat.get(8).getSeat_valid() == 0) {
							seatSelectCHK9.setSelected(true);
							seatSelectCHK9.setEnabled(false);
						} else {
							seatSelectCHK9.setSelected(false);
							seatSelectCHK9.setEnabled(true);
						}

						if (seat.get(9).getSeat_valid() == 0) {
							seatSelectCHK10.setSelected(true);
							seatSelectCHK10.setEnabled(false);
						} else {
							seatSelectCHK10.setSelected(false);
							seatSelectCHK10.setEnabled(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			});
			seatSelectBtn.setBounds(619, 360, 97, 23);
			panel_2.add(seatSelectBtn);

			JButton movieMainBtn1 = new JButton("홈으로");
			movieMainBtn1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainTabbedPane.setSelectedIndex(0);
				}
			});
			movieMainBtn1.setBounds(86, 355, 97, 23);
			panel_2.add(movieMainBtn1);
		} catch (Exception e1) {
			System.out.println("오류");
		}

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		movieTabbedPane.addTab("영화2", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie1.jpg")));
		lblNewLabel_7.setBounds(26, 44, 219, 307);
		panel_3.add(lblNewLabel_7);

		JLabel movie2Label = new JLabel("");
		movie2Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie2Label.setBounds(257, 59, 465, 268);
		panel_3.add(movie2Label);
		try {
			movie2Label.setText("<html>" + movieService.findBymoviehall("2회차").getM_Introduce());

			seatSelectBtn_1 = new JButton("예매하기");
			seatSelectBtn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "2회차";
					try {
						movieService.remainUpdate(hall_name);
						ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
						if (seat.get(0).getSeat_valid() == 0) {
							seatSelectCHK.setSelected(true);
							seatSelectCHK.setEnabled(false);
						} else {
							seatSelectCHK.setSelected(false);
							seatSelectCHK.setEnabled(true);
						}

						if (seat.get(1).getSeat_valid() == 0) {
							seatSelectCHK2.setSelected(true);
							seatSelectCHK2.setEnabled(false);
						} else {
							seatSelectCHK2.setSelected(false);
							seatSelectCHK2.setEnabled(true);
						}

						if (seat.get(2).getSeat_valid() == 0) {
							seatSelectCHK3.setSelected(true);
							seatSelectCHK3.setEnabled(false);
						} else {
							seatSelectCHK3.setSelected(false);
							seatSelectCHK3.setEnabled(true);
						}

						if (seat.get(3).getSeat_valid() == 0) {
							seatSelectCHK4.setSelected(true);
							seatSelectCHK4.setEnabled(false);
						} else {
							seatSelectCHK4.setSelected(false);
							seatSelectCHK4.setEnabled(true);
						}

						if (seat.get(4).getSeat_valid() == 0) {
							seatSelectCHK5.setSelected(true);
							seatSelectCHK5.setEnabled(false);
						} else {
							seatSelectCHK5.setSelected(false);
							seatSelectCHK5.setEnabled(true);
						}

						if (seat.get(5).getSeat_valid() == 0) {
							seatSelectCHK6.setSelected(true);
							seatSelectCHK6.setEnabled(false);
						} else {
							seatSelectCHK6.setSelected(false);
							seatSelectCHK6.setEnabled(true);
						}

						if (seat.get(6).getSeat_valid() == 0) {
							seatSelectCHK7.setSelected(true);
							seatSelectCHK7.setEnabled(false);
						} else {
							seatSelectCHK7.setSelected(false);
							seatSelectCHK7.setEnabled(true);
						}

						if (seat.get(7).getSeat_valid() == 0) {
							seatSelectCHK8.setSelected(true);
							seatSelectCHK8.setEnabled(false);
						} else {
							seatSelectCHK8.setSelected(false);
							seatSelectCHK8.setEnabled(true);
						}

						if (seat.get(8).getSeat_valid() == 0) {
							seatSelectCHK9.setSelected(true);
							seatSelectCHK9.setEnabled(false);
						} else {
							seatSelectCHK9.setSelected(false);
							seatSelectCHK9.setEnabled(true);
						}

						if (seat.get(9).getSeat_valid() == 0) {
							seatSelectCHK10.setSelected(true);
							seatSelectCHK10.setEnabled(false);
						} else {
							seatSelectCHK10.setSelected(false);
							seatSelectCHK10.setEnabled(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});

			seatSelectBtn_1.setBounds(642, 360, 97, 23);
			panel_3.add(seatSelectBtn_1);

			JButton movieMainBtn2 = new JButton("홈으로");
			movieMainBtn2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainTabbedPane.setSelectedIndex(0);

				}
			});
			movieMainBtn2.setBounds(77, 361, 97, 23);
			panel_3.add(movieMainBtn2);
		} catch (Exception e1) {

		}

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		movieTabbedPane.addTab("영화3", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie3.jpg")));
		lblNewLabel_12.setBounds(22, 34, 219, 344);
		panel_4.add(lblNewLabel_12);

		JLabel movie3Label = new JLabel("");
		movie3Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie3Label.setBounds(253, 65, 465, 268);
		panel_4.add(movie3Label);
		try {
			movie3Label.setText("<html>" + movieService.findBymoviehall("3회차").getM_Introduce());

			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "3회차";
					try {
						movieService.remainUpdate(hall_name);
						ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
						if (seat.get(0).getSeat_valid() == 0) {
							seatSelectCHK.setSelected(true);
							seatSelectCHK.setEnabled(false);
						} else {
							seatSelectCHK.setSelected(false);
							seatSelectCHK.setEnabled(true);
						}

						if (seat.get(1).getSeat_valid() == 0) {
							seatSelectCHK2.setSelected(true);
							seatSelectCHK2.setEnabled(false);
						} else {
							seatSelectCHK2.setSelected(false);
							seatSelectCHK2.setEnabled(true);
						}

						if (seat.get(2).getSeat_valid() == 0) {
							seatSelectCHK3.setSelected(true);
							seatSelectCHK3.setEnabled(false);
						} else {
							seatSelectCHK3.setSelected(false);
							seatSelectCHK3.setEnabled(true);
						}

						if (seat.get(3).getSeat_valid() == 0) {
							seatSelectCHK4.setSelected(true);
							seatSelectCHK4.setEnabled(false);
						} else {
							seatSelectCHK4.setSelected(false);
							seatSelectCHK4.setEnabled(true);
						}

						if (seat.get(4).getSeat_valid() == 0) {
							seatSelectCHK5.setSelected(true);
							seatSelectCHK5.setEnabled(false);
						} else {
							seatSelectCHK5.setSelected(false);
							seatSelectCHK5.setEnabled(true);
						}

						if (seat.get(5).getSeat_valid() == 0) {
							seatSelectCHK6.setSelected(true);
							seatSelectCHK6.setEnabled(false);
						} else {
							seatSelectCHK6.setSelected(false);
							seatSelectCHK6.setEnabled(true);
						}

						if (seat.get(6).getSeat_valid() == 0) {
							seatSelectCHK7.setSelected(true);
							seatSelectCHK7.setEnabled(false);
						} else {
							seatSelectCHK7.setSelected(false);
							seatSelectCHK7.setEnabled(true);
						}

						if (seat.get(7).getSeat_valid() == 0) {
							seatSelectCHK8.setSelected(true);
							seatSelectCHK8.setEnabled(false);
						} else {
							seatSelectCHK8.setSelected(false);
							seatSelectCHK8.setEnabled(true);
						}

						if (seat.get(8).getSeat_valid() == 0) {
							seatSelectCHK9.setSelected(true);
							seatSelectCHK9.setEnabled(false);
						} else {
							seatSelectCHK9.setSelected(false);
							seatSelectCHK9.setEnabled(true);
						}

						if (seat.get(9).getSeat_valid() == 0) {
							seatSelectCHK10.setSelected(true);
							seatSelectCHK10.setEnabled(false);
						} else {
							seatSelectCHK10.setSelected(false);
							seatSelectCHK10.setEnabled(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			});
			seatSelectBtn.setBounds(621, 355, 97, 23);
			panel_4.add(seatSelectBtn);

			JButton movieMainBtn3 = new JButton("홈으로");
			movieMainBtn3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainTabbedPane.setSelectedIndex(0);
				}
			});
			movieMainBtn3.setBounds(75, 366, 97, 23);
			panel_4.add(movieMainBtn3);
		} catch (Exception e1) {
		}

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		movieTabbedPane.addTab("영화4", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie4.jpg")));
		lblNewLabel_13.setBounds(25, 40, 217, 346);
		panel_5.add(lblNewLabel_13);

		JLabel movie4Label = new JLabel("");
		movie4Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie4Label.setBounds(254, 76, 465, 268);
		panel_5.add(movie4Label);
		try {
			movie4Label.setText("<html>" + movieService.findBymoviehall("4회차").getM_Introduce());

			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "4회차";
					try {
						movieService.remainUpdate(hall_name);
						ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
						if (seat.get(0).getSeat_valid() == 0) {
							seatSelectCHK.setSelected(true);
							seatSelectCHK.setEnabled(false);
						} else {
							seatSelectCHK.setSelected(false);
							seatSelectCHK.setEnabled(true);
						}

						if (seat.get(1).getSeat_valid() == 0) {
							seatSelectCHK2.setSelected(true);
							seatSelectCHK2.setEnabled(false);
						} else {
							seatSelectCHK2.setSelected(false);
							seatSelectCHK2.setEnabled(true);
						}

						if (seat.get(2).getSeat_valid() == 0) {
							seatSelectCHK3.setSelected(true);
							seatSelectCHK3.setEnabled(false);
						} else {
							seatSelectCHK3.setSelected(false);
							seatSelectCHK3.setEnabled(true);
						}

						if (seat.get(3).getSeat_valid() == 0) {
							seatSelectCHK4.setSelected(true);
							seatSelectCHK4.setEnabled(false);
						} else {
							seatSelectCHK4.setSelected(false);
							seatSelectCHK4.setEnabled(true);
						}

						if (seat.get(4).getSeat_valid() == 0) {
							seatSelectCHK5.setSelected(true);
							seatSelectCHK5.setEnabled(false);
						} else {
							seatSelectCHK5.setSelected(false);
							seatSelectCHK5.setEnabled(true);
						}

						if (seat.get(5).getSeat_valid() == 0) {
							seatSelectCHK6.setSelected(true);
							seatSelectCHK6.setEnabled(false);
						} else {
							seatSelectCHK6.setSelected(false);
							seatSelectCHK6.setEnabled(true);
						}

						if (seat.get(6).getSeat_valid() == 0) {
							seatSelectCHK7.setSelected(true);
							seatSelectCHK7.setEnabled(false);
						} else {
							seatSelectCHK7.setSelected(false);
							seatSelectCHK7.setEnabled(true);
						}

						if (seat.get(7).getSeat_valid() == 0) {
							seatSelectCHK8.setSelected(true);
							seatSelectCHK8.setEnabled(false);
						} else {
							seatSelectCHK8.setSelected(false);
							seatSelectCHK8.setEnabled(true);
						}

						if (seat.get(8).getSeat_valid() == 0) {
							seatSelectCHK9.setSelected(true);
							seatSelectCHK9.setEnabled(false);
						} else {
							seatSelectCHK9.setSelected(false);
							seatSelectCHK9.setEnabled(true);
						}

						if (seat.get(9).getSeat_valid() == 0) {
							seatSelectCHK10.setSelected(true);
							seatSelectCHK10.setEnabled(false);
						} else {
							seatSelectCHK10.setSelected(false);
							seatSelectCHK10.setEnabled(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			});
			seatSelectBtn.setBounds(622, 364, 97, 23);
			panel_5.add(seatSelectBtn);

			JButton movieMainBtn4 = new JButton("홈으로");
			movieMainBtn4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainTabbedPane.setSelectedIndex(0);
				}
			});
			movieMainBtn4.setBounds(80, 380, 97, 23);
			panel_5.add(movieMainBtn4);
		} catch (Exception e1) {
		}

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		movieTabbedPane.addTab("영화5", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon(ProjectUI.class.getResource("/images/big_movie5.jpg")));
		lblNewLabel_27.setBounds(22, 42, 213, 308);
		panel_6.add(lblNewLabel_27);

		JLabel movie5Label = new JLabel("");
		movie5Label.setFont(new Font("D2Coding", Font.PLAIN, 15));
		movie5Label.setBounds(257, 54, 465, 268);
		panel_6.add(movie5Label);
		try {
			movie5Label.setText("<html>" + movieService.findBymoviehall("5회차").getM_Introduce());

			JButton seatSelectBtn = new JButton("예매하기");
			seatSelectBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainTabbedPane.setSelectedIndex(3);
					hall_name = "5회차";
					try {
						movieService.remainUpdate(hall_name);
						ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
						if (seat.get(0).getSeat_valid() == 0) {
							seatSelectCHK.setSelected(true);
							seatSelectCHK.setEnabled(false);
						} else {
							seatSelectCHK.setSelected(false);
							seatSelectCHK.setEnabled(true);
						}

						if (seat.get(1).getSeat_valid() == 0) {
							seatSelectCHK2.setSelected(true);
							seatSelectCHK2.setEnabled(false);
						} else {
							seatSelectCHK2.setSelected(false);
							seatSelectCHK2.setEnabled(true);
						}

						if (seat.get(2).getSeat_valid() == 0) {
							seatSelectCHK3.setSelected(true);
							seatSelectCHK3.setEnabled(false);
						} else {
							seatSelectCHK3.setSelected(false);
							seatSelectCHK3.setEnabled(true);
						}

						if (seat.get(3).getSeat_valid() == 0) {
							seatSelectCHK4.setSelected(true);
							seatSelectCHK4.setEnabled(false);
						} else {
							seatSelectCHK4.setSelected(false);
							seatSelectCHK4.setEnabled(true);
						}

						if (seat.get(4).getSeat_valid() == 0) {
							seatSelectCHK5.setSelected(true);
							seatSelectCHK5.setEnabled(false);
						} else {
							seatSelectCHK5.setSelected(false);
							seatSelectCHK5.setEnabled(true);
						}

						if (seat.get(5).getSeat_valid() == 0) {
							seatSelectCHK6.setSelected(true);
							seatSelectCHK6.setEnabled(false);
						} else {
							seatSelectCHK6.setSelected(false);
							seatSelectCHK6.setEnabled(true);
						}

						if (seat.get(6).getSeat_valid() == 0) {
							seatSelectCHK7.setSelected(true);
							seatSelectCHK7.setEnabled(false);
						} else {
							seatSelectCHK7.setSelected(false);
							seatSelectCHK7.setEnabled(true);
						}

						if (seat.get(7).getSeat_valid() == 0) {
							seatSelectCHK8.setSelected(true);
							seatSelectCHK8.setEnabled(false);
						} else {
							seatSelectCHK8.setSelected(false);
							seatSelectCHK8.setEnabled(true);
						}

						if (seat.get(8).getSeat_valid() == 0) {
							seatSelectCHK9.setSelected(true);
							seatSelectCHK9.setEnabled(false);
						} else {
							seatSelectCHK9.setSelected(false);
							seatSelectCHK9.setEnabled(true);
						}

						if (seat.get(9).getSeat_valid() == 0) {
							seatSelectCHK10.setSelected(true);
							seatSelectCHK10.setEnabled(false);
						} else {
							seatSelectCHK10.setSelected(false);
							seatSelectCHK10.setEnabled(true);
						}

					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			});
			seatSelectBtn.setBounds(625, 358, 97, 23);
			panel_6.add(seatSelectBtn);

			JButton movieMainBtn5 = new JButton("홈으로");
			movieMainBtn5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainTabbedPane.setSelectedIndex(0);
				}
			});
			movieMainBtn5.setBounds(76, 358, 97, 23);
			panel_6.add(movieMainBtn5);
		} catch (Exception e1) {
		}

		seatPanel = new JPanel();
		seatPanel.setBackground(Color.WHITE);
		mainTabbedPane.addTab("좌석선택", null, seatPanel, null);
		seatPanel.setLayout(null);

		JButton btnNewButton_8 = new JButton("Screen");
		btnNewButton_8.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_8.setBounds(51, 46, 376, 34);
		seatPanel.add(btnNewButton_8);

		JLabel lblNewLabel_14 = new JLabel("인원/좌석");
		lblNewLabel_14.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_14.setBounds(576, 113, 115, 26);
		seatPanel.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("성인");
		lblNewLabel_15.setBounds(576, 166, 57, 15);
		seatPanel.add(lblNewLabel_15);

		adultCB = new JComboBox();
		adultCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
		adultCB.setBounds(633, 162, 32, 23);
		seatPanel.add(adultCB);

		JLabel lblNewLabel_16 = new JLabel("청소년");
		lblNewLabel_16.setBounds(576, 206, 57, 15);
		seatPanel.add(lblNewLabel_16);

		childCB = new JComboBox();
		childCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
		childCB.setBounds(633, 202, 32, 23);
		seatPanel.add(childCB);

		seatSelectPanel = new JPanel();
		seatSelectPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		seatSelectPanel.setBounds(48, 88, 379, 324);
		seatPanel.add(seatSelectPanel);
		seatSelectPanel.setLayout(new GridLayout(0, 5, 0, 0));

		seatSelectCHK = new JCheckBox("1");
		seatSelectPanel.add(seatSelectCHK);

		seatSelectCHK2 = new JCheckBox("2");
		seatSelectPanel.add(seatSelectCHK2);

		seatSelectCHK3 = new JCheckBox("3");
		seatSelectPanel.add(seatSelectCHK3);

		seatSelectCHK4 = new JCheckBox("4");
		seatSelectPanel.add(seatSelectCHK4);

		seatSelectCHK5 = new JCheckBox("5");
		seatSelectPanel.add(seatSelectCHK5);

		seatSelectCHK6 = new JCheckBox("6");
		seatSelectPanel.add(seatSelectCHK6);

		seatSelectCHK7 = new JCheckBox("7");
		seatSelectPanel.add(seatSelectCHK7);

		seatSelectCHK8 = new JCheckBox("8");
		seatSelectPanel.add(seatSelectCHK8);

		seatSelectCHK9 = new JCheckBox("9");
		seatSelectPanel.add(seatSelectCHK9);

		seatSelectCHK10 = new JCheckBox("10");
		seatSelectPanel.add(seatSelectCHK10);

		JButton btnNewButton = new JButton("다음");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PriceInfo price = priceInfoDao.priceSelectByNo(hall_name);
					int a = (adultCB.getSelectedIndex() * price.getAdult_price())
							+ (childCB.getSelectedIndex() * price.getChild_price());
					totalPriceTB.setText(a + "");
					mainTabbedPane.setSelectedIndex(4);
					ArrayList<Seat> seat = new ArrayList<Seat>(seatService.findAllByhallName(hall_name));
					resevationSeat = new ArrayList<Integer>();
					int ArrayCount = 0;
					if (seatSelectCHK.isSelected() && seat.get(0).getSeat_valid() == 1) {
						seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK.getText()));
						seatSelectCHK.setEnabled(false);
						ArrayCount = 1;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK2.isSelected() && seat.get(1).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK2.getText()));
						seatSelectCHK2.setEnabled(false);
						ArrayCount = 2;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK3.isSelected() && seat.get(2).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK3.getText()));
						seatSelectCHK3.setEnabled(false);
						ArrayCount = 3;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK4.isSelected() && seat.get(3).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK4.getText()));
						seatSelectCHK4.setEnabled(false);
						ArrayCount = 4;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK5.isSelected() && seat.get(4).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK5.getText()));
						seatSelectCHK5.setEnabled(false);
						ArrayCount = 5;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK6.isSelected() && seat.get(5).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK6.getText()));
						seatSelectCHK6.setEnabled(false);
						ArrayCount = 6;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK7.isSelected() && seat.get(6).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK7.getText()));
						seatSelectCHK7.setEnabled(false);
						ArrayCount = 7;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK8.isSelected() && seat.get(7).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK8.getText()));
						seatSelectCHK8.setEnabled(false);
						ArrayCount = 8;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK9.isSelected() && seat.get(8).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK9.getText()));
						seatSelectCHK9.setEnabled(false);
						ArrayCount = 9;
						resevationSeat.add(ArrayCount);
					}

					if (seatSelectCHK10.isSelected() && seat.get(9).getSeat_valid() == 1) {
						ArrayCount = seatService.updateSeat(loginCus.getCus_id(), hall_name,
								Integer.parseInt(seatSelectCHK10.getText()));
						seatSelectCHK10.setEnabled(false);
						ArrayCount = 10;
						resevationSeat.add(ArrayCount);
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnNewButton.setBounds(587, 353, 97, 23);
		seatPanel.add(btnNewButton);

		payPanel = new JPanel();
		payPanel.setBackground(Color.WHITE);
		mainTabbedPane.addTab("결제페이지", null, payPanel, null);
		payPanel.setLayout(null);

		JLabel lblNewLabel_18 = new JLabel("1.결제수단");
		lblNewLabel_18.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(127, 76, 104, 23);
		payPanel.add(lblNewLabel_18);

		JRadioButton cardRBtn = new JRadioButton("카드");
		cardRBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (cardRBtn.isSelected()) {
					cardCB.setEnabled(true);
					depositRBtn.setSelected(false);
					PayCount = 0;
				}
			}
		});
		cardRBtn.setBounds(138, 129, 70, 23);
		payPanel.add(cardRBtn);

		depositRBtn = new JRadioButton("무통장입금");
		depositRBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (depositRBtn.isSelected()) {
					cardCB.setEnabled(false);
					cardRBtn.setSelected(false);
					PayCount = 1;
				}
			}
		});
		depositRBtn.setBounds(138, 166, 121, 23);
		payPanel.add(depositRBtn);

		JLabel lblNewLabel_19 = new JLabel("2.할인");
		lblNewLabel_19.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(138, 237, 57, 23);
		payPanel.add(lblNewLabel_19);

		cardCB = new JComboBox();
		cardCB.setEnabled(false);
		cardCB.setModel(new DefaultComboBoxModel(new String[] {"국민", "신한", "농협", "우리", "IBK", "기업"}));
		cardCB.setBounds(214, 129, 57, 23);
		payPanel.add(cardCB);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("쿠폰");
		rdbtnNewRadioButton_4.setBounds(149, 294, 59, 23);
		payPanel.add(rdbtnNewRadioButton_4);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		comboBox_3.setBounds(227, 294, 32, 23);
		payPanel.add(comboBox_3);

		JLabel lblNewLabel_19_1 = new JLabel("3.총 결제금액");
		lblNewLabel_19_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_19_1.setBounds(420, 76, 121, 23);
		payPanel.add(lblNewLabel_19_1);

		JLabel lblNewLabel_20 = new JLabel("-------------------------------");
		lblNewLabel_20.setBounds(127, 105, 189, 15);
		payPanel.add(lblNewLabel_20);

		JButton btnNewButton_11 = new JButton("결제하기");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentService paymentService = new PaymentService();
				// paymentService.insertPayment(new Payment());
				cardCB.getSelectedItem();
				adultCB.getSelectedItem();
				childCB.getSelectedItem();
				loginCus.getCus_id();

				try {
					for (int i = 0; i < resevationSeat.size(); i++) {
						
							int seatno = 0;

							if (hall_name.equals("2회차")) {
								seatno = i + 10;
							}
							if (hall_name.equals("3회차")) {
								seatno = i + 20;
							}
							if (hall_name.equals("4회차")) {
								seatno = i + 30;
							}
							if (hall_name.equals("5회차")) {
								seatno = i + 40;
							}
						
							
							paymentService.insertPayment((String) cardCB.getSelectedItem(),
									Integer.parseInt(adultCB.getSelectedItem() + ""),
									Integer.parseInt(childCB.getSelectedItem() + ""), loginCus.getCus_id(), seatno);
						

					}
					seatUpdate();
					JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
				mainTabbedPane.setSelectedIndex(0);

			}
		});
		btnNewButton_11.setBounds(401, 283, 104, 44);
		payPanel.add(btnNewButton_11);

		JButton btnNewButton_11_1 = new JButton("이전으로");
		btnNewButton_11_1.setBounds(527, 283, 104, 44);
		payPanel.add(btnNewButton_11_1);

		JLabel lblNewLabel_20_1 = new JLabel("-------------------------------");
		lblNewLabel_20_1.setBounds(418, 105, 189, 15);
		payPanel.add(lblNewLabel_20_1);

		JLabel lblNewLabel_20_2 = new JLabel("-------------------------------");
		lblNewLabel_20_2.setBounds(127, 265, 189, 15);
		payPanel.add(lblNewLabel_20_2);

		totalPriceTB = new JTextField();
		totalPriceTB.setEnabled(false);
		totalPriceTB.setEditable(false);
		totalPriceTB.setBounds(425, 130, 116, 21);
		payPanel.add(totalPriceTB);
		totalPriceTB.setColumns(10);
		totalPriceTB.setText("");

		JLabel lblNewLabel_21 = new JLabel("원");
		lblNewLabel_21.setBounds(550, 134, 57, 15);
		payPanel.add(lblNewLabel_21);
		try {

			/********** 서비스생성 ***********/
			/**********************/
			// seatReservation("1회차");
			logoutProcess();
			seatUpdate();
			ArrayList<Seat> seat = new ArrayList<Seat>();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private JTextField totalPriceTB;
	private JTextField nicknameTextField;
	private JRadioButton femaleRadioButton;
	private JRadioButton maleRadioButton;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldC;
	private JPasswordField loginPasswordField;
	private JTabbedPane mainTabbedPane;
	private JTabbedPane cusTabbedPane;
	private JTabbedPane movieTabbedPane;
	private JButton myPageBtn;
	private JButton loginBtn;
	private JButton joinBtn;
	private JLabel idinfolabel;
	private JLabel genderinfolabel;
	private JComboBox childCB;
	private JComboBox adultCB;
	private JComboBox cardCB;
	private JRadioButton depositRBtn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField cusNameTF;
	private JTextField cusNicknameTF;
	private JTextField cusBrithTF;
	private JTextField cusPhoneTF;
	private JTextField cusEmailTF;
	private JTextField mynicknameTF;
	private JTextField mybirthTF;
	private JTextField myphoneTF;
	private JTextField myemailTF;
	private JPasswordField mypasswordTF1;
	private JPasswordField mypasswordTF2;
	private JTextPane cusResTF;

	/*************** Service선언 ************/
	SeatService seatService = new SeatService();
	private JTextField findIdNameTF;
	private JTextField findIdPhoneTF;
	private JTextField findPwIdTF;
	private JTextField findPwNameTF;
	JCheckBox seatSelectCHK1;
	private JButton seatSelectBtn_1;
	private JCheckBox seatSelectCHK2;
	private JCheckBox seatSelectCHK3;
	private JCheckBox seatSelectCHK4;
	private JCheckBox seatSelectCHK5;
	private JCheckBox seatSelectCHK6;
	private JCheckBox seatSelectCHK7;
	private JCheckBox seatSelectCHK8;
	private JCheckBox seatSelectCHK9;
	private JCheckBox seatSelectCHK10;
	private JCheckBox seatSelectCHK;
	private JLabel reaminseat1;
	private JLabel reaminseat2;
	private JLabel reaminseat3;
	private JLabel reaminseat4;
	private JLabel reaminseat5;
	ArrayList<Seat> seat;
	ArrayList<Integer> resevationSeat;
	private int login = 10;
	private JPanel moviePanel;
	private JPanel seatPanel;
	private JPanel payPanel;
	private JPanel findIdPWPanel;
	private JPanel updatePanel;
	private JPanel myPanel;
	private JPanel loginPanel;
	private JPanel JoinPanel;

	/*
	 * public void seatReservation(String hall_name) throws Exception {
	 * ArrayList<Seat> seat = (ArrayList) seatService.findAllByhallName(hall_name);
	 * seatSelectPanel.remove(seatSelectCHK1_1);
	 * 
	 * for (int i = 0; i < seat.size(); i++) { seatSelectCHK1 = new JCheckBox("");
	 * seatSelectCHK1.setToolTipText(1 + i + ""); seatSelectCHK1.setText(1 + i +
	 * ""); seatSelectPanel.add(seatSelectCHK1);
	 * 
	 * if (seat.get(i).getSeat_valid() == 0) { seatSelectCHK1.setSelected(true);
	 * seatSelectCHK1.setEnabled(false); }
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * seatSelectBtn_1.addActionListener(new ActionListener() { public void
	 * actionPerformed(ActionEvent e) { mainTabbedPane.setSelectedIndex(3); try {
	 * String hall_name = "2회차"; ArrayList<Seat> seat = new ArrayList<>(); seat =
	 * (ArrayList) seatService.findAllByhallName(hall_name);
	 * System.out.println(seat);
	 * 
	 * seatSelectCHK1.setSelected(false); seatSelectCHK1.setEnabled(true);
	 * 
	 * for (int i = 0; i < seat.size(); i++) { if(i<=10) {
	 * seatSelectCHK1.setSelected(false); seatSelectCHK1.setEnabled(true); }
	 * 
	 * if (seat.get(i).getSeat_valid() == 0) { seatSelectCHK1.setSelected(true);
	 * seatSelectCHK1.setEnabled(false); } } } catch (Exception e1) {
	 * e1.printStackTrace(); } } }); 98
	 * 
	 * 
	 * /* seatSelectCHK1.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { int a =
	 * Integer.parseInt(seatSelectCHK1.getText()); try {
	 * seatService.updateSeat(loginCus.getCus_id(), hall_name, a); } catch
	 * (Exception e1) { // TODO Auto-generated catch block e1.printStackTrace(); } }
	 * });
	 * 
	 * 
	 * }
	 */
	public void seatUpdate() throws Exception {
		movieService.remainUpdate("1회차");
		movieService.remainUpdate("2회차");
		movieService.remainUpdate("3회차");
		movieService.remainUpdate("4회차");
		movieService.remainUpdate("5회차");
		reaminseat1.setText("남은좌석 : " + movieService.findBymoviehall("1회차").getRemainSeat());
		reaminseat2.setText("남은좌석 : " + movieService.findBymoviehall("2회차").getRemainSeat());
		reaminseat3.setText("남은좌석 : " + movieService.findBymoviehall("3회차").getRemainSeat());
		reaminseat4.setText("남은좌석 : " + movieService.findBymoviehall("4회차").getRemainSeat());
		reaminseat5.setText("남은좌석 : " + movieService.findBymoviehall("5회차").getRemainSeat());
	}

	// 로그인 메소드
	public void loginProcess(String id) throws Exception {
		loginCus = cusService.findById(id);
		setTitle(loginCus.getCus_name());

		cusTabbedPane.setSelectedIndex(2);
		mainTabbedPane.setSelectedIndex(0);
		cusTabbedPane.setEnabledAt(0, false);
		cusTabbedPane.setEnabledAt(1, false);
		cusTabbedPane.setEnabledAt(2, true);

		joinBtn.setEnabled(false);
		loginBtn.setEnabled(false);
		myPageBtn.setEnabled(true);
		login = 20;

	}

	public void logoutProcess() {
		this.loginCus = null;
		setTitle("ITWILL CINEMA");

		cusTabbedPane.setEnabledAt(0, true);
		cusTabbedPane.setEnabledAt(1, true);

		joinBtn.setEnabled(true);
		loginBtn.setEnabled(true);
		myPageBtn.setEnabled(false);
		
		login = 10;
		

	}
}
