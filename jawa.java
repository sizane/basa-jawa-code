public class jawa {
    public static void main(String[] args) {
        //first code java
        /*
        idk 
        but 
        i 
        love
        cat
        :)
         */
        System.out.println("Hello, World!");
        System.out.println("aku jawa woy!");
        System.out.println("belajar day 1!");

        mainSecond(args);
    }
    
    public static void mainSecond(String[] args) {
        //variable (*note : artinya entar dulu :v)
        // = a reusable container for a value 
        //   a variable behaves as if it was the value it contains
        // variable di java ada 2 type
        // 1. primitive = simple value stored directly in memory (stack)
            // contoh : aku memberi mu buku atau benda ke kamu
        // 2. reference = memory address (stack) that points to the (heap)
        // *heap mungkin mirip kek bank atau tempat penyimpanan sementara
            // contoh : aku memberi mu cek uang 10k tapi uang nya ada di bank
        
        /*
            primitive vs reference
            ---------    ---------
            int          string
            double       array
            char         object
            boolean
        */
       // *note : untuk kata yg lebih dari 1 kalimat atau mau buat variable baru huruf awal harus kecil 

        int umur = 20; //buat nya mirip kek di python
        System.out.println("umurku " + umur);

        double ukuran = 35.83; //ini untuk bilangan desimal
        System.out.println("ini ukurannya " + ukuran);

        char nilai = 'A'; //ini untuk huruf atau simbol juga ini hanya bisa diisi 1 huruf
        System.out.println("aku dapat nilai " + nilai);

        boolean seorangMahasiswa = true; //seperti bool kek biasa hanya bisa true atau false
        // disini aku nyoba buat if else sederhana (masih mirip mirip sama bahasa yang lain)
        if(seorangMahasiswa == true){
            System.out.println("real w mahasiswa");
        }
        else {
            System.out.println("lu sapa njir kalo gk mahasiswa");
        }

        String nama = "ujang";
        System.out.println("nama lu " + nama + " ya?");
    }
}