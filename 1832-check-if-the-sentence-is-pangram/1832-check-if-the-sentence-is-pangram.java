class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(char x:sentence.toCharArray()){
        set.add(x);
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}