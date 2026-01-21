package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluyidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInsctritos().add(this);
    }

    ;

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosConcluyidos.stream().findFirst();

        if(conteudo.isPresent()){
        this.conteudosConcluyidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
    } else

    {
        System.err.println("Vocè não está matriculado em nenhum conteúdo");
    }
}




   public double calcularXpTotal(){
      return this.conteudosConcluyidos
              .stream().mapToDouble(Conteudo::calcularXp)
              .sum();
   };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluyidos() {
        return conteudosConcluyidos;
    }

    public void setConteudosConcluyidos(Set<Conteudo> conteudosConcluyidos) {
        this.conteudosConcluyidos = conteudosConcluyidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluyidos, dev.conteudosConcluyidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluyidos);
    }
}
