
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODdO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int b1 = (b%10);	//a곱하기 b를10으로 나눈 나머지(1의자리 숫자)
		int b10 = (  ((b%100)-b1)/10 ); 
		int b100 = ((b-(b1+b10*10))/100);
		System.out.println(a*b1);          
		System.out.println(a*b10);
		
		System.out.println(a*((b-(b1+b10*10))/100));
		System.out.println(a*b);
		
		//System.out.println(b1);
		//System.out.println(b10);
		//System.out.println(b100);
		
		
		
		
		
		
	}

}
