public abstract class Tier {

    public abstract void fressen();

    public void laufen() {
        System.out.println("Das Tier läuft...");
    }

    @Override
    public String toString() {
        return "Tier";
    }
}
