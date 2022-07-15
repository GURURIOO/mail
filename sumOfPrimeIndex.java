package mail;
import java.util.*;

public class sumOfPrimeIndex {
	static Scanner sc;
	static int q=2,ans=0;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF THE ARRAY : ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int G=0;
			G=i;
			q=prime(G);
			if(q==1) {
				System.out.println("index : "+i+"  "+arr[i]);
				ans+=arr[i];
			}	
		}
		System.out.println(ans);
	}
	public static int prime(int a) {
		
		int f=0;
		int T=1,F=0;
		if(a==0 || a==1){
			return F;
		}else {
			for (int i = 2; i <= a / 2;i++) {
				if (a % i == 0) {
					f++;					
				}	
			}
		}
		if(f==0) {
		return T;
		}else {
		return F;
		}
	}
}
