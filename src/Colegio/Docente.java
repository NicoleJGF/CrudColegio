package Colegio;

public class Docente {

    private int id;
    private String nombre;
    private String dni;
    //private Curso curso;

    public Docente() {

    }

    public Docente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    ////////////
    /*public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {this.curso = curso;}*/
}
