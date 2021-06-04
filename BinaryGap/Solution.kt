fun solution(N: Int): Int {
    // write your code in Kotlin
    val strBinary = Integer.toBinaryString(N)
    print("Binary string = $strBinary \n")
    var longestGap = 0
    var currentLongestGap = 0
    val arrChar = strBinary.toCharArray()
    for (chr in arrChar) {
        if (chr == '1') {
            longestGap = max(currentLongestGap, longestGap)
            currentLongestGap = 0
        } else {
            currentLongestGap += 1
        }
    }
    return longestGap
}