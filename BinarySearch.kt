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