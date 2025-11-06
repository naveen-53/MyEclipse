package BacktrackingProblems;

/*
 Given an array arr[] of size n, the task is to divide it into two subsets such that the absolute difference between the sum of elements in the two subsets is zero.
 

If n is even, both subsets must have exactly n/2 elements.
If n is odd, one subset must have (n−1)/2 elements and the other must have (n+1)/2 elements.
Examples:

Input: arr[] = [3, 4, 5, -3, 100, 1, 89, 54, 23, 20]
Output: 
3 5 -3 89 54 
4 100 1 23 20 
Explanation: The absolute difference between the two subsets is 0.

Input: arr[] = [23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4]
Output: 
23 0 -99 4 189 4 
45 -34 12 98 -1 
Explanation: The absolute difference between the two subsets is 1, which is minimum.

Approach:

The idea is to use backtracking to explore all valid combinations of elements that can form two subsets of required sizes, and track the minimum absolute difference between their sums. A boolean array is used to keep track of which elements belong to the first subset, and at each step, the current element is either included in the first or second subset. 

Step by step approach:

Start from the first index and recursively explore each element's inclusion in either of the two subsets.
Track the count of elements added to the first subset to ensure size constraints are met.
Maintain the current difference in subset sums while building the subsets.
If the required number of elements is chosen, calculate the final difference and update the minimum if smaller.
After recursion completes, use the final boolean array to separate the elements into two result subsets.



// Function that tries every possible solution by calling 
// itself recursively
void TOWUtil(int[] arr, boolean[] curr,
             int sel, boolean[] resSel, int[] minDiff,
             int totalSum, int currSum, int pos) {
​
    int n = arr.length;
​
    // Check whether it is going out of bounds
    if (pos == n)
        return;
​
    // Check that the number of elements left are not 
    // less than the number of elements required to 
    // form the solution
    if ((n / 2 - sel) > (n - pos))
        return;
​
    // Consider the case when current element is not included
    TOWUtil(arr, curr, sel, resSel, minDiff, totalSum, currSum, pos + 1);
​
    // Add the current element to the solution
    sel++;
    currSum += arr[pos];
    curr[pos] = true;
​
    // Check if a solution is formed
    if (sel == n / 2) {
        
        // Check if this solution is better than the best so far
        int diff = Math.abs(totalSum / 2 - currSum);
        if (diff < minDiff[0]) {
            minDiff[0] = diff;
            resSel = curr.clone();
        }
    } 
    
    else {
        
        // Consider the case where current element is included
        TOWUtil(arr, curr, sel, resSel, minDiff, totalSum, currSum, pos + 1);
    }
​
    // Remove current element before returning to the caller
    curr[pos] = false;
}
​
// Function that returns the two subsets
public static Pair<List<Integer>, List<Integer>> tugOfWar(int[] arr) {
    int n = arr.length;
​
    // Boolean array that contains inclusion/exclusion of an element
    boolean[] curr = new boolean[n];
​
    // Final solution mask
    boolean[] resSel = new boolean[n];
​
    int[] minDiff = new int[]{Integer.MAX_VALUE};
​
    // Total sum of all elements
    int totalSum = 0;
    for (int num : arr) totalSum += num;
​
    // Recursive solution
    TOWUtil(arr, curr, 0, resSel, minDiff, totalSum, 0, 0);
​
    // Prepare the two subsets
    List<Integer> res1 = new ArrayList<>(), res2 = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
        if (resSel[i])
            res1.add(arr[i]);
        else
            res2.add(arr[i]);
    }
​
    return new Pair<>(res1, res2);
}
​
// Driver program to test above functions
public static void main(String[] args) {
    int[] arr = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
​
    // Get the two subsets
    Pair<List<Integer>, List<Integer>> res = tugOfWar(arr);
​
    // Print the subsets
    System.out.print("The first subset is: ");
    for (int x : res.getKey())
        System.out.print(x + " ");
​
    System.out.print("\nThe second subset is: ");
    for (int x : res.getValue())
        System.out.print(x + " ");
}

Output
3 5 -3 89 54 
4 100 1 23 20 
Time Complexity: O(2^n)
Auxiliary Space: O(n)

*/



public class TugofWar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
