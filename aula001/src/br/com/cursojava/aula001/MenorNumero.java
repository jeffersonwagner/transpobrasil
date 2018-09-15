package br.com.cursojava.aula001;

public class MenorNumero {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 20;
		int d = 30;
		int result = Math.min(a,Math.min(b,Math.min(c,d)));
		System.out.println(result);
		
	}
}
