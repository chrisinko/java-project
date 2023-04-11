import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		// 시간은 0시부터 23시간 분은 0에서 60분 근데 걸리는 시간이 최대 1000분 ==16시간 다 더하면 17시간까지 가능
		// 신경 쓸 포인트 : 시간이 23시 넘어갈 때와 m+t가 1시간,2시간-----17시간까지 넘는걸 시간으로 넘겨야 하는것
		int var = h + (m+t)/60; 
		
				if (var>=24) {
					System.out.println( (var-24) + " " + (m+t)%60);
				} else {
					System.out.println( var + " " + (m+t)%60);
				}

	}
}