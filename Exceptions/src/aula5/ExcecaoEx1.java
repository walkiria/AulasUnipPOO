package aula5;

public class ExcecaoEx1 {

	//ex de acesso a posicao que nao existe
	public static void main(String args[]) {
		
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da excecao");
		
		vetor[4] = 1;
		
		System.out.println("Nao sera impresso");
		
		
			}
}
