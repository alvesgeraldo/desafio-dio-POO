import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descriçao do Bootcamp");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev dev1 = new Dev();
      dev1.setNome("Geraldo");
      dev1.inscreverBootcamp(bootcamp);
      
      Dev dev2 = new Dev();
      dev2.setNome("José");
      dev2.inscreverBootcamp(bootcamp);

      System.out.println("Conteúdos inscritos Geraldo" + dev1.getConteudosInscritos());
      dev1.progredirBootcamp();
      dev1.progredirBootcamp();
      System.out.println("Conteúdos concluidos Geraldo" + dev1.getConteudosConcluidos());
      System.out.println("XP: " + dev1.calcularTotalXP());
      System.out.println("Conteúdos inscritos Geraldo" + dev1.getConteudosInscritos());
      
      System.out.println("Conteúdos inscritos José" + dev2.getConteudosInscritos());
      dev2.progredirBootcamp();
      System.out.println("Conteúdos concluidos José" + dev2.getConteudosConcluidos());
      System.out.println("XP: " + dev2.calcularTotalXP());
      System.out.println("Conteúdos inscritos José" + dev2.getConteudosInscritos());
      

    }
}
