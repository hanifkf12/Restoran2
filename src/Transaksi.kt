class Transaksi(var idTransaksi: String, var pesanan: Pesanan){
    fun bayar(){
        println("============== Struk Pembayaran Ayam 99 ==============")
        println("No Transaksi : $idTransaksi")
        println("======================================================")
        pesanan.cetakPesanan()
        println("==================== Terima Kasih ====================")
    }
}