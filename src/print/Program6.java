/*Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary 
 * size numbers, printing all primes up to the largest number you can easily represent is fine too.)*/
//definition of prime is a number is n=only divisible by 1 and itself
package print;
import java.util.Scanner;
//number should be  divisible by only 1 and itself
public class Program6 {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter a large number:\n");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		int prime;
		System.out.println("The list of prime number before "+i+"are:");
		for(int j=2;j<=i;j++){
			prime = 0;
			for(int n=2;n<j;n++){
				if(j%n==0){
					prime = 1;
					break;
				}
			}
			if(prime == 0){
				System.out.println(+j+"\n");
			}
		}
	}
}