package ExercVoo;

public class Voo {
    private int numeroVoo;
    private int dataVoo;
    private boolean[] assentosVoo = new boolean[100];
    
    public Voo(int numeroVoo, int dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
    }

    public int getNumeroVoo() {
        return this.numeroVoo;
    }
    public int getData() {
        return this.dataVoo;
    }

    public int proximoLivre() {
       for (int i = 0; i < assentosVoo.length; i++) {
            if(this.assentosVoo[i] == false) {
                return 1;
            } 
       }
       return 0;
    }
    public boolean verifica(int numeroCadeira) {
        int indice = numeroCadeira - 1;
        return this.assentosVoo[indice];
    }

    public boolean ocupa(int numeroCadeira) {
        boolean assento = verifica(numeroCadeira);
        int indice = numeroCadeira - 1;
        if(assento == false) {
            this.assentosVoo[indice] = true;
        } else {
        return false;
        }
    }
}