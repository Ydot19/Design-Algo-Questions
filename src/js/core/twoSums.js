/**
 * Outline (one of) the worst possible solutions
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSumsWorst = function(nums, target){
    // basic 0(n^n) time complexity
    let ret = [];
    // examine every element against the same array
    nums.every(function(currentValue,index, array){
        // map the value to each element of the array
        const replica = array.map(element => element + currentValue)
        const indexOfTarget = replica.findIndex((element) => element === target);
        const foundValues = (indexOfTarget !== -1 ) && (indexOfTarget !== index);

        if (foundValues){
            ret = [index, indexOfTarget];
        } else {

        }
        return !foundValues; // continue to next element if not found
    })

    return ret
}

/**
 * Optimize twoSumsWorst to remove repetitive array searching
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSumsBasedImproved = function(nums, target){
    let stillTryingToFindValues = true;
    let ret = [];
    nums.every(function(currentValue, index, array){
        const diff = target - currentValue;
        // search from the next index onward
        for (let i = index + 1; i < array.length; i++){
            if (array[i] === diff){
                ret = [index, i];
                stillTryingToFindValues = false; // no longer trying to find the values
            }
        }
        return stillTryingToFindValues;
    })
    return ret
}

/**
 * Optimize twoSumsWorst by utilizing js Object built obj. Time complexity is O(n)
 * One of the best solutions
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSumsObjectOptimized = function(nums, target){
    /**
     * @type {{}}
     */
    const numsObject = nums.reduce((map,currentValue, currentIndex) => {
        // create key (number), value (index) pair of nums array
        map[currentValue] = currentIndex;
        return map;
    },{})

    for(let index = 0; index < nums.length; index++){
        let diff = target - nums[index];
        if (numsObject.hasOwnProperty(diff) && numsObject[diff] !== index){
            return [index, numsObject[diff]];
        }
    }
}

/**
 * Optimizes twoSumsWorst. One of the best solutions. Utilizes js Map utility
 * Time complexity is O(n)
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSumsMapOptimized = function(nums, target){
    const map = new Map();
    let ret = []; // return array
    for(let index = 0; index < nums.length; index++){
        let diff = target - nums[index];
        if (map.has(diff)){
            ret = [index, map.get(diff)];
            break;
        }

        map.set(nums[index], index)
    }
    return ret
}


module.exports = {
    default: twoSumsObjectOptimized,
    worst: twoSumsWorst,
    others: [
        twoSumsMapOptimized,
        twoSumsBasedImproved
    ]
}
