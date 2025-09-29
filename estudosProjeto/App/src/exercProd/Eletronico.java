package exercProd;

public class Eletronico extends Produto implements Garantia {
    private String voltagem;



    public Eletronico(String nome, String codigo, double preco, String voltagem) {
        super(nome, codigo, preco);
        this.voltagem = voltagem;

    }



 // Métodos De Acesso ( Getters )

    public String getVoltagem() {

        return voltagem;

    }


 // Métodos De Modificação ( Setters )

    public void setVoltagem(String voltagem) {

    this.voltagem = voltagem;

    }

 // Métodos De Comportamento

  @Override

    public String exibirMensagem() {
      String detalhesProdutos = super.exibirMensagem();

      return detalhesProdutos + "| Voltagem: " + this.voltagem;

    }
  @Override
  public int calcularGarantiaEmMeses() {
    return 12;
  
  }

  @Override
  public void acionarGarantia() {
    System.out.println("Garantia do produto " + getNome() + " acionada. Levar na assistência técnica.");
  }
}
