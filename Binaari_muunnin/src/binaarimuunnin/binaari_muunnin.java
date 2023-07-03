package binaarimuunnin;

import java.util.Scanner;

public class binaari_muunnin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tervetuloa bin‰‰riluvun ja kokonaisluvun muuntimeen!");
        System.out.println("Valitse toiminto:");
        System.out.println("1. Muunna kokonaisluku bin‰‰riluvuksi");
        System.out.println("2. Muunna bin‰‰riluku kokonaisluvuksi");

        int valinta = scanner.nextInt();
        scanner.nextLine();

        if (valinta == 1) {
            System.out.print("Syˆt‰ kokonaisluku: ");
            int kokonaisluku = scanner.nextInt();
            String binaariluku = Integer.toBinaryString(kokonaisluku);
            System.out.println("Bin‰‰riluku: " + binaariluku);
        } else if (valinta == 2) {
            System.out.print("Syˆt‰ bin‰‰riluku: ");
            String binaariluku = scanner.nextLine();
            int kokonaisluku = Integer.parseInt(binaariluku, 2);
            System.out.println("Kokonaisluku: " + kokonaisluku);
        } else {
            System.out.println("Virheellinen valinta!");
        }
    }
}





