import java.util.Scanner;
public class isi_kata_simple {
    public static void main(String[] args) {
        Scanner kata = new Scanner(System.in);
        System.out.println("aku ____ ikan di ____");
        System.out.println("di ____ ada kucing _____");

        System.out.print("input kata (kata kerja) : ");
        String kataKerja = kata.next();
        System.out.print("input kata (nama tempat) : ");
        String tempat = kata.next();
        System.out.print("input kata (nama tempat) : ");
        String tempat2 = kata.next();
        System.out.print("input kata (sedang apa) : ");
        String kegiatan = kata.next();

        System.out.println("aku " + kataKerja + " ikan di " + tempat);
        System.out.println("di " + tempat2 + "ada kucing" + kegiatan);
    }
}
