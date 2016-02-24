package UCoreCalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import Incrementor;

// Автор: Кирилл Усачёв, cyril-usachov@ukr.net
public class SimpleIncrementor extends JFrame {
	private int result = 0;
	private JLabel resultLine;
	private JButton increment;

	public SimpleIncrementor() {
		super("Incrementor");
		setBounds(300, 50, 300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultLine = new JLabel("Result: " + result);
		increment = new JButton("Increment");
		JPanel buttonsPanel = new JPanel(new FlowLayout());
		buttonsPanel.add(increment);
		add(resultLine, BorderLayout.NORTH);
		add(buttonsPanel, BorderLayout.SOUTH);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result++;
				resultChange();
			}
		};
		increment.addActionListener(al);
	}

	private void resultChange() {
		resultLine.setText("Result: " + result);
	}

	public static void main(String... strings) {
		SimpleIncrementor tp = new SimpleIncrementor();
		tp.setVisible(true);

	}

}
