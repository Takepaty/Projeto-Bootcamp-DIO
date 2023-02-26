import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso C#");
        curso2.setDescricao("descrição curso C#");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdo inscrito por %s:%n%s%n", devCamila.getNome(), devCamila.getMostrarConteudoInscritos());
        devCamila.avancarConteudo();
        devCamila.avancarConteudo();
        System.out.println("------------------");
        System.out.println();
        System.out.printf("Conteúdo inscrito por %s:%n%s%n", devCamila.getNome(), devCamila.getMostrarConteudoInscritos());
        System.out.println("------------------");
        System.out.println();
        System.out.printf("Conteúdo concluido por %s:%n%s%n", devCamila.getNome(), devCamila.getMostrarConteudoConcluido());
        System.out.println("------------------");
        System.out.println();
        System.out.println("XP" + devCamila.calcularTotalXp());
        System.out.println();

        System.out.println("*********************************");

        System.out.println();
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdo inscrito por %s:%n%s%n", devCarlos.getNome(), devCarlos.getMostrarConteudoInscritos());
        devCarlos.avancarConteudo();
        devCarlos.avancarConteudo();
        devCarlos.avancarConteudo();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println();
        System.out.printf("Conteúdo inscrito por %s:%n%s%n", devCarlos.getNome(), devCarlos.getMostrarConteudoInscritos());
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println();
        System.out.printf("Conteúdo concluido por %s:%n%s%n", devCarlos.getNome(), devCarlos.getMostrarConteudoConcluido());
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println();
        System.out.println("XP" + devCarlos.calcularTotalXp());










    }
}