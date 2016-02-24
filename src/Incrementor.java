import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// �����: ������ ������, cyril-usachov@ukr.net
public class Incrementor extends JFrame {
	private int result = 0;
	private JLabel resultLine;
	private JButton increment;

	// �����������
	public Incrementor() {
		// ��������� ����
		super("Incrementor");
		// �����, ������� ��������� ������ � ������������� ��� �������
		setBounds(300, 50, 300, 100); // -- ����� �� ������������

		// �����, ������� ������������� �������� �������� ����,
		// ������� ������ ����� ���������, ������������, ���
		// ������ ����� ����������� ����� �������� ����.
		// � ������ ������, ����� �������� ���� ������ ����������.
		// ����� ������� �� ���������� ��������� ��������� EXIT_ON_CLOSE.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �������
		resultLine = new JLabel("Result: " + result);

		// ������ increment
		increment = new JButton("Increment");

		// ������� ������ � �������� (������ ���� JPanel)
		JPanel buttonsPanel = new JPanel(new FlowLayout());

		// �� ������ � �������� ��������� ������ increment
		buttonsPanel.add(increment);

		// � ������ ��������� ������� resultLine
		// � ��������� � "�� ������"
		add(resultLine, BorderLayout.NORTH);

		// � ������ ��������� ������ � �������� buttonsPanel
		// � ��������� � "�� ���"
		add(buttonsPanel, BorderLayout.SOUTH);

		// ������� ������ ���������� ActionListener, ��������
		// ��� ���� ����� actionPerformed, � ������� ���������� ��
		// ��������, ������� ��� ���������� ����������
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++; // �������������� result
				resultChange(); // �������� ����������, ��� ���������� result
								// ����������
			}
		};

		// ��������� ���������� ������ increment � ������� ������
		// addActionListener, �������� ������� ������ al
		// ���������� ActionListener � �������������
		// ������� actionPerformed, ������� � ��������� �������� ������
		increment.addActionListener(al);
	}

	// ������ ������� resultLine, ��������� � ��� ��������� ���������
	private void resultChange() {
		resultLine.setText("Result: " + result);
	}

	public static void main(String... strings) {
		Incrementor tp = new Incrementor();
		tp.setVisible(true);
		// ��� ������� ��������� ����������� ������ � ����������� �� �����������
		// ����
		// tp.pack(); -- ����� �� ������������

	}

}
