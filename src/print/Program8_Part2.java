//print all the leap years between two given dates
package print;
import java.util.Scanner;

public class Program8_Part2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the beginning year:\n");
		i = scan.nextInt();
		System.out.println("Enter the ending year:\n");
		j = scan.nextInt();
		if(i%4==0&&j%4==0){
			i=i+4;
			for(int k=0;i+4==j;k++){
				System.out.println(i+"\n");
			}
		}else if(i%4==0&&j%4!=0){
			i=i+4;
			for(int p=0;i+4<j;p++){
				System.out.println(i+"\n");
			}
		}else if(j%4==0&&i%4!=0){
			j=j-4;
			for(int q=0;j-4>i;q--){
				System.out.println(j+"\n");
			}
		 }else{
				int r,t;
				r=i%4;
				t=j%4;
				int y = i+4-r;
				for(int z=0;y<j;z++){
					System.out.println(y+"\n");
				}
			}
		}
	}

