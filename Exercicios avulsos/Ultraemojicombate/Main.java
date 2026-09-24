public class Main {
    public static void main(String[] args) {
        Lutador l1[] = new Lutador[6];
        l1[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 69.5f, 11, 3, 2);
        l1[1] = new Lutador("PutScript", "Brasil", 29, 1.58f, 57.8f, 14, 2, 3);
        l1[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l1[0].status();
        l1[1].status();
        l1[2].status();
    }
}