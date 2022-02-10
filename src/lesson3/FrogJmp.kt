package lesson3

/**
 * Count minimal number of jumps from position X to Y.
 */

fun main() {
    println(solution(10, 101, 30))
}

fun solution(X: Int, Y: Int, D: Int): Int {
    val res: Int

    val diff = Y - X
    val q = diff % D
    res = if (q == 0) {
        diff / D
    } else {
        1 + diff / D
    }
    return res
}