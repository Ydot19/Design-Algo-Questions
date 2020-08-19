package support.custom_types;

/**
 * Defines a single directional ListNode
 */
public class ListNode {
    /**
     * Integer value of the node
     */
    public int val;
    /**
     * The next node in the list. If there is no node afterwards, ListNode.next
     * is set to null
     */
    public ListNode next;

    /**
     * Class variables left as undefined if not initiated
     */
    public ListNode(){
    }

    /**
     * Defines the value at the current node.
     * Set the next property to null
     * @param val Value at the current node
     */
    public ListNode(int val){
        this(val, null);
    }

    /**
     *
     * @param val Value at the current node
     * @param next Pointer to next node
     */
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
