package exercProd;

public class Produto {
    // Atributos
    private String nome;
    private String codigo;
    private double preco;
    
    // Construtor
    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    // Getters - Métodos de Acesso
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    //Setters - Métodos de Modificação
    public void setPreco(double preco) {
        if(preco > 0){
           this.preco = preco;
        } else {
            System.out.println("ERRO - 400");
        }   
    }
    // Métodos de comportamento
    public String exibirMensagem() {
        return this.nome + " (" + this.codigo + ") - R$ " + String.format("%.2f", this.preco);
    }
}
