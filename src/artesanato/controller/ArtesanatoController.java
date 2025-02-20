package artesanato.controller;

import java.util.ArrayList;
import artesanato.model.Artesanato;
import artesanato.repository.ArtesanatoRepository;

public class ArtesanatoController implements ArtesanatoRepository {
	
	private ArrayList<Artesanato> listaArtesanatos = new ArrayList<Artesanato>();
	int numeroArtesanato = 0;
	
	@Override
	public void adicionarArtesanato(Artesanato artesanato) {
		listaArtesanatos.add(artesanato);
		System.out.println("\nO Artesanato número: " + artesanato.getNumeroArtesanato() +  " foi criada com sucesso!");
		
		
	}
	
	@Override
	public void listarTodosArtesanatos() {
		for (var artesanato : listaArtesanatos) {
			artesanato.visualizar();
		}
		
	}
	
	@Override
	public void buscarPorNumero(int numeroArtesanato) {
		var artesanato = buscarNaCollection(numeroArtesanato);
		
		if (artesanato != null) {
			artesanato.visualizar();
		} else {
			System.out.println("\nO Artesanato número: " + numeroArtesanato + " não foi encontrado!");
		}
		
	}
	
	@Override
	public void atualizarArtesanato(Artesanato artesanato) {
		var buscaArtesanato = buscarNaCollection(artesanato.getTipoArtesanato());
		
		if (buscaArtesanato != null) {
			
			listaArtesanatos.set(listaArtesanatos.indexOf(buscaArtesanato), artesanato);
			System.out.println("\n O Artesanato número: " + artesanato.getTipoArtesanato() + " foi atualizado com sucesso!");
			
			
		} else {
			
			System.out.println("\nA O Artesanato número: " + artesanato.getTipoArtesanato() + " não foi encontrado!");
			
		}
		
	}
	
	@Override
	public void excluirArtesanato(int numeroArtesanato) {
		var artesanato = buscarNaCollection(numeroArtesanato);
		
		if (artesanato != null) {
			
			if (listaArtesanatos.remove(artesanato) == true) {
				
				System.out.println("\nO artesanato número: " + numeroArtesanato + " foi deletado com sucesso!");
				
			}
			
		} else {
			
			System.out.println("\nO artesanato número: " + numeroArtesanato + " não foi encontrado!");
		}
		
	}
	
	@Override
	public void verNovidadesArtesanais() {
		
		if (listaArtesanatos.isEmpty()) {
	        System.out.println("\nNão há novidades artesanais no momento.");
	        return;
	    } else {
	    	
	    		System.out.println("\nÚltimos Artesanatos Adicionados:\n");
		    
		    int limite = Math.min(5, listaArtesanatos.size());
		    
		    for (int i = listaArtesanatos.size() - limite; i < listaArtesanatos.size(); i++) {
		     
		    		System.out.println(listaArtesanatos.get(i).getNomeArtesanato());
	    	
		    }
	    }
		
	}
	
	
	public int gerarNumero() {
		
		return ++ numeroArtesanato;
		
	}
	
	public Artesanato buscarNaCollection (int numeroArtesanato) {
		
		for (var artesanato : listaArtesanatos) {
			if (artesanato.getNumeroArtesanato () == numeroArtesanato) {
				return artesanato;
			}
		}
		
		return null;
	}

}
