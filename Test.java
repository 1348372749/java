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
	Seperate a = new Seperate("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行");
	public Test(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("《长恨歌》整理");
		setBounds(700, 300, 300, 150);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("统计词：");
		jl.setBounds(0, 0, 20, 18);
		final JTextField stuff=new JTextField(15);
		cp.add(jl);
		cp.add(stuff);
		JButton jb1=new JButton("整理对齐");
		JButton jb2 = new JButton("字或词出现次数");
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
			System.out.print("异常");
		}
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(stuff.getText().trim().length()==0){
					JOptionPane.showMessageDialog(null, "统计词不能为空");
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
