import java.util.*;
public class onceTens {
	public static Scanner sc;
	public static int aa=0,k=0,l;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
//		int [] arr=new int[4];
//		System.out.println("enter three dig number:");
//		for(int i=0;i<3;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("enter the 10's value to add:");
//		int nm= sc.nextInt();
//		if(nm==0) {
//			k=10;
//		}else if(nm==1){
//			for(int i=0;i<3;i++) {
//				arr[i]=arr[i]/10;
//			}	
//
//			k=10;
//		}else if(nm==2){
//			for(int i=0;i<3;i++) {
//				arr[i]=arr[i]/100;
//			}
//
//			k=10;
//		}
//		
//		for(int i=0;i<3;i++) {
//			l=arr[i]%k;
//			System.out.print(l+"+");
//			aa+=l;
//		}
//		System.out.println(aa);

		int n1,n2,n3,n4,sum=0;
		
		System.out.println("enter the n1 :");
		n1=sc.nextInt();
		System.out.println("enter the n2 :");
		n2=sc.nextInt();
		System.out.println("enter the n3 :");
		n3=sc.nextInt();
		System.out.println("enter the n4 :");
		n4=sc.nextInt();
		
		if(n4==0) {
			
			sum+=n1%10;
			sum+=n2%10;
			sum+=n3%10;
	
		}
		else if(n4==1) {
			n1=n1/10;
			n2=n2/10;
			n3=n3/10;
			
			sum+=n1%10;
			sum+=n2%10;
			sum+=n3%10;
	
		}
		else if(n4==2) {
			
			n1=n1/100;
			n2=n2/100;
			n3=n3/100;
			
			sum+=n1%10;
			sum+=n2%10;
			sum+=n3%10;
	
	
		}
		else {
			System.out.println("enter the correct value for n4");
		}
			
		System.out.printf("the sum of %d's is = %d",n4,sum);
		
	}

}
