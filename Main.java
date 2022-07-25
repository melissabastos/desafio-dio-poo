import br.com.digitalinnovationone.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

         Curso c = new Curso();
         c.setName("Java");
         c.setDescription("Introduzione a spring");
         c.setTotalhours(20);

        Curso c1 = new Curso();
        c1.setName("Java pattern");
        c1.setDescription("Introduzione a patterns");
        c1.setTotalhours(12);

         Mentoria m = new Mentoria();
         m.setName("Java");
         m.setDescription("Java description high level");

         Conteudo conteudo = new Curso();
         conteudo.setDescription("JS course");
         conteudo.setName("JavaScript");




        //System.out.println(c);
        //System.out.println(c1);
        //System.out.println(m);
        //System.out.println(m.getDescription());

        Bootcamp bot = new Bootcamp();
        bot.setName("Java");
        bot.setDescription("Bootcamp Java description");
        bot.getContents().add(c1);
        bot.getContents().add(c);

        Bootcamp b1 = new Bootcamp();
        b1.getContents().add(c1);
        b1.getContents().add(conteudo);



        Dev a1 = new Dev();
        a1.setNome("Elara");
        a1.inscreverBootCamp(bot);
        System.out.println("Conteudos inscritos: " + a1.getConteudosInscritos());
        a1.progredir();
        a1.progredir();
        System.out.println("Conteudos Concluidos: " + a1.getConteudosConcluidos());
        System.out.println(a1.calcularXP());

        Dev a2 = new Dev();
        a2.setNome("Melissa");
        a2.inscreverBootCamp(b1);
        System.out.println("Conteudos inscritos " + a2.getConteudosInscritos());
        a2.progredir();
        System.out.println("Conteudos Concluidos: " + a2.getConteudosConcluidos());
        System.out.println(a2.calcularXP());


        Dev a3 = new Dev();
        a3.setNome("Ana Claudia");
        a3.inscreverBootCamp(b1);
        System.out.println("Conteudos inscritos: " + a3.getConteudosInscritos());
        a3.progredir();
        a3.progredir();
        a3.progredir();
        System.out.println("Conteudos Conlcluidos: " + a3.getConteudosConcluidos());
        System.out.println(a3.calcularXP());
    }
}
