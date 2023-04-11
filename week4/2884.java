import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		switch(h) {

		case 0: 
			if (m>=45) {
				System.out.println(h + " " + (m-45));
			}
			else {
				h = 23;
				System.out.println(h + " " + (15+m));
			}
			break;
		default: 

			if (m>=45) {
				System.out.println(h + " " + (m-45) );
			}
			else {
				System.out.println( (h-1) + " " + (15+m) );
			break;
			}

		}

	}
}