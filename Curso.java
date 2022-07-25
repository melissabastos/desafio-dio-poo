package br.com.digitalinnovationone.dominio;

public class Curso extends Conteudo{

    private int totalhours;



    public int getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(int totalhours) {
        this.totalhours = totalhours;
    }

    @Override
    public double calcularXP() {
        return XP_STANDARD * totalhours;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "name='" + getName()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", totalhours=" + totalhours +
                '}';
    }
}
