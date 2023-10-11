import java.util.Scanner;
public class Q9_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("수학,과학,영어 순으로 3개의 정수 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Q9_Grade stu1 = new Q9_Grade(a,b,c);
		System.out.println("평균은 "+ stu1.average());
		sc.close();
	}

}
