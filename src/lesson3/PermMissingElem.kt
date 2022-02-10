package lesson3

/**
 * Find the missing element in a given permutation.
 */

fun main() {
    println(solution(intArrayOf(2, 3, 1, 5)))
}

private fun solution(A: IntArray): Int {

    var min = 100002
    var result = -1
    val bool = BooleanArray(A.size + 1)

    if (A.isEmpty()) return 1
    if (A.size == 1 && A[0] != 1) return A[0] - 1

    A.forEach {
        if (it < min) min = it
    }

    for (item in A) {
        bool[item - min] = true
    }

    for (i in bool.indices) {
        if (!bool[i]) {
            result = i + min
            break
        }
    }
    if (!bool.last() && min != 1) return 1
    return result
}