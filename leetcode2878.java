// LeetCode 2878. Get the Size of a DataFrame
// Difficulty: Easy
// Link: https://leetcode.com/problems/get-the-size-of-a-dataframe/
// Note: This is a Pandas/Python problem. Java equivalent logic shown below.

// Python Solution (Pandas):
// import pandas as pd
//
// def getDataframeSize(players: pd.DataFrame) -> List[int]:
//     return [players.shape[0], players.shape[1]]

// Java equivalent (for reference):
class Solution {
    // Returns [rows, columns] of a 2D array
    public int[] getDataframeSize(int[][] data) {
        if (data == null || data.length == 0) return new int[]{0, 0};
        return new int[]{data.length, data[0].length};
    }
}
