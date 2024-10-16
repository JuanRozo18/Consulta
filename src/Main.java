public class Main {
    public static void main(String[] args) {
      
        Perro perro = new Perro("Firulais");
        Pajaro pajaro = new Pajaro("Pajaro");

       
        perro.hacerSonido();
        perro.dormir();

        pajaro.hacerSonido();
        pajaro.volar();
        pajaro.dormir();
    }
}

interface Volador {
    void volar();
}

abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void dormir() {
        System.out.println(nombre + " duerme");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice guau");
    }
}

class Pajaro extends Animal implements Volador {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice pio");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " vuela");
    }
}
