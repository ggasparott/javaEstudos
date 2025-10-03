package ExercData;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public boolean isBissexto() {
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        }
        return false;
    }

    public Data(int dia, int mes, int ano) {
        if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
        
    }
    // Getters
    public int getDia() {
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getAno() {
        return this.ano;
    }

    public String getAnoExtenso() {
        String nomeAno;
        switch (this.ano) {
            case 1:
                nomeAno = "Janeiro";
                break;
            case 2:
                nomeAno = "Fevereiro";
                break;
            case 3: 
                nomeAno = "Março";
                break;
            case 4:
                nomeAno = "Abril";
                break;
            case 5: 
                nomeAno = "Maio";
                break;
            case 6: 
                nomeAno = "Junho";
                break;
            case 7:
                nomeAno = "Julho";
                break;
            case 8:
                nomeAno = "Agosto";
                break;
            case 9:
                nomeAno = "Setembro";
                break;
            case 10:
                nomeAno = "Outubro";
                break;
            case 11:
                nomeAno = "Novembro";
                break;
            case 12:
                nomeAno = "Dezembro";
                break;
            default:
                nomeAno = "Mês Invalido";
                break;
        }
        return nomeAno;
        
    }

    public int compara(Data outraData) {
    // Nível 1: Comparar os anos
    if (this.ano > outraData.getAno()) {
        return 1;
    } else if (this.ano < outraData.getAno()) {
        return -1;
    } else { 
        
        
        
        if (this.mes > outraData.getMes()) {
            return 1;
        } else if (this.mes < outraData.getMes()) {
            return -1;
        } else {
            
            if (this.dia > outraData.getDia()) {
                return 1;
            } else if (this.dia < outraData.getDia()) {
                return -1;
            } else {
                
                return 0;
            }
        }
    }
    }
    
    public Data clone() {
    return new Data(this.dia, this.mes, this.ano);
}
}
