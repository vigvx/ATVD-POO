interface Instrumento {
    void tocar();
}

class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Sons de Violao");
    }
}

class Piano implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Sons de Baixo");
    }
}

// Demonstração
public class exercicio5 {
    public static void tocarInstrumento(Instrumento instrumento) {
        instrumento.tocar();
    }

    public static void main(String[] args) {
        InstrumentoMusical guitarra = new Violao();
        InstrumentoMusical piano = new Baixo();

        tocarInstrumento(violao);
        tocarInstrumento(baixo);    
    }
}
