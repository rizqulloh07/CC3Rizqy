fun main(args: Array<String>) {

    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")

    val pilihan = arrayOf("GUNTING", "BATU", "KERTAS")
    val input1 = Pemain1(pilihan)

    val input2 = Pemain2(pilihan)

    println("Hasilnya : ")

    val controller = Peraturan(keluarCuyy)
    controller.aturan(input1!!.toLowerCase(), input2!!.toLowerCase())
}

fun Pemain1(optionsParam: Array<String>): String {
    var pilihanBenar = false
    var pilihanpemain = ""

    while (!pilihanBenar) {
        for (item in optionsParam) ("$item")
        print("1. Masukkan Pemain 1 : ")
        val inputpemain = readLine()

        when {
            inputpemain != null && inputpemain in optionsParam -> {
                pilihanBenar = true
                pilihanpemain = inputpemain
            }
        }
        if (!pilihanBenar!!) println("Huruf Besar Semua yaa : GUNTING, BATU, KERTAS")
    }
    return pilihanpemain

}

fun Pemain2(optionsParam: Array<String>): String {
    var pilihanBenar = false
    var pilihanpemain = ""

    while (!pilihanBenar) {
        for (item in optionsParam) ("$item")
        print("2. Masukkan Pemain 2 : ")
        val inputpemain = readLine()

        when {
            inputpemain != null && inputpemain in optionsParam -> {
                pilihanBenar = true
                pilihanpemain = inputpemain
            }
        }
        if (!pilihanBenar!!) println("Lupa ya? Huruf Besar Semua ya")
    }
    return pilihanpemain
}

val keluarCuyy = object : Callback {
    override fun keluarin(msg: String) {
        println(msg)
    }
}