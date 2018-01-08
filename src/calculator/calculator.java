package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String ans;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 252, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(9, 28, 216, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn7.getText();
				textField.setText(enterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 102, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn8.getText();
				textField.setText(enterNum);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(65, 102, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn9.getText();
				textField.setText(enterNum);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(120, 102, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlus.setBounds(175, 102, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn4.getText();
				textField.setText(enterNum);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 157, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn5.getText();
				textField.setText(enterNum);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(65, 157, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn6.getText();
				textField.setText(enterNum);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(120, 157, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(175, 157, 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn1.getText();
				textField.setText(enterNum);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 212, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn2.getText();
				textField.setText(enterNum);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(65, 212, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn3.getText();
				textField.setText(enterNum);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(120, 212, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMul.setBounds(175, 212, 50, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNum=textField.getText() + btn0.getText();
				textField.setText(enterNum);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 267, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String enterNum=textField.getText() + btnDot.getText();
					textField.setText(enterNum);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(65, 267, 50, 50);
		frame.getContentPane().add(btnDot);
		
		
		JButton btnPM = new JButton("+-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPM.setBounds(120, 267, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				} 
				else if(operations=="*")
				{
					result=firstnum*secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstnum%secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations=="+")
				{
					result=firstnum+secondnum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
				}
			}
		});
		btneq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btneq.setBounds(175, 267, 50, 50);
		frame.getContentPane().add(btneq);
		
		JButton btnback = new JButton("<-");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					backspace=strb.toString();
					textField.setText(backspace);
				}
			}
		});
		btnback.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnback.setBounds(10, 322, 50, 50);
		frame.getContentPane().add(btnback);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);

			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(65, 322, 50, 50);
		frame.getContentPane().add(btnC);
		
		
		JButton btnperc= new JButton("%");
		btnperc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnperc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnperc.setBounds(120, 322, 50, 50);
		frame.getContentPane().add(btnperc);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(175, 322, 50, 50);
		frame.getContentPane().add(btnDiv);
	}
}
