package exercProd;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, String codigo, double preco, String autor) {

        super(nome, codigo, preco);
        this.autor = autor;

    }

 // Métodos de Acesso para a classe Livro

    public String getAutor() {
        return autor;
    }

// Métodos de modificação

    public void setAutor(String autor) {

    this.autor = autor;
 }


 // Metodos De Comportamento
    @Override
    public String exibirMensagem() {
    String detalhesProdutos = super.exibirMensagem();
    return detalhesProdutos + " | Autor: " + this.autor;
    }
}
