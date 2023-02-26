package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> mostrarConteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> mostrarConteudoConcluido = new LinkedHashSet<>();



    public void inscreverBootcamp(Bootcamp bootcamp){
        this.mostrarConteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void avancarConteudo(){
        Optional<Conteudo> conteudo = this.mostrarConteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.mostrarConteudoConcluido.add(conteudo.get());
            this.mostrarConteudoInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não esta matrículado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        return this.mostrarConteudoConcluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMostrarConteudoInscritos() {
        return mostrarConteudoInscritos;
    }

    public void setMostrarConteudoInscritos(Set<Conteudo> mostrarConteudoInscritos) {
        this.mostrarConteudoInscritos = mostrarConteudoInscritos;
    }

    public Set<Conteudo> getMostrarConteudoConcluido() {
        return mostrarConteudoConcluido;
    }

    public void setMostrarConteudoConcluido(Set<Conteudo> mostrarConteudoConcluido) {
        this.mostrarConteudoConcluido = mostrarConteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(mostrarConteudoInscritos, dev.mostrarConteudoInscritos) && Objects.equals(mostrarConteudoConcluido, dev.mostrarConteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mostrarConteudoInscritos, mostrarConteudoConcluido);
    }
}
