class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp=new int[nums.length];
         int k=0;

        for(int i =n;i<nums.length;i++){
            temp[k]=nums[i];
            k++;
        }
         int[] ans=new int[nums.length];
int j=0;
        for(int i=0;i<n;i++){
          
            ans[j]=nums[i];
          
          ans[j+1]=temp[i];
j+=2;
          }
           
        
        return ans;
    }
}