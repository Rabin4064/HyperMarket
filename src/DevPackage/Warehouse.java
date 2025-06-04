package DevPackage;

public class Warehouse {
    protected static String[] kala = {"milk", "cake"};
    protected static int[] tedad  = {3, 1};

    protected static void see() {
        System.out.println("name: much");
        System.out.println("----------");
        for (int i = 0; i < kala.length; i++) {
            System.out.println(kala[i] + ": " + tedad[i]);
        }
        Service.anotherBuy();
    }
}
