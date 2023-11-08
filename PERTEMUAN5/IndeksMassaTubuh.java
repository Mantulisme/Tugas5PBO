package PERTEMUAN5;
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan (kg) dan tinggi badan (meter)
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imtPoint = beratBadan / (tinggiBadan * tinggiBadan);
        double imt = Math.round(imtPoint);

        // Menentukan kriteria kegemukan
        String kriteria = "";
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt < 25) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt < 30) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt < 40) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Obesitas";
        }

        // Output hasil
        System.out.println("Indeks Massa Tubuh (IMT): " + imt);
        System.out.println("Kriteria Kegemukan: " + kriteria);

        input.close(); // Menutup Scanner
    }
}
