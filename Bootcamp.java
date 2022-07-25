package br.com.digitalinnovationone.dominio;

import com.sun.source.doctree.SeeTree;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDateTime startDate = LocalDateTime.now();
    private final LocalDateTime finishDate = startDate.plusDays(45);
    private Set<Conteudo> contents = new LinkedHashSet<>();

    private Set<Dev> devs = new HashSet<>();


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

    public LocalDateTime getStartDate() {
        return startDate;
    }


    public LocalDateTime getFinishDate() {
        return finishDate;
    }


    public Set<Conteudo> getContents() {
        return contents;
    }

    public void setContents(Set<Conteudo> contents) {
        this.contents = contents;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finishDate, bootcamp.finishDate) && Objects.equals(contents, bootcamp.contents) && Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finishDate, contents, devs);
    }
}
