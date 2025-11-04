import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble(); 

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double biayaPerKg;
        double biayaTotal;

        // Tentukan biaya per kg
        if (jarak < 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya total
        biayaTotal = berat * biayaPerKg;

        // Tambahan biaya jika volume > 100 cm³
        if (volume > 100) {
            biayaTotal += 50000;
        }

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Volume Barang : " + volume + " cm³");
        System.out.println("Biaya Total   : Rp " + biayaTotal);
    }
}
