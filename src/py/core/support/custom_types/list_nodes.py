class SingleLinkedNode:
    """
    Defines the characteristics of a single directional node
    """
    def __init__(self, val=None, next=None):
        """
        Class definition for single directional node
        :param val: any
        :param next: None or another SingleLinkedNode object variable

        - example usage:   `core.leetcode.add_two_numbers.AddTwoNumbers`
        """
        self.val = val
        self.next = next

