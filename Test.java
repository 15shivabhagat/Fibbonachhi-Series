package p2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Number of Test Cases");
		    int t=sc.nextInt();
		    if(t>0 && t<=10){
		      String str = sc.nextLine();
		      char arr[]=str.toCharArray();
		      for(int i=0; i<t-3; i++){
		        if(arr[i]==arr[i+1]&&(arr[i+1]==arr[i+2])) {
		        	System.out.println("Dynamic");
		        }else {
		        	System.out.println("Not");
		        }
		      }
		      }
		     else{
		      System.out.println("Enter Valied Test Cases");
		      }
		      }
	}


