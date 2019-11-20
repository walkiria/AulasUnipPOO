package aula5;

public class ExcecaoEx6 {

	public static void main(String[] args) {
		int[] vetor1 = {4,8,5, 16,28,32,128};
		int[] vetor2 = {2,4,0,8};

		for (int i = 0; i < vetor1.length; i++) {
			try {
				if(vetor1[i] %2 !=0) {
					
					//aqui vc pode criar sua propria excecao
					throw new Exception("Numero impar");
				}

				System.out.println(vetor1[i] + "/" + vetor2[i] + "=" + (vetor1[i]/vetor2[i]) );	
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
