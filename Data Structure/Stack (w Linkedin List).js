class Node {
  constructor(value){
    this.value = value;
    this.next = null;
  }
}

class Stack {
  constructor(){
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }
  peek() {
    return this.top;
  }
  push(value){
    let newNode = new Node(value);
    if (this.length === 0) {
      this.bottom = newNode;
    } else {
      newNode.next = this.top
    }
    this.top = newNode;
    this.length++;
    return this;
  }
  pop(){
    if (!this.top) {
      return null;
    } else if(this.length === 1) {
      this.bottom = null;
    }
    let topNode = this.top;
    this.top = topNode.next
    this.length--;
    return this;

  }
  isEmpty() {
    return !this.length;
  }
}

const myStack = new Stack();
myStack.push("google");
myStack.push("Udemy")
myStack.push("Discord");
myStack.pop();
myStack.pop();
myStack.pop();
// myStack.isEmpty();

//Discord
//Udemy
//google
