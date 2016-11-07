/*Write a program that asks the user for a number n and gives him the possibility
 *  to choose between computing the sum and computing the product of 1,…,n.*/
package print;
import java.util.Scanner;
class sum_operation{
	void printt41(){
		int sum=0,j,n;
		System.out.println("enter a number:\n");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(j=1;j<=n;j++){
			sum=sum+j;
		}
		System.out.println("Sum of 1 to "+n+"is "+sum);
	}
}
class product_operation{
	void printt42(){
		int j,prod=1,n;
		System.out.println("enter a number:\n");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(j=1;j<=n;j++){
			prod = prod*j;
		}
		System.out.println("Product of numbers 1 to "+n+"is "+prod);
	}
}
public class TaskThree {

	public static void main(String[] args) {
		int i;
		System.out.println("enter a option:\n1.sum from 1 to n\n2.product from 1 to n");
        Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
        if(i == 1){
        	sum_operation so = new sum_operation();
        	so.printt41();
        }else{
        	product_operation po = new product_operation();
        	po.printt42();
        }
	}

}
