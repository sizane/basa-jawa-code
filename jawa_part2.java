import java.util.Scanner; //ini untuk library inputan dari user

public class jawa_part2 {
    public static void main(String[] args) {
        /* 
        Scanner masukkan = new Scanner(System.in);
        System.out.println("masukkan namamu : ");

        String name = masukkan.next(); // next() aja untuk membuat input setelah println()
        // tapi kalau pakai nextLine() itu untuk membuat input di line selanjutnya (kek abis di enter)

        System.out.println("namamu itu " + name);
        masukkan.close();
        */

        double lebar = 0;
        double panjang = 0;
        double tinggi = 0;

        Scanner angka = new Scanner(System.in);
        System.out.println("masukan lebar : ");
        lebar = angka.nextDouble();
        System.out.println("masukan panjang : ");
        panjang = angka.nextDouble();
        System.out.println("masukan tinggi : ");
        tinggi = angka.nextDouble();

        double hasil = panjang * lebar * tinggi;

        System.out.println("jumlahnya : " + hasil + " cm^3");

        angka.close();
    }
}
