package DevPackage;

import java.util.Scanner;

class Buy {
    protected static void buy(String need) {
        int index = -1;
        for (int i = 0; i < Warehouse.kala.length; i++) {
            if (Warehouse.kala[i].equals(need)){
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Sorry, we don't  hava that! :(");
            Service.anotherBuy();
        } else {
            if (Warehouse.tedad[index] > 0) {
                Warehouse.tedad[index] -= 1;
                System.out.println("You bought it!");
                Service.anotherBuy();
            } else {
                System.out.println("Sorry, it's not enough in the warehouse. :(");
                Service.anotherBuy();
            }
        }
    }
}
