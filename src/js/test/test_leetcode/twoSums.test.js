const TwoSums = require("../../core/leetcode/twoSums").default

describe("TwoSums LeetCode Test", ()=>{
    let testCases = [];  // Initialize
    let twoSums = new TwoSums([], null)
    beforeAll(()=>{
        testCases.push(
            {
                 nums: [3, 2, 4],
                 target: 6,
                 expected: [1, 2]
            },
            {
                nums: [3, 3],
                target: 6,
                expected: [0, 1]
            },
            {
                nums: [3, 4, 1, 4],
                target: 8,
                expected: [1, 3]
            }
            )
    })
    test("Test - Worst method() Produces Expected Results", ()=>{
        for( let testCase of testCases){
            // Setup
            twoSums.setNums = testCase.nums;
            twoSums.setTarget = testCase.target;
            // Execute
            const actual = twoSums.worst();
            const expected = testCase.expected.sort();

            // Verify
            expect(actual.sort()).toEqual(expected)
        }
    })

    test("Test - secondWorst method() Produces Expected Results", ()=>{
        for( let testCase of testCases){
            // Setup
            twoSums.setNums = testCase.nums;
            twoSums.setTarget = testCase.target;
            // Execute
            const actual = twoSums.secondWorst();
            const expected = testCase.expected.sort();

            // Verify
            expect(actual.sort()).toEqual(expected);
        }
    })

    test("Test - objectOptimized() Produces Expected Results", ()=>{
        for( let testCase of testCases){
            // Setup
            twoSums.setNums = testCase.nums;
            twoSums.setTarget = testCase.target;
            // Execute
            const actual = twoSums.objectOptimized();
            const expected = testCase.expected.sort();

            // Verify
            expect(actual.sort()).toEqual(expected);
        }
    })

    test("Test - mapOptimized() Produces Expected Results", ()=>{
        for( let testCase of testCases){
            // Setup
            twoSums.setNums = testCase.nums;
            twoSums.setTarget = testCase.target;
            // Execute
            const actual = twoSums.mapOptimized();
            const expected = testCase.expected.sort();

            // Verify
            expect(actual.sort()).toEqual(expected);
        }
    })
})
