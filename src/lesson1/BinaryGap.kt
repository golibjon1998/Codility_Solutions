package lesson1

/**
 * Find longest sequence of zeros in binary representation of an integer.
 */

fun main() {
    println(solution(1041))
}

fun solution(N: Int): Int {
    val binary = Integer.toBinaryString(N)
    var t = 0
    var lastOne = 0
    for (i in 1 until binary.length) {
        if (binary[i] == '1') {
            lastOne = i
        }
    }

    var max = 0
    for (i in 1..lastOne) {

        if (binary[i] != '1') {
            t++
        } else {
            t = 0
        }

        if (t >= max) {
            max = t
        }

    }
    return max
}