import java.util.Scanner;
public class Q12_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Q12_Won2Dollar toDollar = new Q12_Won2Dollar(1200);
		toDollar.run();
		
		Q13_Km2Mile toMile = new Q13_Km2Mile(1.6);
		toMile.run();
		sc.close();
	}

}
