import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {
        Double Nilai;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        Nilai = inputan.nextDouble();

        if (Nilai > 85){
            System.out.print("A");
        }
        if (Nilai > 75){
            System.out.print("B");
        }
        if (Nilai > 65){
            System.out.print("C");
        }
        if (Nilai > 55){
            System.out.print("D");
        }
            System.out.print("E");
        inputan.close();
    }
}
