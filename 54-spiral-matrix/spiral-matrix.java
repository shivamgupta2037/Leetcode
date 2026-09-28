class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> op = new ArrayList<>();

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        while(left<=right && top<=bottom){
            for(int i =left;i<=right;i++){
                op.add(matrix[top][i]);
            }
            top++;
            for(int i =top;i<=bottom;i++){
                op.add(matrix[i][right]);
            }
            right--;

            //what if there is only one row and column
            //check if row still exists
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    op.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //cheeck if column still exists
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    op.add(matrix[i][left]);
                }
                left++;
            }
        }
        return op;
        
    }
}