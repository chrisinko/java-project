
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total= sc.nextInt();
		int[] num= new int[total];
		int a;
		for (int i=0;i<total;i++) {
		a=sc.nextInt();
		num[i]= a;
		}
		int var;
		var = sc.nextInt();
		int count =0;
		for (int j=0;j<total;j++) {
			if (num[j]==var) {
				count++;
			}
		}
		System.out.println(count);
	}
}