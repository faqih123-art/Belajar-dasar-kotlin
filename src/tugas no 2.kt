fun main() {
    val nilaiMtk = 70
    val nilaiIps = 60
    val nilaiIpa = 50
    val nilaiPAI = 55

    // menghitung rata-rata
    val rataRata =(nilaiMtk + nilaiIps + nilaiIpa + nilaiPAI )/ 4

    // menampilkan nilai rata-rata
    println("nilai rata-rata UAS adalah: $rataRata ")

    //menentukan pesan berdasarkan nilai rata-rata
    if (rataRata  >= 85){
        println("pertahankan nilai dan prestasimu.Nilai kamu sudah sangat bagus.")
    }else if (rataRata >= 66){
        println("Nilai kamu sudah cukup baik . semangat buat belajar.")
    }else{
        println("Perlu lebih banyak belajar lagi untuk meningkatkan nilai rata-rata kamu.")
    }
}