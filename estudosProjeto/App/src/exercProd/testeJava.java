package exercProd;

public class testeJava {
    public static void main(String[] args) {
        Produto caneta = new Produto("Caneta Bic Azul", "123457", 4.99);

        System.out.println(caneta.exibirMensagem());

        caneta.setPreco(5.99);

        System.out.println(caneta.exibirMensagem());
    }
}
 