import Implementation.SupermarketArray;
import Implementation.supermarket;

import java.util.Scanner;


public class Main {
	
	private final static int SIZE = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		supermarket supermarket = new SupermarketArray(SIZE);
		int opcao ;
		do {
			System.out.print("Lista de Compras");
			System.out.print("1 - Inserir");
			System.out.print("2 - Listar");
			System.out.print("3 - Remover");
			System.out.print("4 - Sair");
			System.out.print("Escolha uma opção");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o item a ser inserido");
				String item = scanner.next();
				supermarket.add(item);
				break;
			case 2:
				supermarket.print();
				break;
			case 3:
				System.out.print("Digite a posição do item a ser removido: ");
				int index = scanner.nextInt();
				break;
			
			case 4:
				System.out.println("Saindo do programa...");
				break;
			default :
				System.out.println("Opção invalida Por favor, escolha novamente.");
			}
				
		}while (opcao != 4);
		
		scanner.close();

	}

}
