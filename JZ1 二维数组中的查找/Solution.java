public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null) return false;
        
        // 从第一行最右端开始比较
        int row = 0;
        int col = array[0].length - 1;
        while(row < array.length && col >= 0) {
            if(array[row][col] == target) {
                return true;
            } else if(target > array[row][col]) {
                // target大于右端点 从下一行找
                row++;
            } else {
                // target小于右端点 从前一列找
                col--;
            }
        }
        return false;
    }
}
