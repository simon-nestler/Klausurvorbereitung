public class Bulldogge extends Hund {

    @Override
    public String toString() {
        return "Bulldogge";
    }

    @Override
    public void fressen() {
        System.out.println("Der Hund frissst...");
    }

    @Override
    public void bellen() {
        System.out.println("Der Hund bellt wie eine Bulldogge...");
    }
}
