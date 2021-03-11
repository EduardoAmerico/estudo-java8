

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class ExemploCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(c -> c.getAlunos()));

        //
        //cursos.stream().filter(c -> c.getAlunos() >= 1000).map(c -> c.getAlunos()).forEach(total -> System.out.println(total));
        //cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
        // cursos.forEach(c -> System.out.println(c.getNome()));
        //
//        Curso curso = opTionalCurso.orElse(null);
//        System.out.println(curso.getNome());
      //  cursos = null;

            cursos.stream().filter(c -> c.getAlunos() >= 100).findFirst().ifPresent(curso -> System.out.println(curso.getNome()+" aqui"));


      //  cursos.stream().filter(c -> c.getAlunos() >= 100).findFirst().ifPresent(curso -> System.out.println(curso.getNome()+" aqui"));

        //to list
//       cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
//       cursos.stream().forEach(curso -> System.out.println(curso.getNome()));

        //map
//        Map<String, Integer> map = cursos.stream().filter(c -> c.getAlunos() >= 10).collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()));
//        System.out.println(map);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 10)
                .collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
//
        int sum = cursos.stream().mapToInt(c -> c.getAlunos()).sum();
        double average = cursos.stream().mapToInt(c -> c.getAlunos()).average().orElse(0.0);

        System.out.println("Quantidade total de alunos = "+ sum+" com média de "+average+" alunos por curso");
    }
}
