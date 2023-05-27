package Colegio;

public class CursoDocente {

    private int id;

    private Docente[] docentes;
    private Curso[] cursos;

    private int indicedocentes;
    private int indicecursos;
    private String dato;

    public CursoDocente() {
        this.docentes = new Docente[1];
        this.indicedocentes = 0;

        this.cursos = new Curso[2];
        this.indicecursos = 0;
    }

    ////////////////////////////

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Docente[] getDocentes() {return docentes;}
    public void setDocentes(Docente[] docentes) {this.docentes = docentes;}

    public Curso[] getCursos() {return cursos;}
    public void setCursos(Curso[] cursos) {this.cursos = cursos;}


    ////////////////////////////
    //       AGREGAR         //
    ///////////////////////////
    public void agregarDocente(Docente docente){
        this.docentes[this.indicedocentes] = docente;
        this.indicedocentes++;
    }

    public void agregarCurso(Curso cursos){
        this.cursos[this.indicecursos] = cursos;
        this.indicecursos++;
    }

    ////////////////////////////
    //        EDITAR         //
    ///////////////////////////
    public void editarDocente(Docente docente){
        for (int i = 0; i < this.docentes.length; i++) {
            if (this.docentes[i].getNombre() == docente.getNombre()) {
                this.docentes[i] = docente;
                break;
            }else {
                this.docentes[i] = docente;
                break;
            }
        }
    }
    public void editarCurso(Curso curso){
        for (int i = 0; i < this.cursos.length; i++) {
            if (this.cursos[i].getNombre() == curso.getNombre()) {
                this.cursos[i] = curso;
                break;
            }else {
                this.cursos[i] = curso;
                break;
            }
        }
    }

    ////////////////////////////
    //        ELIMINAR        //
    ///////////////////////////
    public void eliminarDocente(Docente docente){
        for (int i = 0; i <this.docentes.length; i++) {
            if (this.docentes[i].getNombre() == docente.getNombre()) {
                for (int j = i; j < this.docentes.length - 1; j++) {
                    this.docentes[j] = this.docentes[j + 1];
                }
                this.docentes[indicedocentes - 1] = null;
                indicedocentes--;
                break;
            }
        }
    }
    public void eliminarCurso(Curso cursos){
        for (int i = 0; i <this.cursos.length; i++) {
            if (this.cursos[i].getNombre() == cursos.getNombre()) {
                for (int j = i; j < this.cursos.length - 1; j++) {
                    this.cursos[j] = this.cursos[j + 1];
                }
                this.cursos[indicecursos - 1] = null;
                indicecursos--;
                break;
            }
        }
    }

    ////////////////////////////
    //        BUSCAR         //
    ///////////////////////////
    boolean b = false;
    public int buscarDocente(String dato1){
        /*int i = 0;
        while ((i<this.docentes.length) && (b == false)) {
            if (this.docentes[i].getNombre() == dato){
                b = true;
            }
            i++;
        }
        if (b == false){
            System.out.println("No encontrado");
        }else if (b == true){
            System.out.println("Si se encontro:"+this.docentes[i].getNombre());
        }
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getNombre().equalsIgnoreCase(nombre)) {
                return clientes[i];
            }
        }
        return null;
        */

        for(int i = 0; i < this.docentes.length; i++){
            if(this.docentes[i].getNombre().equalsIgnoreCase(dato1)){
                return i;
            }
        }
        return -1;
    }
    public int buscarCurso(String dato){
        for(int i = 0; i < this.cursos.length; i++){
            if(this.cursos[i].getNombre().equalsIgnoreCase(dato)){
                return i;
            }
        }
        return -1;
    }

    ////////////////////////////
    //        MOSTRAR        //
    ///////////////////////////
    public void mostrarDocenteCurso() {
        for (int i=0; i<this.docentes.length; i++) {
            if (this.docentes[i] == null){
                System.out.println("Se eliminaron todos los docentes " );
            }else {
                System.out.println(this.docentes[i].getDni()+ " " + " " +this.docentes[i].getNombre());
            }
        }

        for (int i=0; i<this.cursos.length; i++) {
            if (this.cursos[i] == null){
                System.out.println("Se eliminaron todos los cursos " );
            }else {
                System.out.println(this.cursos[i].getNombre()+ " " + " " +this.cursos[i].getCredito());
            }

        }
    }


}
