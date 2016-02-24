package UCoreCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Автор: Кирилл Усачёв, cyril-usachov@ukr.net
public class USourceCalculator extends JFrame {
	private double digit1 = 0, digit2 = 0, result = 0;
	private boolean nowFirstDigit = true, computingAllowed = true, firstPress = true, nextDigit=false;
	private char operator = ' ';
	private JLabel visibleLine;
	private JButton sum, subtraction, multiplication, division, increment, equality, one, two, three, four, five, six,
			seven, eight, nine, zero;

	public USourceCalculator() {
		super("uSorce");
		// setBounds(300, 50, 300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		visibleLine = new JLabel("" + result);
		increment = new JButton("Increment");
		sum = new JButton("+");
		subtraction = new JButton("-");
		multiplication = new JButton("x");
		division = new JButton("/");
		equality = new JButton("Result");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		JPanel buttonsPanel1 = new JPanel(new FlowLayout());
		JPanel buttonsPanel2 = new JPanel(new FlowLayout());
		buttonsPanel1.add(increment);
		buttonsPanel1.add(sum);
		buttonsPanel1.add(subtraction);
		buttonsPanel1.add(multiplication);
		buttonsPanel1.add(division);
		buttonsPanel1.add(equality);
		buttonsPanel2.add(one);
		buttonsPanel2.add(two);
		buttonsPanel2.add(three);
		buttonsPanel2.add(four);
		buttonsPanel2.add(five);
		buttonsPanel2.add(six);
		buttonsPanel2.add(seven);
		buttonsPanel2.add(eight);
		buttonsPanel2.add(nine);
		buttonsPanel2.add(zero);
		add(visibleLine, BorderLayout.NORTH);
		add(buttonsPanel2, BorderLayout.CENTER);
		add(buttonsPanel1, BorderLayout.SOUTH);

		increment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++;
				resultChange();
			}
		});

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 1;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 1;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 2;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 2;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 3;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 3;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 4;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 4;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 5;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 5;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 6;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 6;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 7;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 7;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 8;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 8;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 9;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 9;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowFirstDigit) {
					result = digit1 = 0;
					computingAllowed = nowFirstDigit = false;
				} else {
					result = digit2 = 0;
					firstPress = false;
					computingAllowed = true;
				}

				resultChange();
			}
		});

		sum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operator != ' ') {
					operator = '+';
					computingAllowed = false;
				} else {
					operator = '+';
					computingAllowed = false;
				}
			}
		});

		subtraction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operator != ' ') {
					operator = '-';
					computingAllowed = false;
				} else {
					operator = '-';
					computingAllowed = false;
				}
			}
		});

		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operator != ' ') {
					operator = '*';
					computingAllowed = false;
				} else {
					operator = '*';
					computingAllowed = false;
				}
			}
		});

		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operator != ' ') {
					operator = '/';
					computingAllowed = false;
				} else {
					operator = '/';
					computingAllowed = false;
				}
			}
		});

		equality.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!firstPress && computingAllowed) {
					if (operator == '+')
						digit1 = result = digit1 + digit2;
					if (operator == '-')
						digit1 = result = digit1 - digit2;
					if (operator == '/')
						digit1 = result = digit1 / digit2;
					if (operator == '*')
						digit1 = result = digit1 * digit2;
				}
				resultChange();
				// nowFirstDigit = true;
			}
		});
	}

	private void resultChange() {
		visibleLine.setText("Result: " + result);
	}

	public static void main(String... strings) {
		USourceCalculator usc = new USourceCalculator();
		usc.setVisible(true);
		usc.pack();

	}

}
