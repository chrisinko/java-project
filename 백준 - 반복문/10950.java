import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lim = sc.nextInt();
		int a;
		int b;
		for (int i=1;i<=lim;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
