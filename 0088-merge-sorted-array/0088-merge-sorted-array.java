class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        
        int[] temp=new int[m+n];
        while(i<m && j<n){
            if(nums2[j]<=nums1[i]){
                temp[k]=nums2[j];
                j++;
            }
            else{
                temp[k]=nums1[i];
                i++;
            }
            k++;
        }

        while(i<m){
            temp[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n){
            temp[k]=nums2[j];
            j++;
            k++;
        }

        int a=0;
        for(int b=0;b<nums1.length;b++){
            nums1[b]=temp[a];
            a++;
        }
    }
}