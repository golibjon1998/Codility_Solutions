package lesson2

/**
 * Rotate an array to the right by a given number of steps.
 */

fun main() {
    println(solution(intArrayOf(3, 8, 9, 7, 6),3))
}

fun solution(A: IntArray, K: Int): List<Int> { // return IntArray
    val l: Int = if (A.isEmpty()) {
        0
    } else
        K % A.size

    val b: ArrayList<Int> = arrayListOf()
    for (i in A.size - l until A.size) {
        b.add(A[i])
    }
    for (i in 0 until A.size - l) {
        b.add(A[i])
    }

    val result = b.toIntArray() //return this value
    return b
}
