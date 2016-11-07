package print;

public class PrintFile {
	public static void main(String[] args){
		Test t = new Test();
		t.show();
		final Test t1 = new Test();
		t1.show1();
		t1.i = 30;
		System.out.println(t1.i);
		t1.thisshow();
		int inum = 1_00_000;
		long lnum = 1_00_000;
		float fnum = 2.10_001F;
		double dnum = 2.10_12_001;
		System.out.println(dnum);
		/*System.out.println("Y"+"O");
		System.out.println('1'+'A');
		String s = new String("Geeks for Geeks");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.equals("geeks for geeks"));
		System.out.println(s.equalsIgnoreCase("geeks for geeks"));
		System.out.println(s.substring(3, 6));
		System.out.println(s.substring(4));
		String s2 = new String();
		s2 = s.concat("Pranathi");
		System.out.println(s2);
		System.out.println(s.indexOf(" "));
		System.out.println(s.indexOf("f", 3));*/
	}
}
class Test{
	int i=10;
	private int p = 10;
	void show(){
		System.out.println("Test::show() called");
	}
	void show1(){
		i = 10;
		System.out.println(i);
	}
	void thisshow(){
		int p = 40;
		System.out.println(this.p);
		System.out.println(p);
	}
}

