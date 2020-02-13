class Makanan(var nama:String, var harga:Double) {
    fun cetakMakanan() : String{
        return  "$nama harga Rp $harga"
    }
}