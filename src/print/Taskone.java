package print;
import java.util.Scanner; 
class Tests{
    int greet(){
		System.out.println("Enter user name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
	    if(name.equals("Pranathi") | name.equals("Ramesh")){
			System.out.println("Hello \n"+name);
		}else{
			System.out.println(name);
		}
	    SecondTest st = new SecondTest();
	    return st.greetthem();
	}
}
class SecondTest{
	 int greetthem(){
	 System.out.println("Do you want to continue? y or n");
	 Scanner scan = new Scanner(System.in);
	 String userOption = scan.next();
	 if(userOption.equals("y")){
	    	return 1;
	    }else{
	    	return 0;
	    }
	}
}
public class Taskone {
	public static void main(String[] args){
		Tests t = new Tests();
		int userOption;
		do{
		    userOption = t.greet();
	    }while(userOption == 1);
		System.out.println("end of the program");
	}
}