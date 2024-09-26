
public class MAINFILME {
	public static void main(String[] args) {

		// Cria uma instância da classe
		FILME filme1 = new FILME();

		// Modificando o título e a duração
		filme1.setTitulo("O Senhor dos Anéis: A Sociedade do Anel");
		filme1.setDuracao(178);
		filme1.setGenero("Comédia");
		System.out.println("Título: " + filme1.getTitulo());
		System.out.println("Título: " + filme1.getGenero());
		System.out.println("Duração: " + filme1.getDuracao() + " horas");

	}

}
