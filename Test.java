package poem;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Test extends JFrame {
	private static final long serialVersionUID = 1L;
	Seperate a = new Seperate("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������");
	public Test(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("�����޸衷����");
		setBounds(700, 300, 300, 150);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("ͳ�ƴʣ�");
		jl.setBounds(0, 0, 20, 18);
		final JTextField stuff=new JTextField(15);
		cp.add(jl);
		cp.add(stuff);
		JButton jb1=new JButton("�������");
		JButton jb2 = new JButton("�ֻ�ʳ��ִ���");
		cp.add(jb1);
		cp.add(jb2);
		try{
			String b=a.adds();
			jb1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, b);
				}
			});
		}catch(Exception e) {
			System.out.print("�쳣");
		}
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(stuff.getText().trim().length()==0){
					JOptionPane.showMessageDialog(null, "ͳ�ƴʲ���Ϊ��");
					return;
				}
				else{
					JOptionPane.showMessageDialog(null, a.counts(stuff.getText().trim()));
				}
			}
		});
	}
	
	public static void main(String[] args) {
		Test l = new Test();
		l.setSize(300, 150);
		l.setVisible(true);
	}
}
