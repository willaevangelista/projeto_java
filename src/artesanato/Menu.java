package artesanato;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import artesanato.controller.ArtesanatoController;
import artesanato.util.Cores;
import artesanato.model.ArtesanatoDecorativo;
import artesanato.model.ArtesanatoFuncional;

public class Menu {
    public static void main(String[] args) {
    	
    		ArtesanatoController artesanato = new ArtesanatoController();
        
        Scanner leia = new Scanner(System.in);
        
        int opcao, tipo, numeroArtesanato = 0;
        String nomeArtesanato, nomeArtesao, tecnica, estilo, tema, tipoUso;
        float preco;
        
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("         ARTESANANDO - ARTIGOS FEITOS A MAO          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("      1 - Adicionar Artesanato                       ");
			System.out.println("      2 - Listar todas os Artesanatos                ");
			System.out.println("      3 - Buscar Artesanato por Número               ");
			System.out.println("      4 - Atualizar Dados do Artesanato              ");
			System.out.println("      5 - Excluir Artesanato                         ");
			System.out.println("      6 - Ver Novidades Artesanais                   ");
			System.out.println("      7 - Sair                                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("Informe com a opção desejada:                        ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			

			try {
				
				opcao = leia.nextInt();
			
			} catch (InputMismatchException e) {
				
				System.out.println("\nPor favor, digite somente valores inteiros!");
				
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println("\nArtesanando – Cada peça, uma história feita à mão!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "\nAdicionar Artesanato\n\n");
					
					System.out.println("\nDigite o Nome do Artesanato");
					leia.skip("\\R?");
					nomeArtesanato = leia.nextLine();
					
					System.out.println("\nDigite o Nome do Artesão: ");
					leia.skip("\\R?");
					nomeArtesao = leia.nextLine();
					
					System.out.println("\nInforme a Técnica de Confecção do Artesanato: ");
					System.out.println("Exemplo - Crochê, Macramê, Costura, Pintura, etc.");
					leia.skip("\\R?");
					tecnica = leia.nextLine();
					
					System.out.println("\nInforme Estilo do Artesanato: ");
					System.out.println("Exemplo - Rústico, Vintage, Minimalista, etc.");
					leia.skip("\\R?");
					estilo = leia.nextLine();
					
					System.out.println("\nInforme Preço do Artesanato: ");
					leia.skip("\\R?");
					preco = leia.nextFloat();
					
						
					do {
							
						System.out.println("\nDigite o Tipo de Artesanato (1 - Artesanato Decorativo ou 2 - Artesanato Funcional): ");
						tipo = leia.nextInt();
							
							
					} while (tipo < 1 && tipo > 2);
						
						switch(tipo) {
						
							case 1 -> {
								
								System.out.println("\nInforme o Tema do Artesanato: ");
								System.out.println("Exemplo - Natal, Páscoa, Halloweeen, Festa Junina, etc.");
								leia.skip("\\R?");
								tema = leia.nextLine();
								
								artesanato.adicionarArtesanato(new ArtesanatoDecorativo(numeroArtesanato, artesanato.gerarNumero(),nomeArtesanato, nomeArtesao, tecnica, estilo, preco, tema)); 
							
							}
							
							case 2 -> {
								
								System.out.println("\nInforme o Tipo de Funcionalidade do Artesanato: ");
								System.out.println("Exemplo - Utensílios, Organizadores, Móveis, etc.");
								leia.skip("\\R?");
								tipoUso = leia.nextLine();
								artesanato.adicionarArtesanato(new ArtesanatoFuncional(numeroArtesanato, artesanato.gerarNumero(),nomeArtesanato, nomeArtesao, tecnica, estilo, preco, tipoUso)); 
								
							} 
							
						}
						
						keyPress();

						break;
			case 2:
				
				System.out.println(Cores.TEXT_WHITE + "\nListar todas os Artesanatos\n\n");
				artesanato.listarTodosArtesanatos();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "\nBuscar Artesanato por Número\n\n");
				
				System.out.println("Digite o número do Artesanato: ");
				numeroArtesanato = leia.nextInt();
				
				artesanato.buscarPorNumero(numeroArtesanato);

				keyPress();
				break;
				
			case 4:
				
				System.out.println(Cores.TEXT_WHITE + "Atualizar Dados do Artesanato\n\n");
				
				System.out.println("Informe o número do Artesanato: ");
				numeroArtesanato = leia.nextInt();
				
				var buscarPorNumero = artesanato.buscarNaCollection(numeroArtesanato);
				
				if (buscarPorNumero != null) {
					
					tipo = buscarPorNumero.getTipoArtesanato();
					
					System.out.println("\nDigite o Nome do Artesanato");
					leia.skip("\\R?");
					nomeArtesanato = leia.nextLine();
					
					System.out.println("\nDigite o Nome do Artesão: ");
					leia.skip("\\R?");
					nomeArtesao = leia.nextLine();
					
					System.out.println("\nInforme a Técnica de Confecção do Artesanato: ");
					System.out.println("Exemplo - Crochê, Macramê, Costura, Pintura, etc.");
					leia.skip("\\R?");
					tecnica = leia.nextLine();
					
					System.out.println("\nInforme Estilo do Artesanato: ");
					System.out.println("Exemplo - Rústico, Vintage, Minimalista, etc.");
					leia.skip("\\R?");
					estilo = leia.nextLine();
					
					System.out.println("\nInforme Preço do Artesanato: ");
					leia.skip("\\R?");
					preco = leia.nextFloat();
					
					do {
						
						System.out.println("\nDigite o Tipo de Artesanato (1 - Artesanato Decorativo ou 2 - Artesanato Funcional): ");
						tipo = leia.nextInt();
							
							
					} while (tipo < 1 && tipo > 2);
					
						switch (tipo) {
						
							case 1 -> {
								
								System.out.println("\nInforme o Tema do Artesanato: ");
								System.out.println("Exemplo - Natal, Páscoa, Halloweeen, Festa Junina, etc.");
								leia.skip("\\R?");
								tema = leia.nextLine();
								
								artesanato.atualizarArtesanato(new ArtesanatoDecorativo(numeroArtesanato, artesanato.gerarNumero(),nomeArtesanato, nomeArtesao, tecnica, estilo, preco, tema));
								
							}
							
							case 2 -> {
								
								System.out.println("\nInforme o Tipo de Funcionalidade do Artesanato: ");
								System.out.println("Exemplo - Utensílios, Organizadores, Móveis, etc.");
								leia.skip("\\R?");
								tipoUso = leia.nextLine();
								
								artesanato.atualizarArtesanato(new ArtesanatoFuncional(numeroArtesanato, artesanato.gerarNumero(),nomeArtesanato, nomeArtesao, tecnica, estilo, preco, tipoUso));
								
									
							} 
							
							default -> {
							
								System.out.println("Tipo de artesanato inválido!");
							}
						}
					
				} else {
					
					System.out.println("O Artesanato informado não foi encontrado!");
					
				}
				
				
				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "\nExcluir Artesanato\n\n");
				System.out.println("Informe o número do Artesanato: ");
				leia.skip("\\R?");
				
				tipo = leia.nextInt();
				artesanato.excluirArtesanato(tipo);
	
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE + "\nVer Novidades Artesanais\n\n");
		
			    artesanato.verNovidadesArtesanais();
			    
			    keyPress();
				break;
			}
		}
	}
    
    public static void sobre() {
		
		System.out.println("\n*********************************************************");					
		System.out.println("Projeto Desenvolvido por: Willa Evangelista");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	
	}
	
    public static void keyPress() {
    	
		try {
			
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
			
		} catch (IOException e) {
			
			System.out.println("Você pressionou uma tecla diferente de enter!");
			
		}
    	
    }
	
}

