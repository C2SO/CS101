public class Driver {
    public static void main(String[] args) {
        Speaker s = new Speaker("Santa");
        Speaker p = new Politician("Ted Cruz");
        Speaker h = new SuperHero("Superman");
        Speaker plant = new Plant("Groot");
        System.out.println("\n" + s.name + ": " + s.speaks());
        System.out.println("\n" + p.name + ": " + p.speaks());
        System.out.println("\n" + h.name + ": " + h.speaks());
        System.out.println("\n" + plant.name + ": " + plant.speaks());
    }
}