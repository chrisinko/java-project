import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0;i<a;i++) {
			for (int j=0;j<a;j++) {
				if (j%5==0) {
					System.out.print("1 ");
				}else if (j%5==1) {
					System.out.print("3 ");
				}else if (j%5==2) {
					System.out.print("5 ");
				}else if (j%5==3) {
					System.out.print("7 ");
				}else if (j%5==4) {
					System.out.print("9 ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
