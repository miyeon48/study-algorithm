package study.dp;

/* 백준 problem/1463 
 * 
 * 피보나치 수는 0과 1로 시작한다. 
 * 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Fibonacci {

	public long getFibonacci(int n) {
		long[] array = new long[n + 1];

		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == 1)
				array[i] = i;
			else {
				array[i] = array[i - 1] + array[i - 2];
			}

		}

		return array[n];
	}

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo.getFibonacci(n));
	}

}
