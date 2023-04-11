import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//집합 전체에서 처음에는 다 같을 경우 제외
		//n n n 그 다음 두개만 같은경우 제외 n n m ,n m n,m n n  
		
		int max;
		if (a>b) {
			if (a>c) {
				max=a;
			} else {
				max=c;
			}
		} else {
			if (b>c) {
				max=b;
			} else {
				max=c;
			}
		}
		
		int same;
		if (a==b) {
			same = a;
		} else {
			same = c;
		}

		if (a==b && a==c) {
			System.out.println(10000+(a*1000));
		} else if (a!=b && a!=c && b!=c) {
			System.out.println(max*100);

		} else {
			System.out.println(1000 + (same*100));
		}

	}
}