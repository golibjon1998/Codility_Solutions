package lesson3

/**
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */
import kotlin.math.abs

fun main() {
    println(solution(intArrayOf(3,1,2,4,3)))
}

private fun solution(A: IntArray): Int {

    var min = Integer.MAX_VALUE
    var sumAllElements = 0

    for (element in A) {
        sumAllElements += element
    }
    var localSum = 0

    for (i in 0..A.size - 2) {
        localSum += A[i]
        val difference = sumAllElements - localSum
        val diffBetweenParts = abs(localSum - difference)
        if (diffBetweenParts < min) min = diffBetweenParts
    }

    return min
}