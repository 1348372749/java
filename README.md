# 大数据181 刘显阳 2018310975  
## 一.实验目的  
**掌握字符串String及其方法的使用  
掌握异常处理结构**  
## 二.实验要求  
**利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：  
1.每7汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2.允许提供输入参数，统计古诗中某个字或词出现的次数  
3.考虑操作中可能出现的异常，在程序中设计异常处理程序  
输入：  
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行  
输出：  
汉皇重色思倾国,御宇多年求不得.  
杨家有女初长成,养在深闺人未识.  
天生丽质难自弃,一朝选在君王侧.  
回眸一笑百媚生,六宫粉黛无颜色.  
春寒赐浴华清池,温泉水滑洗凝脂.  
侍儿扶起娇无力,始是新承恩泽时.  
云鬓花颜金步摇,芙蓉帐暖度春宵.  
春宵苦短日高起,从此君王不早朝.  
承欢侍宴无闲暇,春从春游夜专夜.  
后宫佳丽三千人,三千宠爱在一身.  
金屋妆成娇侍夜,玉楼宴罢醉和春.  
姊妹弟兄皆列士,可怜光采生门户.  
遂令天下父母心,不重生男重生女.  
骊宫高处入青云,仙乐风飘处处闻.  
缓歌慢舞凝丝竹,尽日君王看不足.  
渔阳鼙鼓动地来,惊破霓裳羽衣曲.  
九重城阙烟尘生,千乘万骑西南行.**  
## 三.过程  
**首先创建类，在类中构造函数将字符串赋值，以及构建对字符串整理对齐和统计词频的方法。  
在字符串的整理对齐的方法中，对字符串遍历，每间隔14个字符执行一次操作，每次操作包括按顺序用substring（）取7个字加“，”，取后7个字加“。”加换行符“\n”，再取剩余的全部字符，然后将此字符串重新赋值给原字符串。重复此操作直至遍历到字符串末尾。  
在统计词频的方法中，先用length（）获取查询对象字符串的长度，对整理对其后的字符串遍历，按顺序每次将与要查询的字符串长度一样长的前几个字符提取出来，用equals（）判断与查询的对象是否一样，一样则count+1，不一样则继续。重复此操作直至遍历到字符串末尾。  
再创建测试类，先用构造函数定义一个内容为《长恨歌》未整理的字符串，然后建立一个窗体加入，添加输入框JTextField获取统计词频对象和两个按钮JButton执行整理对齐和统计词频的操作。先调用构建的整理对齐的方法，两个按钮再分别执行用提示框输出整理对齐的结果和调用统计词频的方法并用提示框输出结果。**  
## 四.流程图  
![image](https://github.com/1348372749/java/blob/master/images/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)  
## 五.核心代码  
```javascript  
public String adds() {  
        int strlenth=strings.length();  
        if(strlenth<7) {
                System.out.println(strings);  
        }  
        else {  
    	        for(int i=1;i<=strlenth;i++) {  
      	                if (i%14==0) {  
        	                strings=strings.substring(0, i-7+i/7-3+i/14)+","+strings.substring(i-7+i/7-3+i/14,i+i/7-3+i/14)+"."+"\n"+strings.substring(i+i/7-3+i/14,strlenth+i/7-3+i/14);  
                        }  
                }  
        }  
        return strings;  
}  
public int counts(String s) {
        int strlenth=strings.length();
	int slenth=s.length();
	int count=0;
	for(int i=0;i<=strlenth-slenth;i++) {
		if(strings.substring(i,i+slenth).equals(s)) {
			count=count+1;
		}
	}
	return count;
}
String b=a.adds();
jb1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, b);
	}
});
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
```  
# 六.运行结果  
![image](https://github.com/1348372749/java/blob/master/images/%E8%BF%90%E8%A1%8C1.png)  
![image](https://github.com/1348372749/java/blob/master/images/%E8%BF%90%E8%A1%8C2.png)  
![image](https://github.com/1348372749/java/blob/master/images/%E8%BF%90%E8%A1%8C3.png)
