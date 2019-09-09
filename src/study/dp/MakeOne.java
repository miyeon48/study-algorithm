package study.dp;

/* 백준 problem/1463 
 * 
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * 1) X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2) X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3) 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
*/
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {

	public long getMinValue(int n){
		
		long []array = new long[n+1];
		
		array[1] = 0;
		
		for(int i = 2; i < array.length; i++ ){
			if(i % 3 == 0) 
				array[i] = Math.min(array[i], array[i/3] + 1); 
			if(i % 2 == 0) 
				array[i] = Math.min(array[i], array[i/2] + 1); 
		}
		return array[n];
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		MakeOne minValue = new MakeOne();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		System.out.println(minValue.getMinValue(n));

	}

}
