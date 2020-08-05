class TwoSums{
    /**
     * Implementations of the two sums algorithm
     * @param {number[]} nums
     * @param {number} target
     */
    constructor(nums, target){
        this._nums = nums;
        this._target = target;
    }

    /**
     * @returns {number[]}
     */
    get getNums(){
        return this._nums
    }

    /**
     * @param {number[]} nums
     */
    set setNums(nums){
        this._nums = nums
    }

    /**
     * @returns {number}
     */
    get getTarget() {
        return this._target;
    }

    /**
     * @param {number} value
     */
    set setTarget(value) {
        this._target = value;
    }

    /**
     * Returns solution in O(n^2). Really trying hard here to get the worst possible solution
     * @returns {[]}
     */
    worst(){
        let ret = [];
        // examine every element against the same array
        this.getNums.every((currentValue,index, array) => {
            // map the value to each element of the array
            const replica = array.map(element => element + currentValue)
            const indexOfTarget = replica.findIndex((element) => element === this.getTarget);
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
     * Optimizes the worst algo but still relies on heavy list iteration
     * @returns {[]}
     */
    secondWorst(){
        let stillTryingToFindValues = true;
        let ret = [];
        this.getNums.every((currentValue, index, array)=>{
            const diff = this.getTarget - currentValue;
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
     * One of the better solutions. Relies on object lookup. O(n) time
     * @return {number[]}
     */
    objectOptimized(){
        /**
         * @type {{}}
         */
        const numsObject = this.getNums.reduce((map,currentValue, currentIndex) => {
            // create key (number), value (index) pair of nums array
            map[currentValue] = currentIndex;
            return map;
        },{})

        for(let index = 0; index < this.getNums.length; index++){
            let diff = this.getTarget - this.getNums[index];
            if (numsObject.hasOwnProperty(diff) && numsObject[diff] !== index){
                return [index, numsObject[diff]];
            }
        }
    }

    /**
     * One of the better solutions. Relies on map lookup. O(n) time
     * @return {number[]}
     */
    mapOptimized(){
        const map = new Map();
        let ret = []; // return array
        for(let index = 0; index < this.getNums.length; index++){
            let diff = this.getTarget - this.getNums[index];
            if (map.has(diff)){
                ret = [index, map.get(diff)];
                break;
            }

            map.set(this.getNums[index], index)
        }
        return ret
    }
}


module.exports = {
    default: TwoSums
}
