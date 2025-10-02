package exercProva;

public class testeJava {
    public static void main(String[] args) {
        Aluno gaspa = new Aluno(12345, "Gabriel Gasparotto");

    try {

        // Settar os dados necessários
        gaspa.setNotaP1(1.2);
        gaspa.setNotaP2(5.0);
        gaspa.setNotaTrab(10);
    } catch (IllegalArgumentException e) {
        System.err.println("!! ERRO AO ATRIBUIR A NOTA !!");
        System.err.println("Motivo: " + e.getMessage());
    }
        System.out.println(gaspa.exibirMensagem());
        double notaFinal = gaspa.calcularMediaFinal();
        System.out.println("Nota necessária para a final: " + String.format("%.2f", notaFinal));
    }
}
