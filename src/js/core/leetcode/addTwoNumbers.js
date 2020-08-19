let ListNode = require("../support/custom_types/listNode").default

/**
 * Static Class methods for solving the Add Two Numbers Leetcode question
 */
class AddTwoNumbers{
    /**
     * Uses string manipulation to solve the algorithm
     * Transforms Node inputs to strings, to int, back to str
     * Iterates final string into a SingleLinkedNode as a return variable
     * @param l1 {SingleLinkedNode}
     * @param l2 {SingleLinkedNode}
     *
     * @see ListNode
     */
    static bruteForce(l1, l2){
        let [l1String, l2String] = ["", ""];
        /**
         * Creating strings out of the nodes
         */
        while (!(l1 == null && l2 == null)){
            if (!(l1 == null)){
                l1String += l1.val;
                l1 = l1.next
            }

            if (!(l2 == null)){
                l2String += l2.val;
                l2 = l2.next
            }
        }

        /**
         * Use to hold integers beyond Number.Max_Safe_Integer
         * @type {bigint}
         */
        const l1ReversedNum = BigInt(l1String.split("").reverse().join(""))
        const l2ReversedNum = BigInt(l2String.split("").reverse().join(""))
        /**
         * Parse the ListNode val as an array of integers
         * @type {string[]}
         */
        const retStringArray = String(l1ReversedNum + l2ReversedNum).split("").reverse()
        let previousNode = new ListNode(); // needed to keep track in memory as the retStringArray forEach is looping
        let ret = new ListNode();  // Initializing the ret ListNode

        /**
         * Use the Array for each prototype method
         */
        retStringArray.forEach((currentValue, index, arr)=>{
            if(index === 0 ){
                ret.val = Number(currentValue);
                previousNode = ret;
            } else {
                const currentNode = new ListNode(Number(currentValue));
                previousNode.next = currentNode;
                previousNode = currentNode;
            }

        })

        return ret
    }
    /**
     *
     * Uses a form of iteration to add a node to another node
     * @param l1 {SingleLinkedNode}
     * @param l2 {SingleLinkedNode}
     *
     * @see ListNode
     * @author Yaadata Abdalhalim
     */
    static optimized(l1, l2){
        let previousNode = null;
        let ret = new ListNode();
        let isHead = true;
        let carry = 0;
        /**
         * null, undefined and zero are all falsy values
         */
        while (l1 || l2 || carry){
            let currentValue = carry;

            if (l1){
                currentValue += l1.getVal;
                l1 = l1.getNext;
            }

            if (l2){
                currentValue += l2.getVal;
                l2 = l2.getNext;
            }

            if (currentValue >= 10){
                carry = 1;
                currentValue = currentValue - 10;
            } else {
                carry = 0;
            }

            if (isHead){
                ret.setVal = currentValue;
                previousNode = ret;
                isHead = false;
            }  else {
                const currentNode = new ListNode(currentValue)
                previousNode.setNext = currentNode;
                previousNode = currentNode
            }
        }

        return ret
    }
}

module.exports = {
    default: AddTwoNumbers
}
