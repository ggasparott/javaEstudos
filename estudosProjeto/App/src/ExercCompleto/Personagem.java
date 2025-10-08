package ExercCompleto;

public abstract class Personagem {
    protected String nome;
    protected int pontosDeVida;
    protected int pontosDeAtaque;
    protected boolean estaVivo;

    public Personagem(String nome, int pontosDeAtaque, int pontosDeVida, boolean estaVivo){
        this.nome = nome;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeVida = pontosDeVida;
        this.estaVivo = true;


    }
    public String getNome() {
        return this.nome;
    }

    public int getPontosDeVida() {
        return this.pontosDeVida;
    }

    public int getPontosDeAtaque() {
        return this.pontosDeAtaque;
    }
    
    public boolean getEstaVivo() {
        return this.estaVivo;
    }



    public void receberDano(int dano) {
        this.pontosDeVida -= dano;
        if(this.pontosDeVida < 0) {
            this.estaVivo = false;
        }
    }

    public void exibirInfo() {
        System.out.println("Campeão: " + getNome() + "Pontos de Ataque: " + getPontosDeAtaque() + 
        "Pontos de Vida: " + getPontosDeVida() + "Esta vivo: " + getEstaVivo());
    }

    public abstract void atacar(Personagem alvo);
}
