/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let temp =[];
    let j =0, n =arr.length;
    
    for(let i=0; i<n; i++){
        if(fn(arr[i], i)) temp[j++] = arr[i];
    }
    
    return temp;
};