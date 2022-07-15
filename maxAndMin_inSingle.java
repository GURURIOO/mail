package mail;
import java.util.*;

public class maxAndMin_inSingle {
	static int gg=1000,j=0;
	
	static int arb[]=new int [gg],k=0;
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF THE ARRAY : ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int ser=arr[i];
			single(ser);
		}
		for(int i=0;i<j;i++) {
			System.out.println(arb[i]);
		}
		
		
		int max=0,min=arr[0];
		for(int i=0;i<j;i++){
			if(arb[i]>max){
			max=arb[i];
			}
			if(min>arb[i]){
				min=arb[i];
			}

		}
		System.out.println("the max element is "+max);
		System.out.println("the min element is "+min);
		
	}
	public static int single(int a) {
		
		while(a!=0) {
			k=a%10;
			arb[j]=k;
			a=a/10;
			j++;
		}
		return 0;
	}
}
