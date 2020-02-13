class Menu(var minumans : MutableList<Minuman>, var makanans: MutableList<Makanan>) {

    fun cetakMenuMakanan(){
        println("++++++++++++++++++ Menu Makanan ++++++++++++++++++")
        makanans.forEachIndexed { index, makanan ->
            println("${index+1}. ${makanan.cetakMakanan()}")
        }
    }
    fun cetaMenuMinuman(){
        println("++++++++++++++++++ Menu Minuman ++++++++++++++++++")
        minumans.forEachIndexed { index, minuman ->
            println("${index+1}. ${minuman.cetakMinuman()}")
        }
    }
}