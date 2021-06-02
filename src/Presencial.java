public class Presencial extends Alumno {
    private double matriculaCurso;
    private int numeroConvocatoria;
    private double plusPorConvocatoria;

    public Presencial(String dni, String nombre) {
        super(dni, nombre);
    }


    @Override
    public void pagoMensual() {
        System.out.println(matriculaCurso + (plusPorConvocatoria * numeroConvocatoria) / 12);
    }

    @Override
    public void mostrarAsignaturas() {
        System.out.println("El estudiante presencial " + getNombre());
    }
}
