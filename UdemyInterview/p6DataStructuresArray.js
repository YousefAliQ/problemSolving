language = "javascript"
run = ""	run = ""


//Naive solution	// Naive solution
const hasPairWithSum = (array, sum) => {	function reverse(str){
  for(let i=0; i<array.length-1; i++){	  let retVal= str.split("");
    for(let j=i+1; j<array.length; j++){	  let temp; 
      if (array[i] + array[j] === sum){	  for(let i=0; i< retVal.length/2; i++){
        return true;	    temp = retVal[i];
      }	    retVal[i] = retVal[retVal.length -1 -i]
    }	    retVal[retVal.length -1 -i] = temp;
  }	  }
  return false;	
  return retVal.join("");
}
console.log(reverse("Hello My Name Is Yousef"));

// Better solution 
function reverseBetter(str){
  const backwords = []; 
  const length = str.length-1;
  for(let i=length; i>=0; i--){
   backwords.push(str[i]);
  }
  return backwords.join('');
}
console.log(reverseBetter("Hello My Name Is Yousef"));

// Cleaner solution 
function reverseBuildIn(str){
  return str.split('').reverse().join('');
}	}
console.log(reverseBuildIn("Hello My Name Is Yousef"));


console.log(hasPairWithSum([1, 5, 4, 9], 7)); 	// Modern solution
const reverseES6 = str => [...str].reverse().join('');
console.log(reverseES6("Hello My Name Is Yousef"));