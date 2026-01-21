import br.com.dio.desafio.dominio.Conteudo;

import java.time.LocalDate;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXp(){
        return XP_PADRAO +20d;
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrcao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public void setTitulo(String mentoriaDoCursoJava) {
    }
}


