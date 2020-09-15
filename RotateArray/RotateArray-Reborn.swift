import Foundation

func shiftRight(anArray: inout [Int], by distance: Int = 1) {
    let count = anArray.count
    if count == 0 || count <= distance || distance < 1 {
        return
    }
    var tempArray = [Int]()
    for i in (count-distance)..<count {
        tempArray.append(anArray[i])
    }
    for j in 0..<(count-distance) {
        tempArray.append(anArray[j])
    }
    anArray = tempArray
}