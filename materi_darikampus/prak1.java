import java.util.Random;
public class prak1 {
    public static void main(String[] args) {
        Random acak = new Random();

        byte num1 = (byte) (acak.nextDouble());
        System.out.println(num1);
    }
}
