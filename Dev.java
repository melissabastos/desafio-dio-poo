package br.com.digitalinnovationone.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootCamp(Bootcamp bootcamp){
        bootcamp.getStartDate();
        bootcamp.getDevs().add(this);
        this.conteudosInscritos.addAll(bootcamp.getContents());


    }

    public void progredir(){

        Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
        else
            System.out.println("La tua lista è vuota. ");
    }

    public double calcularXP(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
