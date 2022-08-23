fun main() {
    println("Enter array Number")
    val a = ArrayList<Int>()
    for (i in 0..5) {
        print("a[$i] = ")
        val temp: Int = readLine()!!.toInt()
        a.add(temp)
    }

    println("Max array Number is ${maxNum(a)}")
}

fun maxNum(arr: ArrayList<Int>): Int {
    var temp = arr[0]
    for (i in 0..5) {
        if (arr[i] > temp) {
            temp = arr[i]
        }
    }
    return temp
}

