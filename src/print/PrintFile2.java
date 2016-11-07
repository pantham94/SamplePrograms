package print;

public class PrintFile2 {
	public static void main(String[] args){
		String s = 3+2+"hello"+6+4+"pranathi";
		System.out.println(s);
		int i=0112;
		String newLine = System.getProperty("line.separator");
		System.out.println(s+newLine+i);
	}

}
