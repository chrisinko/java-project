
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum=0;
		do {
			sum=0;
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a+b;
			if (sum!=0) {
				System.out.println(sum);
			}
		}while (a!=0 && b!=0);
	}
}