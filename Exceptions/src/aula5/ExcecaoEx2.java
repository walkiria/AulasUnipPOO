package aula5;

public class ExcecaoEx2 {

	
	//Contornando a excecao com try catch e ex de bloco finally	 e exemplo de quando o finally nao é executado
	public static void main(String args[]) {

	
			try {
				int[] vetor = new int[4];
				
				System.out.println("Antes da excecao");
				
			//	vetor[4] = 1;
				
				System.out.println("Nao sera impresso");
				
		//		System.exit(0);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Excecao capturada");
				
				//System.exit(0);
				
				
			}
			finally {
				System.out.println("Executando o finally");
			}
	}
}
