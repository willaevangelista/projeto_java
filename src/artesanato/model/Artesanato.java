package artesanato.model;

public abstract class Artesanato {
	
	private int tipoArtesanato;
	private int numeroArtesanato;
	private String nomeArtesanato;
	private String nomeArtesao;
	private String tecnica;
	private String estilo;
	private float preco;
	
	public Artesanato(int tipoArtesanato, 
			int numeroArtesanato, 
			String nomeArtesanato, 
			String nomeArtesao,
			String tecnica, 
			String estilo, 
			float preco) {
	
		this.tipoArtesanato = tipoArtesanato;
		this.numeroArtesanato = numeroArtesanato;
		this.nomeArtesanato = nomeArtesanato;
		this.nomeArtesao = nomeArtesao;
		this.tecnica = tecnica;
		this.estilo = estilo;
		this.preco = preco;
	}
	
	public int getTipoArtesanato() {
		return tipoArtesanato;
	}



	public void setTipoArtesanato(int tipoArtesanato) {
		this.tipoArtesanato = tipoArtesanato;
	}



	public int getNumeroArtesanato() {
		return numeroArtesanato;
	}



	public void setNumeroArtesanato(int numeroArtesanato) {
		this.numeroArtesanato = numeroArtesanato;
	}



	public String getNomeArtesanato() {
		return nomeArtesanato;
	}



	public void setNomeArtesanato(String nomeArtesanato) {
		this.nomeArtesanato = nomeArtesanato;
	}



	public String getNomeArtesao() {
		return nomeArtesao;
	}



	public void setNomeArtesao(String nomeArtesao) {
		this.nomeArtesao = nomeArtesao;
	}


	public String getTecnica() {
		return tecnica;
	}



	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}



	public String getEstilo() {
		return estilo;
	}



	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}


	public void visualizar() {

		@SuppressWarnings("unused")
		String tipo = "";
		
		switch(this.tipoArtesanato) {
		
		case 1:
			
			tipo = "Artesanato Decorativo";
			break;
			
		case 2:
			
			tipo = "Artesanato Funcional";
			break;
		
		default:
           
			tipo = "Tipo desconhecido"; 
            break;
		}
	
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Artesanato:");
		System.out.println("***************************************************************");
		System.out.println("Nome do Artesanato: " + this.nomeArtesanato);
		System.out.println("Nome do(a) Artesão(ã): " + this.nomeArtesao);
		System.out.println("Tecnica: " + this.tecnica);
		System.out.println("Estilo do Artesanato: " + this.estilo);
		System.out.println("Preço da Peça " + this.preco);
	}


}
