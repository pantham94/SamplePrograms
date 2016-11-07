package print;
import java.util.Scanner;
//except 2 and 5, no other number cannot end with 2 and 5
public class Program6part2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("Enter a number:");
		i = scan.nextInt();
		for(int n=2;n<=i;n++){
		    if((n%10!=2&&n%10!=5)&&(n!=2&&n!=5)&&(n%10!=0)&&(n%2!=0)){
		    	System.out.println(+n+"is a prime number");
		    }else if(n==2||n==5){
		    	System.out.println(+n+"is a prime number");
		    }else{
		    	System.out.println(+n+"is not a prime number");
		    }
		}    
	}
}
