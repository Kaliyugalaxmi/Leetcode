class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(char x:jewels.toCharArray()){set.add(x);}
         int count=0;
        for(char x:stones.toCharArray()  ){
            if(set.contains(x)){
            set.add(x);
            count++;}
            }
           return count;
    }
}