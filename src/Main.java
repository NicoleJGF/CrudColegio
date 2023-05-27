import Colegio.Curso;
import Colegio.CursoDocente;
import Colegio.Docente;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  DOCENTES  */

        //DOCENTE_01
        Docente docente1 = new Docente("Freddy", "45121526");

        //DOCENTE_02
        Docente docente2 = new Docente("Ehtel", "45895626");

        //DOCENTE_03
        Docente docente3 = new Docente("Jose", "45892536");


        /*  CURSOS  */

        //CURSO_01
        Curso curso1 = new Curso("Programacion", "4");

        //CURSO_02
        Curso curso2 = new Curso("Base de Datos","5");

        //CURSO_03
        Curso curso3 = new Curso("Analisis y Diseño","3");


        /* Cursos_Docente */

        //Agregando
        CursoDocente id_01 = new CursoDocente();
        id_01.setId(01);
        id_01.agregarDocente(docente1);
        id_01.agregarCurso(curso3);
        id_01.agregarCurso(curso2);

        //Buscar
        String dato, dato1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que Curso desea buscar?");
        dato = sc.nextLine();
        //Buscar curso
        int pos = id_01.buscarCurso(dato);
        if (pos != -1) {
            System.out.println("Se encontro el curso " + dato);
        } else {
            System.out.println("No se encontro el curso " + dato);
        }
        //Buscar docente
        System.out.println("Que Profesor desea buscar?");
        dato1 = sc.nextLine();
        int posi = id_01.buscarDocente(dato1);
        if (posi != -1) {
            System.out.println("Se encontro al docente " + dato1);
        } else {
            System.out.println("No se encontro al docente " + dato1);
        }

        //Eliminando
        //id_01.eliminarDocente(docente1);
        //id_01.eliminarCurso(curso2);

        // Editar Curso
        Curso curso = new Curso("Sistemas Operativos", "5");
        id_01.editarCurso(curso);
        // id_01.mostrarDocenteCurso();

        // Eliminar Docente
        id_01.eliminarDocente(docente1);
        id_01.mostrarDocenteCurso();

        //Mostrar
        /*System.out.println("Curso I");
        System.out.println(id_01.getId());
        id_01.mostrarDocenteCurso();*/



        /*  CURSOS  */

        //CURSO 01System.out.println("Si se encontro:"+this.docentes[i].getNombre());
        /*Curso curso1 = new Curso();
        curso1.setCodigo("C01");
        curso1.setNombre("Programacion Orientada a Objetos");
        curso1.agregarDocente(docente1);
        curso1.agregarDocente(docente2);*/
        //curso1.agregarDocente(docente3);
        //curso1.agregarDocente(new Docente("Pilar", "125"));

        //CURSO 02
        /*Curso curso2 = new Curso();
        curso2.setCodigo("C02");
        curso2.setNombre("Estructura de Datos");
        curso2.agregarDocente(docente1);
        curso2.agregarDocente(docente3);*/
        //curso2.agregarDocente(new Docente("Pilar", "125"));
        //curso2.agregarDocente(new Docente("Margot", "127"));

        //CURSO 03
        /*Curso curso3 = new Curso();
        curso3.setCodigo("C03");
        curso3.setNombre("Base de Datos");
        curso3.agregarDocente(docente3);
        curso3.agregarDocente(new Docente("Maria", "126"));*/
        //curso2.agregarDocente(new Docente("Pilar", "125"));
        //curso2.agregarDocente(new Docente("Margot", "127"));


        /* MOSTRAR
        System.out.println("Curso I");
        System.out.println(curso1.getCodigo());
        System.out.println(curso1.getNombre());
        curso1.mostrarDocenteCurso();

        System.out.println(" ");
        System.out.println("Curso II");
        System.out.println(curso2.getCodigo());
        System.out.println(curso2.getNombre());
        curso2.mostrarDocenteCurso();

        System.out.println(" ");
        System.out.println("Curso III");
        System.out.println(curso3.getCodigo());
        System.out.println(curso3.getNombre());
        curso3.mostrarDocenteCurso();*/


    }
}