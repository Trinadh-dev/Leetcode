class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int max[]=new int[matrix[0].length];
        int min[]=new int[matrix.length];
        List<Integer> mylist = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int mi=Integer.MAX_VALUE;
            //for minimum number in its row 
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<mi){
                    mi=matrix[i][j];
                }
            }
            min[i]=mi;
        }
        //for maximum number in its column
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(max[j]<matrix[i][j]){
                    max[j]=matrix[i][j];
                }
            }
        }

        //for common element
        for(int i=0;i<max.length;i++){
            for(int j=0;j<min.length;j++){
                if(max[i]==min[j]){
                    mylist.add(max[i]);
                }
            }
        }
    return mylist;
    }
}