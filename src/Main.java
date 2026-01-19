import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDecricao("Java na Dio");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java2");
        curso2.setDecricao("Java2 na Dio");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do curso Java");
        mentoria1.setDescrcao("Descrição do curso java" );
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);


    }
}
