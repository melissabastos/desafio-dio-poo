package br.com.digitalinnovationone.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime startdDate;


    public LocalDateTime getStartdDate() {
        return startdDate;
    }

    public void setStartdDate(LocalDateTime startdDate) {
        this.startdDate = startdDate;
    }

    @Override
    public double calcularXP() {
        return XP_STANDARD + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", startdDate=" + startdDate +
                '}';
    }
}
