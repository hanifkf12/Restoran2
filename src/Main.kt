import kotlin.random.Random

fun main(){
    val ayamBakar = Makanan("Ayam Bakar", 21000.0)
    val ayamGeprek = Makanan("Ayam Geprek", 24000.0)
    val ayamGoreng = Makanan("Ayam Goreng", 21000.0)
    val ayamPenyet = Makanan("Ayam Penyet", 21000.0)

    val esTeh = Minuman("Es Teh", 4000.0)
    val esJeruk = Minuman("Es Jeruk", 4000.0)
    val esMilo = Minuman("Es Milo", 6000.0)

    val listMakanan = mutableListOf(ayamBakar,ayamGeprek,ayamGoreng,ayamPenyet)
    val listMinuman = mutableListOf(esTeh,esJeruk,esMilo)

    val menu = Menu(listMinuman,listMakanan)
    val pesanan = Pesanan()
    var input :Int
    do {
        println("================= Ayam 99 =================")
        if(pesanan.pesananMakanan.isNotEmpty() || pesanan.pesananMinuman.isNotEmpty()){
            println("Keranjang : ")
            println("Terdapat ${pesanan.pesananMakanan.size} Makanan & " +
                    "${pesanan.pesananMinuman.size} Minuman")
            println("============================================")

        }
        println("1. Pilih Makanan")
        println("2. Pilih Minuman")
        println("3. Lihat Pesanan")
        println("4. Bayar")
        println("5. Keluar")
        print("Masukan Pilihan : ")
        input = readLine()!!.toInt()
        when(input){
            1-> {
                menu.cetakMenuMakanan()
                print("Masukan Pilihan Makanan : ")
                var pilihanMakanan = readLine()!!.toInt()
                print("Masukan Jumlah : ")
                var jumlahMakanan = readLine()!!.toInt()
                pesanan.addMakanan(listMakanan[pilihanMakanan-1],jumlahMakanan)
            }
            2->{
                menu.cetaMenuMinuman()
                print("Masukan Pilihan Minuman : ")
                var pilihanMinuman = readLine()!!.toInt()
                print("Masukan Jumlah : ")
                var jumlahMinuman= readLine()!!.toInt()
                pesanan.addMinuman(listMinuman[pilihanMinuman-1],jumlahMinuman)
            }
            3->{
                pesanan.cetakPesanan()
            }
            4->{
                var random = Random.nextInt(100,1000)
                var idTransaksi = "TRX$random"
                val transaksi = Transaksi(idTransaksi,pesanan)
                pesanan.cetakPesanan()
                print("Apakah Pesanan Benar? (y/n)")
                var pilih = readLine()!!.toString()
                if(pilih.equals("y")){
                    transaksi.bayar()
                    pesanan.resetPesanan()
                }else if (pilih.equals("n")){
                    pesanan.resetPesanan()
                }
            }
            5->{
                println("--------- Shut Down ---------")
            }
        }
    }while (input!=5)
}