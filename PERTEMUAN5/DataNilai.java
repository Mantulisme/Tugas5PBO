package PERTEMUAN5;

import java.util.Scanner;

public class DataNilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("NPM : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        input.close();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Menentukan grade dan keterangan
        String grade = "";
        String keterangan = "";
        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        // Output
        System.out.println("NPMMahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
