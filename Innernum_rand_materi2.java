import java.util.Random;

public class Innernum_rand_materi2 {
    public static void main(String[] args) {
        // mari kita coba buat roll 1d20 dnd
        Random kocok_dadu = new Random();

        int dadu_1d20;

        dadu_1d20 = kocok_dadu.nextInt(20);

        System.out.println("selamat anda mendapat angka " + dadu_1d20);

        if (dadu_1d20 == 1 ) {
            System.out.println("Nat 1 (lagi sial anda)");
        };
        if (dadu_1d20 == 20) {
            System.out.println("Nat 20 (hoki kali kau)");
        };
    }
}
