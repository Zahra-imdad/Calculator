package calculator_assignment2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_assignment2 {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String Operation;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_assignment2 window = new calculator_assignment2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator_assignment2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(128,128,128));
		frame.setBounds(100, 100, 310, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(10, 11, 270, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);}}}

		);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBackground(new Color(192,192,192));
		btnBack.setBounds(10, 55, 46, 43);
		frame.getContentPane().add(btnBack);
		
		JButton btnCe = new JButton("Ce");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCe.setBackground(new Color(192,192,192));
		btnCe.setBounds(65, 55, 46, 43);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBackground(new Color(192,192,192));
		btnC.setBounds(121, 55, 46, 43);
		frame.getContentPane().add(btnC);
		
		JButton btnaddsub = new JButton("\u00B1");
		btnaddsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));

			}
		});
		btnaddsub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnaddsub.setBackground(new Color(192,192,192));
		btnaddsub.setBounds(177, 55, 46, 43);
		frame.getContentPane().add(btnaddsub);
		
		JButton btnNewButton_4 = new JButton("\u221A");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));

			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBackground(new Color(192,192,192));
		btnNewButton_4.setBounds(233, 55, 46, 43);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn7.getText();
				textField.setText(iNum);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBackground(new Color(192,192,192));
		btn7.setBounds(10, 109, 46, 43);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn8.getText();
				textField.setText(iNum);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBackground(new Color(192,192,192));
		btn8.setBounds(65, 109, 46, 43);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn9.getText();
				textField.setText(iNum);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBackground(new Color(192,192,192));
		btn9.setBounds(121, 109, 46, 43);
		frame.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="/";

			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBackground(new Color(192,192,192));
		btnDiv.setBounds(177, 109, 46, 43);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="%";

			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMod.setBackground(new Color(192,192,192));
		btnMod.setBounds(233, 109, 46, 43);
		frame.getContentPane().add(btnMod);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn4.getText();
				textField.setText(iNum);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(new Color(192,192,192));
		btn4.setBounds(10, 163, 46, 43);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn5.getText();
				textField.setText(iNum);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBackground(new Color(192,192,192));
		btn5.setBounds(65, 163, 46, 43);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn6.getText();
				textField.setText(iNum);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBackground(new Color(192,192,192));
		btn6.setBounds(121, 163, 46, 43);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="*";

			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMul.setBackground(new Color(192,192,192));
		btnMul.setBounds(177, 163, 46, 43);
		frame.getContentPane().add(btnMul);
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795) ;
				textField.setText(String.valueOf(ops));

			}
		});
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPi.setBackground(new Color(192,192,192));
		btnPi.setBounds(234, 163, 46, 43);
		frame.getContentPane().add(btnPi);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum = textField.getText()+btn1.getText();
				textField.setText(iNum);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBackground(new Color(192,192,192));
		btn1.setBounds(10, 217, 46, 43);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn2.getText();
				textField.setText(iNum);

			}
		});
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBackground(new Color(192,192,192));
		btn2.setBounds(65, 217, 46, 43);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText()+btn3.getText();
				textField.setText(iNum);

			}
		});
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBackground(new Color(192,192,192));
		btn3.setBounds(121, 217, 46, 43);
		frame.getContentPane().add(btn3);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="-";

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBackground(new Color(192,192,192));
		btnSub.setBounds(177, 217, 46, 43);
		frame.getContentPane().add(btnSub);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(Operation=="+")												//ADDITION
				{
					result=firstnum+secondnum;
					answer=String.format("%.1f", result);
					textField.setText(answer);
				}
				else if(Operation=="-")											//SUBTRACTION
				{
					result=firstnum-secondnum;
					answer=String.format("%.1f", result);
					textField.setText(answer);
				}
				else if(Operation=="*")											//MULTIPLY
				{
					result=firstnum*secondnum;
					answer=String.format("%.1f", result);
					textField.setText(answer);
				}
				else if(Operation=="÷")											//DIVISION
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}		
				
			}

			
	});
		btnEql.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEql.setBackground(new Color(192,192,192));
		btnEql.setBounds(233, 217, 46, 97);
		frame.getContentPane().add(btnEql);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnDot.getText());
		          }
			
		
		
			
			}});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBackground(new Color(192,192,192));
		btnDot.setBounds(121, 271, 46, 43);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum = textField.getText()+btn0.getText();
				textField.setText(iNum);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBackground(new Color(192,192,192));
		btn0.setBounds(10, 271, 101, 43);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="+";

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBackground(new Color(192,192,192));
		btnAdd.setBounds(177, 271, 46, 43);
		frame.getContentPane().add(btnAdd);
	}
}
