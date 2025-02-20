package artesanato.model;

public class Artesanato {
	
	private String nomeArtesanato;
	private String nomeArtesao;
	private String categoria;
	private String tecnica;
	private String materiaPrima;
	private float preco;
	
	public Artesanato(String nomeArtesanato, String nomeArtesao, String categoria, String tecnica, String materiaPrima,
			float preco) {
		super();
		this.nomeArtesanato = nomeArtesanato;
		this.nomeArtesao = nomeArtesao;
		this.categoria = categoria;
		this.tecnica = tecnica;
		this.materiaPrima = materiaPrima;
		this.preco = preco;
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

	public String getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
