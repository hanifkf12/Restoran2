class Pesanan{
    var pesananMakanan : MutableList<Makanan> = mutableListOf()
    var pesananMinuman : MutableList<Minuman> = mutableListOf()
    private var totalHarga = 0.0
    fun addMakanan(makanan: Makanan, jumlah:Int){
        for (i in 0 until jumlah){
            this.pesananMakanan.add(makanan)
        }
    }

    fun addMinuman(minuman: Minuman, jumlah: Int){
        for (i in 0 until jumlah){
            this.pesananMinuman.add(minuman)
        }
    }

    fun cetakPesanan(){
        totalHarga = 0.0
        println("________________ Pesanan Makanan ________________")
        pesananMakanan.forEachIndexed { index, makanan ->
            println("${index+1}. ${makanan.cetakMakanan()}")
            totalHarga = totalHarga + makanan.harga
        }
        println("________________ Pesanan Minuman ________________")
        pesananMinuman.forEachIndexed { index, minuman ->
            println("${index+1}. ${minuman.cetakMinuman()}")
            totalHarga = totalHarga + minuman.harga
        }
        println("________________________________________________")
        println("Total Harga : Rp $totalHarga")
    }

    fun resetPesanan(){
        this.pesananMakanan.clear()
        this.pesananMinuman.clear()
    }

}