import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan firda = new Perhitungan(4, 6, 0);
        firda.PrintJudul();
        System.out.println("Hasil Penambahan = " + firda.Penambahan(4, 6));
        System.out.println("Hasil Perkalian = " + firda.Perkalian(4, 6));
    }

    //Tugas / TM
    // Tampilkan hasil perhitungan dengan memanggil method yang ada pada perhitungan.java. Method yang dibuat, menerima parameter dan mengembalikan nilai (method with return).
    // Dikumpulkan hari sabtu, 30 April 2022
    // Hasil diemail ke aherijanto@mimoapps.xyz berupa gitub repo masing-masing siswa
    // Subject email : TM_NIM_NAMALENGKAP_KELAS
    //e.g : TM_21090119_FIRDAAULIARAKHMAH_2B
}
