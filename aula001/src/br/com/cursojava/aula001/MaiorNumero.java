package br.com.cursojava.aula001;

public class MaiorNumero {
	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int c = 25;
		int d = 10;
		int result = Math.max(a,Math.max(b,Math.max(c,d)));
		System.out.println(result);
		
	}
}
