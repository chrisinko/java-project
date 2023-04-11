import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int y = sc.nextInt();
	int p;
	if (x>0) {
		p=1;
	}
	else {
		p=2;
	}
	
	
	
	switch (p) {
	case 1: 
		if (y>0) {
			System.out.println("1");
		}
		else {
			System.out.println("4");
		}
		break;
	case 2:
		if (y>0) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
		break;
	}
	

}
}