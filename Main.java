public class Main {
    public static void main(String[] args) {
   
        Veterinaria vet = new Veterinaria(new Consultorio("Av. Principal 123"));

        // Crear animales (Perro tiene un Collar)
        Perro perro = new Perro("Firu", new Collar("rojo"));
        Gato gato = new Gato("Misu");

      
        vet.atender(perro); // ejecuta Perro.sonido()
        vet.atender(gato);  // ejecuta Gato.sonido()

        Animal a = new Perro("Rocky", new Collar("azul")); 
        if (a instanceof Perro) {
            Perro p = (Perro) a; // downcasting
            p.saludar();         // método específico de Perro
        }

        // Genéricos: Caja<Animal>
        Caja<Animal> caja = new Caja<>();
        caja.set(gato); // guardamos el gato en la caja
        Animal guardado = caja.get();
        System.out.println("Objeto guardado en caja: " + guardado.getNombre());
        vet.atender(guardado);
    }
}
