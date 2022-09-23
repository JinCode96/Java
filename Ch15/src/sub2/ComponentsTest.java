package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(17, 28, 99, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("버튼 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...");
			}
		});
		btnNewButton.setBounds(-1, 83, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼 2");
		btnNewButton_1.setBounds(105, 83, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("버튼 3");
		btnNewButton_2.setBounds(216, 83, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("버튼 4");
		btnNewButton_3.setBounds(327, 83, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setBounds(17, 6, 99, 16);
		contentPane.add(lblNewLabel);
		
		txtf1 = new JTextField();
		txtf1.setBounds(17, 161, 130, 26);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setBounds(17, 199, 130, 26);
		contentPane.add(txtf2);
		txtf2.setColumns(10);
		
		txtf3 = new JTextField();
		txtf3.setBounds(17, 237, 130, 26);
		contentPane.add(txtf3);
		txtf3.setColumns(10);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.setBounds(156, 161, 117, 29);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.setBounds(156, 199, 117, 29);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.setBounds(156, 237, 117, 29);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_2 = new JLabel("TextFeild 컴포넌트");
		lblNewLabel_2.setBounds(30, 124, 117, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblTxtf1Result = new JLabel("결과 : ");
		lblTxtf1Result.setBounds(285, 166, 61, 16);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 : ");
		lblTxtf2Result.setBounds(285, 204, 61, 16);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 : ");
		lblTxtf3Result.setBounds(285, 242, 61, 16);
		contentPane.add(lblTxtf3Result);
	}
}
