package repet;
import java.util.*;
public class repet {
    private static Scanner scan;
    static int n,a=0;
    static int []arb=new int[1000];
    public static void main(String[] args) {
        scan=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        n=scan.nextInt();
        int []arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=scan.nextInt();
    }
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    a=0;
    System.out.println("\n");
    int len =arr.length;
    rem(arr,len);
    System.out.println("\n");
    }
    public static void sort(int [] arr) {
        while (a<arr.length*arr.length) {
            for (int i = 0; i < arr.length-1; i++) {
                int u=0;
                    if (arr[i]>arr[i+1]) {
                        u=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=u;
                    }
                    a++;
            }
        }
    }
    public static void rem(int [] arr,int n) {
        int arb[]=new int[9099];
       int  j=0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]) {
                arb[j++]=arr[i];
            }           
        }
        arb[j++]=arr[n-1];
        for (int i = 0; i < j; i++) {
            System.out.print(arb[i]); 
        }    
    }
}
    
