package print;
import java.util.Scanner;
public class English_To_Piglatin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to convert from english to pig latin:\n");
		String s = scan.next();
		String s1 = new String();
		int len = s.length();
		s1 = s.substring(1,len)+s.charAt(0)+"ay";
		System.out.println("Answer is:");
		System.out.println(s1);
	}
}
