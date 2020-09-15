import Foundation

func shiftRight(anArray: inout [Int], by distance: Int = 1) {
    let count = anArray.count
    let maxIndex = count - 1
    var index = maxIndex
    var tempArr = [Int]()
    while(index >= count - distance){
        tempArr.append(anArray[index])
        index -= 1
    }
    for i in 0...(maxIndex - distance) {
        tempArr.append(anArray[i])
    }
    anArray = tempArr
}

func rotateArray(inputArray: inout [Int], by times: Int) {
    if inputArray.isEmpty || inputArray.count <= times {
        return
    }
    shiftRight(anArray: &inputArray, by: times)
}