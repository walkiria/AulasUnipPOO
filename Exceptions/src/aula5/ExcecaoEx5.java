package aula5;

import java.util.Scanner;

public class ExcecaoEx5 {
	
	public static void main(String[] args) {
		//passr a responsabilidade para quem vai usar o metodo -- JAVA WEB tem lugar especifico para tratar
		System.out.println("Entre com um numero");
		
		//nao consegue chamar o metodo sem tratar
		//double num = lerNumero();
		
		try {
			double num = lerNumero();
		} catch (Exception e) {
			System.out.println("entrada invalida");
			e.printStackTrace();
			
			
			//PARA O USUARIO COLOCAR UMA MENSAGEM AMIGAVEL E NAO PASSAR DADOS SENSIVEIS DO PROGRAMA
		}
		
		
	}
	
	public static double lerNumero()  throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
