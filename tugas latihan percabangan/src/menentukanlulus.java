import java.util.Scanner;

public class menentukanlulus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Masukkan Nilai: ");
            double Nilai = scanner.nextDouble();

            if (Nilai >= 75) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }
    }
}
