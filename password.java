package mail;
import java.util.*;

public class password {

	static Scanner sc;
	public static String output1="no out put",reVal="",fun="bad";
	public static String cap="",smal="",num="",simb="";

	public static int a,len;
	public static char c,b1,b2,b3;

	public static void main( String [] args ) {
		sc= new Scanner(System.in);
		String password=sc.next();
		output1=userMethod(password);
		
		System.out.println( output1 );
	}

	public static String userMethod(String password) {
		len=password.length();
		if(7<len&&len<29) {
			reVal=alpha(password);
			if(reVal=="alpha") {
				reVal=end(password);
				if(reVal=="end") {
					reVal=minreq(password);
					if(reVal=="minreq") {
						reVal=char3(password);
						if(reVal=="char3") {
							fun="valid";
						}
						else {
							fun="invalid";
						}
					}else {
						fun= "invalid";
					}
					
				}else {
					fun= "invalid";
				}
			}else {
				fun= "invalid";
			}
		}else {
			fun= "invalid";
		}
		return fun;
	}
	
	public static String alpha(String password){
			c=password.charAt(0);
			a=c;
			if(a>64&&a<91||a>96&&a<123) {
				fun= "alpha";
			}
		return fun;
	}
	
	public static String end(String password) {
		//!, @, #, $, %, ^, &, *, (, )
		c=password.charAt(len-1);
		a=c;
		if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')') {
			fun="end";
		}else {
			fun="bad";
		}
	return fun;
	}
	
	
	public static String minreq(String password){

		for(int i=0;i<len;i++) {
			c=password.charAt(i);
			a=c;
			if(a>64&&a<91) {
				cap+=c;
			}
			else if(a>96&&a<123) {
				smal+=c;
			}
			else if(a>47&&a<58) {
				num+=c;
			}else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')') {
				simb+=c;
			}
		}
		if(cap.length()>=1) {
			
			if(smal.length()>=2) {
	
			
			if(num.length()>=2) {

			
			if(simb.length()>=1) {
				fun= "minreq";
			}
			}else {
				fun="bad";
			}
			}else {
				fun="bad";
			}
		}
		else {
			fun="bad";
		}
		
	return fun;
	
	}
	
	public static String char3(String password){

			b1=password.charAt(0);
			b2=password.charAt(1);
			b3=password.charAt(2);
		if(b1==b2&&b2==b3) {
			fun="bad";
		}else {
			fun="char3";
		}
		return fun;
	}
}

