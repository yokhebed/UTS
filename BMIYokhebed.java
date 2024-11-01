import java.util.Scanner;

class BMI {
    private double tinggi; // dalam meter
    private double berat;  // dalam kilogram
    private String kategori;

    // Konstruktor
    public BMI(double tinggiCm, double berat) {
        this.tinggi = tinggiCm / 100; // konversi cm ke meter
        this.berat = berat;
        hitungKategori(); // Mutator
    }

    // Setter (mutator untuk tinggi)
    public void setTinggi(double tinggiCm) {
        this.tinggi = tinggiCm / 100; // konversi cm ke meter
        hitungKategori(); // Mutator untuk kategori BMI
    }

    // Setter (mutator untuk berat)
    public void setBerat(double berat) {
        this.berat = berat;
        hitungKategori(); // Mutator untuk kategori BMI
    }

    // Getter (asesor untuk tinggi dalam cm)
    public double getTinggi() {
        return tinggi * 100; // kembalikan dalam cm
    }

    // Getter (asesor untuk berat)
    public double getBerat() {
        return berat;
    }

    // Getter (asesor untuk kategori BMI)
    public String getKategori() {
        return kategori;
    }

    // Method private untuk menghitung kategori BMI
    private void hitungKategori() {
        double bmi = berat / (tinggi * tinggi);
        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            kategori = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            kategori = "Kelebihan BB";
        } else {
            kategori = "Obesitas";
        }
    }
}

public class BMIYokhebed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        // Membuat objek BMI (menggunakan konstruktor)
        BMI bmiUser = new BMI(tinggiCm, berat);

        // Output kategori BMI (menggunakan asesor/getter)
        System.out.println("Kategori BMI Anda: " + bmiUser.getKategori());

        input.close();
    }
}
