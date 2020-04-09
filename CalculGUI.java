import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculGUI extends JFrame {
	private JButton button = new JButton("Выполнить расчет");
	
	private JTextField input1 = new JTextField("",4);
	private JTextField input2 = new JTextField("",4);
	private JTextField input3 = new JTextField("",4);
	private JTextField input4 = new JTextField("",4);
	private JTextField input5 = new JTextField("",4);
	
	private JLabel label1 = new JLabel("Количество отработанных дней:");
	private JLabel label2 = new JLabel("Оклад, руб.:");
	private JLabel label3 = new JLabel("Премия, руб.:");
	private JLabel label4 = new JLabel("Количество рабочих дней в месяце:");
	private JLabel label5 = new JLabel("Заработная плата сотрудника составит, руб.:");
	
	public CalculGUI() {
		super("Калькулятор расчета заработной платы"); 
		this.setBounds(100, 100,800, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		input5.disable();
		
		container.add(label1);
		container.add(input1);
		
		container.add(label2);
		container.add(input2);
		
		container.add(label3);
		container.add(input3);
		
		container.add(label4);
		container.add(input4);
		
		container.add(label5);
		container.add(input5);
		
		//������� ����������� ������� ��������
		input1.setText("0");
		input2.setText("0");
		input3.setText("0");
		input4.setText("0");
		
		button.addActionListener(new ButtonEventListener());
		container.add(button);
	}