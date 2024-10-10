import java.util.Scanner;

public class hargajeruk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buah jeruk: ");
        int jumlah = scanner.nextInt();

        int harga_5 = 10000, harga_2 = 5000, harga_1 = 3000;
        int total = 0;

        if ( jumlah >= 5) {
            int harga_buah_5 = (jumlah / 5) * harga_5;
            jumlah = jumlah % 5;
            total += harga_buah_5; 
        }
        if ( jumlah >= 2) {
            int harga_buah_2 = (jumlah / 2) * harga_2;
            jumlah = jumlah % 2;
            total += harga_buah_2;
        }
        if ( jumlah >= 1) {
            int harga_buah_1 = (jumlah / 1) * harga_1;
            jumlah = jumlah % 1;
            total += harga_buah_1;
        }
        System.out.println("Total harga: " + total);
        scanner.close();
    }
}
