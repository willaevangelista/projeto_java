package artesanato;


import java.util.Scanner;
import artesanato.util.Cores;

public class Menu {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int opcao;
        
				
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
			System.out.println("      7 - Listar Artesanatos por Categoria           ");
			System.out.println("      8 - Listar Artesanais Técnicas Mais Usadas     ");
			System.out.println("      9 - Sair                                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("Informe com a opção desejada:                        ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nArtesanando – Cada peça, uma história feita à mão!");

                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar Artesanato\n\n");

					break;
				case 2:
					System.out.println("Listar todas os Artesanatos\n\n");

					break;
				case 3:
					System.out.println("Buscar Artesanato por Número\n\n");

					break;
				case 4:
					System.out.println("Atualizar Dados do Artesanato\n\n");

					break;
				case 5:
					System.out.println("Excluir Artesanato\n\n");

					break;
				case 6:
					System.out.println("Ver Novidades Artesanais\n\n");

					break;
				case 7:
					System.out.println("Listar Artesanatos por Categoria\n\n");

					break;
				case 8:
					System.out.println("Listar Artesanais Técnicas Mais Usadas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
    }
	
	public static void sobre () {
			
		System.out.println("\n*********************************************************");					
		System.out.println("Projeto Desenvolvido por: Willa Evangelista");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	
	}
}

