public class Main {
    public static void main(String[] args) {
        Fight marc = new Fight("Ali", 15, 100, 90, 50);
        Fight alex = new Fight("Taha", 17, 95, 100, 50);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}