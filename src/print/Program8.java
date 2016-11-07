//Write a program that prints the next 20 leap years. Next modify to 
//print all the leap years between two given dates
package print;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.println("Enter a year number:");
		i = scan.nextInt();
		System.out.println("The next 20 leap years are:");
		if(i%4==0){
			System.out.println(i+" are \n");
			for(int j=0;j<19;j++){
				i = i+4;
				System.out.println(i+"\n");
			}
		}else if(i%4==1){
			i=i+3;
			System.out.println(i+" \n");
			for(int j=0;j<19;j++){
				i = i+4;
				System.out.println(i+"\n");
			}
		}else if(i%4==2){
			i=i+2;
			System.out.println(i+"\n");
			for(int j=0;j<19;j++){
				i = i+4;
				System.out.println(i+"\n");
			}
		}else{
			i=i+1;
			System.out.println(i+"\n");
			for(int j=0;j<19;j++){
				i = i+4;
				System.out.println(i+"\n");
			}
		}
		
	}

}
