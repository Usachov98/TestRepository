import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Автор: Кирилл Усачёв, cyril-usachov@ukr.net
public class Incrementor extends JFrame {
	private int result = 0;
	private JLabel resultLine;
	private JButton increment;

	// Конструктор
	public Incrementor() {
		// Заголовок окна
		super("Incrementor");
		// Метод, который размещает окошко и устанавливает его размеры
		setBounds(300, 50, 300, 100); // -- можно не использовать

		// Метод, который устанавливает оператор закрытия окна,
		// который являет собой константу, определяющую, что
		// именно будет происходить после закрытия окна.
		// В данном случае, после закрытия весь процес завершится.
		// Этого эффекта мы добиваемся благодаря константе EXIT_ON_CLOSE.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Надпись
		resultLine = new JLabel("Result: " + result);

		// Кнопка increment
		increment = new JButton("Increment");

		// Создаем панель с кнопками (объект типа JPanel)
		JPanel buttonsPanel = new JPanel(new FlowLayout());

		// На панель с кнопками добавляем кнопку increment
		buttonsPanel.add(increment);

		// В окошко добавляем надпись resultLine
		// и размещаем её "по северу"
		add(resultLine, BorderLayout.NORTH);

		// В окошко добавляем панель с кнопками buttonsPanel
		// и размещаем её "по югу"
		add(buttonsPanel, BorderLayout.SOUTH);

		// Создаем объект интерфейса ActionListener, реализуя
		// при этом метод actionPerformed, в котором записываем те
		// действия, которые нам необходимо произвести
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++; // инкрементируем result
				resultChange(); // Сообщаем приложению, что переменная result
								// поменялась
			}
		};

		// Добавляем функционал кнопке increment с помощью метода
		// addActionListener, которому передаём объект al
		// интерфейса ActionListener с реализованным
		// методом actionPerformed, который и выполняет основную работу
		increment.addActionListener(al);
	}

	// Меняем надпись resultLine, отображая в ней изменённый результат
	private void resultChange() {
		resultLine.setText("Result: " + result);
	}

	public static void main(String... strings) {
		Incrementor tp = new Incrementor();
		tp.setVisible(true);
		// Эта команда подбирает оптимальный размер в зависимости от содержимого
		// окна
		// tp.pack(); -- млжно не использовать

	}

}
