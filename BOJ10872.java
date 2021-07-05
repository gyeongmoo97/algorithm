package boj.단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {
	
	static int N;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		System.out.println(fac(N));
	}
	
	public static int fac(int n) {
		if(n<=1) {
			return 1;
		}
		
		return fac(n-1)*n;
	}

}
