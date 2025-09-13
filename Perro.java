public class Perro extends Animal {
    private Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    @Override
    public void sonido() {
        System.out.println("Guau! Soy " + nombre + ".");
    }

    // Método propio de Perro (demuestra downcasting)
    public void saludar() {
        System.out.println("El perro " + nombre + " saluda moviendo la cola. Collar: " + collar);
    }

    public Collar getCollar() {
        return collar;
    }
}
