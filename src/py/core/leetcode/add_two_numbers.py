from core.support.custom_types.list_nodes import SingleLinkedNode


class AddTwoNumbers:
    """
    Used to solved the Add Two Numbers leetcode medium question

    - see
        `test.test_leetcode.test_add_two_numbers.AddTwoNumbersTest`

    """
    @staticmethod
    def bruteforce(l1: SingleLinkedNode, l2: SingleLinkedNode) -> SingleLinkedNode:
        """
        Uses string manipulation to solve the algorithm
        Transforms Node inputs to strings, to int, back to str
        Iterates final string into a SingleLinkedNode as a return variable

        :param l1: SingleLinkedNode

        :param l2: SingleLinkedNode

        :return: SingleLinkedNode

        see
            `core.support.custom_types.list_nodes.SingleLinkedNode`
        """
        l1_str, l2_str = '', ''
        while l1 or l2:
            if l1:
                l1_str += str(l1.val)
                l1 = l1.next

            if l2:
                l2_str += str(l2.val)
                l2 = l2.next
        """
        1. Reverse each string
        2. Turn into integer
        3. Add the integers
        4. Create a string
        5. Reverse the string
        """
        ret_str: str = str(int(l1_str[::-1]) + int(l2_str[::-1]))[::-1]
        ret: SingleLinkedNode = SingleLinkedNode()
        previous_node = SingleLinkedNode()
        for char_index in range(0, len(ret_str)):
            if char_index == 0:
                ret.val = int(ret_str[char_index])
                previous_node = ret
            else:
                current_node = SingleLinkedNode(val=int(ret_str[char_index]))
                previous_node.next = current_node
                previous_node = current_node

        return ret

    @staticmethod
    def optimized(l1: SingleLinkedNode, l2: SingleLinkedNode) -> SingleLinkedNode:
        """
        Uses a form of iteration to add a node to another node

        :param l1: SingleLinkedNode

        :param l2: SingleLinkedNode

        :return SingleLinkedNode

        see `core.support.custom_types.list_nodes.SingleLinkedNode`
        """
        ret: SingleLinkedNode = SingleLinkedNode()  # return variable
        carry: int = 0
        previous_node: SingleLinkedNode = SingleLinkedNode()
        is_head: bool = True
        while l1 or l2 or carry:
            value: int = carry
            carry = 0
            """
            Add values only if l1 or l2 or carry exist
            """
            if l1:
                value += l1.val
                l1 = l1.next

            if l2:
                value += l2.val
                l2 = l2.next

            """
            Evaluate the remainder
            """
            quotient, remainder = divmod(value, 10)

            if quotient == 1:
                value = remainder
                carry += 1
            """
            Separate logic for head of list node and elements
            after the head
            """
            if is_head:
                is_head = False
                ret.val = value
                previous_node = ret
            else:
                current_node = SingleLinkedNode(val=value)
                previous_node.next = current_node
                previous_node = current_node

        return ret
