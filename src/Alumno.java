import java.util.ArrayList;
import java.util.List;

public abstract class Alumno extends Persona {
    private int curso;
    private String nivelAcademico;
    private ArrayList listaAsignaturas;

    public Alumno(String dni, String nombre) {
        super(dni, nombre);
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public ArrayList getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "curso=" + curso +
                ", nivelAcademico='" + nivelAcademico + '\'' +
                ", listaAsignaturas=" + listaAsignaturas +
                '}';
    }
    abstract public void pagoMensual();
    abstract public void mostrarAsignaturas();
}
