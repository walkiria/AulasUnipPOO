package aula5;

public class ExcecaoEx3 {
	
	
	//multiple catchs
	public static void main(String[] args) {
		
		int[] vetor1 = {4,8,16,28,32,128};
		int[] vetor2 = {2,4,0,8};
		
		for (int i = 0; i < vetor1.length; i++) {
			try {
				System.out.println(vetor1[i] + "/" + vetor2[i] + "=" + (vetor1[i]/vetor2[i]) );	
			} 
			
			//multiplas excecoes
			//catch (ArithmeticException e) {
//				System.out.println("Erro ao dividir por zero ");
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Indice nao existe ");
//			}
			
			//excecao Generica
//			catch(Throwable e) {
//				System.out.println("Ocorreu um erro");
//			}
			
			//agrupar excecao
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro numerico");
			}
			
		
		}
		
		
		
	}

}
