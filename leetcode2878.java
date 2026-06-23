class Solution {
    public int[] getDataframeSize(int[][] data) {
        if (data == null || data.length == 0) return new int[]{0, 0};
        return new int[]{data.length, data[0].length};
    }
}
