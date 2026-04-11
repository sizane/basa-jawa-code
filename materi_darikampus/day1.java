import java.util.Random;

public class day1 {
    public static void main(String[] args) {
        Random acak = new Random();
        double[] a;
        int N = acak.nextInt(150) + 1; // Random N between 1 and 150
        a = new double[N];

        for (int i = 0; i < N; i++) 
            a[i] = acak.nextDouble() * 100; // Random double between 0 and 100

        System.out.println(a[N-1]);

    }
}
