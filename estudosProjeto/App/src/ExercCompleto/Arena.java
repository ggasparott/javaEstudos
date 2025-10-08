package ExercCompleto;

public class Arena {
    public static void main(String[] args) {
        Guerreiro aragorn = new Guerreiro("Gaspa", 100, 50, true);
        Mago fiot = new Mago("Chiarelli", 110, 75, 100, true);

        Arena Coliseu =  new Arena();
        Coliseu.iniciarBatalha(aragorn, fiot);
    }   
     public void iniciarBatalha(Personagem p1, Personagem p2) {
        System.out.println("===== A BATALHA COMEÇOU ===== ");
        p1.exibirInfo();
        p2.exibirInfo();
        System.out.println("=========================");

        int rodada = 1;

        while (p1.getEstaVivo() && p2.getEstaVivo()) {
            System.out.println("\n--- Rodada: " + rodada + "---");

            System.out.println("Turno de " + p1.nome + ":");
            if(p1 instanceof Mago){
                try {
                    ((Magia) p1).lancarMagia(p2);
                } 
                catch (ManaInsuficienteException e) {
                    System.out.println(e.getMessage() + "Usando ataque básico.");
                    p1.atacar(p2);
                }

            } else {
                p1.atacar(p2);
            }
            p2.exibirInfo();

            if(p2.getEstaVivo()) {
                System.out.println("Turno de: " + p2.nome);
                if(p2 instanceof Magia) {
                    try {
                        ((Magia) p2).lancarMagia(p1);
                    } catch (ManaInsuficienteException e) {
                        System.out.println(e.getMessage() + "Usando ataque basico.");
                    }
                } else {
                    p2.atacar(p1);
                }
                p1.exibirInfo();
            }
            rodada++;
        }
        System.out.println("------- FIM DA BATALHA ------");
        if(p1.getEstaVivo()) {
            System.out.println("O ganhandor foi o: " + p1.nome);
        } else {
            System.out.println("O ganhandor foi o: " + p2.nome);
        }
    }
}
