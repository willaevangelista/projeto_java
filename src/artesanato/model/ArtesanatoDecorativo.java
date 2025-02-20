package artesanato.model;

public class ArtesanatoDecorativo extends Artesanato {
	
	private String tema;

	public ArtesanatoDecorativo(int tipoArtesanato, 
			int numeroArtesanato, 
			String nomeArtesanato, 
			String nomeArtesao,
			String categoria, 
			String tecnica, 
			String materiaPrincipal, 
			String estilo, 
			float preco, 
			String tema) {
		
		super(tipoArtesanato, numeroArtesanato, nomeArtesanato, nomeArtesao, categoria, tecnica, materiaPrincipal,
				estilo, preco);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	

}
