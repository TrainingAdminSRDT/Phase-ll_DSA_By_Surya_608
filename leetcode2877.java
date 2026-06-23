// LeetCode 2877. Create a DataFrame from List
// Difficulty: Easy
// Link: https://leetcode.com/problems/create-a-dataframe-from-list/
// Note: This is a Pandas/Python problem. Java equivalent logic shown below.

// Python Solution (Pandas):
// import pandas as pd
//
// def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
//     return pd.DataFrame(student_data, columns=['student_id', 'age'])

// Java equivalent (for reference):
import java.util.List;
import java.util.ArrayList;

class Solution {
    // Converts list of [student_id, age] pairs into a structured 2D array
    public int[][] createDataframe(List<List<Integer>> studentData) {
        int[][] result = new int[studentData.size()][2];
        for (int i = 0; i < studentData.size(); i++) {
            result[i][0] = studentData.get(i).get(0);
            result[i][1] = studentData.get(i).get(1);
        }
        return result;
    }
}
