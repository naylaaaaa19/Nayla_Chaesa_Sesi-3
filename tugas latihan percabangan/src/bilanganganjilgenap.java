import java.util.Scanner;

public class bilanganganjilgenap {
    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            int angka = inputan.nextInt();

            if (angka % 2 == 0){
                System.out.println("Bilangan Genap");
            } else {
                System.out.println("Bilangan Ganjil");
            }
        }
    }
}
