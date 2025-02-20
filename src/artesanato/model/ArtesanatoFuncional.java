package artesanato.model;

public class ArtesanatoFuncional extends Artesanato {
	
	private String tipoUso;

	public ArtesanatoFuncional(int tipoArtesanato, 
			int numeroArtesanato, 
			String nomeArtesanato, 
			String nomeArtesao,
			String tecnica, 
			String estilo, 
			float preco, 
			String tipoUso) {
		
		super(tipoArtesanato, numeroArtesanato, nomeArtesanato, nomeArtesao, tecnica,
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
