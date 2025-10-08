package ExercCompleto;

public class ManaInsuficienteException extends Exception{
    public ManaInsuficienteException(String mensagem) {
        super(mensagem);
    }
    public ManaInsuficienteException() {
        super("Mana insuficiente para lançar a magia!");
    }
}
