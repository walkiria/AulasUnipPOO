package aula5;

public class ExcecaoEx4 {

	public static void main(String[] args) {

		//classe Throwable


		int[] vetor1 = {4,8,16,28,32,128};
		int[] vetor2 = {2,4,0,8};

		for (int i = 0; i < vetor1.length; i++) {
			try {
				System.out.println(vetor1[i] + "/" + vetor2[i] + "=" + (vetor1[i]/vetor2[i]) );	
			} 
			
			//NAO USAR ASSIM
//			catch (Throwable e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//
//			}

			//USAR ASSIM
			catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		}
	}

}
