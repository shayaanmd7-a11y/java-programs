// Interface: Defines a contract (100% abstraction)
interface Playable {
    void play(); // Abstract method (no body)
}

// Abstract class: Cannot be instantiated directly
abstract class Instrument implements Playable {
    String name;

    // Abstract constructor
    Instrument(String name) {
        this.name = name;
    }

    // Abstract method: Child classes MUST implement this
    abstract void makeTone();

    // Concrete method: Common functionality provided directly
    void clean() {
        System.out.println("Cleaning the " + name + "...");
    }
}

// Concrete Subclass 1
class Guitar extends Instrument {
    Guitar() {
        super("Guitar");
    }

    // Implementing abstract method from Instrument
    @Override
    void makeTone() {
        System.out.println("Strumming acoustic strings: Strum Strum!");
    }

    // Implementing method from Playable interface
    @Override
    public void play() {
        System.out.println("Playing classical guitar music.");
    }
}

// Concrete Subclass 2
class Piano extends Instrument {
    Piano() {
        super("Piano");
    }

    // Implementing abstract method from Instrument
    @Override
    void makeTone() {
        System.out.println("Striking piano keys: Plink Plonk!");
    }

    // Implementing method from Playable interface
    @Override
    public void play() {
        System.out.println("Playing a Beethoven sonata.");
    }
}

// Main class named 'abstraction'
public class abstraction {
    public static void main(String[] args) {
        // We cannot do: Instrument myInstrument = new Instrument("Generic"); 
        // because abstract classes cannot be instantiated!

        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();

        System.out.println("--- Guitar ---");
        myGuitar.clean();    // Call concrete method from abstract class
        myGuitar.makeTone(); // Call overridden abstract method
        ((Playable) myGuitar).play();

        System.out.println("\n--- Piano ---");
        myPiano.clean();
        myPiano.makeTone();
        ((Playable) myPiano).play();
    }
}