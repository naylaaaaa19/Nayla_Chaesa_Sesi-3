import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Uang");
        int totalUang = scanner.nextInt();

        int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatus, seratus;
        
        if (totalUang >= 100000) {
            seratusRibu = totalUang / 100000;
            totalUang = totalUang % 100000;
            System.out.println(seratusRibu + "lembar 100 ribu rupiah");
        }
        if (totalUang >= 50000); {
            limaPuluhRibu = totalUang / 50000;
            totalUang = totalUang % 50000;
            System.out.println(limaPuluhRibu + "lembar 50 ribu rupiah");
        }
        if (totalUang >= 20000); {
            duaPuluhRibu = totalUang % 20000;
            System.out.println(duaPuluhRibu + "lembar 20 ribu rupiah");
        }
        if (totalUang >= 10000); {
            sepuluhRibu = totalUang / 10000;
            System.out.println(sepuluhRibu + "lembar 10 ribu rupiah");
        }
        if (totalUang >= 5000); {
            limaRibu = totalUang / 5000;
            System.out.println(limaRibu + "lembar 5 ribu rupiah");
        }
        if (totalUang >= 2000); {
            duaRibu = totalUang / 2000;
            System.out.println(duaRibu + "lembar 2 ribu rupiah");
        }
        if (totalUang >= 1000); {
            seribu = totalUang / 1000;
            System.out.println(seribu + "lembar 1 ribu rupiah");
        }
        if (totalUang >= 500); {
            limaRatus = totalUang / 500;
            System.out.println(limaRatus + "lembar 5 rupiah");
        }
        if (totalUang >= 100); {
            seratus = totalUang / 100;
            System.out.println(seratus + "lembar 1 rupiah");
        }
        scanner.close();
    }
}


