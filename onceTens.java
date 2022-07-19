import java.util.*;
public class onceTens {
	public static Scanner sc;
	public static int aa=0,k=0,l;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int [] arr=new int[4];
		System.out.println("enter three dig number:");
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the 10's value to add:");
		int nm= sc.nextInt();
		if(nm==0) {
			k=10;
		}else if(nm==1){
			for(int i=0;i<3;i++) {
				if(arr[i]<10) {
					arr[i]=1;
				}else {
				arr[i]=arr[i]/10;
				}
			}	

			k=10;
		}else if(nm==2){
			for(int i=0;i<3;i++) {
				if(arr[i]<100) {
					arr[i]=2;
				}else {
				arr[i]=arr[i]/100;
				}
			}

			k=10;
		}
		
		for(int i=0;i<3;i++) {
			l=arr[i]%k;
			System.out.print(l+"+");
			aa+=l;
		}
		System.out.println(aa);

		
	}

}
