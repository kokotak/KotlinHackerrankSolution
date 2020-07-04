package warmUp_challenges

import java.util.*
import kotlin.collections.HashSet

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val set = HashSet<Int>()
    var jumlahPasangan = 0
    for(i in 0 until n){
        val element = ar[i]
        if(set.contains(element)){
            set.remove(element)
            jumlahPasangan++
        } else{
            set.add(element)
        }
    }
    return jumlahPasangan
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
