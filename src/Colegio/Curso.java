package Colegio;

public class Curso {

    private int id;
    private String nombre;
    private String credito;
    //private Docente[] docente;

    //private int indicedocente;

    /*  public Curso() {
        //this.docente = new Docente[2];

        //this.indicedocente = 0;
    }*/

    public Curso(String nombre, String credito){
        this.nombre = nombre;
        this.credito = credito;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCredito() { return credito; }
    public void setCredito(String credito) {this.credito = credito;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
    //////////////////

    /*
    public Docente[] getDocente() {return docente;}

    public void setDocente(Docente[] docente) {this.docente = docente;}


    public void agregarDocente(Docente docente)
    {
        this.docente[this.indicedocente] = docente;
        this.indicedocente++;
    }

    public void mostrarDocenteCurso()
    {
        for (int i=0; i<this.docente.length; i++) {
            System.out.println(this.docente[i].getDni()+ " " + " " +this.docente[i].getNombre());
        }
    }*/
}
