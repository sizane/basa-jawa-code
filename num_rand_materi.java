import java.util.Random;

public class num_rand_materi {
    public static void main(String[] args) {
        Random acak = new Random();

        boolean data;
        data = acak.nextBoolean();
        System.out.println(data);
        // untuk random boolean adalah akan muncul secara acak true atau false

        int dataint;
        int dataint2;
        dataint = acak.nextInt();
        System.out.println(dataint);
        // untuk memunculkan angka acak secara asal(atau benar benar acak)

        dataint2 = acak.nextInt(20, 99);

        System.out.println(dataint2);
        // pada code ini memunculkan angka acak dari 20 sampai 99
        // dan code ini angka 20 untuk minimal dan 99 adalah maksimal
        // jika hanya di isi 10 (contohnya = acak.nextInt(10);)
        // maka hanya akan muncul angka acak dari 1 sampai 10

        double datadua;
        double datadua2;

        datadua = acak.nextDouble();

        System.out.println(datadua);
        // mirip dengan nextInt() kalo int adalah angka asli sedangkan untuk nextDouble() angka desimal
        // cara kerjanya sama dengan nextInt() membuat angka acak tapi ini bedanya ini desimal

        datadua2 = acak.nextDouble(0, 30);

        System.out.println(datadua2);
        // dan code ini angka 0 untuk minimal dan 30 adalah maksimal
        // jika hanya di isi 10 (contohnya = acak.nextDouble(10);)
        // angka desimal yg akan muncul acak (contoh = 5.827160186712483 , dll)

    }
}    