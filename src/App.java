public class App {
    public static void main(String[] args) throws Exception {
        statischerVsDynamischerTyp();
    }

    public static void statischerVsDynamischerTyp() {
        Tier t = new Bulldogge();

        System.out.println(t.toString());

        t = new Dalmatiner();

        System.out.println(t.toString());

    }

    public static void aufrufbarkeitVonMethoden() {
        Tier t = new Bulldogge();
        System.out.println(t.getClass().getName());

        if (t instanceof Hund) {
            Hund h = (Hund) t;
            h.bellen();
        }
    }
}
