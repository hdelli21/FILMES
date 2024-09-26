public class FILME {
//Atributos
	public String titulo;
	public String genero;
	public float duracao; 

	// Construtor padrão (sem parâmetros)
	FILME() {
	}

	// Construtor completo com sobrecarga
	public FILME(String titulo, String genero, float duracao) {
		this.titulo = titulo;
		this.genero = genero;
		 // Arredonda a duração para 2 casas decimais
		this.duracao = arredondarDuracao(duracao);
	}
	 // Getter para o título do filme
	public String getTitulo() {
		return titulo;
	}
	 // Setter para o título do filme, com validação para garantir que o título não seja vazio
	public void setTitulo(String titulo) {
		validarTitulo(titulo); // Valida o título antes de atribuir
		this.titulo = titulo;
	}
	  // Getter para a duração do filme
	public float getDuracao() {
		return duracao;
	}

	// Setter para a duração (em horas), arredondando para 2 casas decimais
	public void setDuracao(float duracao) {
		validarDuracao(duracao);// Verifica se a duração é válida
		this.duracao = arredondarDuracao(duracao);
	}

    // Setter para a duração em minutos (converte para horas e arredonda para 2 casas decimais)
	public void setDuracao(int duracaoMinutos) {
		  // Converte os minutos em horas
		float duracaoHoras = duracaoMinutos / 60.0f;
		
		validarDuracao(duracaoHoras);// Valida a duração convertida
		
		this.duracao = arredondarDuracao(duracaoHoras);
	}
	 // Getter para o gênero do filme
	public String getGenero() {
		return genero;
	}
	// Setter para o gênero do filme, com validação para aceitar apenas gêneros pré-definidos
	public void setGenero(String genero) {
		validarGenero(genero);// Valida o gênero antes de atribuir
		this.genero = genero;
	}

	// Método para arredondar a duração para 2 casas decimais
	public float arredondarDuracao(float duracao) {
		return Math.round(duracao * 100.0f) / 100.0f;
	}
	// Valida o título para garantir que ele não esteja vazio
	public void validarTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("O título não pode estar vazio.");
		}
	}
	 // Valida a duração para garantir que seja maior que zero
	public void validarDuracao(float duracao) {
		if (duracao <= 0) {
			throw new IllegalArgumentException("A duração deve ser maior que zero.");
		}
	}
    // Valida o gênero, permitindo apenas 'Romance', 'Terror' ou 'Comédia'
	public void validarGenero(String genero) {
		if (!genero.equalsIgnoreCase("Romance") && !genero.equalsIgnoreCase("Terror")
				&& !genero.equalsIgnoreCase("Comédia")) {
			throw new IllegalArgumentException("O gênero deve ser 'Romance', 'Terror' ou 'Comédia'.");
		}
	}
}
