package Trabalho01;

import java.util.List;

public class main {
    public static void main(String[] args) {
            List<Curso> cursos = List.of(
                    new CursoDeDesign("Curso de Photoshop", "Max", 30, 50.0, "Photoshop"),
                    new CursoDeProgramacao("Curso de Programação em Java", "Gabriel", 60, 80.0, "Java"),
                    new CursoDeDesign("Curso de Illustrator", "Hamilton", 25, 45.0, "Illustrator"),
                    new CursoDeProgramacao("Curso de Python", "Alonso", 40, 70.0, "Python")
            );

            for (Curso curso : cursos) {
                curso.mostrarDados();
                System.out.println("Custo: R$ " + curso.calcularCusto());
                curso.gerarRelatorio();
            }
    }
}

