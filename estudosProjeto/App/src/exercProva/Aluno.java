package exercProva;

public class Aluno {
    // atributos
    private double notaP1;
    private double notaP2;
    private String matricula;
    private String nome;
    private double notaTrabalho;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    
    public double getNotaTrab() {
        return notaTrabalho;
    }
    // Setters
    
    public void setNotaP1(double notaP1) {
        if(notaP1 > 0) {
            this.notaP1 = notaP1;
        } else {
            new Error("Nota não pode ser definida");
        }
    }

    public void setNotaP2(double notaP2) {
        if(notaP2 > 0){
          this.notaP2 = notaP2;
        } else {
            throw new IllegalArgumentException("A nota tem que estar entre 0 e 10");
        }
    }

    
    public void setNotaTrab(double notaTrabalho) {
        if(notaTrabalho > 0) {
          this.notaTrabalho = notaTrabalho;
        }
    }
    
    public double media() {
    double mediaCalculada = ((this.notaP1 * 2.5) + (this.notaP2 * 2.5) + (this.notaTrabalho * 2.0)) / 7.0;
    return mediaCalculada;
}
    public double calcularMediaFinal() {
        double mediaAtual = this.media();
        if(mediaAtual >= 7) {
            return 0.0;
        } else {
            double notaNecessaria = 10 - mediaAtual;
            return notaNecessaria;
        }
    }

    public String exibirMensagem() {
      return this.nome + "(" + this.matricula + ") " + this.media() + this.calcularMediaFinal();
    }
}
