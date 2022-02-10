package lesson2

/**
 * Find value that occurs in odd number of elements.
 */

fun main() {
    println(solution(intArrayOf(3,3,4)))
}

fun solution(A: IntArray): Int {

    var res = 0
    for (element in A) {
        res = res.xor(element)

    }
    return res
}