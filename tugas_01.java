import java.util.ArrayList;

public class tugas_01 {
    public static void main(String[] args) {
        ArrayList<String> judul = new ArrayList<>();

        judul.add("The Lord of the Rings : The Fellowship of the Ring");
        judul.add("Ex Machina");
        judul.add("The Imitation Game");
        judul.add("Interstellar");
        judul.add("Ready Player One");
        judul.add("Source Code");

        System.out.println("Arraylist Sebelum dihapus :");
        System.out.println("1. " + judul.get(0));
        System.out.println("2. " + judul.get(1));
        System.out.println("3. " + judul.get(2));
        System.out.println("4. " + judul.get(3));
        System.out.println("5. " + judul.get(4));
        System.out.println("6. " + judul.get(5));
        System.out.println(" ");

        judul.remove(1);
        judul.remove(2);

        System.out.println("Arraylist Sebelum dihapus :");
        System.out.println("1. " + judul.get(0));
        System.out.println("3. " + judul.get(1));
        System.out.println("5. " + judul.get(2));
        System.out.println("6. " + judul.get(3));

        System.out.println(" ");
        System.out.println(" ");

        ArrayList<String> judul2 = new ArrayList<>();

        judul2.add("The Lord of the Rings : The Fellowship of the Ring");
        judul2.add("Ex Machina");
        judul2.add("The Imitation Game");
        judul2.add("Interstellar");
        judul2.add("Ready Player One");
        judul2.add("Source Code");

        System.out.println("Arraylist Sebelum dihapus :");
        System.out.println("1. " + judul2.get(0));
        System.out.println("2. " + judul2.get(1));
        System.out.println("3. " + judul2.get(2));
        System.out.println("4. " + judul2.get(3));
        System.out.println("5. " + judul2.get(4));
        System.out.println("6. " + judul2.get(5));
        System.out.println(" ");

        judul2.remove(1);
        judul2.remove(2);

        System.out.println("Arraylist Sebelum dihapus :");
        System.out.println("1. " + judul2.get(0));
        System.out.println("3. " + judul2.get(1));
        System.out.println("5. " + judul2.get(2));
        System.out.println("6. " + judul2.get(3));
        
    }    
}
