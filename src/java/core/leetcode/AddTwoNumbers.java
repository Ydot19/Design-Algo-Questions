package leetcode;

import java.math.BigInteger;

import support.custom_types.ListNode;

/**
 * AddTwoNumbers Leetcode algorithm question
 * <br>
 * Prompt:
 * "You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list." - Leetcode
 * <br>
 * <br>
 * Example:
 * <br><br>
 * Input:
 * <br>
 *     <p style="margin-left: 5%">l1: (1 -&gt; 2 -&gt; 3)</p>
 *     <p style="margin-left: 5%">l2: (4 -&gt; 5 -&gt; 6)</p>
 *
 * <br>
 * Output:
 * <br>
 *      <p style="margin-left: 5%">(5 -&gt; 7 -&gt; 9)</p>
 * <br>
 * Explanation: <br>
 * <br>
 *      <p style="margin-left: 5%">     321       +        654      =   975</p>
 *      <p style="margin-left: 5%">(l1 reversed)  +   (l2 reversed) =   Output</p>
 *
 * @author Yaadata Abdalhalim
 */
public class AddTwoNumbers {

    /**
     * Uses a mixture of string manipulation, basic arithmetic, and
     * ArrayList to arrive at the answer
     *
     * Time Complexity: 0(nm)
     * where n is longest ListNode
     * where m is the length of the output ListNode
     * @param l1 Non Empty ListNode
     * @param l2 Non Empty ListNode
     * @return Non Empty ListNode
     *
     * @see ListNode
     */
    public static ListNode BruteForce(ListNode l1, ListNode l2){
        /*
         * Transform l1 ListNode to string
         */
        StringBuilder l1String = new StringBuilder();
        /*
         * Transform l2 ListNode to String
         */
        StringBuilder l2String = new StringBuilder();

        while (l1 != null || l2 != null){
            if (l1 != null){
                l1String.append(l1.val);

                l1 = l1.next;

            }

            if (l2 != null){
                l2String.append(l2.val);

                l2 = l2.next;
            }
        }

        /*
         * Convert the strings to number.
         * Use BigInteger for arbitrarily large numbers (edge case)
         */
        BigInteger l1ReversedStrNum = new BigInteger(l1String.reverse().toString());
        BigInteger l2ReversedStrNum = new BigInteger(l2String.reverse().toString());

        /*
         * retString represents the addition of the two BigInteger numbers as strings reversed
         */
        String retString = new StringBuilder().append(l1ReversedStrNum.add(l2ReversedStrNum).toString()).reverse().toString();

        /*
         * Convert retString to ListNode
         */
        ListNode ret = new ListNode();
        ListNode previousNode = new ListNode();
        boolean isHead = true;

        for (char character: retString.toCharArray()){
            if(isHead){
                isHead = false;
                ret.val = Character.getNumericValue(character);
                previousNode = ret;
            } else{
                ListNode current_node = new ListNode(Character.getNumericValue(character));
                previousNode.next = current_node;
                previousNode = current_node;
            }
        }

        return ret;
    }

    /**
     * Uses a while loop and adds the elements at each position of both ListNodes.
     * Function also uses an int carry variable to determine if an additional node position
     * needs to be created.
     * @param l1 Non empty ListNode
     * @param l2 Non empty ListNode
     * @return Non Empty ListNode
     *
     * @see ListNode
     */
    public static ListNode Optimized(ListNode l1, ListNode l2){
        /*
         * Initialize the values. Problem guarantees non-empty ListNode
         */
        int value = l1.val + l2.val;
        int carry = (value >= 10) ? 1: 0;
        // ret stands for the return variable
        ListNode ret = (value >= 10) ? new ListNode(value-10): new ListNode(value);
        ListNode previousNode = ret;

        l1 = l1.next;
        l2 = l2.next;

        while( (l1 !=null) || (l2 != null) || (carry != 0)){
            /*
             * Restart the value from the carry
             */
            value = carry;
            if ( l1 != null){
                value += l1.val;
                l1 = l1.next;
            }

            if ( l2 != null){
                value += l2.val;
                l2 = l2.next;
            }

            /*
             * Carry if value is greater than or equal to 10
             * Otherwise reset carry to zero
             */
            if (value >= 10){
                carry = 1;
                value = value - 10;
            } else {
                carry = 0;
            }

            ListNode currentNode = new ListNode(value);
            previousNode.next = currentNode;
            previousNode = currentNode;

        }
        return ret;
    }
}
