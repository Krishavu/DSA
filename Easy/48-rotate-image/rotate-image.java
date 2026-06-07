class Solution {
    public void swapp(int matrix[][], int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    public void reverse(int matrix[][], int i){
        for(int j=0,k=matrix.length-1;j<k;j++,k--){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k]=temp;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swapp(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }
    }
}