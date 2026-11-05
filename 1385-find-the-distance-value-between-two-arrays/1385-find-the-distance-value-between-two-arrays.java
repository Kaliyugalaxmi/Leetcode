class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result=0;
        int count=0;
        boolean valid;
        for(int i=0;i<arr1.length;i++){
            valid = true;          
            for(int j=0;j<arr2.length;j++){
                result=Math.abs(arr1[i]-arr2[j]);
                if(result<=d){
                    valid=false;
                    break;
                }
                
            }
            if(valid==true){
                count++;
            }
        }
        return count;
    }
}