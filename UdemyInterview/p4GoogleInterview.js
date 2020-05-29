const firstCharArray = ['a', 'b', 'c', 'd'];
const secondCharArray = ['a', 'y', 'z'];

//Naive solution O(n*m)
const containsCommonItems = (firstArray, secondArray) => {
  for(let i=0; i<firstArray.length; i++){
    for(let j=0; j<secondArray.length; j++){
      if(firstArray[i] === secondArray[j]){
        return true;
      }
    }  
  }
  return false;
}

console.log(containsCommonItems(firstCharArray, secondCharArray));

//Better solution O(n+m)
const containsCommonItems2 = (firstArray, secondArray) => {
  let map = {};
  for(let i=0; i<firstArray.length; i++){
      if(!map[firstArray[i]]){
       map[firstArray[i]] = true;
      }
  }

  for(let j=0; j<secondArray.length; j++){
      if(map[secondArray[j]]){
      return true;
      }
  }
  return false;
  
}

console.log(containsCommonItems2(firstCharArray, secondCharArray));

//Using JS build-in functions
const containsCommonItems3 = (firstArray, secondArray) => {
  return firstArray.some(item => secondArray.includes(item));
}

console.log(containsCommonItems3(firstCharArray, secondCharArray));