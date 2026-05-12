package Atividade_montar_codigo.ENTIDADES;

public class Product {
    public String nome;
    public double preco;
    public int Quantidade;

    public double TotalNoEstoque() {
        return preco * Quantidade;
    }

    public void adicionarProduto(int valor) {
        Quantidade +=  valor;
    }

    public void removerProduto(int valor) {
        Quantidade-= valor;
    }

}
