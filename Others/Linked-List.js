// Create the below linked list:
// myLinkedList = {
//   head: {
//     value: 10
//     next: {
//       value: 5
//       next: {
//         value: 16
//         next: null
//       }
//     }
//   }
// };

class LinkedList {
  constructor(value) {
    this.head = {
      value: value,
      next: null
    };
    this.tail = this.head;
    this.length = 1;
  }
  // O(1)
  append(value) {
    //Code here
    const newNode = {
      value: value,
      next: null
    };
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;
  }
  // O(1)
  prepend(value) {
    const newNode = {
      value: value,
      next: null
    }
    newNode.next = this.head;
    this.head = newNode;
    this.length++;
    return this;
  }
  // O(n)
  insert(index, value) {
    if (index >= this.length) {
      return this.append(value);
    }
    const newNode = {
      value: value,
      next: null
    };
    const leader = this.tranverseToIndex(index-1);
    newNode.next = leader.next;
    leader.next = newNode;
    this.length++;
  }
  // O(n) because of tranverseToIndex
  remove(index) {
    if (index > this.length) {
      return this;
    } 
    const leader = this.tranverseToIndex(index-1);
    leader.next = leader.next.next;
  }
  // O(n)
  tranverseToIndex(index) {
    let counter = 0;
    let currentNode = this.head;
    while (counter !== index) {
      currentNode = currentNode.next;
      counter++;
    }
    return currentNode;
  }
  // O(n)
  printList() {
    const nodeArray = [];
    let currentNode = this.head;
    while(currentNode) {
      nodeArray.push(currentNode.value);
      currentNode = currentNode.next;
    }
    return nodeArray;
  }
}

let myLinkedList = new LinkedList(10);
myLinkedList.append(5);
myLinkedList.append(16);
myLinkedList.prepend(1);
myLinkedList.insert(3, 6);
myLinkedList.remove(4)
myLinkedList.printList();