class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int x : nums1)set.add(x);
                Set<Integer> common = new HashSet<>();

        for(int x : nums2){
            if(set.contains(x)){
                common.add(x);
            }
        }


        int[] result=new int[common.size()];
        int i=0;
        for(int x:common){
            result[i++]=x;
        }

        return result;
    }
}