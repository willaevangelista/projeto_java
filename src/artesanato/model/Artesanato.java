package artesanato.model;

public abstract class Artesanato {
	
	private int tipoArtesanato;
	private int numeroArtesanato;
	private String nomeArtesanato;
	private String nomeArtesao;
	private String categoria;
	private String tecnica;
	private String materiaPrincipal;
	private String estilo;
	private float preco;
	
	public Artesanato(int tipoArtesanato, 
			int numeroArtesanato, 
			String nomeArtesanato, 
			String nomeArtesao,
			String categoria, 
			String tecnica, 
			String materiaPrincipal, 
			String estilo, 
			float preco) {
	
		this.tipoArtesanato = tipoArtesanato;
		this.numeroArtesanato = numeroArtesanato;
		this.nomeArtesanato = nomeArtesanato;
		this.nomeArtesao = nomeArtesao;
		this.categoria = categoria;
		this.tecnica = tecnica;
		this.materiaPrincipal = materiaPrincipal;
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



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getTecnica() {
		return tecnica;
	}



	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}



	public String getMateriaPrincipal() {
		return materiaPrincipal;
	}



	public void setMateriaPrincipal(String materiaPrincipal) {
		this.materiaPrincipal = materiaPrincipal;
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
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Tecnica: " + this.tecnica);
		System.out.println("Material Principal Utilizado: " + this.materiaPrincipal);
		System.out.println("Estilo do Artesanato: " + this.estilo);
		System.out.println("Preço da Peça " + this.preco);
	}


}
