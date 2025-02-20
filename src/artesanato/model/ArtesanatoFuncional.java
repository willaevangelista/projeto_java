package artesanato.model;

public class ArtesanatoFuncional extends Artesanato {
	
	private String tipoUso;

	public ArtesanatoFuncional(int tipoArtesanato, 
			int numeroArtesanato, 
			String nomeArtesanato, 
			String nomeArtesao,
			String categoria, 
			String tecnica, 
			String materiaPrincipal, 
			String estilo, 
			float preco, 
			String tipoUso) {
		
		super(tipoArtesanato, numeroArtesanato, nomeArtesanato, nomeArtesao, categoria, tecnica, materiaPrincipal,
				estilo, preco);
		this.tipoUso = tipoUso;
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}

	
	
}
