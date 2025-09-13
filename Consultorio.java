public class Consultorio {
    private String ubicacion;

    public Consultorio(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return "Consultorio(" + ubicacion + ")";
    }
}
