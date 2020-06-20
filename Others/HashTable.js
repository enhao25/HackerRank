class HashTable {
  constructor(size){
    this.data = new Array(size);
  }

  // O(1)
  _hash(key) {
    let hash = 0;
    for (let i =0; i < key.length; i++){
        hash = (hash + key.charCodeAt(i) * i) % this.data.length
    }
    return hash;
  }

  // O(1)
  set(key, value) {
    const address = this._hash(key);
    if (!this.data[address]) {
      this.data[address] = [];
    }
    this.data[address].push([key, value]);
    return this.data;
  }

  // O(1) mostly, except when hash collisions happens
  get(key) {
    const address = this._hash(key);
    const current =  this.data[address];
    if (current) {
      for (let i = 0; i< current.length; i++) {
        if (current[i][0] === key) {
          return current[i][1];
        }
      }
    }
    return null;
  }

  // O(n) where n is the length of the hashtable
  keys(){
    const keysArray = [];
    for (let i = 0; i < this.data.length; i++){
      if(this.data[i]){
        keysArray.push(this.data[i][0][0])
      }
    }
    return keysArray;
  }

  // O(n) where n is the length of the hashtable
  values(){
    const valuesArray = [];
    for (let i = 0; i < this.data.length; i++){
      if(this.data[i]){
        valuesArray.push(this.data[i][0][1])
      }
    }
    return valuesArray;
  }
}

const myHashTable = new HashTable(50);
myHashTable.set('grapes', 10000)
myHashTable.get('grapes')
myHashTable.set('apples', 9)
myHashTable.get('apples')
myHashTable.keys();
myHashTable.values();