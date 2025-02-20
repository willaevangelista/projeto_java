package artesanato.repository;

import artesanato.model.Artesanato;

public interface ArtesanatoRepository {
	
	// CRUD do Artesanato
    public void adicionarArtesanato(Artesanato artesanato); 
    public void listarTodosArtesanatos(); 
    public void buscarPorNumero(int numeroArtesanato); 
    public void atualizarArtesanato(Artesanato artesanato); 
    public void excluirArtesanato(int numeroArtesanato); 
    
    // Métodos Adicionais
    public void verNovidadesArtesanais(); 
    public void listarArtesanatosPorCategoria(String categoria); 
    public void listarArtesanatosTecnicasMaisUsadas(String tecnica); 

}
