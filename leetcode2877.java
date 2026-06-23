import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[][] createDataframe(List<List<Integer>> studentData) {
        int[][] result = new int[studentData.size()][2];
        for (int i = 0; i < studentData.size(); i++) {
            result[i][0] = studentData.get(i).get(0);
            result[i][1] = studentData.get(i).get(1);
        }
        return result;
    }
}
