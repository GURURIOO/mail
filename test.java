package barath;
import java.util.Scanner;
public class test {
		public static void main(String args[]){
	      Scanner  sc = new Scanner(System.in);
	        System.out.print("Enter size of Array : ");
	        int a = sc.nextInt();
	        int[] arr=new int[a];
	        System.out.println("Enter the Array Elements : ");
	        for(int i =0 ; i < arr.length ; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("\nArray in original order : ");
	        for(int i =0 ; i < arr.length ; i++){
	        System.out.print(arr[i] + " ");
	        }
	        
	        System.out.println("\n\nArray in reverse order : ");
	        for(int i = arr.length-1 ; i >= 0 ; i--){
	        System.out.print(arr[i] + " ");
	}

}}


