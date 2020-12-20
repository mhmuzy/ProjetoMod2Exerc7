package Hitss.Treinamento.Apresentacao;

public class Show {
	public static void main(String[] args) {
		try {
			System.out.println("");
			System.out.println("         Hitss Treinamento");
			System.out.println("");
			for (int i = 15; i <= 200; i++) {
				
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
