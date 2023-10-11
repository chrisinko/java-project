import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] cl= new int[4];
		for (int i=0;i<4;i++) {
			System.out.println((i+1)+"class?");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			cl[i] = a+b+c;
		}
		for (int i=0;i<4;i++) {
			System.out.println((i+1)+"class : "+cl[i]);
		}
		sc.close();
	}

}
