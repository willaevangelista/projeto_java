package artesanato.controller;

import java.util.ArrayList;
import artesanato.model.Artesanato;
import artesanato.repository.ArtesanatoRepository;
//import artesanato.model.Artesanato;

public class ArtesanatoController implements ArtesanatoRepository {
	
	private ArrayList<Artesanato> listaArtesanatos = new ArrayList<Artesanato>();
	int numeroArtesanato = 0;
	@Override
	public void adicionarArtesanato(Artesanato artesanato) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodosArtesanatos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorNumero(int numeroArtesanato) {
		var artesanato = buscarNaCollection(numeroArtesanato);
		
		if (artesanato != null) {
			artesanato.visualizar();
		} else {
			System.out.println("\nA Conta número: " + numeroArtesanato + " não foi encontrada!");
		}
		
	}
	@Override
	public void atualizarArtesanato(Artesanato artesanato) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluirArtesanato(int numeroArtesanato) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void verNovidadesArtesanais() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarArtesanatosPorCategoria(String categoria) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarArtesanatosTecnicasMaisUsadas(String tecnica) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		
		return ++ numeroArtesanato;
		
	}
	
	public Artesanato buscarNaCollection (int numeroArtesanato) {
		
		for (var conta : listaArtesanatos) {
			if (conta.getNumeroArtesanato () == numeroArtesanato) {
				return conta;
			}
		}
		return null;
	}

}
