class Animal {
    public void fazerSom() {
        System.out.println("Sons de animais");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Auuuuu!!!!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miauuuuu!!!");
    }
}


public class ex01 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.latir();
        gato.Miar();     
    }
}
