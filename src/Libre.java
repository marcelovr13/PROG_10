public class Libre extends Alumno {

    private final float precio_hora = 10;
    private int numeroHorasDiarias;

    public Libre(String dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void pagoMensual() {
        System.out.println(precio_hora*numeroHorasDiarias*30);

    }

    @Override
    public void mostrarAsignaturas() {
        System.out.println("El estudiante libre " + getNombre() + " cursa.");
    }

}
