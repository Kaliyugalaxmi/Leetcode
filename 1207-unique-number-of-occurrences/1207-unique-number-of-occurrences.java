class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i] < min) {
        min = arr[i];
    }
        }
       int[] hash=new int[max - min + 1];
       for(int i=0;i<arr.length;i++){
        hash[arr[i]-min]++;
       }
               for(int i=0;i<hash.length;i++){
            for(int j=i+1;j<hash.length;j++){
                if(hash[i]!=0 && hash[i]==hash[j]){

                    return false;
                }
            }
        }
        return true;

    }
}