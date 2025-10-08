package ExercCompleto;

public class Mago extends Personagem implements Magia {
    protected int pontosDeMana;

    public Mago(String nome, int pontosDeAtaque, int pontosDeVida, int pontosDeMana, boolean estaVivo) {
        super(nome, pontosDeAtaque, pontosDeVida, estaVivo);
        this.pontosDeMana = pontosDeMana;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("Mago: " + getNome() + "lança um feitiço simples em: " + alvo);

    }

    @Override
    public void lancarMagia(Personagem alvo) throws ManaInsuficienteException {
        if(this.pontosDeMana >= 10) {
            this.pontosDeMana -= 2;
            int danoMagico = this.pontosDeAtaque * 2;
            alvo.receberDano(danoMagico);
        } else {
            throw new ManaInsuficienteException( this.nome + " Sem mana suficiente");
        }       
        
    }
}
