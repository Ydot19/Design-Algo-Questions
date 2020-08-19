class SingleLinkedNode{
    /**
     * Constructor for the Single Directional Linked Node
     * @param value {null || Number}
     * @param next {SingleLinkedNode || null}
     */
    constructor(value = null, next= null) {
        this.val = value;
        this.next = next;
    }

    /**
     * Set the value of the node
     * @param value {Number || String}
     */
    set setVal(value){
        this.val = value;
    }

    /**
     * Return the value of the node
     * @return {null|Number}
     */
    get getVal(){
        return this.val;
    }

    /**
     * Set the next for SingleLinkedNode
     * @param next {SingleLinkedNode}
     */
    set setNext(next){
        this.next = next;
    }

    /**
     * Return the next node
     * @return {SingleLinkedNode|null}
     */
    get getNext(){
        return this.next
    }
}


module.exports = {
    default: SingleLinkedNode
}
