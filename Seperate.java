package poem;

public class Seperate {
	private String strings;
	public Seperate(String strings) {
		this.strings=strings;
	}
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
	
}
