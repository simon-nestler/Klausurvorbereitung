public class Dalmatiner extends Hund {

    @Override
    public String toString() {
        return "Dalmatiner";
    }

    @Override
    public void fressen() {
        System.out.println("Der Hund frissst...");
    }

    @Override
    public void bellen() {
        System.out.println("Der Hund bellt wie ein Dalmatiner...");
    }

}
