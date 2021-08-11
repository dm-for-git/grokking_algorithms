class Node {
    var value: Int
    var next: Node?
    
    init(newValue: Int) {
        value = newValue
    }
}


class MyLinkedList {
    
    var size: Int
    var head: Node
    
    /** Initialize your data structure here. */
    init() {
        size = 0
        head = Node(newValue: -1)
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    func get(_ index: Int) -> Int {
        if index >= 0 && index < size {
            var currentNode = head
            for _ in 0...index {
                if let next = currentNode.next {
                    currentNode = next
                }
            }
            return currentNode.value
        }
        return -1
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    func addAtHead(_ val: Int) {
        let newNode = Node(newValue: val)
        if size == 0 {
            head = newNode
        } else {
            newNode.next = head.next
            head.next = newNode
        }
        size += 1
    }
    
    /** Append a node of value val to the last element of the linked list. */
    func addAtTail(_ val: Int) {
        if val <= 1000 {
            var currentNode = head
            for _ in 0...size {
                if let next = currentNode.next {
                    currentNode = next
                }
            }
            let tailNode = Node(newValue: val)
            tailNode.next = currentNode.next
            currentNode.next = tailNode
            size += 1
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    func addAtIndex(_ index: Int, _ val: Int) {
        if index == 0 {
            addAtHead(val)
        } else if index == size {
            addAtTail(val)
        } else if index > size {
            return
        } else {
            var currentNode = head
            for _ in 0..<index {
                if let next = currentNode.next {
                    currentNode = next
                }
            }
            let newNode = Node(newValue: val)
            newNode.next = currentNode.next
            currentNode.next = newNode
            size += 1
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    func deleteAtIndex(_ index: Int) {
        if index >= 0 && size > 0 && index < size {
            if index == 0 {
                // Delete head
                head = head.next ?? Node(newValue: -1)
                size -= 1
            } else {
                var currentNode = head
                var prevNode = head
                for _ in 0...index {
                    if let next = currentNode.next {
                        prevNode = currentNode
                        currentNode = next
                    }
                }
                prevNode.next = currentNode.next
                size -= 1
            }
        }
    }
}