package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TesteEstoque {

	public static void main(String[] args) {

		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("-----------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("-----------------------------------------------");
			System.out.println("\nDigite a sua opção: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não encontrado!!!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+" : ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não encontrado!!!");
				}
				System.out.println("\n"+estoque);
				break;
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa!!!");
			}
		}while(op!=0);


	}

}
