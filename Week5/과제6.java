package myJava;
import java.util.Scanner;
public class 과제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,s;
		float s1;
		int var=0;
		
		String c = "a";
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			
			s = (a*b*5);
			s1 = (float)s/10;
			System.out.println(s1);
			System.out.println("Continue?");
			c = sc.next();
			switch (c) {
			case "Y": var=1; break;
			case "y": var=1; break;
			default : var=0; break;
			}
		}while(var!=0);
	}

}
