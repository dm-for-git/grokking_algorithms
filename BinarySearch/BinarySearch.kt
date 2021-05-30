fun myOwnBinarySearch(arr: IntArray, toBeFound: Int): Int {
    val count = arr.count()
    // Check if array is empty
    if (count == 0) {
        return -1
    }
    // Check if array has one item and match to be found item
    else if (count == 1 && arr[0] == toBeFound) {
        return 0
    }
    // Check if array has one item but not match to be found item
    else if (count == 1 && arr[0] != toBeFound) {
        return -1
    }
    // Check if array is ascending
    else if (arr[0] <= arr[1]) {
        var lower = 0
        var upper = count - 1
        while (lower <= upper) {
            val mid = (lower + upper) / 2
            val guest = arr[mid]
            when {
                guest == toBeFound -> {
                    return mid
                }
                guest > toBeFound -> {
                    upper = mid - 1
                }
                else -> {
                    lower = mid + 1
                }
            }
        }
    }
    // Array is descending
    else {
        var lower = 0
        var upper = count - 1
        while (upper >= lower) {
            val mid = (upper + lower) / 2
            val guess = arr[mid]
            when {
                guess == toBeFound -> {
                    return mid
                }
                guess > toBeFound -> {
                    lower = mid + 1
                }
                else -> {
                    upper = mid - 1
                }
            }
        }
    }
    return -1
}

fun testBinaryAlgorithm() {
/*
    * Possible cases can occur:
    * Empty array
    * Array has 1 item and match to be found item
    * Array has 1 item but not match to be found item
    * Array is ascending
    * Array is descending
* */
    val toBeFound = 69
    val arr0 = intArrayOf()
    val arr1 = intArrayOf(69)
    val arr2 = intArrayOf(96)
    val arr3 = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 69)
    val arr4 = intArrayOf(69, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

    // True case = -1
    println("The index of $toBeFound in arr0 is ${myOwnBinarySearch(arr0, toBeFound)}")
    // True case = 0
    println("The index of $toBeFound in arr1 is ${myOwnBinarySearch(arr1, toBeFound)}")
    // True case = -1
    println("The index of $toBeFound in arr2 is ${myOwnBinarySearch(arr2, toBeFound)}")
    // True case = 10
    println("The index of $toBeFound in arr3 is ${myOwnBinarySearch(arr3, toBeFound)}")
    // True case = 0
    println("The index of $toBeFound in arr4 is ${myOwnBinarySearch(arr4, toBeFound)}")

}

testBinaryAlgorithm()