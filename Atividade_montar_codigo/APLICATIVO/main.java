package Atividade_montar_codigo.APLICATIVO;
import Atividade_montar_codigo.ENTIDADES.Product;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner sc = new Scanner(System.in);
       Product produto = new Product();
        System.out.println("Digite o nome  do produto:");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto:");
        produto.preco = sc.nextDouble();
        System.out.println("Digite a quantidade:");
        produto.Quantidade = sc.nextInt();

        System.out.println("Quantos produtos deseja adicionar?");
        int adicionar = sc.nextInt();
        produto.adicionarProduto(adicionar);

        System.out.println("Quantos produtos deseja remover?");
        int remover = sc.nextInt();
        produto.removerProduto(remover);

        System.out.println("Dados atualizados: ");
        System.out.println("nome:" + produto.nome);
        System.out.println("Preço do produto:" + produto.preco);
        System.out.println("Quantidade do produto:" + produto.Quantidade);
    }
}
