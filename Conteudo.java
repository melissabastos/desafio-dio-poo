package br.com.digitalinnovationone.dominio;

public abstract class Conteudo {
    private String name;
    private String description;

    protected static final double XP_STANDARD = 10;

    public Conteudo() {
    }

    public abstract double  calcularXP();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
