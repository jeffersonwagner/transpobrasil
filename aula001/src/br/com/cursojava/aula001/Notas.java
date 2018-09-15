package br.com.cursojava.aula001;

public class Notas {
	
	public static void main(String[] args) {
		double x = 10;
		double y = 9;
		double z = 8;
		System.out.println("Notas: "+ x +", " + y + ", " + z);
		System.out.println("Média: " + avg(x,y,z));
	}
	
	public static double avg(double x, double y, double z) {
		return (x+y+z)/3;
	}

}
