class Stack {
  constructor(){
    this.arr = [];
  }
  peek() {
    return this.arr[this.arr.length - 1];
  }
  push(value){
    this.arr.push(value);
    return this;
  }
  pop(){
    this.arr.pop();
    return this;
  }
  isEmpty() {
    return !this.arr.length;
  }
}

const myStack = new Stack();
myStack.peek();
myStack.push('google');
myStack.push('udemy');
myStack.push('discord');
myStack.peek();
myStack.pop();
myStack.pop();
myStack.pop();