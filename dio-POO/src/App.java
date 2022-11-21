import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
      Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descriço Curso Java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso JS");
      curso2.setDescricao("Descriço Curso JS");
      curso2.setCargaHoraria(4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria curso java");
      mentoria.setDescricao("Descriçao da mentoria java");
      mentoria.setData(LocalDate.now());

      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);
    }
}
