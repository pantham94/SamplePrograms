/*Write a program that asks the user for a number n and prints the sum of the numbers 1 to n*/
/*Modify the previous program such that only multiples of three or five are considered in the 
 * sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17*/

package print;
import java.util.Scanner;
class Testme{
	void me(){
		int i;
		int sum = 0;
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		for(int j = 1; j<=i;j++){
			if(j % 3 == 0||j % 5 == 0){
			sum = sum+j;
			System.out.println(j);
			}else{
				//do nothing;
			}
		}
		System.out.println("the sum of numbers from 1 to "+i+" is "+sum);	
	}
}
public class TaskTwo {
	public static void main(String[] args) {
		Testme tm = new Testme();
		tm.me();
	}

}
