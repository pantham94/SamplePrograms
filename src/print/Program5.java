/*Write a program that prints a multiplication table for numbers up to 12.*/
package print;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++){
			System.out.println("Multiplication table for "+i);
			for(int j=1;j<=12;j++){
				int n=i*j;
				System.out.println(+i+"*"+j+"="+n+"\n");
	
		}
		
	}

}
}
