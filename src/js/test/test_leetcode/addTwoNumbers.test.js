const AddTwoNumbers = require("../../core/leetcode/addTwoNumbers").default;
const ListNode = require("../../core/support/custom_types/listNode").default;

describe("Add Two Numbers Test", ()=>{
    let testCases = [];

    beforeAll(()=>{
      testCases.push(
          /*
          Case 1:
            l1: (2 -> 4 -> 3)

            l2: (5 -> 6 -> 4)

            example:
             342 + 465 = 807

            expected: (7 -> 0 -> 8)
           */
          {
              l1: new ListNode(
                  2,
                  new ListNode(
                      4,
                      new  ListNode(
                          3,
                          null
                      )
                  )
              ),
              l2: new ListNode(
                  5,
                  new ListNode(
                      6,
                      new ListNode(
                          4,
                          null
                      )
                  )
              ),
              expected: new ListNode(
                  7,
                  new ListNode(
                      0,
                      new ListNode(
                          8,
                          null
                      )
                  )
              )
          },
          /*
          Case 2:
            l1: (4)

            l2: (6)

            explain:
              4 + 6 = 10

            expected: (0 -> 1)
           */
          {
              l1: new ListNode(
                  4,
                  null
              ),
              l2: new ListNode(
                  6,
                  null
              ),
              expected: new ListNode(
                  0,
                  new ListNode(
                      1,
                      null
                  )
              )
          },
          /*
          Case 3:
            l1: (7 -> 4 -> 8)

            l2: (2 -> 9 -> 9)

            explain:
                847 + 992 = 1839

            expected: (9 -> 3 -> 8 -> 1)
           */
          {
              l1: new ListNode(
                  7,
                  new ListNode(
                      4,
                      new  ListNode(
                          8,
                          null
                      )
                  )
              ),
              l2: new ListNode(
                  2,
                  new ListNode(
                      9,
                      new ListNode(
                          9,
                          null
                      )
                  )
              ),
              expected: new ListNode(
                  9,
                  new ListNode(
                      3,
                      new ListNode(
                          8,
                          new ListNode(
                              1,
                              null
                          )
                      )
                  )
              )
          },
          /*
          Case 4:
            l1: (4, 5, 9)

            l2: (3, 2)

            explain:
                954 + 23 = 977

            expected:
                (7 -> 7 -> 9)
           */
          {
              l1: new ListNode(
                  4,
                  new ListNode(
                      5,
                      new  ListNode(
                          9,
                          null
                      )
                  )
              ),
              l2: new ListNode(
                  3,
                  new ListNode(
                      2,
                      null
                  )
              ),
              expected: new ListNode(
                  7,
                  new ListNode(
                      7,
                      new ListNode(
                          9,
                          null
                      )
                  )
              )
          },
          /*
          Case 4:
            l2: (4, 5, 9)

            l1: (3, 2)

            explain:
                954 + 23 = 977

            expected:
                (7 -> 7 -> 9)
           */
          {
              l2: new ListNode(
                  4,
                  new ListNode(
                      5,
                      new  ListNode(
                          9,
                          null
                      )
                  )
              ),
              l1: new ListNode(
                  3,
                  new ListNode(
                      2,
                      null
                  )
              ),
              expected: new ListNode(
                  7,
                  new ListNode(
                      7,
                      new ListNode(
                          9,
                          null
                      )
                  )
              )
          }
      )
    })

    test("bruteForce static method", ()=>{
        for (let testcase of testCases){
            // Setup - none
            // Exercise
            let actual = AddTwoNumbers.bruteForce(testcase.l1, testcase.l2);
            // verify
            let expected = testcase.expected;
            while (expected){
                expect(actual.val).toEqual(expected.val);
                expected = expected.next;
                actual = actual.next
            }
        }
    })

    test("optimized static method", ()=>{
        for (let testcase of testCases){
            // Setup - none
            // Exercise
            let actual = AddTwoNumbers.optimized(testcase.l1, testcase.l2);
            // verify
            let expected = testcase.expected;
            while (expected){
                expect(actual.val).toEqual(expected.val);
                expected = expected.next;
                actual = actual.next
            }
        }
    })
})
