package musica;


import java.util.Scanner;
import musica.util.Cores;

public class Menu {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int opcao;
        
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CINEMOVIES E-COMMERCE                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Filme                      ");
			System.out.println("            2 - Listar todas os Filmes               ");
			System.out.println("            3 - Buscar Filme por Código              ");
			System.out.println("            4 - Atualizar Dados do Filme             ");
			System.out.println("            5 - Excluir Filme                        ");
			System.out.println("            6 - Adicionar Filme ao Carrinho          ");
			System.out.println("            7 - Exibir Carrinho                      ");
			System.out.println("            8 - Finalizar Compra                     ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("Informe com a opção desejada:                        ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");

                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println("Saque\n\n");

					break;
				case 7:
					System.out.println("Depósito\n\n");

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
    }
	
	public static void sobre () {
			
		System.out.println("\n*********************************************************");					
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	
	}
}

