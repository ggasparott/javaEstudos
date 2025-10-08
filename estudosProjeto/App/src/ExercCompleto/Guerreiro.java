package ExercCompleto;

public class Guerreiro extends Personagem {
      
    public Guerreiro(String nome, int pontosDeVida, int pontosDeAtaque, boolean estaVivo) {
        super(nome, pontosDeAtaque, pontosDeVida, estaVivo);
    }
    
    @Override
    public void atacar(Personagem alvo) {
        System.out.println("Guerreiro: " + this.nome + "ataca: " + alvo.nome);
        alvo.receberDano(this.pontosDeAtaque);
    }
}
