import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculGUI extends JFrame {
	private JButton button = new JButton("��������� ������");
	
	private JTextField input1 = new JTextField("",4);
	private JTextField input2 = new JTextField("",4);
	private JTextField input3 = new JTextField("",4);
	private JTextField input4 = new JTextField("",4);
	private JTextField input5 = new JTextField("",4);
	
	private JLabel label1 = new JLabel("���������� ������������ ����:");
	private JLabel label2 = new JLabel("�����, ���.:");
	private JLabel label3 = new JLabel("������, ���.:");
	private JLabel label4 = new JLabel("���������� ������� ���� � ������:");
	private JLabel label5 = new JLabel("���������� ����� ���������� ��������, ���.:");
	
	public CalculGUI() {
		super("����������� ������� ���������� �����"); 
		this.setBounds(100, 100,800, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		input5.disable();